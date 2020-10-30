package vorozheykin.Unsorted;

public class House {
    private final int floors;

    public House(int floors) {
        if(floors < 0) throw new IllegalArgumentException("The amount of floors can't be negative");
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        if(floors != 11 && (floors % 10 == 1)) return "Дом с " + floors + " этажем";
        else return "Дом с " + floors + " этажами";
    }
}
