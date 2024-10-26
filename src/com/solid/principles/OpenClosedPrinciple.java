package com.solid.principles;

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        //Notification.notifyCustomer(Notification.messageType.EMAIL, "Your Email application is received");
        //Notification.notifyCustomer(Notification.messageType.SMS, "Your SMS application is received");
         Notification emailNotification = new MailNotification();
         emailNotification.notifyCustomer("Your Email application is received");
         Notification smsNotification = new SMSNotification();
         smsNotification.notifyCustomer("Your SMS application is received");
    }
}
abstract class Notification {
    public abstract void notifyCustomer(String messageBody);
}

class MailNotification extends Notification {

    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("Email Sent. Content is :"+ messageBody);
    }
}

class SMSNotification extends Notification {

    @Override
    public void notifyCustomer(String messageBody) {
        System.out.println("SMS Sent. Content is :"+ messageBody);
    }
}

class PushNotification extends Notification {

    @Override
    public void notifyCustomer(String messageBody) {

    }
}
/*class Notification {
    static String messageBody;
    static public void notifyCustomer(messageType type, String message) {
        if(type.equals(messageType.EMAIL)){
            System.out.println("Email Sent. Content is :"+ message);
        }
        if(type.equals(messageType.SMS)){
            System.out.println("SMS Sent. Content is :"+ message);
        }
    }
    enum messageType{SMS, EMAIL, PUSH}
}*/
