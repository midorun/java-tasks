package vorozheykin.Geometry;

import java.util.List;

public interface PolygonalChainable {

    List<Point> getPoints();

    default PolygonalChain getPolygonalChain() {
        PolygonalChain polygonalChain = new PolygonalChain();
        polygonalChain.addPoints(getPoints());
        return polygonalChain;
    }
}
