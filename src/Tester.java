import java.util.ArrayList;
import java.util.List;

class Tester extends Employee {
    public List<String> testTypes = new ArrayList<>();
    public Tester(String imie, String nazwisko, String address, String email, String pesel, int rokZatrudnienia) {
        super(imie, nazwisko, address, email, pesel, rokZatrudnienia);
    }
    public void addTestType(String testType) {
        testTypes.add(testType);
    }
    @Override
    public int calculateSalary() {
        int pensja = super.calculateSalary();
        pensja += testTypes.size() * 300;
        return pensja;
    }
}