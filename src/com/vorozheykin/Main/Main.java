package com.vorozheykin.Main;


import com.vorozheykin.Media.MultiComment;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MultiComment> b = new ArrayList<>();
        b.add(new MultiComment(0, "fsdfsdf"));
        b.add(new MultiComment(1, "fsdfsdf"));
        b.add(new MultiComment(2, "fsdfsdf"));
        b.add(new MultiComment(3, "fsdfsdf"));

        MultiComment a = new MultiComment(0,"innerContent",
                new MultiComment(1, "firstCont"),
                new MultiComment(2, "secondCont"),
                new MultiComment(1, "firstCont"),
                new MultiComment(2, "secondCont"),
                new MultiComment(1, "firstCont"),
                new MultiComment(2, "secondCont"),
                new MultiComment(1, "firstCont"),
                new MultiComment(2, "secondCont")
        );
        MultiComment c = new MultiComment(1,"gdfgdfg", b);


        System.out.println(a.toString(3));
        System.out.println("a".repeat(3));
    }
}