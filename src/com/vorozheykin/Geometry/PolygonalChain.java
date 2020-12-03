package com.vorozheykin.Geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolygonalChain implements Lengthable, Moveable {
    private List <Point<Double>> points = new ArrayList<>();

    @SafeVarargs
    public PolygonalChain(Point<Double>...points){
        for(Point<Double> p : points){
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point<>(p.getX(), p.getY()));
        }
    }

    public PolygonalChain(List<Point<Double>> points) {
        for (Point<Double> p: points) {
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point<>(p.getX(), p.getY()));
        }
    }

    @SafeVarargs
    public final PolygonalChain addPoints(Point<Double>... points){
        for(Point<Double> p: points){
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point<>(p.getX(), p.getY()));
        }

        return this;
    }

    public PolygonalChain addPoints(List<Point<Double>> points){
        for(Point<Double> p: points){
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point<>(p.getX(), p.getY()));
        }
        return this;
    }

    public List<Point<Double>> getPoints() {
        return points;
    }

    public double length(){
        double result = 0;
        for(int i = 0; i < points.size()-1; i++){
            double x = points.get(i).getX() - points.get(i+1).getX();
            double y = points.get(i).getY() - points.get(i+1).getY();
            result += Math.sqrt(x * x + y * y);
        }
        return result;
    }

    @Override
    public void move(int x, int y){
        for(Point<Double> p: points){
            p.setX(p.getX() + x);
            p.setY(p.getY() + y);
        }
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        PolygonalChain polygonalChain = (PolygonalChain) o;
        return Objects.equals(points, polygonalChain.points);
    }
    @Override
    public int hashCode(){
        return Objects.hash(points);
    }
    @Override
    public String toString(){
        return "PolygonalChain" + points;
    }
}
