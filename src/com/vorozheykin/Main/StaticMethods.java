package com.vorozheykin.Main;

import com.vorozheykin.Animals.Bird;
import com.vorozheykin.Animals.Meowable;
import com.vorozheykin.Geometry.Figure;
import com.vorozheykin.Geometry.Lengthable;
import com.vorozheykin.Geometry.PolygonalChain;
import com.vorozheykin.Geometry.PolygonalChainable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StaticMethods implements Cloneable{
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

    public static int strPow(String[] args){
        return (int) Math.pow(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }

    public static void toStr(Object...objects){
        for(Object object: objects){
            if (Objects.isNull(object)) {
                System.out.println("здесь мог бы быть ваш объект");
            }else{
                System.out.println(object.toString());
            }
        }
    }

    public static List<Object> totalClone(MyClone...objects) throws CloneNotSupportedException {
        List<Object> copies = new ArrayList<>();
        for(MyClone object: objects){

            copies.add(object.clone());
        }
        return copies;
    }


}
