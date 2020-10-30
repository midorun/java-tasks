package vorozheykin.Geometry;

import java.util.ArrayList;
import java.util.List;

public class Quadrangle implements Figure, PolygonalChainable {
    private Point start;
    private List<Point> points = new ArrayList<>(4);
    private int side;

    public Quadrangle(Point start, int side) {
        if(side <= 0) throw new IllegalArgumentException("The length of the quadrangle side can't be less than 1");
        this.start = start;
        this.side = side;
        setPoints();
    }

    public PolygonalChain getPolygonalChain(){
        return new ClosedLine(getPoints());
    }

    public List<Point> getPoints(){
        return points;
    }

    public Quadrangle setPoints() {
        points.add(new Point(start.getX(), start.getY()));
        points.add(new Point((start.getX() + side), start.getY()));
        points.add(new Point((start.getX() + side), (start.getY() - side)));
        points.add(new Point(start.getX(), (start.getY() - side)));
        return this;
    }

    public Point getStart() {
        return start;
    }

    public Quadrangle setStart(Point start) {
        this.start = start;
        return this;
    }

    public Quadrangle setSide(int side){
        this.side = side;
        return new Quadrangle(this.start, side);
    }

    public int getSide() {
        return side;
    }

    public double square(){
        return side * side;
    }

    public String toString(){
        return "Quadrangle: \n\tStartPoint: " + start + "\n\tside: " + side + "\n\tSquare: " + square();
    }
}
