package main.java.joycewanderings.main;

/**
 * Created by kylewebster on 11/19/18.
 * Creates a tree of all of the events to reduce the search time of the events
 */
public class EventManager {
    private Event current = null;
    private Event head;
    public EventManager() {
    }

    public void addNodeLeft(String location){
        Event temp = new Event(new FileManager(location));
        if (current == null){
            head = temp;
            current = head;
        }
        else{
            current.setLeft(temp);
        }
    }
    public void addNodeCenter(String location){
        Event temp = new Event(new FileManager(location));
        if (current == null){
            head = temp;
            current = head;
        }
        else{
            current.setCenter(temp);
        }
    }
    public void addNodeRight(String location){
        Event temp = new Event(new FileManager(location));
        if (current == null){
            head = temp;
            current = head;
        }
        else{
            current.setRight(temp);
        }
    }

    public Event getCurrent(){
        return current;
    }

    public Event getHead(){
        return head;
    }

    public void traverseLeft(){
        current = current.getLeft();
    }

    public void traverseRight(){
        current = current.getRight();
    }

    public void traverseCenter(){
        current = current.getCenter();
    }
}
