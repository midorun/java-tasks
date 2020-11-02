package com.vorozheykin.HumanRelated;

public class Human{
    private Name fullName;
    private int height;
    private Human father;
    private final String sex;

    public Human(Name fullName, int height, String sex, Human father) {
        setFullName(fullName);
        setHeight(height);
        this.sex = sex;
        setFather(father);
    }

    public Human(Name fullName, int height, String sex){
        this(fullName, height, sex, null);
    }

    public Name getFullName() {
        return fullName;
    }

    public Human setFullName(Name fullName) {
        this.fullName = fullName;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Human setHeight(int height) {
        if(height <120| height > 200) throw new IllegalArgumentException("Wrong height value!");
        this.height = height;
        return this;
    }

    public Human setFather(Human father) {
        if(father == null){
            this.father = null;
            return this;
        } else {
            this.father = father;
            fullName.setSurname(father.getFullName().getSurname());
            fullName.setPatronymic( "the " + (sex.equals("male") ? "son " : "daughter ") + "of " + this.father.getFullName().getName());
            return this;
        }
    }

    public Human getFather() {
        return father;
    }

    public String getSex(){
        return sex;
    }

    @Override
    public String toString() {
        return "Human: " + fullName + " Height:" + height + " Sex:" + sex;
    }
}
