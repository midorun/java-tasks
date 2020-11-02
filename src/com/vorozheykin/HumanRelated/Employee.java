package com.vorozheykin.HumanRelated;

public class Employee{
    String name;
    Department department;

    public Employee(String name, Department department){
        if(name == null || name.equals("")) throw new IllegalArgumentException("Заданы неверные аргументы в конструкторе работника");
        this.name = name;
        changeDepartment(department);
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

    public void changeDepartment(Department department){
        if(this.department != department){
            if(this.department.chief == this){
                throw new IllegalArgumentException("Нельзя оставлять отдел без начальника");
            }

            this.department = department;
        }
    }

    public void fire(){
        this.department = null;
    }

    public void toEmploy(Department department){
        this.department = department;
    }

    @Override
    public String toString() {
        if(this != department.chief) return name + " работает в отделе " + department.title +
                ", начальник которого " + department.chief.name;
        else return  name + " начальник отдела " + department.title;
    }
}
