import java.util.ArrayList;
import java.util.List;

class Developer extends Employee {
    public List<Technology> technologies = new ArrayList<>();
    public Developer(String imie, String nazwisko, String address, String email, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, address, email, pesel, rokZatrudnienia);
    }
    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }
    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        for (Technology tech : technologies) {
            baseSalary += tech.getBonus();
        }
        return baseSalary;
    }
}