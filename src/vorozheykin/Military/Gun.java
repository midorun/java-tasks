package vorozheykin.Military;

public class Gun {
    private int ammo;
    private final int maxAmmo;

    public Gun(int ammo , int maxAmmo) {
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    public Gun(int ammo){
        this(ammo, ammo);
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public int getAmmo() {
        return ammo;
    }

    public int reload(int ammo){
        int extraAmmo = 0;
        
        if(ammo < 0) throw new IllegalArgumentException("The amount of ammo can't be negative");
        if(ammo > maxAmmo){
            extraAmmo = ammo - (maxAmmo - this.ammo);
            
        }
        this.ammo = maxAmmo;
        return extraAmmo;
    }

    public int unload(){
        int extraAmmo = this.ammo;
        this.ammo = 0;
        return extraAmmo;
    }

    public String isLoad(){
        if(ammo > 0){
            return "Gun is load, amount of ammo:" + ammo;
        }
        else return "Gun is empty";
    }

    public void shoot() {
        if (ammo > 0) {
            System.out.println("Bang!"); ammo--;
        }
        else System.out.println("Click");
    }



}