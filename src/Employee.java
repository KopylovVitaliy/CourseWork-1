import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private final String employee;
    private int department;
    private double salary;
    public static int counter = 1;
    private int id;


    public Employee(String employee, int department, double salary) {
        this.employee = employee;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getEmployee() {
        return employee;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return department == employee1.department && Double.compare(employee1.salary, salary) == 0 && id == employee1.id && Objects.equals(employee, employee1.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, department, salary, id);
    }

    @Override
    public String toString() {
        return employee + " " +
                 + department +
                " " + salary +
                " id = " + id
                ;
    }
}
