package com.solid.principles;

/*
    Single Responsibility Principle. Should have single responsibility and purpose.
 */

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        ContentImpl service = new ContentImpl();
        service.writeMessage("Hi i am John Doe!");
        service.replaceMessageContent("Hi", "Hello");
    }
}

interface IContentService {
    void writeMessage(String content);
    void replaceMessageContent(String source, String destination);
}

interface IMessageService {
    void printMessage(String content);
    void sendMessage(String content);
}

class MessageImpl implements IMessageService {

    @Override
    public void printMessage(String content) {
        System.out.println("Message is :"+content);
    }

    @Override
    public void sendMessage(String content) {
        System.out.println("Message is sent and Content is :"+content);
    }
}

class ContentImpl implements IContentService {
    String content;

    IMessageService service = new MessageImpl();

    @Override
    public void writeMessage(String msg) {
        content = msg;
        service.printMessage(content);
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
        service.sendMessage(content);
    }
}
