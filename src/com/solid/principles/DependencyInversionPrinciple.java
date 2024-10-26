package com.solid.principles;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
       NotifyCustomer notifyCustomer = new NotifyCustomer(new MailService());
       notifyCustomer.notifyCustomer();
        NotifyCustomer notifyCustomer1 = new NotifyCustomer(new SmsService());
        notifyCustomer1.notifyCustomer();
        NotifyCustomer notifyCustomer3 = new NotifyCustomer(new PushService());
        notifyCustomer3.notifyCustomer();
    }
}
interface INotifyService {
    void notifyCustomer();
}

class PushService implements INotifyService {

    @Override
    public void notifyCustomer() {
        System.out.println("Push Notification sent.");
    }
}

class MailService implements INotifyService {
    /*void sentEmail(){
        System.out.println("Email Sent to the customer.");
    }*/

    @Override
    public void notifyCustomer() {
        System.out.println("Email Sent to the customer.");
    }
}

class SmsService implements INotifyService{
    /*void sentSms(){
        System.out.println("SMS sent to customer.");
    }*/
    @Override
    public void notifyCustomer() {
        System.out.println("SMS sent to customer.");
    }

}

class NotifyCustomer {
    private INotifyService service;

    public NotifyCustomer(INotifyService service) {
        this.service = service;
    }
    public void notifyCustomer(){
        service.notifyCustomer();
    }
}
