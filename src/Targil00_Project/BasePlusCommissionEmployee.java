package Targil00_Project;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    //CTOR
    public BasePlusCommissionEmployee(String firstName, String lastName, String id, double grossSales, double commision, double baseSalary) {
        super(firstName, lastName, id, grossSales, commision);
        setBaseSalary(baseSalary);
    }

    //default CTOR
    public BasePlusCommissionEmployee() {
        setBaseSalary(0);
    }

    //copy CTOR
    public BasePlusCommissionEmployee(BasePlusCommissionEmployee b_emp){
        super((CommissionEmployee) b_emp);
        if(b_emp != null){
            setBaseSalary(b_emp.getBaseSalary());
        }
    }

    //set function
    public void setBaseSalary(double baseSalary) {
        if(baseSalary >= 0){
            this.baseSalary = baseSalary;
        }
        else{
            throw new IllegalArgumentException("The baseSalary have to be a positive number");
        }
    }

    //get function
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grossSales=" + getGrossSales() +
                ", commision=" + getCommision() + "%" +
                ", baseSalary=" + getBaseSalary() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof BasePlusCommissionEmployee)) return false;
        return super.equals((CommissionEmployee) obj) && getBaseSalary() == ((BasePlusCommissionEmployee)obj).getBaseSalary();
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
}
