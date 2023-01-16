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
        employeeBook.addEmployee("Сильвестров Владислав Алексеевич", 5, 28736);
        employeeBook.addEmployee("Казакова Алёна Алексеевна", 5, 29873);
        employeeBook.addEmployee("Страхова Алиса Александровна", 4, 57890);


        employeeBook.printAll();
        employeeBook.allSalary();
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.averageSalary();
        employeeBook.allEmployees();
        employeeBook.removeEmployee(null, 5);
        employeeBook.printAll();
        employeeBook.addEmployee("Астахов Иван Васильевич", 2, 23402);
        employeeBook.printAll();
        employeeBook.employeesDeportment();


    }
}