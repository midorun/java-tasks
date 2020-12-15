package com.vorozheykin.Patterns.Singletone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combo{
    private String title;
    private List<Skillable> skills = new ArrayList<>();

    public Combo(String title, Skillable...skills){
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

    public List<Skillable> getSkills() {
        return skills;
    }

    public Combo setSkills(List<Skillable> skills) {
        this.skills = skills;
        return this;
    }

    public void execute(KarateBoy karateBoy){
        for (Skillable s: skills){
            s.skillSound(karateBoy);
        }
    }
}
