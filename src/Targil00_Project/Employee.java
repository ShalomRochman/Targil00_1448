package Targil00_Project;

import java.util.Objects;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String id;

    // CTOR
    public Employee(String firstName, String lastName, String id){
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
    }

    //default CTOR
    public Employee(){
        setFirstName("plony");
        setLastName("almony");
        setId("0");
    }

    // set functions
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    //get functions
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", id=" + getId() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastName(), employee.getLastName());
    }

    public abstract double earnings();
}
