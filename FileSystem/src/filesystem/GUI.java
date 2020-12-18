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
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aleta
 *
 *
 */
public class GUI extends javax.swing.JFrame {

    public String File;
    private int cant_sectores = 0;
    private int tamaño_sector = 0;
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
        filePath.setVisible(false);
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
        filePath = new javax.swing.JLabel();

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

        filePath.setText("path");

        javax.swing.GroupLayout textPaneLayout = new javax.swing.GroupLayout(textPane);
        textPane.setLayout(textPaneLayout);
        textPaneLayout.setHorizontalGroup(
            textPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(textPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filePath)
                    .addComponent(fileName)
                    .addComponent(fileContent)
                    .addComponent(fileDate)
                    .addComponent(fileDateMod)
                    .addComponent(fileSize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        textPaneLayout.setVerticalGroup(
            textPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPaneLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(fileName)
                .addGap(18, 18, 18)
                .addComponent(fileContent)
                .addGap(43, 43, 43)
                .addComponent(fileDate)
                .addGap(47, 47, 47)
                .addComponent(fileDateMod)
                .addGap(44, 44, 44)
                .addComponent(fileSize)
                .addGap(34, 34, 34)
                .addComponent(filePath)
                .addContainerGap(100, Short.MAX_VALUE))
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        String path = crearPath(jt.getSelectionPath().getPath());
        file file = new file(name, extension, contenido, date, null, contenido.length(), path);

        addTree(file, selectedNode);
    }//GEN-LAST:event_addFileActionPerformed

    private void addTree(file file, DefaultMutableTreeNode selectedNode) {
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(file);
        Boolean nombre_repetido = name_check(selectedNode, file.getName(), file.getExtension());
        if (!nombre_repetido) {
            if (add_file(file)) {
                selectedNode.add(newNode);
                DefaultTreeModel model = (DefaultTreeModel) jt.getModel();
                model.reload();
            }
        } else {
            int result = JOptionPane.showConfirmDialog(null, "Ya existe ese nombre, desea reemplazarlo");
            System.out.println(result);

            if (result == 0) {
                DefaultMutableTreeNode RepeatNode = getRepeatNode(selectedNode, file.getName(), file.getExtension());
                deleteNode(RepeatNode);
                if (add_file(file)) {
                    selectedNode.add(newNode);
                    DefaultTreeModel model = (DefaultTreeModel) jt.getModel();
                    model.reload();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "No se pudo crear el archivo");
            }

        }

    }
    private void mkdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkdirActionPerformed
        // TODO add your handling code here:
        String name = JOptionPane.showInputDialog("Digite el nombre del directorio");
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
//        Dir dir = new Dir(name);
        
        Boolean nombre_repetido = dir_check(selectedNode, name);
        if (!nombre_repetido) {       
            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(name);
            selectedNode.add(newNode);
            DefaultTreeModel model = (DefaultTreeModel) jt.getModel();
            model.reload();
        }
        else{
         JOptionPane.showMessageDialog(rootPane, "Nombre de directorio Repetido\n Intente otro nombre");   
        }

    }//GEN-LAST:event_mkdirActionPerformed

    private void modFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modFileActionPerformed
        // TODO add your handling code here:

        String contenido = JOptionPane.showInputDialog("Digite el contenido");
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode parent = (DefaultMutableTreeNode) selectedNode.getParent();
        System.out.println(parent.toString());
        file file = (file) selectedNode.getUserObject();
        String fullName = getFullName(file);

