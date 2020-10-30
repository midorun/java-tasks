package vorozheykin.HumanRelated;

public class Name {
    private String name;
    private String surname;
    private String patronymic;

    public Name(String name){
       setName(name);
    }

    //    public static class Builder {
//        String name;
//        String surname;
//        String patronymic;
//
//        public Builder(String name){
//            setName(name);
//        }
//
//        public Builder setName(String name) {
//            if(name == null || name.trim().equals("")) throw new IllegalArgumentException("The name can't be empty");
//            this.name = name;
//            return this;
//        }
//
//        public Builder setSurname(String surname) {
//            if(surname == null || surname.trim().equals("")) throw new IllegalArgumentException("The surname can't be empty");
//            this.surname = surname;
//            return this;
//        }
//
//        public Builder setPatronymic(String patronymic) {
//            if(patronymic == null || patronymic.trim().equals("")) throw new IllegalArgumentException("The patronymic can't be empty");
//            this.patronymic = patronymic;
//            return this;
//        }
//
//        public Name build(){
//            return new Name(this);
//        }
//    }

//    public Name getCopy(){
//        return new Name.Builder(name).setSurname(surname).setPatronymic(patronymic).build();
//    }

    public Name setName(String name) {
        if(name == null || name.trim().equals("")) throw new IllegalArgumentException("The name can't be empty");
        this.name = name;
        return this;
    }

    public Name setSurname(String surname) {
        if(surname == null || surname.trim().equals("")) throw new IllegalArgumentException("The surname can't be empty");
        this.surname = surname;
        return this;
    }

    public Name setPatronymic(String patronymic) {
        if(patronymic == null || patronymic.trim().equals("")) throw new IllegalArgumentException("The patronymic can't be empty");
        this.patronymic = patronymic;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString(){
        return name + (surname == null ? "" : " " + surname) + (patronymic == null ? "" : " " + patronymic);
    }
}
