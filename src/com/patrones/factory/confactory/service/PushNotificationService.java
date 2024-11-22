package com.patrones.factory.confactory.service;

import com.patrones.factory.confactory.notification.Notification;
import com.patrones.factory.confactory.notification.PushNotification;

public class PushNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