        if (selectedNode != jt.getModel().getRoot()) {

            for (Sector s : disco_virtual) {
                System.out.println(s);
                if (!s.isEmpty) {
                    String name = getFullName(s.getFile());
                    file archivo = s.getFile();
                    file temp = new file();
                    if (name.equals(fullName)) {
                        temp.setName(archivo.getName());
                        temp.setExtension(archivo.getExtension());
                        temp.setContent(contenido);
                        temp.setCreationDate(archivo.getCreationDate());
                        temp.setModicationDate();
                        temp.setSize(contenido.length());
                        temp.setPath(archivo.getPath());

                        delete();
                        addTree(temp, parent);

                        break;
                    }

                }

            }
        }


    }//GEN-LAST:event_modFileActionPerformed

    private void moveDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDirActionPerformed
        TreePath[] selectionPaths = jt.getSelectionPaths();
        file archivo = new file();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) selectionPaths[0].getLastPathComponent();
            DefaultMutableTreeNode nodeDestino = (DefaultMutableTreeNode) selectionPaths[1].getLastPathComponent();
            if (node.getUserObject() instanceof file) {
                archivo = (file) node.getUserObject();
            }          
            String path = crearPath(nodeDestino.getPath());
            archivo.setPath(path);        
            deleteNode(node);
            addTree(archivo, nodeDestino);
                

    }//GEN-LAST:event_moveDirActionPerformed


    private void copyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyFileActionPerformed
        TreePath[] selectionPaths = jt.getSelectionPaths();
        System.out.println(selectionPaths.toString());
        System.out.println(selectionPaths.length);
        file archivo = new file();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) selectionPaths[0].getLastPathComponent();
            DefaultMutableTreeNode nodeDestino = (DefaultMutableTreeNode) selectionPaths[1].getLastPathComponent();
            if (node.getUserObject() instanceof file) {
                archivo = (file) node.getUserObject();
            }          
            String path = crearPath(nodeDestino.getPath());
            archivo.setPath(path);        
            addTree(archivo, nodeDestino);
                
            
        
    }//GEN-LAST:event_copyFileActionPerformed


    private void seePropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seePropertiesActionPerformed
        // TODO add your handling code here:
        TreePath currentSelection = jt.getSelectionPath();
        DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
        file archivo = (file) currentNode.getUserObject();

        fileName.setText("Nombre: " + archivo.getName() + "." + archivo.getExtension());
        fileContent.setText("Contenido: " + archivo.getContent());
        fileDate.setText("Fecha Creacion: " + archivo.getCreationDate().toString());
        fileDateMod.setText("Fecha Modificacion: " + archivo.getModicationDate());
        fileSize.setText("Tamaño: " + archivo.getSize());
        filePath.setText("Path: " + archivo.getPath());

        fileName.setVisible(true);
        fileContent.setVisible(true);
        fileDate.setVisible(true);
        fileDateMod.setVisible(true);
        fileSize.setVisible(true);
        filePath.setVisible(true);

