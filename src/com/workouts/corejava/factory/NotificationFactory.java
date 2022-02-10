package com.workouts.corejava.factory;
import com.workouts.corejava.factory.Notification;
class NotificationFactory {
   public Notification createNotification(String channel){
   	if(channel == null || channel.isEmpty()){
   	     return null;
   	}
   	if("SMS".equalsIgnoreCase(channel)){
   	   return new SMSNotification();		
   	} else if("EMAIL".equalsIgnoreCase(channel)){
   	   return new EmailNotification();		
   	} else if("PUSH".equalsIgnoreCase(channel)){
   	   return new PushNotification();	
   	}
   	return null;
   }
}
