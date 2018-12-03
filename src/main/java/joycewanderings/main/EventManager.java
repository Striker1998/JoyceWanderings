package main.java.joycewanderings.main;
import java.io.File;
import java.util.regex.*;

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

    public void createTree(String directory){
        if (head==null){
            head = new Event(new FileManager(directory+ "/First.txt"));
            current = head;
            System.out.println(current.getContent());
            createTree(directory);
        }
        else{
            try{
            File[] files = new File(directory).listFiles();
            String pattern = "(.*/)(.*\\Z)";
            Pattern r = Pattern.compile(pattern);

            int length = files.length;
            for(int i = 0; i < length; i++) {
                System.out.println("Directory ");
                for (int j = 0; j < length; j++) {
                    System.out.println(files[j].toString());
                }
                System.out.println();
                Matcher m = r.matcher(files[i].toString());
                if (m.find()) {
                    if (m.group(0).contains(".txt")) {
                        System.out.println(files[i].toString());
                    } else if(!m.group(0).contains(".DS_Store") && !m.group(0).equals(directory) && !(m.group(0) == null)) {
                        System.out.println("Found value: " + m.group(0));
                        createTree(m.group(0));
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
