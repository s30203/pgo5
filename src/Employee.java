import java.util.Calendar;

class Employee {
    public String imie;
    public String nazwisko;
    public String address;
    public String email;
    public String pesel;
    public int rokZatrudnienia;
    public Employee(String imie, String nazwisko, String address, String email, String pesel, int rokZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
    }
    public int calculateSalary() {
        int baseSalary = 3000 + (Calendar.getInstance().get(Calendar.YEAR) - rokZatrudnienia) * 1000;
        return baseSalary;
    }
}