import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Астахов Иван Петрович", 2, 23402);
        employeeBook.addEmployee("Ермаков Пётр Васильевич", 3, 33333);
        employeeBook.addEmployee("Мартин Полина Валерьевна", 1, 45670);
        employeeBook.addEmployee("Чухряев Илья Александрович", 4, 45293);
        employeeBook.addEmployee("Кнауб Владислав Эдуардович", 3, 39520);
        employeeBook.addEmployee("Сильвестров Владислав Алексеевич", 1, 28736);
        employeeBook.addEmployee("Казакова Алёна Алексеевна", 5, 29873);
        employeeBook.addEmployee("Страхова Алиса Александровна", 4, 57890);

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Напечатать список всех сотрудников");
            System.out.println("2 - Показать общую зарплату всех сотрудников");
            System.out.println("3 - Показать сотрудника с минимальной зарплатой");
            System.out.println("4 - Показать сотрудника с самой высокой зарплатой");
            System.out.println("5 - Показать среднюю зарплату");
            System.out.println("6 - Показать Ф.И.О. сотрудников");
            System.out.println("7 - Изменить зарплату всех сотрудников на L процентов");
            System.out.println("8 - Удалить сотрудника");
            System.out.println("9 - Показать сотрудников, зарплата которых меньше введённого показателя");
            System.out.println("10 - Показать сотрудников, зарплата которых выше введённого показателя");
            System.out.println("11 - Добавить сотрудника");
            System.out.println("12 - Перевод сотрудника в другой отдел и изменение его заработной платы");
            System.out.println("13 - Отсортировать сотрудников по отделениям");
            System.out.println("0 - Выход");

            int command = scanner.nextInt();

            if (command == 1) {
                employeeBook.printAll();
            } else if (command == 2) {
                employeeBook.allSalary();
            } else if (command == 3) {
                employeeBook.minSalary();
            } else if (command == 4) {
                employeeBook.maxSalary();
            } else if (command == 5) {
                employeeBook.averageSalary();
            } else if (command == 6) {
                employeeBook.allEmployees();
            } else if (command == 7) {
                System.out.println("Введите значение процента, на которое вы хотиете изменить зарплату сотрудников");
                double l = scanner.nextDouble();
                employeeBook.changeAllSalary(l);
            } else if (command == 8) {
                System.out.println("Для удаления сотрудника необходимо ввести Фамилию и ID сотрудника");
                System.out.println("Введите фамилию сотрудника с большой буквы");
                String x;
                x = scanner.next();
                System.out.println("Введите ID сотрудника");
                int y = scanner.nextInt();
                employeeBook.removeEmployee(x, y);
            } else if (command == 9) {
                System.out.println("Введите значение");
                int x = scanner.nextInt();
                employeeBook.salaryIsLess(x);
            } else if (command == 10) {
                System.out.println("Введите значение");
                int x = scanner.nextInt();
                employeeBook.salaryIsHigh(x);
            } else if (command == 11) {
                System.out.println("Введите Ф.И.О. сотрудника. Данные вводятся через. Пример ввода: Иванов_Иван_Иванович.");
                String x = scanner.next();
                System.out.println("Введите номер отдела от 1 до 5");
                int y = scanner.nextInt();
                if (y > 5 || y < 0) {
                    System.out.println("Введён некорректный отдел");
                    break;
                }
                System.out.println("Введите зарплату сотрудника");
                double z = scanner.nextDouble();
                if (z < 0) {
                    System.out.println("Зарплата не может быть отрицательной");
                    break;
                }
                employeeBook.addEmployee(x, y, z);

            } else if (command == 12) {
                System.out.println("Введите Ф.И.О. сотрудника. Данные вводятся через. Пример ввода: Иванов_Иван_Иванович.");
                String x = scanner.next();
                System.out.println("Введите новый номер отдела от 1 до 5");
                int y = scanner.nextInt();
                if (y > 5 || y < 0) {
                    System.out.println("Введён некорректный отдел");
                    break;
                }
                System.out.println("Введите новую зарплату сотрудника");
                double z = scanner.nextDouble();
                if (z < 0) {
                    System.out.println("Зарплата не может быть отрицательной");
                    break;
                }
                employeeBook.changeEmployee(x, y, z);
            } else if (command == 13) {
                employeeBook.employeesSortDeportment();
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
    }
}