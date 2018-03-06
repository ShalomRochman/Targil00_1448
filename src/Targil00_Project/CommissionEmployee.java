package Targil00_Project;

import java.util.Objects;

public class CommissionEmployee extends Employee {

    private double grossSales;
    private double commision;

    //CTOR
    public CommissionEmployee(String firstName, String lastName, String id, double grossSales, double commision) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommision(commision);
    }

    //default CTOR
    public CommissionEmployee() {
        setGrossSales(0);
        setCommision(0);
    }

    //copy CTOR
    public CommissionEmployee(CommissionEmployee c_emp){
        if(c_emp != null){
            setFirstName(c_emp.getFirstName());
            setLastName(c_emp.getLastName());
            setId(c_emp.getId());
            setGrossSales(c_emp.getGrossSales());
            setCommision(c_emp.getCommision());
        }
    }

    //set functions
    public void setGrossSales(double grossSales) {
        if(grossSales >= 0){
            this.grossSales = grossSales;
        }
        else{
            throw new IllegalArgumentException("grossSales have to be a positive number");
        }
    }

    public void setCommision(double commision) {
        if(commision >= 0 && commision <= 100){
            this.commision = commision;
        }
        else{
            throw new IllegalArgumentException("0 <= commision <= 100");
        }

    }

    //get functions
    public double getGrossSales() {
        return grossSales;
    }

    public double getCommision() {
        return commision;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", grossSales=" + getGrossSales() +
                ", commision=" + getCommision() + "%" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof CommissionEmployee)) return false;
        CommissionEmployee temp = (CommissionEmployee)o;
        return getId() == temp.getId() &&
                Objects.equals(getFirstName(), temp.getFirstName()) &&
                Objects.equals(getLastName(), temp.getLastName()) &&
                getGrossSales() == temp.getGrossSales() &&
                getCommision() == temp.getCommision();
    }

    @Override
    public double earnings() {
        return (getCommision()/100.0)*getGrossSales();
    }
}
