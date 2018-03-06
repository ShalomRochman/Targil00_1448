package Tasting;

import Targil00_Project.CommissionEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    @Test
    void earnings() {
        CommissionEmployee emp = new CommissionEmployee("Shalom", "Rochman", "206341448", 20000, 20);
        System.out.println(emp);
        System.out.println(emp.earnings() + " NIS");
    }
}