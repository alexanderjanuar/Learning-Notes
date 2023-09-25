import cv2 as cv

cap = cv.VideoCapture(0)

haar_cascade = cv.CascadeClassifier('haar_cascade.xml')

recognizer = cv.face.LBPHFaceRecognizer_create()
recognizer.read("Trainer.yml")

name_list = ["","Andhika","Alex"]

while True:
    result, video_frame = cap.read()
    gray_image = cv.cvtColor(video_frame, cv.COLOR_BGR2GRAY)

    faces = haar_cascade.detectMultiScale(gray_image, 1.1, 8, minSize=(40, 40))
    for (x, y, w, h) in faces:
        serial,conf = recognizer.predict(gray_image[y:y+h , x:x+w])

        if conf < 50:
            cv.rectangle(video_frame, (x, y), (x + w, y + h), (0, 0, 255), 1)
            cv.rectangle(video_frame, (x, y), (x + w, y + h), (50, 50, 255), 2)
            cv.rectangle(video_frame, (x, y-40), (x+w, y), (50, 50, 255), -1)
            cv.putText(video_frame,name_list[serial],(x,y-10),cv.FONT_HERSHEY_PLAIN,1,(255,255,255),2)


        else:
            cv.rectangle(video_frame, (x, y), (x + w, y + h), (0, 0, 255), 2)
            cv.rectangle(video_frame, (x, y), (x + w, y + h), (50, 50, 255), 2)
            cv.rectangle(video_frame, (x, y-40), (x+w,y), (50, 50, 255), -1)
            cv.putText(video_frame,"Unknown",(x,y-19),cv.FONT_HERSHEY_PLAIN,1,(255,255,255),2)



    cv.imshow('Frame',video_frame)

    k = cv.waitKey(1)


cap.release()
cv.destroyAllWindows()
