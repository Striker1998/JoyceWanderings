package main.java.joycewanderings.main;

import java.io.*;
/**
 * Created by kylewebster on 11/19/18.
 * Allows the opening and closing of files
 */
public class FileManager {
    private String source;
    private String name;

    public FileManager(String source) {
        this.source = source;
        this.name = name;
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

    public String getContent() throws Exception{
        File file = new File(source);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String combined = "";
        while((st = br.readLine()) != null){
            combined += st;
        }
        return combined;
    }
}
