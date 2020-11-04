package com.vorozheykin.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    final String title;
    List<String> authors = new ArrayList<>();
    Album album;


    public Song(String title, Album album, String...authors) {
        this.title = title;
        this.album = album;
        setAuthors(authors);
    }

    public Song(String title, String author){
        this(title,null, author);
    }

    public Song(String title){
        this(title, null, "Без автора");
    }

    public String getTitle(){
        return title;
    }

    public List<String> getAuthor(){
        return authors;
    }

    public Song setAuthors(List<String> authors){
        this.authors.addAll(authors);
        return this;
    }

    public Song setAuthors(String...authors){
        setAuthors(Arrays.asList(authors));
        return this;
    }

    public Song setAlbum(Album album) {
        if(!album.getSongs().contains(this)) album.setSongs(this);
        this.album = album;
        return this;
    }

    public Album getAlbum() {
        return album;
    }

    @Override
    public String toString(){
        return title +" - authors: " + authors;
    }
}
