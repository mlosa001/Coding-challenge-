//package org.pursuit;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class GuessingGame implements Game {
//    @Override
//    public void startGame() {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int ranNu = random.nextInt(10) + 1;
//       int guess;
//
//        do {
//            System.out.println("guess a # b/w  1 & 10" );
//             guess = scanner.nextInt(10) + 1;
//
//        } while(guess != ranNu);
//        System.out.println(" guessed " + ranNu );
//
//
//    }
//}
