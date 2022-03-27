public class Employee implements Comparable, EmployeeInterface {
    public String name;
    public int monthSalary;

    public Employee(String name) {
        this.name = name;

    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int salary) {
        this.monthSalary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return Integer.compare(employee.monthSalary, monthSalary);
    }
}
