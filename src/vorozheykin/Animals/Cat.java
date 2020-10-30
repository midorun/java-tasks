package vorozheykin.Animals;

public class Cat implements Meowable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice(){
        System.out.println(name + ": мяу!");
    }

    public void voice(int n){
        System.out.print(name + ": ");
        for(int i = 0; i < n; i++){
            if(i == 0) System.out.print("мяу");
            else System.out.print("-мяу");
        }
        System.out.println("!");
    }

    @Override
    public String toString() {
        return "cat: " + name;
    }

    @Override
    public void meow() {
        System.out.println("meow");
    }
}
