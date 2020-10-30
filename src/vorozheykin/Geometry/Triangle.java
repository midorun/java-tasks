package vorozheykin.Geometry;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Figure, PolygonalChainable {
    private List<Point> points = new ArrayList<>(3);
    private List<Double> sides = new ArrayList<>(3);

    public Triangle(Point first, Point second, Point third) {
        setPoints(first, second, third);
        setSides();
    }

    public List<Point> getPoints(){
        return points;
    }

    public Triangle setPoints(Point first, Point second, Point third){
        if(checkForXPoints(first, second, third)) throw new IllegalArgumentException("Triangle can't be defined by X points");
        points.add(0, first);
        points.add(1, second);
        points.add(2, third);

        return this;
    }

    public Triangle setSides(){
        sides.add(lengthOfSide(points.get(0), points.get(1)));
        sides.add(lengthOfSide(points.get(1), points.get(2)));
        sides.add(lengthOfSide(points.get(0), points.get(2)));

        return this;
    }

    private boolean checkForXPoints(Point first, Point second, Point third){
        return (first.getCoordinates().size() < 2 || second.getCoordinates().size() < 2 || third.getCoordinates().size() < 2);
    }

    public double lengthOfSide(Point start, Point end) {
            int x = start.getX() - end.getX();
            int y = start.getY() - end.getY();
            return Math.sqrt(x * x + y * y);
    }

    public double perimeter() {
        return sides.get(0) + sides.get(1) + sides.get(2);
    }

    public double halfPerimeter() {
        return    perimeter()/2;
    }

    @Override
    public PolygonalChain getPolygonalChain(){
        return new PolygonalChain(getPoints());
    }

    @Override
    public double square(){
        return Math.sqrt(halfPerimeter() * (halfPerimeter() - sides.get(0)) * (halfPerimeter() - sides.get(1)) * (halfPerimeter() - sides.get(2)));
    }

    @Override
    public String toString(){
        return "Triangle: \n\tFirstPoint: " + points.get(0) + "\n\tSecondPoint: " + points.get(1) +
                "\n\tThirdPoint: " + points.get(2) + "\n\tSquare: " + square();
    }
}
