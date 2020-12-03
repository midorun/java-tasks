package com.vorozheykin.Geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveablesList implements Moveable{
    List<Moveable> moveables = new ArrayList<>();

    public MoveablesList(Moveable...moveables){
        this.moveables.addAll(Arrays.asList(moveables));
    }

    public void move(int x, int y){
        moveables.forEach(moveable -> moveable.move(x,y));
    }

    @Override
    public String toString() {
        return "MoveablesList{" +
                "moveables=" + moveables +
                '}';
    }
}
