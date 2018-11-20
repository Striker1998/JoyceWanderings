package main.java.joycewanderings.main;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[])throws Exception {
        FileManager file = new FileManager("/Users/kylewebster/Desktop/test.txt", "username");
        Event e = new Event(file);
        System.out.println(e.getContent());
    }
}
