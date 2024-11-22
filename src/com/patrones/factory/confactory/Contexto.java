package com.patrones.factory.confactory;

import com.patrones.factory.confactory.service.EmailNotificationService;
import com.patrones.factory.confactory.service.NotificationService;
import com.patrones.factory.confactory.service.PushNotificationService;
import com.patrones.factory.confactory.service.SMSNotificationService;

public class Contexto {

    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.sendNotification(); // Output: Sending an Email Notification...

        NotificationService smsService = new SMSNotificationService();
        smsService.sendNotification(); // Output: Sending an SMS Notification...

        NotificationService pushService = new PushNotificationService();
        pushService.sendNotification(); // Output: Sending a Push Notification...
    }
}
