package com.vorozheykin.Geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Point implements Cloneable {
    private List<Integer> coordinates = new ArrayList<>();

    public Point(int x) {
        coordinates.add(x);
    }

    public Point(int x, int y){
        this(x);
        coordinates.add(y);
    }

    public Point(int x, int y, int z) {
        this(x, y);
        coordinates.add(z);
    }

    public int getX() {
        return coordinates.get(0);
    }

    public Point setX(int x) {
      coordinates.add(0, x);
      return this;
    }

    public int getY() {
        if (coordinates.size() < 2) throw new IllegalArgumentException("Can't get Y-coord for X point => " + this);
        return coordinates.get(1);
    }

    public Point setY(int y) {
        coordinates.add(1,y);
        return this;
    }

    public int getZ() {
        if (coordinates.size() < 3) throw new IllegalArgumentException("Can't get Z-coord for 2D point => " + this);
        return coordinates.get(2);
    }

    public Point setZ(int z) {
        coordinates.add(2,z);
        return this;
    }

    public List<Integer> getCoordinates() {
        return coordinates;
    }

    @Override
    public Point clone() throws CloneNotSupportedException{
        Point clone = (Point) super.clone();
        clone.coordinates = new ArrayList<>(this.coordinates);
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(coordinates, point.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates);
    }

    @Override
    public String toString(){
        return "{" + getX() + (coordinates.size() > 1 ? ":" + getY() : "") + (coordinates.size() > 2 ? ":" + getZ() : "") + "}";
    }
}
