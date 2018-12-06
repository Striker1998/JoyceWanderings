package main.java.joycewanderings.main;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

/**
 * Created by kylewebster on 11/19/18.
 * Allows the opening and closing of files
 */
public class FileManager {
    private String source;
    private String name;

    public FileManager(String source) {
        this.source = source;
        String pattern = "(.*/)(.*\\Z)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(source);
        if (m.find()) {
            name = m.group(2);
        }else{

        }
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        try {
            File file = new File(source);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            String combined = "";
            while ((st = br.readLine()) != null) {
                combined += st;
            }
            return combined;
        }
        catch(IOException e){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please put in the manual file for " + source);
            source = scan.nextLine();
            return getContent();
        }
    }
}
