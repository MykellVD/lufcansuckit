package luf_project;

import java.util.Random;

public class Klingon extends Ship {
    int hull;
    Random rand = new Random();
    int sectorX, sectorY;

    public Klingon(int sectorX, int sectorY) {
        super();

        // random health between 100 and 300
        hull = getShields();


    }

    public void usePhaser() {

    }

    @Override
    public void takeDamage(int damage) {
        if (getShields() > 0) {
            decShields(damage);
        } else {
            hull -= damage;
        }
    }
}
