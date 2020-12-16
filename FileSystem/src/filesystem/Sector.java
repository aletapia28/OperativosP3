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
    private String nombre;
    private int numero_sector;
    private String contenido;
    public boolean isEmpty;
    private String ruta;


    public Sector() {
    }

    public Sector(String nombre, int numero_sector, String contenido, boolean isEmpty, String ruta) {
        this.nombre = nombre;
        this.numero_sector = numero_sector;
        this.contenido = contenido;
        this.isEmpty = isEmpty;
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Sector{" + "id="+ numero_sector + ", isEmpty=" + isEmpty + '}';
    }

 

    public boolean isIsEmpty() {
        return isEmpty;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_sector() {
        return numero_sector;
    }

    public void setNumero_sector(int numero_sector) {
        this.numero_sector = numero_sector;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public boolean getEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    


}
