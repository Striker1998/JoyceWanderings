package main.java.joycewanderings.main;
import java.io.File;
import java.util.regex.*;
import java.util.Stack;

/**
 * Created by kylewebster on 11/19/18.
 * Creates a tree of all of the events to reduce the search time of the events
 */
public class EventManager {
    private Event current = null;
    private Stack<String> stack = new Stack<String>();
    private Event head = null;
    public EventManager(String sourceDirectory) {
        getFiles(sourceDirectory);
        head = new Event(new FileManager(stack.pop()));
        current = head;
        createTree(this.current);
        current = head;
    }

    public void createTree(Event current){
        String pattern = "(.*/)(.*/)(.*\\Z)";
        Pattern r = Pattern.compile(pattern);
        Matcher h = r.matcher(head.getDirectory());
        if(!stack.isEmpty()) {
            Matcher m = r.matcher(stack.peek());
            Matcher m1 = r.matcher(current.getDirectory());
            if (m.find() && m1.find() && h.find()) {
                if (m.group(2).equals(m1.group(2)) || m1.group(2).equals(h.group(2))) {
                    if (m.group(2).equals("Left/")) {
                        current.setLeft(new Event(new FileManager(stack.pop())));
                        Event temp = current.getLeft();
                        temp.setParent(current);
                        createTree(temp);
                    }
                    if(stack.isEmpty()){return;}
                    m = r.matcher(stack.peek());
                    if(m.find()) {
                        if (m.group(2).equals("Center/")) {
                            current.setCenter(new Event(new FileManager(stack.pop())));
                            Event temp = current.getCenter();
                            temp.setParent(current);
                            createTree(temp);
                        }
                    }
                    if(stack.isEmpty()){return;}
                    m = r.matcher(stack.peek());
                    if(m.find()) {


                        if (m.group(2).equals("Right/")) {
                            current.setRight(new Event(new FileManager(stack.pop())));
                            Event temp = current.getRight();
                            temp.setParent(current);
                            createTree(temp);
                        }
                    }else{
                    }
                }

            }
        }
    }

    public void getFiles(String directory){
        try{
            File[] files = new File(directory).listFiles();
            String pattern = "(.*/)(.*\\Z)";
            Pattern r = Pattern.compile(pattern);

            int length = files.length;
            for(int i = 0; i < length; i++) {
                Matcher m = r.matcher(files[i].toString());
                if (m.find()) {
                    if (m.group(2).contains(".txt")) {
                        stack.push(files[i].toString());
                    } else if(!m.group(0).contains(".DS_Store") && !m.group(0).equals(directory) && !(m.group(0) == null)) {
                        getFiles(m.group(0));
                    }

                } else {
                    System.out.println("NO MATCH");
                }
            }
        }
        catch(java.lang.NullPointerException e ){
            System.out.println("Something went horribly wrong. No clue what.");
        }
    }
    public Event getCurrent(){
        return current;
    }

    public boolean checkEnd(){
        if(current.getLeft()==null && current.getRight()==null && current.getCenter()==null){
            return true;
        }
        else{
            return false;
        }
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
