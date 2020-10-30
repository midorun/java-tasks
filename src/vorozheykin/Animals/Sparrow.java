package vorozheykin.Animals;

public class Sparrow extends Bird {

    @Override
    public Sparrow sing() {
        System.out.println("чырык");
        return this;
    }
}
