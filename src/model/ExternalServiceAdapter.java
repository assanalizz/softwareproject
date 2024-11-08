package model;

public class ExternalServiceAdapter {
    private ExternalService externalService;

    public ExternalServiceAdapter(ExternalService externalService) {
        this.externalService = externalService;
    }

    public String fetchData() {
        return externalService.getData(); // Используем метод из ExternalService
    }
}
