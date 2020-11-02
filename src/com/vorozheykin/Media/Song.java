package com.vorozheykin.Media;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private List<String> authors = new ArrayList<>();
    private Album album;
    private boolean hasAlbum = false;

    public Song(String title, Album album, String...authors) {
        this.title = title;
        this.album = album;
        setAuthors();
        hasAlbum = true;
    }

    public Song(String title, String...authors){
        this(title, null, authors);
    }

    public Song setAuthors(String...authors){
        for(String author: authors) if(author != null) this.authors.add(author);
        return this;
    }

    public Song setAlbum(Album album) {
        if(hasAlbum) throw new IllegalArgumentException("This song already has album");
        hasAlbum = true;
        this.album = album;
        if(!album.getTracks().contains(this)) album.addTracks();
        return this;
    }

    public Album getAlbum() {
        return album;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString(){
        return title +", authors: " + authors;
    }
}
