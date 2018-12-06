package main.java.joycewanderings.main;


import java.util.Scanner;

public class Main {

    public static void main(String args[])throws Exception {
        Character player;
        Scanner input = new Scanner(System.in);
        boolean finished = false;
        System.out.println("Welcome to JoyceWanderings, please select your player or type Exit to quit");
        while(!finished) {


            System.out.println("Stephen\nBloom\nMolly\nExit");
            String choice = input.nextLine();
            switch (choice) {
                case "Stephen":
                    player = new Character("Stephen", "/Users/kylewebster/Desktop/JoyceWanderings/Stephen");
                    System.out.println("Thank you for choosing " + player.getName());
                    player.playGame();
                    break;
                case "Bloom":
                    player = new Character("Bloom", "/Users/kylewebster/Desktop/JoyceWanderings/Bloom");
                    System.out.println("Thank you for choosing " + player.getName());
                    player.playGame();
                    break;
                case "Molly":
                    player = new Character("Molly", "/Users/kylewebster/Desktop/JoyceWanderings/Molly");
                    System.out.println("Thank you for choosing " + player.getName());
                    player.playGame();
                    break;
                case "Exit":
                    finished = true;
                    System.out.println("Thank you playing JoyceWanderings Early Early Beta 1.0. " +
                            "I plan on expanding the game to the rest of the day as well as adding a graphical interface." +
                            "This is the culmination of all of my studies ");
                    break;
                default:
                    System.out.println("Please, try again");
            }
        }

    }
}
