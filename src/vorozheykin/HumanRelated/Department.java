package vorozheykin.HumanRelated;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee boss;
    private List<Employee> employeeList = new ArrayList<>();

    public Department(String name, Employee boss){
        this.name = name;
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        if(boss != null){
            boss.setDepartment(this);
            this.boss = boss;
        }
    }


}
