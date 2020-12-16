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
    public int sectoresDisponibles;
    

 
        

    
    public Disk(String Name, int size, int CantidadSectores,ArrayList<Sector> sectors) {
        this.Name = Name;
        this.size = size;
        this.sectors = sectors;
        this.CantidadSectores = CantidadSectores;
        this.sectoresDisponibles=CantidadSectores;
        
        
        System.out.println("disco creado");
    }
    
    
    public int sectorSize(){
        return this.size/ CantidadSectores;
    }

    public int getSectoresDisponibles() {
        return sectoresDisponibles;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSectors(ArrayList<Sector> sectors) {
        this.sectors = sectors;
    }

    public void setCantidadSectores(int CantidadSectores) {
        this.CantidadSectores = CantidadSectores;
    }

    public void setSectoresDisponibles(int sectoresDisponibles) {
        this.sectoresDisponibles = sectoresDisponibles;
    }

    public String getName() {
        return Name;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Sector> getSectors() {
        return sectors;
    }

    public int getCantidadSectores() {
        return CantidadSectores;
    }
    



}
