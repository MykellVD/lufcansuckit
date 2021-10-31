package luf_project;

import java.util.Random;

public abstract class Ship extends Placeable {
    private int shields;
    Random rand = new Random();

    public Ship() {
        super();

    }

    public void Placeable() {

    }

    public void incShields(int damage)  {
        shields += damage;
    }

    public void decShields(int damage) {
        shields -= damage;
    }

    public int getShields() {
        return shields;
    }

    public void setShields(int shields) {
        this.shields = shields;
    }

    public abstract void takeDamage(int damage);
}
