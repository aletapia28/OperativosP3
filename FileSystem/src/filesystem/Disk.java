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

    public Disk() {
    }



    @Override
    public String toString() {
        return "Disk{" + "Name=" + Name + ", size=" + size + ", sectors=" + sectors.toString() + '}';
    }
    
    private String Name;
    public int size;
    public ArrayList<Sector> sectors;
    public int CantidadSectores;
    

 
        

    
    public Disk(String Name, int size, int CantidadSectores,ArrayList<Sector> sectors) {
        this.Name = Name;
        this.size = size;
        this.sectors = sectors;
        this.CantidadSectores = CantidadSectores;
        
        
        System.out.println("disco creado");
    }
    
    
    public int sectorSize(){
        return this.size/ CantidadSectores;
    }



}
