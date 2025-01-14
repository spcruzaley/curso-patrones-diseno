package com.patrones.creacionales.factory.confactory.service;

import com.patrones.creacionales.factory.confactory.notification.Notification;
import com.patrones.creacionales.factory.confactory.notification.PushNotification;

public class PushNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
