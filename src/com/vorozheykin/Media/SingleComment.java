package com.vorozheykin.Media;

public class SingleComment {
    private int rate;
    private String content;

     public SingleComment(int rate, String content){
        setRate(rate);
        setContent(content);
    }

    public int getRate() {
        return rate;
    }

    public SingleComment setRate(int rate) {
        this.rate = rate;
        return this;
    }

    public String getContent() {
        return content;
    }

    public SingleComment setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString(){
        return "(" + rate + ") " + content + "\n\t";
    }


    
}
