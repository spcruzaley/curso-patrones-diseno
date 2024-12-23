package com.patrones.creacionales.factory.confactory.service;

import com.patrones.creacionales.factory.confactory.notification.EmailNotification;
import com.patrones.creacionales.factory.confactory.notification.Notification;

public class EmailNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
