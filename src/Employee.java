import java.util.Objects;

public class Employee {
    private final String employer;
    private int department;
    private double salary;

    public static int counter = 1;
    private int id;

    public Employee(String employer, int department, double salary) {
        this.employer = employer;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Сотрудник: ");
        sb.append(employer).append(' ');
        sb.append(department);
        sb.append(" ").append(salary);
        sb.append(" id = ").append(id);
        return sb.toString();
    }

    public String getEmployer() {
        return employer;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
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
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(employer, employee.employer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employer, department, salary, id);
    }
}
