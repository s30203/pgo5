import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class Manager extends Employee {
    public List<Goal> goals = new ArrayList<>();
    public Manager(String imie, String nazwisko, String address, String email, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, address, email, pesel, rokZatrudnienia);
    }
    public void addGoal(Goal goal) {
        goals.add(goal);
    }
    @Override
    public int calculateSalary() {
        int pensja = super.calculateSalary();
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        for (Goal goal : goals) {
            if (goal.getYear() == currentYear && goal.getMonth() == currentMonth) {
                pensja += goal.getBonus();
            }
        }
        return pensja;
    }
}
