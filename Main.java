import controller.EmployeeController;
import model.EmployeeDAO;
import view.EmployeeView;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(dao, view);

        controller.fetchAndDisplayEmployees();
    }
}
