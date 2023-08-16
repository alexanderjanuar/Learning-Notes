import cv2 as cv
import mediapipe as mp
import time

class FaceDetection():
    def __init__(self,min_conf = 0.5):
        
        self.min_detection_confidence = min_conf

        #Face Detection Module
        self.mpFaceDetection = mp.solutions.face_detection
        self.mpDraw = mp.solutions.drawing_utils
        self.face_detection = mpFaceDetection.FaceDetection()

    def find_face(img,draw = True):
        imgRGB = cv.cvtColor(img, cv.COLOR_BGR2RGB)
        results = self.face_detection.process(imgRGB)

        if results.detections:
            for id,detection in enumerate(results.detections):
                #Draw Bounding Box Using Module
                #mpDraw.draw_detection(image = img, detection = detection)

                #Draw Bounding Box Manually
                bboxC = detection.location_data.relative_bounding_box
                


cap = cv.VideoCapture("OpenCV/assets/Talking.mp4")
pTime = 0
cTime = 0



while True:
    success, img = cap.read()
    
    

    # Get FPS
    cTime = time.time()
    fps = 1/(cTime - pTime)
    pTime = cTime

    # Write FPS to the screen
    cv.putText(img, str(int(fps)), (10, 70),
                cv.FONT_HERSHEY_PLAIN, fontScale=3,
                color=(255, 0, 255), thickness=2)

    cv.imshow("Image",img)
    cv.waitKey(1)