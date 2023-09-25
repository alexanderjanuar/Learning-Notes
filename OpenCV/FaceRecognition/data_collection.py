import cv2 as cv

cap = cv.VideoCapture(0)

haar_cascade = cv.CascadeClassifier('haar_cascade.xml')

id = input("Input your ID : ")
count = 0
while True:
    result, video_frame = cap.read()
    gray_image = cv.cvtColor(video_frame, cv.COLOR_BGR2GRAY)

    faces = haar_cascade.detectMultiScale(gray_image, 1.1, 8)
    for (x, y, w, h) in faces:
        count+=1
        cv.imwrite('datasets/User.'+str(id)+'.'+str(count)+'.jpg',gray_image[y:y+h , x:x+w])
        cv.rectangle(video_frame, (x, y), (x + w, y + h), (0, 255, 0), 2)

    cv.imshow('Frame',video_frame)

    k = cv.waitKey(1)

    if count>500:
        break

cap.release()
cv.destroyAllWindows()
print("======== Data Collection Complete ========")