package com.patrones.factory.confactory.service;

import com.patrones.factory.confactory.notification.Notification;

public abstract class NotificationService {

    public abstract Notification createNotification();

    public void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
