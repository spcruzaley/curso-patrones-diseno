package com.patrones.creacionales.factory.sinfactory.service;

import com.patrones.creacionales.factory.sinfactory.notification.EmailNotification;
import com.patrones.creacionales.factory.sinfactory.notification.SMSNotification;
import com.patrones.creacionales.factory.sinfactory.notification.PushNotification;

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
