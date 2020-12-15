/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

import javax.swing.tree.DefaultMutableTreeNode; 
import filesystem.Disk;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;

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
    JFrame f;  
    JTree jt; 
    Disk disk;
    
   



    public String getFile() {
        return File;
    }

    public void setFile(String File) {
        this.File = File;
    }
    public GUI() {
        initComponents();
//        JTree jt= new JTree();
        
        Disk disk = new Disk();
        
        

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
        textPane = new javax.swing.JLabel();

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
                        .addComponent(seeProperties)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(createDisk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(treePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPane, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        File file = new File( name,extension, contenido, date, null);

        int sectoresNecesarios = (int) file.sectoresNecesarios(Integer.parseInt(tam), disk.sectorSize());

        //obtener directorio actual
        //agregarlo a la lista 
        //agregarlo a los sectores libres
        //saber cuantos sectores quedan libres
        //obtener los primeros sectores libres

        //Sector s = new Sector();
        //agregarlo al disco

        
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(file);
        
        //int childsNum= jt.getModel().getChildCount(selectedNode);
//        Object child = jt.getModel().getChild(selectedNode, 1);

        Boolean nombre_repetido = name_check(selectedNode,name,extension);
        if(!nombre_repetido){
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

        File file = new File( name,null, null, null, null);
        
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(name);
        

        Boolean nombre_repetido = name_check(selectedNode,name,"");
        if(!nombre_repetido){
            selectedNode.add(newNode); 
            DefaultTreeModel model = (DefaultTreeModel)jt.getModel();

            model.reload();
        }else{
            JOptionPane.showMessageDialog(rootPane,"El nombre del directorio ya existe");
        }

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
        File archivo = (File) currentNode.getUserObject();
        System.out.println("ff");
        System.out.println(archivo.getContent());
        textPane.setText(archivo.getContent());
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

    private void createDiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDiskActionPerformed
        // TODO add your handling code here:

        String name = JOptionPane.showInputDialog("Digite el nombre del disco");
        String size = JOptionPane.showInputDialog("Digite el tamaño del disco");
        String cant_sector = JOptionPane.showInputDialog("Digite la cantidad de sectores");
        ArrayList sectors = new ArrayList<Sector>();

        for(int i=0;i<Integer.parseInt(cant_sector);i++){
                Sector sector_n = new Sector(i,true);
                sectors.add(sector_n);
        }
    
    
        disk = new Disk(name,Integer.parseInt(size), Integer.parseInt(cant_sector) ,sectors);
    //    System.out.println(disk.toString());

        DefaultMutableTreeNode style=new DefaultMutableTreeNode(name);  
        jt = new javax.swing.JTree(style);
        treePanel.setViewportView(jt);       

    }//GEN-LAST:event_createDiskActionPerformed

    private void jt(java.awt.event.MouseEvent evt){
        
        TreeSelectionModel smd = jt.getSelectionModel();
        if(smd.getSelectionCount() > 0){
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
            //label.setText(selectedNode.getUserObject().toString());
        }
    }
    
    
    private void treePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treePanelMouseClicked
        // TODO add your handling code here:
        TreeSelectionModel smd = jt.getSelectionModel();
        if(smd.getSelectionCount() > 0){
            
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
           // label.setText(selectedNode.getUserObject().toString());
            
        }
    }//GEN-LAST:event_treePanelMouseClicked

    /**
     * @param args the command line arguments
     */
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

    private void addFile(File file){
        
    
    }

    public boolean name_check(DefaultMutableTreeNode parentNode,String name,String ext){
        boolean band = false;
        int lim = parentNode.getChildCount();
        if(lim != 0){
            for(int i=0;i<lim;i++){
            DefaultMutableTreeNode temp = (DefaultMutableTreeNode) parentNode.getChildAt(i);
            Object user = temp.getUserObject(); 
            File file_aux = (File) user;
                if(file_aux.getName().equals(name)&&file_aux.getExtension().equals(ext)){
                    band = true;
                }
            }
        }
        return band;
    }
    
    public void modifyCurrentFileNode(String new_file_content) {
        TreePath currentSelection = jt.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode =
                    (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
            File archivo = (File) currentNode.getUserObject();
            archivo.setContent(new_file_content);
            
        }
        

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFile;
    private javax.swing.JButton copyFile;
    private javax.swing.JButton createDisk;
    private javax.swing.JButton delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mkdir;
    private javax.swing.JButton modFile;
    private javax.swing.JButton moveDir;
    private javax.swing.JTextField search;
    private javax.swing.JButton seeProperties;
    private javax.swing.JLabel textPane;
    public javax.swing.JScrollPane treePanel;
    // End of variables declaration//GEN-END:variables


}
