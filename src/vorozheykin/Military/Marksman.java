package vorozheykin.Military;

public class Marksman {
    String name;
    Gun gun;

    public Marksman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Marksman setName(String name) {
        this.name = name;
        return this;
    }

    public Gun getGun() {
        return gun;
    }

    public Marksman setGun(Gun gun) {
        this.gun = gun;
        return this;
    }

    public void shoot() {
        if(this.gun == null) System.out.println("Can't take part in shooting");
        else this.gun.shoot();
    }
}
