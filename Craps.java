import java.util.*;

public class Craps {
    public static void main(String[] args) {

    }

    public void introduction() {
        System.out.println("Would you like to play Craps? (Y/N)");

        Scanner Scan = new Scanner(System.in);

        if(Scan.next().equals("Y")) {
            System.out.println("Do you need instructions? (Y/N)");
            if(Scan.next().equals("Y")) {
                System.out.println("The basic rules for playing craps are relatively simple:");
                System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over.");
                System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the \"point.\"");
                System.out.println("3. THe player continues to roll the two dice again until one of two things happens:");
                System.out.println("either they roll the \"point\" from the first roll again, in which case they win;");
                System.out.println("or they roll a 7, in which case they lose.");
            }
        }
    }
}
