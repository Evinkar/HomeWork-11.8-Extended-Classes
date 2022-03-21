public class TopManager extends Employee {

    public TopManager(String name) {
        super(name);
        int turnoverPlan = 10000000;  // план компании по товарообороту
        if (Company.getCompanyIncome() > turnoverPlan){
            this.monthSalary = Company.getBASE_RATE()+(int) (Company.getBASE_RATE()*1.5); //базовая ставка + 150% от базовой ставки в случае выполнения плана
        } else {
            this.monthSalary =Company.getBASE_RATE();
        }
    }


}

