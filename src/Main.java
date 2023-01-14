import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Астахов Иван Петрович", 1, 23402);
        employees[1] = new Employee("Ермаков Алексей Иванович", 2, 39281);
        employees[2] = new Employee("Мартин Полина Валерьевна", 2, 44829);
        employees[3] = new Employee("Кнауб Владислав Эдуардович", 3, 39520);
        employees[4] = new Employee("Чухряев Илья Александрович", 4, 45293);
        employees[5] = new Employee("Сильвестров Владислав Алексеевич", 5, 28736);
        employees[6] = new Employee("Казакова Алёна Алексеевна", 5, 29873);
        employees[7] = new Employee("Страхова Алиса Александровна", 4, 57890);


        allPrint(employees);
        allSalary(employees);
        minSalary(employees);
        maxSalary(employees);
        averageSalary(employees);
    }

    public static void allPrint(Employee[] arr) {
        for (Employee s : arr) {
            System.out.println(s);
        }
    }

    public static void allSalary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getSalary();
        }
        System.out.println(sum);
    }

    public static void minSalary(Employee[] arr) {
        double min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getSalary()) {
                min = arr[i].getSalary();
            }
        }
        System.out.println(min);
    }

    public static void maxSalary(Employee[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].getSalary()) {
                max = arr[i].getSalary();
            }
        }
        System.out.println(max);
    }

    public static void averageSalary(Employee[] arr) {
        double sum = 0;
        double average;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() != 0) {
                sum = sum + arr[i].getSalary();
                l++;
            }
        }
        System.out.println(l);
        average = sum / l;
        System.out.println(average);
    }
}