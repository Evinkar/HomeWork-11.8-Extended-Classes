public class Operator extends Employee{

    public Operator(String name) {
        super(name);

        this.monthSalary =Company.getBASE_RATE(); //всегда базовая ставка
    }

}
