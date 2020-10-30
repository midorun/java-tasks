package vorozheykin.HumanRelated;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if(this.department == null){
            this.department = department;
        }
        if(this.department.getBoss() == this){
            this.department.setBoss(null);
        }
            this.department = department;
    }

    @Override
    public String toString() {
        if(this != department.getBoss()) return name + " работает в отделе " + department.getName() +
                ", начальник которого " + department.getBoss().name;
        else return  name + " начальник отдела " + department.getName();
    }
}
