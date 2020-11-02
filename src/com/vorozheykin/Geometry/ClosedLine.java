package com.vorozheykin.Geometry;

import java.util.List;

public class ClosedLine extends PolygonalChain {
    public ClosedLine(Point...Point){
        super(Point);
    }

    public ClosedLine(List<Point> points){
        super(points);
    }

    public double length(){
        double result = super.length();
        if(super.length() < 3) return result;
        result += lengthOfLine(getPoints().get(0), getPoints().get(getPoints().size()-1));
        return result;
    }

    @Override
    public String toString(){
        return "ClosedLine" + getPoints();
    }
}
