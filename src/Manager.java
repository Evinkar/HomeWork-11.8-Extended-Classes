import java.util.Random;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
        Random rand = new Random();
        int randomIncome = 115000 + rand.nextInt(144000 - 115000 + 1); //условие задания - рандомный доход приносимый менеджером
        this.monthSalary =(randomIncome/100*5)+Company.getBASE_RATE();
    }
}







