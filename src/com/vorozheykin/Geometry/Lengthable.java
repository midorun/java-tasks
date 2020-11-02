package com.vorozheykin.Geometry;

public interface Lengthable {

    double length();

    default double lengthOfLine(Point start, Point end){
        double x = start.getX() - end.getX();
        double y = start.getY() - end.getY();
        return (double)Math.sqrt(x * x + y * y);
    }
}
