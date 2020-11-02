package com.vorozheykin.Geometry;

public class Circle implements Figure {
    private Point center;
    private int radius;


    public Circle(Point center, int radius) {
        setCenter(center);
        setRadius(radius);
    }

    public Point getCenter() {
        return center;
    }

    public Circle setCenter(Point center) {
        if(center.getCoordinates().size() == 1) this.center = new Point(center.getX());
        if(center.getCoordinates().size() == 2) this.center = new Point(center.getX(), center.getY());
        if(center.getCoordinates().size() == 3) this.center = new Point(center.getX(), center.getY(), center.getZ());
        return this;
    }

    public int getRadius() {
        return radius;
    }

    public Circle setRadius(int radius) {
        if(radius <= 0) throw new IllegalArgumentException("Radius can't be less than 1");
        this.radius = radius;
        return this;
    }

    public double square(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cirle: \n\tCenter: " + center + "\n\tRadius: " + radius + "\n\tSquare: " + square();
    }
}
