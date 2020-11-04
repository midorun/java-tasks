package com.vorozheykin.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Album {
    final String title;
    List<String> authors = new ArrayList<>();
    List<Song> songs = new ArrayList<>();

    public Album(String title, String author){
        this.title = title;
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors(){
        return authors;
    }

    public Album setAuthors(List<String> authors){
        this.authors.addAll(authors);
        return this;
    }

    public Album setAuthors(String...authors){
        setAuthors(Arrays.asList(authors));
        return this;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Album setSongs(List<Song> songs) {
        this.songs.addAll(songs);
        return this;
    }

    public Album setSongs(Song... songs){
        setSongs(Arrays.asList(songs));
        return this;
    }


}
