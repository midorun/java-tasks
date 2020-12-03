package com.vorozheykin.Main;

public class MyString extends Number{
    public String str;


    public MyString(String str){
        this.str = str;
    }

    @Override
    public int intValue() {
        return str.length();
    }

    @Override
    public long longValue() {
        return str.length();
    }

    @Override
    public float floatValue() {
        return str.length();
    }

    @Override
    public double doubleValue() {
        double res = 0;
        for (int i = 0; i < str.length(); i++) {
            res =+ str.charAt(i);
        }
        return res;
    }
    
}
