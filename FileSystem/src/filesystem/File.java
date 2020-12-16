/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aleta
 */
public class file {
    
    String name;
    String extension;
    String content;
    Date creationDate;
    Date modicationDate;
    int size;
    String path;
//     


    public file(String pname, String pExtension, String pContent, String pPath, int pSize) {

        
        this.name= pname;
        this.extension= pExtension;
        this.content= pContent;

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        Date date = new Date();

        this.creationDate = date;
        this.modicationDate = null;
        this.path= pPath;
        this.size= size;
        // this.sector= psector;

    }

    public file(String name, String extension, String content, Date creationDate, Date modicationDate) {
        this.name = name;
        this.extension = extension;
        this.content = content;
        this.creationDate = creationDate;
        this.modicationDate = modicationDate;
    }

    public file(String name, String extension, String content, Date creationDate, Date modicationDate, int size, String path) {
        this.name = name;
        this.extension = extension;
        this.content = content;
        this.creationDate = creationDate;
        this.modicationDate = modicationDate;
        this.size = size;
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public String getPath() {
        return path;
    }
    

    public void setContent(String content) {
        this.content = content;
    }

    public void setPath(String path) {
        this.path = path;
    }


     
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String Extension) {
        this.extension = extension;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date CreationDate) {
        this.creationDate = creationDate;
    }

    public Date getModicationDate() {
        return this.modicationDate;
    }

    public void setModicationDate(Date ModicationDate) {
        this.modicationDate = modicationDate;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int Size) {
        this.size = size;
    }

    public String getpath() {
        return this.path;
    }

    public void setpath(String path) {
        this.path = path;
    }
    

    // public void createFile(String pname, String pExtension, String pContent, String ppath){
    //     File file = new File();



        
    public void UpdateFile(String p_name,String p_extension,String p_content,Date p_creationDate,Date p_modicationDate,int p_size,String p_path )
    {
        this.name=p_name;
        this.extension=p_extension;
        this.content=p_content;
        this.creationDate=p_creationDate;
        this.modicationDate=p_modicationDate;
        this.size=p_size;
        this.path=p_path;

    }
    
        @Override
    public String toString() {
        return "File{" + "name=" + name + ", extension=" + extension + ", content=" + content + ", creationDate=" + creationDate + ", modicationDate=" + modicationDate + ", size=" + size + ", path=" + path + '}';
    }
//     public String watch() {
//        return "name: " + name + "\nextension=" + extension + ", content=" + content + ", creationDate=" + creationDate + ", modicationDate=" + modicationDate + ", size=" + size + ", path=" + path + '}';
//    }

    
    public double sectoresNecesarios(int sizeFile, int sectorSize){
       return (int) Math.ceil(sizeFile/sectorSize);
       
    }

    // }
    //CREATEFILE
    //MODFILE
    //VERPROPIEDADES
    //VERFILE








}
