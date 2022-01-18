import java.util.*;

public class Craps {

    static int rolls = 0;
    static int point = 0;
    static int lastRoll = 0;
    static int firstRoll = 0;
    public static void main(String[] args) {
        introduction();
    }

    public static void introduction() {
        rolls=0;
        point=0;
        lastRoll=0;
        firstRoll=0;
        System.out.println();
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
                playGame();
            } else {
                playGame();
            }
        }
    }

    public static void playGame() {
        System.out.println();
        System.out.println("Press ENTER to roll the dice.");
        Scanner Scan = new Scanner(System.in);

        Scan.nextLine();

        Die d = new Die();
        
        int point = d.getSum();

        if(rolls==0) {
            rolls++;
            firstRoll+=point;

            if(point==7 || point==11) {
                System.out.println();
                System.out.println("You rolled a " + d.getFirst()   + " and a " + d.getSecond() + "!");
                System.out.println("The point is " + d.getSum() + ".");
                System.out.println("You have won!");
                introduction();
            } else if(point==2 || point == 3 || point == 12) {
                System.out.println();
                System.out.println("You rolled a " + d.getFirst() + " and a " + d.getSecond() + "!");
                System.out.println("The point is " + d.getSum() + ".");
                System.out.println("You have lost!");
                introduction();
            }
            else {
                System.out.println();
                System.out.println("You rolled a " + d.getFirst() + " and a " + d.getSecond() + "!");
                System.out.println("The point is " + d.getSum() + ".");
                playGame();
            }

        } else if(point==firstRoll) {
            rolls++;
            System.out.println();
            System.out.println("You rolled a " + d.getFirst() + " and a " + d.getSecond() + "!");
            System.out.println("The point is " + d.getSum() + ".");
            System.out.println("You have won!");
            introduction();
        } else if(rolls!=0 && point==7) {
            rolls++;
            System.out.println();
            System.out.println("You rolled a " + d.getFirst() + " and a " + d.getSecond() + "!");
            System.out.println("The point is " + d.getSum() + ".");
            System.out.println("You have lost!");
            introduction();
        }
    }
}
