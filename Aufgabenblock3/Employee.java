package Aufgabenblock3;

public class Employee extends Person{
    private int salary;

    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 100 && salary <= 500) {
            this.salary = salary;
        }
    }

    public Employee(String name, Date dateOfBirth, int salary) {
        super(name, dateOfBirth);
        this.salary = salary;
    }

}
