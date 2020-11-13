package com.vorozheykin.Media;

public class SingleComment {
    private final int rate;
    private final String content;

     public SingleComment(int rate, String content){
        this.rate = rate;
        this.content = content;
    }

    @Override
    public String toString(){
        return "(" + rate + ") " + content + "\n\t";
    }


    
}
