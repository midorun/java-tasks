package com.vorozheykin.Karate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combo{
    private String title;
    private List<Skill> skills = new ArrayList<>();

    public Combo(String title, Skill...skills){
        this.title = title;
        this.skills.addAll(Arrays.asList(skills));
    }

    public String getTitle() {
        return title;
    }

    public Combo setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Combo setSkills(List<Skill> skills) {
        this.skills = skills;
        return this;
    }
}
