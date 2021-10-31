package luf_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    Scanner scnr;

    public View() {

    }

    public void damage() {

    }

    public void map() {

    }

    public void ping() {

    }

    public void srs() {

    }

    public void lrs() {

    }

    public void displayMessage() {

    }

    public void displayOpening(int stardate, int endStarDate, int klingons) {
        print("The stardate is ", String.valueOf(stardate), "\n");
        print("You are the captain of the USS Enterprise.  You have received word from Starfleet \n" +
                "command of a plot by Klingon spies to destroy all Federation starbases in the region\n" +
                "so the Klingon Empire can assume control.");
        print("The Federation is in danger and you are the only ship in range.\n");
        print("Your mission is to hunt down and destroy the", String.valueOf(klingons), "Klingon" +
                " warships in the region. \nYou must complete your mission before stardate", String.valueOf(endStarDate),
                ", giving you", String.valueOf(endStarDate-stardate), "stardates to succeed.");
        print("There are 3 Federation Starbases in the region for refueling, restocking torpedoes, and repairs.\n\n"+
                "Good luck, galactic pease is in your hands!\n");
        goNextPart();
        //get klingons in sector change next pring based on amount
        print("As you begin your mission, you find yourself in a sector clear of enemy ships.\n" +
                "You will have to use navigation to jump to another sector to engage with the enemy.\n" +
                "If the sectors adjacent to your ship are unexplored, you can use your long range sensors\n" +
                "to try and find the enemy.\n");

    }

    public int getCommand() {
        print("ENTER ONE OF THE FOLLOWING:\n" +
                "1) NAVIGATION\n" +
                "2) WEAPONS\n" +
                "3) SHIELD CONTROL\n" +
                "4) SENSORS\n" +
                "5) SHIPS COMPUTER\n");

        switch (getInput(5)) {
            case 1:
                print("ENTER ONE OF THE FOLLOWING:\n" +
                        "1) SHORT RANGE JUMP (1 STARDATE)\n" +
                        "2) JUMP TO ANOTHER SECTOR  (1 STARDATE)\n" +
                        "3) BACK\n");
                switch (getInput(3)) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        getCommand();
                }
            case 2:
                print("ENTER ONE OF THE FOLLOWING:\n" +
                        "1) PHASERS\n" +
                        "2) PHOTON TORPEDOES (10 ENERGY)\n" +
                        "3) BACK\n");
                switch (getInput(3)) {
                    case 1:
                        return 3;
                    case 2:
                        return 4;
                    case 3:
                        getCommand();
                }

            case 3:
                return 5;
            case 4:
                print("ENTER ONE OF THE FOLLOWING:\n" +
                        "1) SCAN ENEMY SHIPS (10 ENERGY)\n" +
                        "2) LONG RANGE SENSORS (1 STARDATE)\n" +
                        "3) BACK\n");
                switch (getInput(3)) {
                    case 1:
                        return 6;
                    case 2:
                        return 7;
                    case 3:
                        getCommand();
                }

            case 5:
                print("ENTER ONE OF THE FOLLOWING:\n" +
                        "1) DAMAGE REPORT\n" +
                        "2) MAPS\n" +
                        "3) SELF DESTRUCT\n" +
                        "4) BACK\n");
                switch (getInput(3)) {
                    case 1:
                        //get damage report
                        return 8;
                    case 2:
                        return 9;
                    case 3:
                        return 10;
                    case 4:
                        getCommand();
                }
        }
        return getCommand();
    }

    public int getInput(int upperBound) {
        int input = 0;
        scnr = new Scanner(System.in);
        try {
            System.out.print(" > ");
            if (scnr.hasNextInt()) {
                input = scnr.nextInt();
                if (!(input > 0 && input <= upperBound)) {
                    throw new InputMismatchException();
                }
            } else {
                throw new InputMismatchException();
            }
        }
        catch (InputMismatchException e) {
            getInput(upperBound);
        }
        return input;
    }

    public void goNextPart() {
        scnr = new Scanner(System.in);
        System.out.println("Press \"ENTER\" to continue...");
        scnr.nextLine();
    }

    private void print(String out, String... args) {
        if (args != null) {
            System.out.print(out + " ");
            for (int i = 0; i < args.length; i++ ) {
                System.out.print(args[i] + " ");
            }
        }
        else {
            System.out.print(out);
        }
        System.out.print("\n");
    }

}
