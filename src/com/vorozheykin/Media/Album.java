package com.vorozheykin.Media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Album {
    private String title;
    private List<String> authors = new ArrayList<>();
    private List<Song> tracks = new ArrayList<>();

    public Album(String title, Song...tracks){
        this.title = title;
        this.tracks.addAll(Arrays.asList(tracks));
    }

    public String getName() {
        return title;
    }

    public Album setName(String title) {
        this.title = title;
        return this;
    }

    public List<String> getAuthor() {
        return authors;
    }

    public Album setAuthor(String author) {
        this.authors.add(author);
        return this;
    }

    public List<Song> getTracks() {
        return tracks;
    }

    public Album addTracks(Song...tracks) {
        this.tracks.addAll(Arrays.asList(tracks));
        return this;
    }

    public String toString(){
        String tracksStr = "";

        for(int i = 0; i < tracks.size(); i++) {
            tracksStr += tracks.get(i);
        }
        return "Album: " + title + "\n\t" + tracksStr;

    }
}
