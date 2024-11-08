// model/SystemFacade.java
package model;

public class SystemFacade {
    private ExternalServiceAdapter externalServiceAdapter;

    public SystemFacade() {
        // Создаем объект ExternalService
        ExternalService externalService = new ExternalService();

        // Передаем его в адаптер
        this.externalServiceAdapter = new ExternalServiceAdapter(externalService);
    }

    public void updateData() {
        String data = externalServiceAdapter.fetchData(); // Получаем данные через адаптер
        System.out.println("Updated Data: " + data);
    }
}
