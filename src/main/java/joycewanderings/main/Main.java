package main.java.joycewanderings.main;


import java.util.Scanner;

public class Main {

    public static void main(String args[])throws Exception {
        Character player;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to JoyceWanderings, please select your player");
        System.out.println("1. Stephen\n2. Bloom\n3. Molly");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                player = new Character("Stephen", "");
                break;
            case 2:
                player = new Character("Bloom", "");
                break;
            case 3:
                player = new Character("Molly", "");
                break;
            default:
                System.out.println("How?.. What?... How did you mess up this badly??? There were only 3 options...");
                player = new Character("", "");
        }
        System.out.println("Thank you for choosing " + player.getName());
        player.playGame();

    }
}
