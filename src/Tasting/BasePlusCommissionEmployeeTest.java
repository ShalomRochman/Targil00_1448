package Tasting;

import Targil00_Project.BasePlusCommissionEmployee;
import Targil00_Project.CommissionEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasePlusCommissionEmployeeTest {

    @Test
    void earnings() {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee("Shalom", "Rochman", "206341448", 20000, 20, 5651);
        System.out.println(emp);
        System.out.println(emp.earnings() + " NIS");
    }
}