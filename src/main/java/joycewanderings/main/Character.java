package main.java.joycewanderings.main;

/**
 * Created by kylewebster on 11/26/18.
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

    public void setName(String name) {
        this.name = name;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void playGame(){
        if (name.equals("")||eventManager.getSourceDirectory() == null){
            System.out.println("Something went horribly wrong... I'm ending this now");
        }
        else {
            eventManager.createTree();
            System.out.println("Hello " + name);
        }
    }
}
