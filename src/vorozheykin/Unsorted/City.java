package vorozheykin.Unsorted;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class City {
    private String name;
    private Map<City, Integer> routes = new HashMap<City, Integer>();

    public City(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public City setName(String name) {
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("Name of city can't be empty");
        this.name = name;
        return this;
    }

    public Map<City, Integer> getRoutes() {
        return routes;
    }

    public City addRoute(City city, int price) {
        routes.put(city, price);
        return this;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(routes, city.routes);
    }

    @Override
    public int hashCode(){
        return Objects.hash(routes);
    }

    @Override
    public String toString(){
       String routesStr = "";
       for(Map.Entry<City, Integer> city: routes.entrySet()){
           routesStr += "\n\t\t\t" + city.getKey().getName() + " price: " + city.getValue();
       }
       return "City " + name + " has routes: " + routesStr;
    }
}
