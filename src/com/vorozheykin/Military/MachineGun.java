package com.vorozheykin.Military;

public class MachineGun extends Gun {
    private int fireRate;

    public MachineGun(){
        super(30);
        fireRate = 30;
    }

    public MachineGun(int maxAmmo){
        super(maxAmmo);
        fireRate = maxAmmo / 2;
        if(fireRate < 1) fireRate = 1;
    }

    public MachineGun(int maxAmmo, int fireRate){
        super(maxAmmo);
        this.fireRate = fireRate;
        if(fireRate < 1) throw new IllegalArgumentException("Wrong fireRate argument");
    }

    public void shoot(){
        for(int i = 0; i < fireRate; i++){
            super.shoot();
        }
    }

    public void shoot(int num){
        for(int i = 0; i < fireRate * num; i++){
            super.shoot();
        }
    }
}
