from cgitb import grey
import cv2

cap = cv2.VideoCapture(0)

cascade_classifier = cv2.CascadeClassifier('haarcascades/haarcascade_frontalface_default.xml')

while True:
    
     ret,frame = cap.read()
     frame = cv2.cvtColor(frame,0)
     gray = cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY)
     detections = cascade_classifier.detectMultiScale(gray, 1.3 ,5)

     if(len(detections)>0):
        (x,y,z,h) = detections[0]
        frame = cv2.rectangle(frame,(x,y),(x+z,y+h),(255,0,0),2)

     cv2.imshow('Face Detection (class 12th Project)',frame)
     if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()