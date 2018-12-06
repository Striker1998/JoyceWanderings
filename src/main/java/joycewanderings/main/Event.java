package main.java.joycewanderings.main;

import java.util.regex.*;

/**
 * Created by kylewebster on 11/19/18.
 * contains the individual event
 */

public class Event {
    private FileManager sourceFileDirectory;
    private String name = null;
    private Event left = null;
    private Event right = null;
    private Event center = null;
    private Event parent = null;
    public Event(FileManager sourceFileDirectory) {
        this.sourceFileDirectory = sourceFileDirectory;
        name = sourceFileDirectory.getName();
    }

    public String getContent(){
        return sourceFileDirectory.getContent();
    }

    public Event getParent(){return parent;}
    public void setParent(Event parent){this.parent = parent;}

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
    public String getDirectory(){
        return sourceFileDirectory.getSource();
    }
    public String getName(){
        return sourceFileDirectory.getName();
    }

}
