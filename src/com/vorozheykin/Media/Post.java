package com.vorozheykin.Media;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Post {
    private String title;
    private String content;
    private List<String> tags = new ArrayList<>();
    private List<MultiComment> comments = new ArrayList<>();
    private int rate;

    public Post(String title, String content) {
        setTitle(title);
        setContent(content);
        setRate(0);
    }

    public Post(String title, String content, String...tags) {
        this(title, content);
        this.tags.addAll(Arrays.asList(tags));
        setRate(0);
    }

    public Post(String title, String content, MultiComment...comments) {
        this(title, content);
        this.comments.addAll(Arrays.asList(comments));
        setRate(0);
    }


    public Post(String title, String content, List<String> tags, List<MultiComment> comments) {
       this(title, content);
       setTags(tags);
       setComments(comments);
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Post setContent(String content) {
        this.content = content;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public Post setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Post addTags(List<String> tags){
        this.tags.addAll(tags);
        return this;
    }

    public Post addTags(String...tags){
        this.tags.addAll(Arrays.asList(tags));
        return this;
    }

    public List<MultiComment> getComments() {
        return comments;
    }

    public Post setComments(List<MultiComment> comments) {
        this.comments = comments;
        return this;
    }

    public Post addComments(List<MultiComment> comments){
        this.comments.addAll(comments);
        return this;
    }

    public Post addComments(MultiComment...comments){
        this.comments.addAll(Arrays.asList(comments));
        return this;
    }

    public int getRate() {
        return rate;
    }

    public Post setRate(int rate) {
        this.rate = rate;
        return this;
    }

    public String toString(int tabsLength){
        String tagsStr = "";
//        for (int i = 0; i <tags.size() ; i++) {
//            tagsStr += tags.get(i);
//
//        }

        String commentsStr = "";
        String tab = " ";
        for (int i = 0; i < comments.size(); i++) {
            commentsStr += comments.get(i);
            System.out.println(comments.get(i));
//            if (comments.get(i).getComments().size() > 0){
//                for (int j = 0; j < comments.get(i).getComments().size(); j++) {
//                    comments
//                }
//            }
        }

        String postStr = "(" + rate + ") " + title + "\n"
                       + "Tags:" + tags + "\n"
                       + content + "\n\n"
                       + "Comments:" + "\n\n"
                       + commentsStr;

        return postStr;
    }
}
