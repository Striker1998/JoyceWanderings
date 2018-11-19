package main.java.joycewanderings.main.filemanager;

/**
 * Created by kylewebster on 11/18/18.
 */
public class TextFileManager extends FileManager {
    public TextFileManager(String name) {
        super(name);
    }

    @Override
    public String getContent() {
        super.getContent();
        return name;
    }
}
