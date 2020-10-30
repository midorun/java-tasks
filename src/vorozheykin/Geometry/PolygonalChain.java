package vorozheykin.Geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PolygonalChain implements Lengthable {
    private List <Point> points = new ArrayList<>();

    public PolygonalChain(Point...points){
        for(Point p : points){
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    public PolygonalChain(List<Point> points) {
        for (Point p: points) {
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    public PolygonalChain addPoints(Point... points){
        for(Point p: points){
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point(p.getX(), p.getY()));
        }

        return this;
    }

    public PolygonalChain addPoints(List<Point> points){
        for(Point p: points){
            if(p.getCoordinates().size() < 2) throw new IllegalArgumentException("PolygonalChain can't be defined by X points");
            this.points.add(new Point(p.getX(), p.getY()));
        }
        return this;
    }

    public List<Point> getPoints() {
        return points;
    }

    public double length(){
        double result = 0;
        for(int i = 0; i < points.size()-1; i++){
            int x = points.get(i).getX() - points.get(i+1).getX();
            int y = points.get(i).getY() - points.get(i+1).getY();
            result += Math.sqrt(x * x + y * y);
        }
        return result;
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
