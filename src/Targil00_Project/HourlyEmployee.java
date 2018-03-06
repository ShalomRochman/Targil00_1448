package Targil00_Project;

import java.util.Objects;

public class HourlyEmployee extends Employee {

    private int hours;
    private double wage;

    //CTOR
    public HourlyEmployee(String firstName, String lastName, String id, int hours, double wage) {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    //default ctor
    public HourlyEmployee() {
        setHours(0);
        setWage(0);
    }

    //copy CTOR
    public HourlyEmployee(HourlyEmployee h_emp) {
        if(h_emp != null){
            setFirstName(h_emp.getFirstName());
            setLastName(h_emp.getLastName());
            setId(h_emp.getId());
            setHours(h_emp.getHours());
            setWage(h_emp.getWage());
        }
    }

    //set functions
    public void setHours(int hours) {
        if(hours >= 0){
            this.hours = hours;
        }
        else{
            throw new IllegalArgumentException("The amount of hours have to be a positive number");
        }
    }

    public void setWage(double wage) {
        if(wage >= 0){
            this.wage = wage;
        }
        else{
            throw new IllegalArgumentException("The wage have to be a positive number");
        }
    }

    //get functions
    public int getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                ", hours=" + getHours() +
                ", wage=" + getWage() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof HourlyEmployee)) return false;
        HourlyEmployee temp = (HourlyEmployee)o;
        return getId() == temp.getId() &&
                Objects.equals(getFirstName(), temp.getFirstName()) &&
                Objects.equals(getLastName(), temp.getLastName()) &&
                getHours() == temp.getHours() &&
                getWage() == temp.getWage();
    }

    @Override
    public double earnings() {
        return getHours()*getWage();
    }
}
