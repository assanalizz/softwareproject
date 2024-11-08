package controller;

import model.Config;
import model.DataModel;
import view.ConsoleView;

public class MainController {
    private DataModel model;
    private ConsoleView view;
    private Config config;

    public MainController(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
        this.config = Config.getInstance();
    }

    public void updateData(String newData) {
        model.setData(newData);
        view.displayData(config.getAppName() + ": " + model.getData());
    }
}
