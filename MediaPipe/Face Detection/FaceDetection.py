import cv2 as cv
import mediapipe as mp
import time

class FaceDetection():
    def __init__(self,min_conf = 0.5):
        
        self.min_detection_confidence = min_conf

        #Face Detection Module
        self.mpFaceDetection = mp.solutions.face_detection
        self.mpDraw = mp.solutions.drawing_utils
        self.face_detection = self.mpFaceDetection.FaceDetection()

    def find_face(self,img,draw = True):
        imgRGB = cv.cvtColor(img, cv.COLOR_BGR2RGB)
        results = self.face_detection.process(imgRGB)
        bboxs = []
        if results.detections:
            for id,detection in enumerate(results.detections):
                #Draw Bounding Box Using Module
                #mpDraw.draw_detection(image = img, detection = detection)

                #Draw Bounding Box Manually
                bboxC = detection.location_data.relative_bounding_box
                ih, iw, ic = img.shape
                bbox = int(bboxC.xmin * iw), int(bboxC.ymin * ih), int(bboxC.width * iw), int(bboxC.height * ih)
                bboxs.append([bbox,detection.score])

                cv.rectangle(img = img, rec = bbox, color = (255,0,255), thickness = 2)
                cv.putText(img = img, text = f'{int(detection.score[0] * 100)}%',
                            org = (bbox[0], bbox[1] - 20), fontFace = cv.FONT_HERSHEY_PLAIN,
                            fontScale = 2, color = (255,0,255), thickness = 2)
        
        return img, bboxs
                

def main():       
    cap = cv.VideoCapture(0)
    pTime = 0
    cTime = 0
    detector = FaceDetection()

    while True:
        success, img = cap.read()
        img_Result = detector.find_face(img = img,draw = True)
        
        # Get FPS
        cTime = time.time()
        fps = 1/(cTime - pTime)
        pTime = cTime

        # Write FPS to the screen
        cv.putText(img, str(int(fps)), (10, 70),
                    cv.FONT_HERSHEY_PLAIN, fontScale=3,
                    color=(255, 0, 255), thickness=2)

        cv.imshow("Image",img)
        if cv.waitKey(20) & 0xFF == ord('d'):
            break

if __name__ == '__main__':
    main()