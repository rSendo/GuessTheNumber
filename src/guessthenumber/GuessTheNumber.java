package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
        
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNUMBER) {
                System.out.println("Your number is too big");
            } else if (move < theNUMBER) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You got it!");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Out number is pretty small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is pretty big");
        } else {
            System.out.println("Our number is out of range");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to the game. Try and guess the number between 0 and " + guessGame.max + " inclusive. Just type the number to get started!");
        guessGame.play();
    }

}
