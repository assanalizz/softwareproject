import controller.MainController;
import model.DataModel;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        MainController controller = new MainController(model, view);

        controller.updateData("Hello, Design Patterns!");
    }
}
