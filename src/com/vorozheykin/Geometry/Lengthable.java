package com.vorozheykin.Geometry;

public interface Lengthable {

    double length();

    default double lengthOfLine(Point<Double> start, Point<Double> end){
        double x = start.getX() - end.getX();
        double y = start.getY() - end.getY();
        return Math.sqrt(x * x + y * y);
    }
}
