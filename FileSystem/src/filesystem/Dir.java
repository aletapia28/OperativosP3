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
    private ArrayList<file> files;
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

    public ArrayList<file> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<file> files) {
        this.files = files;
    }

    public ArrayList<Dir> getDirs() {
        return dirs;
    }

    public void setDirs(ArrayList<Dir> dirs) {
        this.dirs = dirs;
    }
    
    


}
