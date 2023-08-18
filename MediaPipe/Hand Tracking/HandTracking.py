import cv2
import mediapipe as mp
import time


class HandTrack():
    def __init__(self, mode=False, maxHands=2, detectionconf=0.5, trackconf=0.5):
        self.mode = mode
        self.maxHands = maxHands
        self.detectionconf = detectionconf
        self.trackconf = trackconf

        self.mpHands = mp.solutions.hands
        self.hands = self.mpHands.Hands(static_image_mode = self.mode,max_num_hands= self.maxHands,
                                        min_detection_confidence= self.detectionconf, min_tracking_confidence= self.trackconf)
        self.mpDraw = mp.solutions.drawing_utils

    def find_hands(self, img, draw=True):
        imgRGB = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
        self.results = self.hands.process(imgRGB)

        if (self.results.multi_hand_landmarks):
            for handLMS in self.results.multi_hand_landmarks:
                if draw:
                    self.mpDraw.draw_landmarks(img, handLMS,
                                               self.mpHands.HAND_CONNECTIONS)
        return img
    
    def findPosition(self, img, handNumber = 0, draw = True):

        lmlist = []
        if self.results.multi_hand_landmarks:
            num_hands = self.results.multi_hand_landmarks[handNumber]      
            for ID, lm in enumerate(num_hands.landmark):
                h, w ,c = img.shape
                cx, cy = int(lm.x * w), int(lm.y * h)
                lmlist.append([ID,cx,cy])
                if draw:
                    cv2.circle(img = img, center = (cx,cy), radius = 5, color = (255,0,255), thickness = cv2.FILLED)

        return lmlist

cap = cv2.VideoCapture(0)
pTime = 0
cTime = 0

while True:
    success,img = cap.read()

    detector = HandTrack()
    img = detector.find_hands(img)
    lmlist = detector.findPosition(img)

    # Get FPS
    cTime = time.time()
    fps = 1/(cTime - pTime)
    pTime = cTime

    # Write FPS to the screen
    cv2.putText(img, str(int(fps)), (10, 70),
                cv2.FONT_HERSHEY_PLAIN, fontScale=3,
                color=(255, 0, 255), thickness=3)
    cv2.imshow("Image", img)
    if cv2.waitKey(20) & 0xFF == ord('d'):
        break
