package com.patrones.factory.sinfactory.service;

import com.patrones.factory.sinfactory.notification.EmailNotification;
import com.patrones.factory.sinfactory.notification.PushNotification;
import com.patrones.factory.sinfactory.notification.SMSNotification;

public class NotificationService {

    public void sendNotification(String type) {
        // El cliente decide qué tipo de notificación crear
        if (type.equalsIgnoreCase("EMAIL")) {
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.notifyUser();
        } else if (type.equalsIgnoreCase("SMS")) {
            SMSNotification smsNotification = new SMSNotification();
            smsNotification.notifyUser();
        } else if (type.equalsIgnoreCase("PUSH")) {
            PushNotification pushNotification = new PushNotification();
            pushNotification.notifyUser();
        } else {
            throw new IllegalArgumentException("Unsupported notification type: " + type);
        }
    }
}
