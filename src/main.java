import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {


        Company.companyIncome = 30000000;

        Company.hire("Евгений","Manager");          //ручной найм сотрудников.
        Company.hire("Константин","Operator");
        Company.hire("Peter", "Manager");
        Company.hire("Gordon", "TopManager");
        Company.hire("Peter", "Operator");
        Company.hire("Peter", "Operator");
        Company.hire("Pablo", "Operator");
        Company.hire("Genry", "Manager");
        Company.hire("Sofy", "TopManager");
        Company.hire("Helga", "Operator");
        Company.hire("Fred", "Manager");

        Company.fire("Fred");



        Company.printAllEmployeeSalary();

        ArrayList <Employee> hireList = new ArrayList<>();
        for (int i = 1; i < 181; i++) {                         //найм 180 опереаторов
            hireList.add(new Operator("noname Operator " + i));
        }
        for (int i = 1; i < 81; i++) {                         //найм 80 менеджеров
            hireList.add(new Manager("noname Manager " + i));
        }
        for (int i = 1; i < 11; i++) {                         //найм 10 Топ менеджеров
            hireList.add(new TopManager("noname TopManager " + i));
        }
        Company.hireAll(hireList);

        Company.getTopSalaryStaff(15);
        System.out.println();
        Company.getLowestSalaryStaff(30);

    }
}