//        textPane.setVisible(true);
    }//GEN-LAST:event_seePropertiesActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    void doMouseClicked(MouseEvent me) {
        TreePath tp = jt.getPathForLocation(me.getX(), me.getY());
        if (tp != null) {
            //        TreePath currentSelection = jt.getSelectionPath();
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (tp.getLastPathComponent());
            file archivo = (file) currentNode.getUserObject();

            fileContent.setText(archivo.getContent());

            fileName.setVisible(false);
            fileContent.setVisible(true);
            fileDate.setVisible(false);
            fileDateMod.setVisible(false);
            fileSize.setVisible(false);
            filePath.setVisible(false);
        } else {
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

        disk = new Disk(name, Integer.parseInt(size), Integer.parseInt(cant_sector), sectors);

        tamaño_sector = Integer.parseInt(size);
        file_system(name, cant_sector, size);
        DefaultMutableTreeNode style = new DefaultMutableTreeNode(name);

        jt = new javax.swing.JTree(style);
        jt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                doMouseClicked(me);
            }
        });

        treePanel.setViewportView(jt);


    }//GEN-LAST:event_createDiskActionPerformed

    private void jt(java.awt.event.MouseEvent evt) {

        TreeSelectionModel smd = jt.getSelectionModel();
        if (smd.getSelectionCount() > 0) {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();

        }
    }

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        TreeSelectionModel smd = jt.getSelectionModel();
        System.out.println(smd);
        if (smd.getSelectionCount() > 0) {

            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
            // label.setText(selectedNode.getUserObject().toString());

        }
    }

    private void treePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treePanelMouseClicked
        // TODO add your handling code here:
        TreeSelectionModel smd = jt.getSelectionModel();
        if (smd.getSelectionCount() > 0) {

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
    
        public boolean dir_check(DefaultMutableTreeNode parentNode, String name) {
        boolean band = false;
        int lim = parentNode.getChildCount();
        if (lim != 0) {
            for (int i = 0; i < lim; i++) {
                DefaultMutableTreeNode temp = (DefaultMutableTreeNode) parentNode.getChildAt(i);
                 System.out.println(temp.toString());
                if (temp.toString().equals(name)) {
                    band = true;
                }
            }
        }
        return band;
    }

    public DefaultMutableTreeNode getRepeatNode(DefaultMutableTreeNode parentNode, String name, String ext) {
        boolean band = false;
        int lim = parentNode.getChildCount();
        if (lim != 0) {
            for (int i = 0; i < lim; i++) {
                DefaultMutableTreeNode temp = (DefaultMutableTreeNode) parentNode.getChildAt(i);
                Object user = temp.getUserObject();
                file file_aux = (file) user;
                if (file_aux.getName().equals(name) && file_aux.getExtension().equals(ext)) {
                    band = true;
                    return temp;
                }
            }
        }
        return parentNode;
    }

    public void modifyCurrentFileNode(String new_file_content) {
        TreePath currentSelection = jt.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
            file archivo = (file) currentNode.getUserObject();
            archivo.setContent(new_file_content);

        }
    }

    public void inicializa_disco() {
        disco_virtual = new ArrayList<>();
        for (int i = 0; i < cant_sectores; i++) {
            Sector sector_n = new Sector("", i, "", true, "", null);
            disco_virtual.add(sector_n);
        }
        System.out.println(disco_virtual.toString());

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
                JOptionPane.showMessageDialog(rootPane, "Error al crear el disco");
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

    public int sectores_disponibles() {
        int sectores = 0;
        for (Sector s : disco_virtual) {
            boolean estado = s.getEmpty();
            if (estado) {
                sectores++;
            }
        }
        return sectores;
    }

    public boolean add_file(file new_file) {
        int size_contenido = new_file.getContent().length();
        double sec_necesitados = new_file.sectoresNecesarios(size_contenido, tamaño_sector);
        double necesitados = sec_necesitados;

        if (necesitados <= disk.sectoresDisponibles) {
            for (int i = 0; i < sec_necesitados; i++) {
                for (Sector s : disco_virtual) {
                    if (s.isEmpty) {
                        s.setNombre(new_file.getName());
                        s.setContenido(new_file.getContent());
                        s.setIsEmpty(false);
                        s.setRuta(new_file.getPath());
                        s.setFile(new_file);
                        disk.setSectoresDisponibles(disk.getSectoresDisponibles() - 1);
                        necesitados--;
                        escribir();
                        break;
                    }
                }
            }
        } else {
            System.out.println("no hay espacio en el disco");
            JOptionPane.showMessageDialog(rootPane, "No hay sectores suficientees");
            return false;
        }
        return true;
    }

    public void escribir() {

        File file = new File(disk.getName() + ".txt");
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile f;
        try {
            f = new RandomAccessFile(new File(disk.getName() + ".txt"), "rw");
            for (Sector s : disco_virtual) {
                if (s.getEmpty()) {
                    f.write("sector vacio".getBytes());
                    f.write("\n".getBytes());
                } else {
                    f.write(s.toString().getBytes());
                    f.write("\n".getBytes());
                }
            }
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void expandTree(JTree tree) {
        DefaultMutableTreeNode root
                = (DefaultMutableTreeNode) tree.getModel().getRoot();
        Enumeration e = root.breadthFirstEnumeration();
        while (e.hasMoreElements()) {
            DefaultMutableTreeNode node
                    = (DefaultMutableTreeNode) e.nextElement();
            if (node.isLeaf()) {
                continue;
            }
            int row = tree.getRowForPath(new TreePath(node.getPath()));
            tree.expandRow(row);
        }
    }

   private String crearPath(Object[] path) {
        String p = "";
        for (int i = 0; i < path.length; i++) {
            p += path[i].toString();
            p += "/";
        }
        return p;
    }

    private String getFullName(file file) {
        return file.getPath() + file.getName() + "." + file.getExtension();
    }

    private void delete() {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
        file file = (file) selectedNode.getUserObject();
        String fullName = getFullName(file);

        if (selectedNode != jt.getModel().getRoot()) {
            for (Sector s : disco_virtual) {
                if (!s.isEmpty) {
                    String name = getFullName(s.getFile());
                    System.out.println(name);
                    System.out.println(fullName);
                    if (name.equals(fullName)) {
                        //borrar archivo  
                        System.out.println("etnora comaodamdoracion");
                        s.resetSector(s);
                        DefaultTreeModel model = (DefaultTreeModel) jt.getModel();
                        model.removeNodeFromParent(selectedNode);
                        model.nodeChanged(selectedNode);
                        escribir();
                    }
                }
            }
        }

    }

    private void deleteNode(DefaultMutableTreeNode selectedNode) {

        file file = (file) selectedNode.getUserObject();
        String fullName = getFullName(file);

        if (selectedNode != jt.getModel().getRoot()) {
            for (Sector s : disco_virtual) {
                if (!s.isEmpty) {
                    String name = getFullName(s.getFile());
                    System.out.println(name);
                    System.out.println(fullName);
                    if (name.equals(fullName)) {
                        //borrar archivo  
                        System.out.println("etnora comaodamdoracion");
                        s.resetSector(s);
                        DefaultTreeModel model = (DefaultTreeModel) jt.getModel();
                        model.removeNodeFromParent(selectedNode);
                        model.nodeChanged(selectedNode);
                        escribir();
                    }
                }
            }
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
    private javax.swing.JLabel filePath;
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
