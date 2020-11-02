package com.vorozheykin.Main;


import com.vorozheykin.HumanRelated.Department;
import com.vorozheykin.HumanRelated.Employee;

public class Main {

    public static void main(String[] args) {



        Employee a = new Employee("a", null);
        Employee b = new Employee("b", null);
        Employee c = new Employee("c", null);
        Employee d = new Employee("d", null);
        Employee e = new Employee("e", null);

        Department IT = new Department("IT", a);
        Department Law = new Department("Law", b);


        System.out.println(a.getDepartment());
        b.changeDepartment(IT);
        System.out.println(Law);
        System.out.println(IT);




    }
}