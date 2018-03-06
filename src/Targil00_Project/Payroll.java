package Targil00_Project;

public class Payroll {
    public static void main(String[] args) {

        //creating an array of three employees
        Employee[] arr = new Employee[3];

        arr[0] = new HourlyEmployee("Shalom", "Rochman", "206341448", 40, 35);
        arr[1] = new CommissionEmployee("a", "aa", "111", 3561, 25);
        arr[2] = new BasePlusCommissionEmployee("b", "bb", "222", 5231, 28, 6521);

        System.out.println("------------");
        for(Employee emp : arr){
            System.out.println(emp);
            System.out.println(emp.earnings() + " NIS");
            if(emp instanceof BasePlusCommissionEmployee){
                System.out.println("after bonus: " + emp.earnings()*1.1);
            }
            System.out.println("------------");
        }
    }
}
