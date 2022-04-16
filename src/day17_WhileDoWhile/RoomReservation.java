package day17_WhileDoWhile;

import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you want to reserve a room?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Invalid entry, please re-enter");
            answer = scan.next().toLowerCase();
        }
        if (answer.equals("yes")) {
            System.out.println("Which type of room do you want? King, Quenn or Single? ");
            scan.nextLine();
            String choise = scan.nextLine().toLowerCase();
            if (choise.equals("king")) {
                System.out.println("King Bed==>120$");
            } else if (choise.equals("quenn")) {
                System.out.println("Quenn Bed==>100$");
            } else if (choise.equals("single")) {
                System.out.println("Single Bed==>80$");
            }
        } else if (answer.equals("no")) {
            System.out.println("Have nice day");
        }
        scan.close();

    }
}
