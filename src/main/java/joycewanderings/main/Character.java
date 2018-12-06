package main.java.joycewanderings.main;
import java.util.Scanner;

/**
 * Created by kylewebster on 11/26/18.
 * Basic player, most important function is playGame
 */
public class Character {
    private String name;
    private EventManager eventManager;

    public Character(String name, String sourceDirectory) {
        this.name = name;
        this.eventManager = new EventManager(sourceDirectory);
    }

    public String getName() {
        return name;
    }
    public void playGame(){
        Scanner scan = new Scanner(System.in);
        Event left, right, center;
        String lname, rname, cname, choice;
        while(!eventManager.checkEnd()){
            System.out.println(eventManager.getCurrent().getContent());
            left = eventManager.getCurrent().getLeft();
            right = eventManager.getCurrent().getRight();
            center = eventManager.getCurrent().getCenter();
            System.out.print("Options:");
            try {
                lname = left.getName();
                System.out.print("\n" + lname);
            }catch(NullPointerException n){
                lname = "";
            }
            try {
                cname = center.getName();
                System.out.print("\n" + cname);
            }catch(NullPointerException n){
                cname = "";
            }
            try {
                rname = right.getName();
                System.out.println("\n" + rname);
            }catch(NullPointerException n){
                rname = "";
            }
            System.out.println();
            choice = scan.nextLine();
            if(choice.equals(lname)){
                eventManager.traverseLeft();
            }else if(choice.equals(cname)){
                eventManager.traverseCenter();
            }else if(choice.equals(rname)){
                eventManager.traverseRight();
            }else{
                System.out.println("Please type your choice again, check that your spelling matches the choice.");
            }
        }
        System.out.println(eventManager.getCurrent().getContent());
    }
}
