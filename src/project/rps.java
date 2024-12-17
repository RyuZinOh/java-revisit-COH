package project;

import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors");
        Random randi = new Random();
        Scanner getuserinput = new Scanner(System.in);
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        String uservalue;
        String computervalue = r;

        // Randomizing
        int randoN = randi.nextInt(3);
        if (randoN == 0) {
            computervalue = r;
        } else if (randoN == 1) {
            computervalue = p;
        } else if (randoN == 2) {
            computervalue = s;
        }

        System.out.println("Rock, Paper, or Scissors?");
        uservalue = getuserinput.nextLine().toLowerCase();
        System.out.println("Computer chose " + computervalue);

        // Determine the winner
        if (uservalue.equals(p) && computervalue.equals(r)) {
            System.out.println("You won!");
        } else if (uservalue.equals(r) && computervalue.equals(s)) {
            System.out.println("You won!");
        } else if (uservalue.equals(s) && computervalue.equals(p)) {
            System.out.println("You won!");
        } else if (uservalue.equals(computervalue)) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("Computer won!");
        }


        getuserinput.close();
    }
}
