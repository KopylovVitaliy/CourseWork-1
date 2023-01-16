import java.util.Arrays;
import java.util.Objects;


public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String employee, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, полный штат!");
        }
        Employee newEmployee = new Employee(employee.replace('_', ' '), department, salary);
        employees[size++] = newEmployee;


    }

    public void removeEmployee(String employee, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getEmployee().equals(employee) || employees[i].getId() == id) {
                System.out.println(employees[i].getEmployee() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }


    public void printAll() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);

        }
    }

    public void allSalary() {
        double all = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].getSalary();
            all = all + employees[i].getSalary();
        }
        System.out.println("Общая зарплата всех сотрудников " + all + " Рублей.");
    }

    public void minSalary() {
        double min = 10000000;
        for (int i = 0; i < size; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            if (min == employees[i].getSalary()) {
                System.out.println("Сотрудник с самой низкой зарплатой: " + employees[i].getEmployee());
            }
        }
    }

    public void maxSalary() {
        double max = 0;
        for (int i = 0; i < size; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            if (max == employees[i].getSalary()) {
                System.out.println("Сотрудник с самой высокой зарплатой: " + employees[i].getEmployee());
            }
        }

    }

    public void averageSalary() {
        double all = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].getSalary();
            all = all + employees[i].getSalary();
        }
        System.out.println("Средняя зарплата: " + all / size);
    }

    public void allEmployees() {
        System.out.println("Ф.И.О. всех сотрудников: ");
        for (int i = 0; i < size; i++) {
            String employee = employees[i].getEmployee();
            System.out.println(employee);
        }
    }

    public void employeesSortDeportment() {
        System.out.println("Сортировака по отделениям");
        int dep = 1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == 1) {
                System.out.println(employees[i]);
            }
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == 2) {
                System.out.println(employees[i]);
            }
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == 3) {
                System.out.println(employees[i]);
            }
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == 4) {
                System.out.println(employees[i]);
            }
        }
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == 5) {
                System.out.println(employees[i]);
            }
        }


    }

    public void changeEmployee(String employee, int deport, double salary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployee().equals(employee.replace('_', ' '))) {
                employees[i].setDepartment(deport);
                employees[i].setSalary(salary);
            }
        }
    }

    public void changeAllSalary(double l) {
        double percent = l / 100;
        for (int i = 0; i < size; i++) {
            employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() * percent));
        }
    }

    public void salaryIsLess(double salary) {
        System.out.println("Сотрудники, зарплата которых меньше: " + salary);
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println(employees[i]);
            }
        }
    }

    public void salaryIsHigh(double salary) {
        System.out.println("Сотрудники, зарплата которых выше: " + salary);
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > salary) {
                System.out.println(employees[i]);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return size == that.size && Arrays.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }
}
