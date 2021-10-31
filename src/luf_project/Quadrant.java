package luf_project;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Quadrant {
    Placeable[][] sector;
    int sectorX, sectorY;
    int row, col;
    int kingons, starbases, stars;
    Random rand = new Random();

    public Quadrant (int sectorX, int sectorY) {
        sector = new Placeable[8][8];
        this.sectorX = sectorX;
        this.sectorY = sectorY;

    }

    public String getKBS() {

        return "";
    }

    public boolean hasEnterprise() {
        return false;
    }

    public void putEnterprise(Enterprise enterprise, int sx, int sy) {

    }

    public void putKlingon(int sx, int sy) {

    }

    public void putStarbase(int sx, int sy) {

    }

    public void removeEnterprise() {

    }

    public void removeKlingon(int sx, int sy) {

    }

    public int[][] blankSpaces() {
        ArrayList<Object> placeables = null;
        for (int i = 0; i < sector.length; i++) {
            for (int j = 0; j < sector.length; j++) {
                placeables = sector[][].getPlaceables();

            }
        }
        System.out.println(placeables);
        return null;
    }
}
