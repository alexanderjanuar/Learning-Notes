import cv2 as cv
import time

# cap = cv2.VideoCapture(0)


def detect_bounding_box(vid,face_classifier):
    gray_image = cv.cvtColor(vid, cv.COLOR_BGR2GRAY)
    faces = face_classifier.detectMultiScale(gray_image, 1.1, 5, minSize=(40, 40))
    for (x, y, w, h) in faces:
        cv.rectangle(vid, (x, y), (x + w, y + h), (0, 255, 0), 2)
    return faces

def main():       
    pTime = 0
    cTime = 0
    cap = cv.VideoCapture(0)
    haar_cascade = cv.CascadeClassifier('haar_cascade.xml')
    while True:
        result, video_frame = cap.read()
        if result is False:
            break  

        # Get FPS
        cTime = time.time()
        fps = 1/(cTime - pTime)
        pTime = cTime

        # Write FPS to the screen
        cv.putText(video_frame, str(int(fps)), (10, 70),
                    cv.FONT_HERSHEY_PLAIN, fontScale=3,
                    color=(255, 0, 255), thickness=2)

        faces = detect_bounding_box(video_frame,haar_cascade)  

        cv.imshow("My Face Detection Project", video_frame)  

        if cv.waitKey(1) & 0xFF == ord("q"):
            break



if __name__ == '__main__':
    main()