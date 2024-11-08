
// controller/MainController.java
package controller;

import model.ExternalServiceAdapter;

public class MainController {
    private ExternalServiceAdapter externalServiceAdapter;

    public MainController() {
        // Создаем экземпляр адаптера
        this.externalServiceAdapter = new ExternalServiceAdapter();
    }

    public void updateData() {
        // Используем адаптер для получения данных
        String data = externalServiceAdapter.fetchData();
        System.out.println("Updated Data: " + data);
    }
}
