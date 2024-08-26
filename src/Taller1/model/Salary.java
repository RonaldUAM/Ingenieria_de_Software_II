package Taller1.model;

public class Salary {
    private long salary;
    private final int hoursEmployee;
    private final int hourPay;

    public Salary(int hoursEmployee, int hourPay) {
        this.hoursEmployee = hoursEmployee;
        this.hourPay = hourPay;
    }

    public void calculateSalary(){
        this.salary = (long) hoursEmployee *hourPay;
    }

    public long getSalary() {
        return salary;
    }
}
