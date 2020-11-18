package com.vorozheykin.Geometry;

import com.vorozheykin.Main.MyClone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Point<T extends Number> implements MyClone {
    private List<T> coordinates = new ArrayList<>();

    public Point (T x) {
        coordinates.add((T) x);
    }

    public Point(T x, T y){
        this(x);
        coordinates.add((T) y);
    }

    public Point(T x, T y, T z) {
        this(x, y);
        coordinates.add((T) z);
    }

    public Point<T> setX(T x) {
      coordinates.add(0, (T) x);
      return this;
    }

    public Point<T> setY(T y) {
        coordinates.add(1,(T) y);
        return this;
    }

    public Point<T> setZ(T z) {
        coordinates.add(2,(T) z);
        return this;
    }

    T getX(){
        return coordinates.get(0);
    }

    T getY(){
        return coordinates.get(1);
    }

    T getZ(){
        return coordinates.get(2);
    }

    public List<T> getCoordinates() {
        return coordinates;
    }

    @Override
    public Point<T> clone() throws CloneNotSupportedException{
        Point<T> clone = (Point<T>) super.clone();
        clone.coordinates = new ArrayList<>(this.coordinates);
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (o.equals(this)) return true;
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
