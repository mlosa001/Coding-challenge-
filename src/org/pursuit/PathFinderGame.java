package org.pursuit;

import java.util.Scanner;

public class PathFinderGame{

        //implements Game{


    Scanner scanner = new Scanner(System.in);
    int tile;
    int roll;

//    @Override
//    public void startGame() {
//
//    }

    public void startGame() {
        logo();
        instructions();
        tile = 90;
        checkvalue();
    }

    private void logo() {
        System.out.println("######                      #######\n" +
                "#     #   ##   ##### #    # #       # #    # #####  ###### #####\n" +
                "#     #  #  #    #   #    # #       # ##   # #    # #      #    #\n" +
                "######  #    #   #   ###### #####   # # #  # #    # #####  #    #\n" +
                "#       ######   #   #    # #       # #  # # #    # #      #####\n" +
                "#       #    #   #   #    # #       # #   ## #    # #      #   #\n" +
                "#       #    #   #   #    # #       # #    # #####  ###### #    #\n");
    }

    //single responsibility principle
    private void instructions() {
        System.out.println("This game is called 'PathFinder'. The goal of this game is to reach the end of the path, 100 tiles.\n" +
                "You start at the first tile, then press enter to roll.\n" +
                "You can roll any number from 1 to 10 - then move that number of tiles forward.\n" +
                "If you roll a 7, you get to move 7 tiles, plus a random roll between 1 an 10.\n" +
                "If you roll a 10, you move back a random roll from between 1 and 10.\n" +
                "If the random roll is greater than your current tile, you move back to the first tile.\n" +
                "Good luck!\n");
    }

    private void input() {
        System.out.print("\npress enter to roll..");
        scanner.nextLine();
        roll = roll();
    }

    private int roll() {
        int random = (int) Math.ceil(Math.random() * 10);
        return random;
    }

    //to change a name
    private void checkvalue() {
        do {
            System.out.println("current tile " + tile);
            System.out.println("tiles  to go " + (100 - tile));
            input();
            int newRoll = roll();
            if (roll == 7) {
                System.out.println("\nluch 7 ");
                tile = tile + roll + newRoll;
            } else if (roll == 10) {
                if (tile <= 10 && newRoll >= tile) {
                    System.out.println("\nyouve rolled a 10 move back one spaves ");
                    tile = 1;
                    //control r to run
                } else {
                    System.out.println("\no no you10 " + newRoll);
                    tile = tile - newRoll;
                }
            } else {
                System.out.println("\nu rolled a " + roll);
                tile = tile + roll;
            }
        } while (tile < 100);
        System.out.println("you reached the end ");
        gameOva();
    }

    private void gameOva() {
        String input;
        do {
            System.out.println("play again? [Y/n] ");
            input = scanner.nextLine();


            if (input.length() == 0 || input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
                startGame();
            } else if (input.charAt(0) == 'n' || input.charAt(0) == 'N') {
                System.out.println("Goodbye! Thanks for playing 'PathFinder'!\n");
                break;

            } else {
                System.out.println("sorry error");
            }
        } while (input.length() != 0 || input.charAt(0) != 'y' || input.charAt(0) != 'Y' || input.charAt(0) != 'n' || input.charAt(0) != 'N');
    }


}