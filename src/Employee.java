import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String employee;
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

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
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
        return department == employee1.department && Double.compare(employee1.salary, salary) == 0 && id == employee1.id && size == employee1.size && Objects.equals(employee, employee1.employee) && Arrays.equals(employees, employee1.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(employee, department, salary, id, size);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }

    private Employee[] employees;
    private int size;
    public Employee(){
        this.employees = new Employee[10];
    }
    public void addEmployee(String employee, int department, double salary){
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, полный штат!");
        }
        Employee newEmployee = new Employee(employee, department, salary);
        employees[size++] = newEmployee;
    }

    @Override
    public String toString() {
        return  employee + " " +
                " " + department +
                " " + salary +
                " id = " + id;
    }

    public void printAll(){
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public void allSalary(){
        double all = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].getSalary();
            all = all + employees[i].getSalary();
        }
        System.out.println(all);
    }

    public void minSalary() {
        double min = 10000000;
        for (int i = 0; i < size; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        System.out.println(min);
    }
    public void maxSalary() {
        double max = 0;
        for (int i = 0; i < size; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        System.out.println(max);
    }

    public void averageSalary() {
        double all = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].getSalary();
            all = all + employees[i].getSalary();
        }
        System.out.println(all/size);
    }

    public void allEmployees() {
        for (int i = 0; i < size; i++) {
            String employee = employees[i].getEmployee();
            System.out.println(employee);
        }
    }
}
