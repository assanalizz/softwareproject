package model;

public class MessageFactory {
    public Message createMessage(String type) {
        if (type.equalsIgnoreCase("welcome")) {
            return new WelcomeMessage();
        } else if (type.equalsIgnoreCase("goodbye")) {
            return new GoodbyeMessage();
        }
        return null;
    }
}
