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
public class Disk {

    @Override
    public String toString() {
        return "Disk{" + "Name=" + Name + ", size=" + size + ", sectors=" + sectors.toString() + '}';
    }
    
    private String Name;
    private int size;
    private ArrayList<Sector> sectors;

 
        

    
    public Disk(String Name, int size, ArrayList<Sector> sectors) {
        this.Name = Name;
        this.size = size;
        this.sectors = sectors;
        
        
        System.out.println("disco creado");
    }



}
