package com.patrones.factory.confactory.service;

import com.patrones.factory.confactory.notification.Notification;
import com.patrones.factory.confactory.notification.SMSNotification;

public class SMSNotificationService extends NotificationService {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
