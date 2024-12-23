package com.patrones.creacionales.factory.sinfactory;

import com.patrones.creacionales.factory.sinfactory.service.NotificationService;

public class Contexto {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        // El cliente decide qué tipo de notificación enviar
        service.sendNotification("EMAIL"); // Output: Sending an Email Notification...
        service.sendNotification("SMS");   // Output: Sending an SMS Notification...
        service.sendNotification("PUSH");  // Output: Sending a Push Notification...
    }
}
