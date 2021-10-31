package luf_project;

import java.util.Random;

public class StarTrek {
    int stardate, endStardate, klingons;
    Galaxy galaxy;
    Random rand = new Random();

    public StarTrek() {
        //random int between 2387 and 5948
        stardate = rand.nextInt((5948 - 2387) + 1) + 2387;
        //stardate + base mission length + random int between 1-10
        endStardate = stardate + 25 + rand.nextInt(9) + 1;

        galaxy = new Galaxy(rand.nextInt(7),rand.nextInt(7));


        View view = new View();
        view.displayOpening(stardate, endStardate, klingons);


        switch( view.getCommand()) {
            case 1: //short range jump
            case 2: //jump to another sector
            case 3: //phasers
            case 4: //photon torpedoes
            case 5: //shield control
            case 6: //srs
            case 7: //lrs
            case 8: damage();
            case 9:
            case 10:
        }


    }

    public void damage() {
        print("Repair crews can repair 1-5% damage per stardate. A star base will fully repair a \n" +
                "single component every stardate.\n" +
//                "At its current level of repair, the warp engines can achieve a speed of " +
                "Phasers Operable : " + "CHANGE TO VAR" + "\n" +
                "Phasers Accuracy : " + "CHANGE TO VAR" + "\n" +
                "Torpedo Accuracy : " + "CHANGE TO VAR" + "\n" +
                "Deflector shield system can process"+ "CHANGE TO VAR" + "units of energy out of a possible 2000");
    }

    public void destruct() {

    }

    public void impulse() {

    }

    public void lrs() {

    }

    public void map() {

    }

    //PHA e x y - fire phasers for "e" energy at sector (x,y).
    //          If a Klingon is hit, it reduces shields first, then hull strength.
    //          When hull strength reaches 0, the Klingon is destroyed.
    public void phase() {

    }

    //ping - scan any enemy ships and report their shield strength and hull status
    //          (basically the amount of energy required to destroy them).
    public void ping() {

    }

    public void sheild() {

    }

    //SRS - short range scan (it's what gets printed at the start of every turn).
    public void srs() {

    }

    //TOR x y - fires a photon torpedo at sector (x,y).
    //          Doesn't use energy, but depletes the number of torpedoes left.
    //          A single torpedo will destroy a Klingon.
    public void torpedo() {

    }

    //WARP x y - use the warp drive to move to quadrant (x,y).
    //           Consumes 10 energy per quadrant moved. Uses 1 stardate.
    public void warp() {

    }

    private void print(String out, String... args) {
        if (args != null) {
            System.out.print(out);
            for (int i = 0; i < args.length; i++ ) {
                System.out.print(args[i] + " ");
            }
        }
        else {
            System.out.print(out);
        }
        System.out.print("\n");
    }



    public static void main(String[] args) {
        StarTrek starTrek = new StarTrek();
    }
}
