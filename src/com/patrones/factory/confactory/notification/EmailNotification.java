package com.patrones.factory.confactory.notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification...");
    }
}
