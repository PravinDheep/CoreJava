package com.workouts.corejava.factory;
import com.workouts.corejava.factory.Notification;
class NotificationService {
   public static void main(String[] args){
      NotificationFactory factory = new NotificationFactory();
      
      Notification notify = factory.createNotification("Sms");
      
      notify.notifyUser();
   }
}
