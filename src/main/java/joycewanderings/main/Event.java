package main.java.joycewanderings.main;
/**
 * Created by kylewebster on 11/19/18.
 * contains the individual event
 */

public class Event {
    private FileManager sourceFileDirectory;
    private String name;
    private Event left;
    private Event right;
    private Event center;
    public Event(FileManager sourceFileDirectory) {
        this.sourceFileDirectory = sourceFileDirectory;
        name = sourceFileDirectory.getName();
    }

    public String getContent(){
        return sourceFileDirectory.getContent();
    }

    private void setEvents(Event left, Event center, Event right){
        this.left = left;
        this.center = center;
        this.right = right;
    }

    public Event getLeft() {
        return left;
    }

    public void setLeft(Event left) {
        this.left = left;
    }

    public Event getRight() {
        return right;
    }

    public void setRight(Event right) {
        this.right = right;
    }

    public Event getCenter() {
        return center;
    }

    public void setCenter(Event center) {
        this.center = center;
    }

    public Event getEvent(int selection){
        Event chosen = null;
        switch (selection){
            case 0:
                chosen= left;
                break;
            case 1:
                chosen= center;
                break;
            case 2:
                chosen= right;
                break;
            default:
                System.out.println("Hmmm... Did Stephen close his eyes and the world cease to exist?");
        }
        return chosen;
    }
}
