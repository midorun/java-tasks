package vorozheykin.Main;

import vorozheykin.Geometry.Point;
import vorozheykin.Geometry.PolygonalChain;

public class Main {

    public static void main(String[] args) {

        PolygonalChain a = new PolygonalChain(new Point(2, 3), new Point(4, 5));
        PolygonalChain b = new PolygonalChain(new Point(2,3), null);

        PolygonalChain c = null;
        PolygonalChain d = null;

        System.out.println(a.equals(b));
        System.out.println(c.equals(b));
    }
}