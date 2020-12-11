/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

/**
 *
 * @author aleta
 */
public class Sector {
    public int id;
    public boolean isEmpty;

    public Sector() {
    }


    public Sector(int id, boolean isEmpty) {
        this.id = id;
        this.isEmpty = isEmpty;
        
    }

    @Override
    public String toString() {
        return "Sector{" + "id=" + id + ", isEmpty=" + isEmpty + '}';
    }
    
    


}
