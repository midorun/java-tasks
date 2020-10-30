package vorozheykin.Unsorted;

public class BilaterialCity extends City{

    public BilaterialCity(String name) {
        super(name);
    }

    public City addRoute(City city, int price) {
        getRoutes().put(city,price);
        city.getRoutes().put(this, price);
        return this;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
