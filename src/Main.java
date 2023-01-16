public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee employee = new Employee();

        employee.addEmployee("Астахов Иван Петрович", 2, 23402);
        employee.addEmployee("Ермаков Пётр Васильевич", 3, 33333);
        employee.addEmployee("Мартин Полина Валерьевна", 2, 45670);
        employee.addEmployee("Чухряев Илья Александрович", 4, 45293);
        employee.addEmployee("Кнауб Владислав Эдуардович", 3, 39520);
        employee.addEmployee("Сильвестров Владислав Алексеевич", 5, 28736);
        employee.addEmployee("Казакова Алёна Алексеевна", 5, 29873);
        employee.addEmployee("Страхова Алиса Александровна", 4, 57890);

        employee.printAll();
        employee.allSalary();
        employee.minSalary();
        employee.maxSalary();
        employee.averageSalary();
        employee.allEmployees();
    }


}