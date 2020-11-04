package com.vorozheykin.Main;


import com.vorozheykin.Geometry.Point;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point p = new Point(3,4,5);
        Point p1 = p.clone();

        p1.setX(2);
        System.out.println(p);
        System.out.println(p1);
    }
}