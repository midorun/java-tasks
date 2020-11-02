package com.vorozheykin.Geometry;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Quadrangle{
    private int secondSide;

    public Rectangle(Point start, int side, int secondSide) {
        super(start, side);
        this.secondSide = secondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public Rectangle setSecondSide(int secondSide) {
        if(secondSide <= 0) throw new IllegalArgumentException("Wrong value of secondSide");
        this.secondSide = secondSide;
        return this;
    }

    @Override
    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();

        points.add(getStart());
        points.add(new Point((getStart().getX() + getSide()), getStart().getY()));
        points.add(new Point((getStart().getX() + getSide()), (getStart().getY() - secondSide)));
        points.add(new Point(getStart().getX(), (getStart().getY() - getSide())));

        return points;
    }

    @Override
    public double square() {
        return getSide() * secondSide;
    }

    @Override
    public String toString(){
        return "Rectangle: \n\tStartPoint: " + getStart() + "\n\tsideLength: " + getSide() +
                "\n\tsecondSideLength: " + secondSide + "\n\tSquare: " + square();
    }
}


