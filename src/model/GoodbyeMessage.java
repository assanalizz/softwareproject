package model;

public class GoodbyeMessage implements Message {
    @Override
    public String getContent() {
        return "Thank you for using our application!";
    }
}
