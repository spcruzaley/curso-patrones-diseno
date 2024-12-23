package com.patrones.creacionales.factory.confactory.service;

import com.patrones.creacionales.factory.confactory.notification.Notification;
import com.patrones.creacionales.factory.confactory.notification.SMSNotification;

public class SMSNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
