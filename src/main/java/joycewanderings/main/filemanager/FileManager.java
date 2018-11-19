package main.java.joycewanderings.main.filemanager;

import java.io.File;
/**
 * Created by kylewebster on 11/18/18.
 */
public abstract class FileManager {
    String filePath;
    String name;

    public FileManager(String name) {
        this.name = name;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getContent(){
        Object blank = null;
        return blank;
    }
}
