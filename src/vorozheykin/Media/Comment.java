package vorozheykin.Media;

public class Comment {
    private final int rate;
    private final String content;

     public Comment(int rate, String content){
        this.rate = rate;
        this.content = content;
    }

    public String toString(){
        return "(" + rate + ") " + content + "\n\t";
    }


    
}
