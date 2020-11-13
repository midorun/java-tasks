package com.vorozheykin.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiComment extends SingleComment {
    private List<MultiComment> comments = new ArrayList<>();


    public MultiComment(int rate, String content) {
        super(rate, content);
        addComments(this);
    }

    public MultiComment(int rate, String content, List<MultiComment> comments) {
        super(rate, content);
        this.comments = comments;
    }

    public MultiComment(int rate, String content, MultiComment...comments) {
        this(rate, content, Arrays.asList(comments));
    }

    public List<MultiComment> getComments() {
        return comments;
    }

    public MultiComment addComments(List<MultiComment> comments) {
        this.comments.addAll(comments);
        return this;
    }

    public MultiComment addComments(MultiComment...comments) {
        addComments(Arrays.asList(comments));
        return this;
    }

    public String toString(int tabsLength){
        String multiCommentStr = super.toString();
        String tab = " ";

        for (int i = 0; i < comments.size(); i++) {
            multiCommentStr += tab.repeat(i * tabsLength) + comments.get(i).toString();
        }
        return multiCommentStr;
    }
}
