/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import static com.sun.tools.javac.tree.TreeInfo.args;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import javax.swing.tree.DefaultMutableTreeNode; 
import filesystem.Disk;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.DropMode;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleta
 * 
 * 
 */

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public String File;
    private int cant_sectores=0;
    private int tamaño_sector=0;
    JFrame f;  
    JTree jt; 
    Disk disk;
    
    File virtualDisk;
    File filedisk;
    private ArrayList<Sector> disco_virtual;
    

    public GUI() {
        initComponents();   
        Disk disk = new Disk();
        
        fileName.setVisible(false);
        fileContent.setVisible(false);
        fileDate.setVisible(false);
        fileDateMod.setVisible(false);
        fileSize.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addFile = new javax.swing.JButton();
        mkdir = new javax.swing.JButton();
        modFile = new javax.swing.JButton();
        moveDir = new javax.swing.JButton();
        copyFile = new javax.swing.JButton();
        seeProperties = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        createDisk = new javax.swing.JButton();
        treePanel = new javax.swing.JScrollPane();
        textPane = new javax.swing.JPanel();
        fileName = new javax.swing.JLabel();
        fileContent = new javax.swing.JLabel();
        fileDate = new javax.swing.JLabel();
        fileDateMod = new javax.swing.JLabel();
        fileSize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addFile.setText("Agregar Archivo");
        addFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFileActionPerformed(evt);
            }
        });

        mkdir.setText("Agregar Directorio");
        mkdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkdirActionPerformed(evt);
            }
        });

        modFile.setText("Modificar Archivo");
        modFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modFileActionPerformed(evt);
            }
        });

        moveDir.setText("Mover Archivo");
        moveDir.setToolTipText("");
        moveDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveDirActionPerformed(evt);
            }
        });

        copyFile.setText("Copiar Archivo");
        copyFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyFileActionPerformed(evt);
            }
        });

        seeProperties.setText("Ver Propiedades");
        seeProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seePropertiesActionPerformed(evt);
            }
        });

        delete.setText("Eliminar ");
        delete.setActionCommand("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        createDisk.setText("Crear Disco");
        createDisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDiskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mkdir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addFile)
                        .addGap(18, 18, 18)
                        .addComponent(moveDir)
                        .addGap(18, 18, 18)
                        .addComponent(modFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seeProperties))
                    .addComponent(createDisk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(copyFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createDisk)
                    .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFile)
                    .addComponent(mkdir)
                    .addComponent(modFile)
                    .addComponent(moveDir)
                    .addComponent(copyFile)
                    .addComponent(seeProperties)
                    .addComponent(delete))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        treePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treePanelMouseClicked(evt);
            }
        });

        fileName.setText("name");

        fileContent.setText("contnte");

        fileDate.setText("date");

        fileDateMod.setText("mod");

        fileSize.setText("size");

        javax.swing.GroupLayout textPaneLayout = new javax.swing.GroupLayout(textPane);
        textPane.setLayout(textPaneLayout);
        textPaneLayout.setHorizontalGroup(
            textPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(textPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileContent)
                    .addComponent(fileName)
                    .addComponent(fileDate)
                    .addGroup(textPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fileSize)
                        .addComponent(fileDateMod)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        textPaneLayout.setVerticalGroup(
            textPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPaneLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(fileName)
                .addGap(68, 68, 68)
                .addComponent(fileContent)
                .addGap(43, 43, 43)
                .addComponent(fileDate)
                .addGap(47, 47, 47)
                .addComponent(fileDateMod)
                .addGap(44, 44, 44)
                .addComponent(fileSize)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(treePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(textPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                        
    private void addFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFileActionPerformed
        // TODO add your handling code here:
            
        String name = JOptionPane.showInputDialog("Digite el nombre del archivo");
        String extension = JOptionPane.showInputDialog("Digite la extension");
        String contenido = JOptionPane.showInputDialog("Digite el contenido"); 
        String tam = JOptionPane.showInputDialog("Digite el tamaño");

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
        Date date = new Date();

        file file = new file( name,extension, contenido, date, null);
            
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(file);
   
        Boolean nombre_repetido = name_check(selectedNode,name,extension);
        if(!nombre_repetido){
            add_file(file);
            selectedNode.add(newNode); 
            DefaultTreeModel model = (DefaultTreeModel)jt.getModel();

            model.reload();
        }else{
            JOptionPane.showMessageDialog(rootPane,"El nombre del archivo ya existe");
        }

     
    }//GEN-LAST:event_addFileActionPerformed

    private void mkdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkdirActionPerformed
        // TODO add your handling code here:
        String name = JOptionPane.showInputDialog("Digite el nombre del directorio");

        Dir dir = new Dir( name);
        
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(name);
        selectedNode.add(newNode); 
        DefaultTreeModel model = (DefaultTreeModel)jt.getModel();

        model.reload();

    }//GEN-LAST:event_mkdirActionPerformed

    private void modFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modFileActionPerformed
        // TODO add your handling code here:

        String contenido = JOptionPane.showInputDialog("Digite el contenido"); 
        
        modifyCurrentFileNode(contenido);
        
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        DefaultTreeModel model = (DefaultTreeModel)jt.getModel();

        model.reload();

        
    }//GEN-LAST:event_modFileActionPerformed

    private void moveDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moveDirActionPerformed

    private void copyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyFileActionPerformed

    private void seePropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seePropertiesActionPerformed
        // TODO add your handling code here:
        TreePath currentSelection = jt.getSelectionPath();
        DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
        file archivo = (file) currentNode.getUserObject();
        
        fileName.setVisible(true);
        
        fileContent.setVisible(true);
        fileDate.setVisible(true);
        fileDateMod.setVisible(true);
        fileSize.setVisible(true);

        
        
        fileName.setText("Nombre: " + archivo.getName()+"."+ archivo.getExtension());
//        fileExt.setText(archivo.getExtension());
        fileContent.setText("Contenido: " + archivo.getContent());
        fileDate.setText("Fecha Creacion: " + archivo.getCreationDate().toString());
        fileDateMod.setText("Fecha Modificacion: " +archivo.getModicationDate().toString());
        fileSize.setText("Tamaño: " +String.valueOf(archivo.getSize()));
        
        
        
    
        textPane.setVisible(true);
    }//GEN-LAST:event_seePropertiesActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        
        if(selectedNode != jt.getModel().getRoot())
        {
            DefaultTreeModel model = (DefaultTreeModel)jt.getModel();

            model.removeNodeFromParent(selectedNode);

            model.nodeChanged(selectedNode);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    void doMouseClicked(MouseEvent me) {
        TreePath tp = jt.getPathForLocation(me.getX(), me.getY());
        if (tp != null){
            //        TreePath currentSelection = jt.getSelectionPath();
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (tp.getLastPathComponent());
            file archivo = (file) currentNode.getUserObject();
            
            fileContent.setText(archivo.getContent());           
            
            fileName.setVisible(false);
            fileContent.setVisible(true);
            fileDate.setVisible(false);
            fileDateMod.setVisible(false);
            fileSize.setVisible(false);
        }else{
            fileContent.setText("");
        } 
        textPane.setVisible(true);
    }

    private void createDiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDiskActionPerformed
        // TODO add your handling code here:

        String name = JOptionPane.showInputDialog("Digite el nombre del disco");
        String size = JOptionPane.showInputDialog("Digite el tamaño del sector");
        String cant_sector = JOptionPane.showInputDialog("Digite la cantidad de sectores");
        ArrayList sectors = new ArrayList<Sector>();

        disk = new Disk(name,Integer.parseInt(size), Integer.parseInt(cant_sector) ,sectors);
        file_system(name, cant_sector,size);
        

        DefaultMutableTreeNode style=new DefaultMutableTreeNode(name);  
        jt = new javax.swing.JTree(style);
        
//        jt.setDragEnabled(true);
//        jt.setDropMode(DropMode.ON_OR_INSERT);
//        jt.setTransferHandler(new TreeTransferHandler());
//        jt.getSelectionModel().setSelectionMode(
//                TreeSelectionModel.CONTIGUOUS_TREE_SELECTION);
//        expandTree(jt);

        
        jt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                doMouseClicked(me);
            }
        });
        
      
    
         treePanel.setViewportView(jt);
         
    
       
       
    }//GEN-LAST:event_createDiskActionPerformed

    private void jt(java.awt.event.MouseEvent evt){
        
        TreeSelectionModel smd = jt.getSelectionModel();
        if(smd.getSelectionCount() > 0){
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
            
        }
    }
     
    private void jtMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        TreeSelectionModel smd = jt.getSelectionModel();
        System.out.println(smd);
        if(smd.getSelectionCount() > 0){
            
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
           // label.setText(selectedNode.getUserObject().toString());
            
        }
    }                                      

    private void treePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treePanelMouseClicked
        // TODO add your handling code here:
        TreeSelectionModel smd = jt.getSelectionModel();
        if(smd.getSelectionCount() > 0){
            
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
            System.out.println(selectedNode);
           // label.setText(selectedNode.getUserObject().toString());
            
        }
    }//GEN-LAST:event_treePanelMouseClicked
    
    public boolean name_check(DefaultMutableTreeNode parentNode, String name, String ext) {
        boolean band = false;
        int lim = parentNode.getChildCount();
        if (lim != 0) {
            for (int i = 0; i < lim; i++) {
                DefaultMutableTreeNode temp = (DefaultMutableTreeNode) parentNode.getChildAt(i);
                Object user = temp.getUserObject();
                file file_aux = (file) user;
                if (file_aux.getName().equals(name) && file_aux.getExtension().equals(ext)) {
                    band = true;
                }
            }
        }
        return band;
    }

    public void modifyCurrentFileNode(String new_file_content) {
        TreePath currentSelection = jt.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode
                    = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
            file archivo = (file) currentNode.getUserObject();
            archivo.setContent(new_file_content);

        }
    }
    
    public void inicializa_disco(){
        disco_virtual  = new ArrayList<>();
        for(int i=0;i<cant_sectores;i++){
            Sector sector_n = new Sector("", i, "", true, "");
            disco_virtual.add(sector_n);
        }
        System.out.println(disco_virtual);
    }
    
    public void file_system(String name, String sectores, String tamaño) {
        
        BufferedWriter writer = null;
        try {
            filedisk = new File(name + ".txt");
            boolean fvar = filedisk.createNewFile();
            if (fvar) {
                System.out.println("Disco Creado");
                writer = new BufferedWriter(new FileWriter(filedisk));
                int num_sector = Integer.parseInt(sectores);
                int tam = Integer.parseInt(tamaño);
                tamaño_sector = tam;
                cant_sectores = num_sector;
                inicializa_disco();
                for (int i = 0; i < num_sector; i++) {
                    writer.write("sector disponible");
                    
                    writer.write('\n');
                }
                writer.close();
            } else {
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }    
 
    public int sectores_necesarios(int tamaño) {
        int tam = 0;
        double sec_necesitados = tamaño / tamaño_sector;
        int sec_necesitados_aux = tamaño / tamaño_sector;
        double res = sec_necesitados - sec_necesitados_aux;
        if (res == 0) {
            tam = sec_necesitados_aux;
        } else {
            tam = sec_necesitados_aux + 1;
        }
        return tam;
    }   
    public int sectores_disponibles(){
        int sectores = 0;
        for(Sector s : disco_virtual){
            boolean estado = s.getEmpty();
            if(estado)
                sectores++;            
        }
        return sectores;
    }    
    
    public void add_file(file new_file) {
        int size_contenido = new_file.getContent().length();
        System.out.println("largo:" + size_contenido);
        double sec_necesitados = new_file.sectoresNecesarios(size_contenido,tamaño_sector);
        System.out.println("sectores:" + sec_necesitados);
        if(sec_necesitados <= disk.sectoresDisponibles){
            for(int i=0; i<sec_necesitados;i++){
                for(Sector s:disco_virtual){
                    if(s.isEmpty){
                        s.setNombre(new_file.getName());
                        s.setContenido(new_file.getContent());
                        s.setIsEmpty(false);
                        disk.setSectoresDisponibles(disk.getSectoresDisponibles()-1);
                        System.out.println(disk.sectoresDisponibles);
                        sec_necesitados--;
                        break;
                        
                        //escribir_sector(new_file.toFile(), s.getNumero_sector());
                    }
                }
            }
            System.out.println(disco_virtual);
        }else{
            System.out.println("no hay espacio en el disco");
            
        }
        
    }
    public void escribir_sector(String contenido, int num_sector){
        RandomAccessFile f;
        try {
                  
            insertStringInFile( filedisk,num_sector,contenido);
            f = new RandomAccessFile(new File(disk.getName()+".txt"), "rw");
            f.seek(num_sector - 1); // goes to where i want to write
            f.write(contenido.getBytes()); //writes the string in name
            f.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    public void insertStringInFile(File inFile, int lineno, String lineToBeInserted)
            throws Exception {
        // temp file
        File outFile = new File("$$$$$$$$.tmp");

        // input
        FileInputStream fis = new FileInputStream(inFile);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        // output         
        FileOutputStream fos = new FileOutputStream(outFile);
        PrintWriter out = new PrintWriter(fos);

        String thisLine = "";
        int i = 1;
        while ((thisLine = in.readLine()) != null) {
            if (i == lineno) {
                out.println(lineToBeInserted);
            }
            out.println(thisLine);
            i++;
        }
        out.flush();
        out.close();
        in.close();

        inFile.delete();
        outFile.renameTo(inFile);
    }
    /**
     * @param args the command line arguments
     */
    

  
    private void expandTree(JTree tree) {
        DefaultMutableTreeNode root =
            (DefaultMutableTreeNode)tree.getModel().getRoot();
        Enumeration e = root.breadthFirstEnumeration();
        while(e.hasMoreElements()) {
            DefaultMutableTreeNode node =
                (DefaultMutableTreeNode)e.nextElement();
            if(node.isLeaf()) continue;
            int row = tree.getRowForPath(new TreePath(node.getPath()));
            tree.expandRow(row);
        }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFile;
    private javax.swing.JButton copyFile;
    private javax.swing.JButton createDisk;
    private javax.swing.JButton delete;
    private javax.swing.JLabel fileContent;
    private javax.swing.JLabel fileDate;
    private javax.swing.JLabel fileDateMod;
    private javax.swing.JLabel fileName;
    private javax.swing.JLabel fileSize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mkdir;
    private javax.swing.JButton modFile;
    private javax.swing.JButton moveDir;
    private javax.swing.JTextField search;
    private javax.swing.JButton seeProperties;
    private javax.swing.JPanel textPane;
    public javax.swing.JScrollPane treePanel;
    // End of variables declaration//GEN-END:variables


}
