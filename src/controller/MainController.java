package controller;

import model.ExternalService;
import model.ExternalServiceAdapter;

public class MainController {
    private ExternalServiceAdapter externalServiceAdapter;

    public MainController() {
        ExternalService externalService = new ExternalService();

        this.externalServiceAdapter = new ExternalServiceAdapter(externalService);
    }

    public void updateData() {
        String data = externalServiceAdapter.fetchData();
        System.out.println("Updated Data: " + data);
    }
}
