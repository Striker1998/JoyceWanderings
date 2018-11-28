package main.java.joycewanderings.main;

/**
 * Created by kylewebster on 11/19/18.
 * Creates a tree of all of the events to reduce the search time of the events
 */
public class EventManager {
    private Event current = null;
    private Event head = null;
    private String sourceDirectory;
    public EventManager(String sourceDirectory) {
        this.sourceDirectory = sourceDirectory;
    }

    public void createTree(){
        if (head==null){
            head = new Event(new FileManager("cats"));
            current = head;
        }
        else{
            current.setLeft(new Event(new FileManager("Main")));
        }

    }
    public String getSourceDirectory(){
        return sourceDirectory;
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
