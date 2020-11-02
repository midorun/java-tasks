package com.vorozheykin.HumanRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {
    final String title;
    Employee chief;
    List<Employee> employees = new ArrayList<>();

    public Department(String title, Employee chief){
        if(chief == null || title == null || title.equals("")) throw new IllegalArgumentException("Заданы неверные аргументы в конструкторе отдела");
        this.title = title;
        this.chief = chief;
        chief.toEmploy(this);
        toEmploy(chief);
    }

    public String getTitle() {
        return title;
    }

    public Employee getChief() {
        return chief;
    }

    public void setChief(Employee chief) {
        if(chief == null) throw new IllegalArgumentException("У отдела должен быть начальник");
        chief.department = this;
        this.chief = chief;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Department addEmployees(List<Employee> employees) {
        this.employees = employees;
        return this;
    }

    public Department addEmployees(Employee...employees) {
        this.employees.addAll(Arrays.asList(employees));
        return this;
    }

    public void fire(Employee employee){
        if(employees.contains(employee)){
            this.employees.remove(employees.indexOf(employee));
        }else throw new IllegalArgumentException("Данный сотрудник в отделе не числится");
    }

    public void toEmploy(Employee employee){
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return "Department: " + title + "; chief: " + chief;
    }
}
