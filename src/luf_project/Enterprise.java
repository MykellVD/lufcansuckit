package luf_project;

import java.util.Random;

public class Enterprise extends Ship {
    int torpedoes;
    int energy;
    int[] system;
    boolean docked;
    int quadX, quadY;
    int sectorX, sectorY;

    Random rand = new Random();

//    WARP_ENGINES = system[0];
//    SHORT_RANGE_SENSORS = system[1];
//    LONG_RANGE_SENSORS = system[2];
//    PHASER_CONTROL = system[3];
//    PHASER_TUBES = system[4];
//    SHIELD_CONTROL = system[5];

    public Enterprise(int quadX, int quadY, int sectorX, int sectorY) {

        this.quadX = quadX;
        this.quadY = quadY;
        this.sectorX = sectorX;
        this.sectorY = sectorY;

        system = new int[6];
        for (int i = 0; i < 5; i++) {
            i = 100;
        }

        energy = 3000 - getShields();
        torpedoes = 10;

    }

    public void decTorpedo() {
        torpedoes--;
    }

    public void dock() {
        docked = true;
        system = new int[6];
        for (int i = 0; i < 5; i++) {
            i = 100;
        }

        energy = 3000;
        torpedoes = 10;

    }

    public void unDock() {
        docked = false;
    }

    public boolean isDestroyed() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += system[i];
        }
        if (total == 0)
            return true;
        return false;
    }

    public void repair() {
        //get component to repair
        int componentToRepair = system[rand.nextInt(5)];
        //add random repair damage amount
        componentToRepair += rand.nextInt((50 - 10) + 1) + 10;
        //using min to not go over max health
        componentToRepair = Math.min(componentToRepair, 100);
    }

    @Override
    public void takeDamage(int damage) {
        int protection = damage / getShields();


        if (getShields() < damage) {
            setShields(0);
            return;
        }

        decShields(damage);
        System.out.println("Shields at " + getShields());



    }

    public int getTorpedoes() {
        return torpedoes;
    }

    public void setTorpedoes(int torpedoes) {
        this.torpedoes = torpedoes;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void decEnergy(int energy) {
        this.energy -= energy;
    }

}

