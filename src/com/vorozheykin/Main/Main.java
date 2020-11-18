package com.vorozheykin.Main;


import com.vorozheykin.Student.MarkCheckable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        MarkCheckable<String> markRule = new MarkCheckable<>() {
            @Override
            public boolean check(String mark) {
                return "зачет".equals(mark) || "незачет".equals(mark);
            }
        };

        Action<String, Integer> convertRule = new Action<>() {
                @Override
                public Integer action(String source) {
                    return source.length();
                }

        };


        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");

        System.out.println(Main.convert(strings, convertRule));
    }

    public static <S, D> List<D> convert(List<S> list, Action<S, D> action){
        List<D> result = new ArrayList<>();
        for (S obj: list){
            result.add(action.action((obj)));
        }
        return result;
    }
}