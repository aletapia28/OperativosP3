/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import java.util.ArrayList;

/**
 *
 * @author aleta
 */
public class Dir {
    

    private String Name;
    private ArrayList<File> files;
    private ArrayList<Dir> dirs;

    public Dir(String Name) {
        this.Name = Name;
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<Dir> getDirs() {
        return dirs;
    }

    public void setDirs(ArrayList<Dir> dirs) {
        this.dirs = dirs;
    }
    
    


}
