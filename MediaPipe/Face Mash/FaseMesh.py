import mediapipe as mp
import cv2 as cv
import time

class FaceMesh():
    def __init__(self, image_mode = False, num_faces = 2, detectionCon = 0.5, trackCon = 0.5):

        self.imageMode= image_mode
        self.num_faces = num_faces
        self.detectionCon = detectionCon
        self.trackCon = trackCon

        self.mpDraw = mp.solutions.drawing_utils
        self.mpFaceMesh = mp.solutions.face_mesh
        self.faceMesh = self.mpFaceMesh.FaceMesh(static_image_mode=self.imageMode, max_num_faces=self.num_faces,
                                                 min_detection_confidence=self.detectionCon,min_tracking_confidence=self.trackCon)
        self.drawSpec = self.mpDraw.DrawingSpec(color=(0,255,0),thickness=1,circle_radius=1)

    def findMesh(self,img, draw = True):

        imgRGB = cv.cvtColor(img, cv.COLOR_BGR2RGB)
        self.results = self.faceMesh.process(imgRGB)

        if (self.results.multi_face_landmarks):
            for faceLMS in self.results.multi_face_landmarks:
                if draw:
                    self.mpDraw.draw_landmarks(img, faceLMS,
                                               self.mpFaceMesh.FACEMESH_CONTOURS,
                                               self.drawSpec,self.drawSpec)
        return img



def main():
    pTime = 0
    cTime = 0
    cap = cv.VideoCapture(f'MediaPipe/assets/Talking.mp4')
    detector = FaceMesh()

    while True:
        success, img = cap.read()
        detector.findMesh(img)

        # Get FPS
        cTime = time.time()
        fps = 1/(cTime - pTime)
        pTime = cTime

        # Write FPS to the screen
        cv.putText(img, str(int(fps)), (10, 70),
                    cv.FONT_HERSHEY_PLAIN, fontScale=3,
                    color=(255, 0, 255), thickness=3)
        cv.imshow("Image", img)
        if cv.waitKey(20) & 0xFF == ord('d'):
            break

if __name__ == "__main__":
    main()