package com.workouts.corejava.factory;
import com.workouts.corejava.factory.Notification;
import java.lang.Override;
class EmailNotification implements Notification {
    @Override
    public void notifyUser(){
    	System.out.println("I am from EmailNotification");
    }
}
