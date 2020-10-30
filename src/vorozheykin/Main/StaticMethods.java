package vorozheykin.Main;

import vorozheykin.Animals.Bird;
import vorozheykin.Animals.Meowable;
import vorozheykin.Geometry.Figure;
import vorozheykin.Geometry.Lengthable;
import vorozheykin.Geometry.PolygonalChain;
import vorozheykin.Geometry.PolygonalChainable;

public class StaticMethods {
    public static void meow(Meowable...cats){
        for(Meowable cat: cats){
            cat.meow();
        }
    }

    public static double sum(Number...number) {
        double res = 0;
        for (Number num : number) {
            res += num.doubleValue();
        }
        return res;
    }

    public static void sing(Bird...birds){
        for(Bird bird: birds){
            bird.sing();
        }
    }

    public static void square(Figure...figures){
        for(Figure figure: figures){
            System.out.println(figure.square());
        }
    }

    public static void length(Lengthable...lengthables) {
        for(Lengthable lengthable: lengthables){
            System.out.println(lengthable.length());
        }
    }

    public static void getPolygonalChain(PolygonalChainable...polygonalChainables){
        PolygonalChain polygonalChain = new PolygonalChain();

        for(PolygonalChainable polygonalChainable: polygonalChainables){
            polygonalChain.addPoints(polygonalChainable.getPoints());
        }
        System.out.println(polygonalChain);
    }
}
