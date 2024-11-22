package com.patrones.factory.confactory.service;

import com.patrones.factory.confactory.notification.EmailNotification;
import com.patrones.factory.confactory.notification.Notification;

public class EmailNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
