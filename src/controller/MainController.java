package controller;

import model.DataModel;
import view.ConsoleView;

public class MainController {
    private DataModel model;
    private ConsoleView view;

    public MainController(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void updateData(String newData) {
        model.setData(newData);
        view.displayData(model.getData());
    }
}
