package vorozheykin.Main;

public class Main {

    public static void main(String[] args) {

        PolygonalChain a = new PolygonalChain(new Point(2, 3), new Point(4, 5));
        PolygonalChain b = new PolygonalChain(new Point(2,3), null);

        Point a = new Point(2,3 ,4);
        PolygonalChain c = null;
        PolygonalChain d = null;

        System.out.println(a.equals(b));
        System.out.println(c.equals(b));
    }
}