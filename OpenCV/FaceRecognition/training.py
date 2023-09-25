import cv2 as cv
import numpy as np
from PIL import Image
import os

path = 'datasets'

recognizer = cv.face.LBPHFaceRecognizer_create()

def getImageID(path):
    imagePath = [os.path.join(path,f) for f in os.listdir(path)]
    faces = []
    ids = []

    for imagePaths in  imagePath:
        faceImage = Image.open(imagePaths).convert('L')
        facesNP = np.array(faceImage)
        Id = (os.path.split(imagePaths)[-1].split(".")[1])
        Id = int(Id)

        faces.append(facesNP)
        ids.append(Id)

    return ids,faces

IDs,faces = getImageID(path)
recognizer.train(faces, np.array(IDs))
recognizer.write('Trainer.yml')

print("Training Complete")
