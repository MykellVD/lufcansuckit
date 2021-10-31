package luf_project;

import java.util.Random;

public class Galaxy {
    Quadrant[][] quadrant;
    Random rand = new Random();
    int quadX, quadY;
    Enterprise enterprise;
    int klingons, starbases, stars;

    public Galaxy (int sx, int sy) {
        //init values
        quadrant = new Quadrant[8][8];
        quadX = sx;
        quadY = sy;
        //add Quadrants to each element of array quadrant
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                quadrant[row][col] = new Quadrant(row, col);
            }
        }

        Enterprise enterprise = new Enterprise(quadX, quadY, rand.nextInt(7),rand.nextInt(7));

        klingons = rand.nextInt((20 - 10) + 1 ) + 10;

        placeItem(1,1);


    }

    public int currentQuadrant() {
        return 0;
    }

    public int currentQuadX() {
        return quadX;
    }


    public int currentQuadY() {
        return quadY;
    }

    public void moveEnterprise(int qx, int qy, int sx, int sy) {
        quadrant[qx][qy].removeEnterprise();
        quadrant[qx][qy].putEnterprise(enterprise, sx, sy);

    }

    public void placeItem(int type, int n) {
        Quadrant curQuad = quadrant[currentQuadX()][currentQuadY()];

        curQuad.blankSpaces();

        switch (type) {
            case 1: //klingons

            case 2: //stars

            case 3: //starbase


        }

    }
}
