package com.patrones.creacionales.factory.confactory.notification;

public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending a Push Notification...");
    }
}
