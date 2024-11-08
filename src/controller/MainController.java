package controller;

import model.Config;
import model.DataModel;
import model.Message;
import model.MessageFactory;
import view.ConsoleView;

public class MainController {
    private DataModel model;
    private ConsoleView view;
    private Config config;
    private MessageFactory messageFactory;

    public MainController(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
        this.config = Config.getInstance();
        this.messageFactory = new MessageFactory();
    }

    public void updateData(String newData) {
        model.setData(newData);
        Message welcomeMessage = messageFactory.createMessage("welcome");
        view.displayData(config.getAppName() + ": " + welcomeMessage.getContent() + " - " + model.getData());
    }
}
