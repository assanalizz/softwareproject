package model;

public class WelcomeMessage implements Message {
    @Override
    public String getContent() {
        return "Welcome to our application!";
    }
}
