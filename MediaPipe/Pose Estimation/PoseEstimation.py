import cv2 as cv
import mediapipe as mp
import time


class poseDetector():

    def __init__(self,static_image_mode = False, upper_body_only = False, smooth_landmarks = False, 
                 min_detection_confidence = 0.5,min_tracking_confidence = 0.5):
        self.mode = static_image_mode
        self.upbody = upper_body_only
        self.smooth = smooth_landmarks
        self.detectionCon = min_detection_confidence
        self.trackCon = min_tracking_confidence

        self.mpDraw = mp.solutions.drawing_utils
        self.mpPose = mp.solutions.pose
        self.pose = self.mpPose.Pose()

    def find_pose(self,img,draw = True):
        imgRGB = cv.cvtColor(img, cv.COLOR_BGR2RGB)
        self.results = self.pose.process(imgRGB)
        if self.results.pose_landmarks:
            if draw:
                self.mpDraw.draw_landmarks(image = img, landmark_list = self.results.pose_landmarks,
                                            connections = self.mpPose.POSE_CONNECTIONS)

        return img
    
    def get_position(self, img, draw = True):
        lmlist = []
        if self.results.pose_landmarks:    
            for ID, lm in enumerate(self.results.pose_landmarks.landmark):
                h, w ,c = img.shape
                cx, cy = int(lm.x * w), int(lm.y * h)
                lmlist.append([ID,cx,cy])
                if draw:
                    cv.circle(img = img, center = (cx,cy), radius = 5, color = (255,0,255), thickness = cv.FILLED)

        return lmlist

def main():
    pTime = 0
    cTime = 0
    cap = cv.VideoCapture(0)
    detector = poseDetector()

    while True:
        success, img = cap.read()
        detector.find_pose(img)
        lmlist = detector.get_position(img = img, draw = True)

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


if __name__ == '__main__':
    main()