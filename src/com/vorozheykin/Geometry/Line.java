package com.vorozheykin.Geometry;


import java.util.Objects;

public class Line implements Lengthable, Cloneable {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
       this.start = new Point(start.getX(), start.getY());
       this.end = new Point(end.getX(), end.getY());
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = new Point(start.getX(), start.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = new Point(end.getX(), end.getY());
    }

    @Override
    public double length(){
         double x = start.getX() - end.getX();
         double y = start.getY() - end.getY();
         return (double)Math.sqrt(x * x + y * y);
    }

   @Override
   public Line clone() throws CloneNotSupportedException{
       Line clone = (Line) super.clone();
       clone.end = this.end.clone();
       clone.start = this.start.clone();
       return clone;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return  Objects.equals(start, line.start) &&
                Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "Line from " + start.toString() + " to " + end.toString();
    }
}

