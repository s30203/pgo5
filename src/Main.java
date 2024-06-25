import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        dev.addTechnology(new Technology("Java", 800));
        employees.add(dev);
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        employees.add(tester);
        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        manager.addGoal(new Goal(2010, 10, 15, "Implementing FB login", 1000));
        employees.add(manager);
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");
    }
}