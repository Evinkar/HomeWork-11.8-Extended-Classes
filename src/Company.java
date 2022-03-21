import java.util.ArrayList;
import java.util.Collections;

public class Company {

    public static final int BASE_RATE = 50000;  //базовая ставка
    public static int companyIncome;            //доход компании
    static ArrayList<Employee>employees = new ArrayList<>(); //список сотрудников



    public static void hire(String name, String post){   //найм сотрудников на должности поштучно
        switch (post){
            case ("Manager"):
                employees.add(new Manager(name));
                System.out.println("Менеджер " + name + " нанят");
                break;
            case ("TopManager"):
                employees.add(new TopManager(name));
                System.out.println("ТОПМенеджер " + name + " нанят");
                break;
            case ("Operator"):
                employees.add(new Operator(name));
                System.out.println("Оператор " + name + " нанят");
                break;
            default:
                System.out.println("Error");
                break;
            }
    }
    public static void hireAll (ArrayList<Employee>employeeList){  //найм списка сотрудников
        employees.addAll(employeeList);
    }
    public static void fire(String name){                       //увольнение сотрудника по имени
        employees.removeIf(empl -> empl.name.contains(name));
        System.out.println("Сотрудник " + name + " уволен");
    }



    public static int getCompanyIncome() {
        return companyIncome;
    }

    public static ArrayList<Employee> getTopSalaryStaff(int count){  //условие задания. Создание списка с самым высоким уровнем зарплат
        Collections.sort(employees);
        ArrayList<Employee> topSalaryStaff = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            topSalaryStaff.add(employees.get(i));
        }
        for (Employee empl: topSalaryStaff) {
            System.out.println("TOP " + empl.getClass()+" "+empl.getName() + " " + empl.getMonthSalary());
        }

        return null;
    }
    public static ArrayList<Employee> getLowestSalaryStaff(int count){//условие задания. Создание списка с самым низким уровнем зарплат
        Collections.sort(employees);
        ArrayList<Employee> lowestSalaryStaff = new ArrayList<>();
        for (int i = employees.size()-1; i > (employees.size()-count-1); i--) {
            lowestSalaryStaff.add(employees.get(i));
        }
        for (Employee empl: lowestSalaryStaff) {
            System.out.println("Flop " + empl.getClass()+" "+empl.getName() + " " + empl.getMonthSalary());
        }
        return null;
    }

    public static int getBASE_RATE() {
        return BASE_RATE;
    }
    public static void printAllEmployeeSalary(){

        for (Employee empl: employees) {
            System.out.println(empl.getClass()+" "+empl.getName() + " " + empl.getMonthSalary());
        }
    }
}

