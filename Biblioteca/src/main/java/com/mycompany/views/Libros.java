/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.biblioteca.DAOLibrosIMPL;
import com.mycompany.biblioteca.Dashboard;
import com.mycompany.interfaces.DAOLibros;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author doria
 */
public class Libros extends javax.swing.JPanel {

    /**
     * Creates new form Bienvenida
     */
    public Libros() {
        initComponents();
        initStyles();
        loadLibros();
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
        jLabel1 = new javax.swing.JLabel();
        BUsuario = new javax.swing.JTextField();
        BBuscar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        BNuevo = new javax.swing.JButton();
        BEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(668, 375));
        setRequestFocusEnabled(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(668, 375));

        jLabel1.setText("Libros");

        BUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUsuarioActionPerformed(evt);
            }
        });

        BBuscar.setBackground(new java.awt.Color(0, 102, 102));
        BBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BBuscar.setText("Buscar");
        BBuscar.setBorderPainted(false);
        BBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        BBorrar.setBackground(new java.awt.Color(0, 102, 102));
        BBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BBorrar.setForeground(new java.awt.Color(255, 255, 255));
        BBorrar.setText("Borrar");
        BBorrar.setBorderPainted(false);
        BBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });

        BNuevo.setBackground(new java.awt.Color(0, 102, 102));
        BNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BNuevo.setText("Nuevo");
        BNuevo.setBorderPainted(false);
        BNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        BEditar.setBackground(new java.awt.Color(0, 102, 102));
        BEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEditar.setForeground(new java.awt.Color(255, 255, 255));
        BEditar.setText("Editar");
        BEditar.setBorderPainted(false);
        BEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Editorial", "Autor", "Genero", "Pais", "Paginas", "Año ed", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(BNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(571, 571, 571))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BBuscar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(BUsuario))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        try {
            DAOLibros dao = new DAOLibrosIMPL();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listar(BUsuario.getText()).forEach((u) -> model.addRow(new Object[]{u.getCod_Libro(), u.getNombreL(), u.getEditorial(), u.getAutor(), u.getGenero(), u.getPais_Autor(), u.getN_paginas(), u.getAño_edicion(), u.getPrecio()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_BBuscarActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        DAOLibros dao = new DAOLibrosIMPL();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más libros a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    dao.eliminar((int) jTable1.getValueAt(i, 0));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_BBorrarActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "El campo AÑO de edicion se debe de llenar unicamente con 4 valore numericos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        Dashboard.ShowJPanel(new SLibros());
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "El campo AÑO de edicion se debe de llenar unicamente con 4 valore numericos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);

        if (jTable1.getSelectedRow() > -1) {
            try {
                int bookId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                DAOLibros dao = new DAOLibrosIMPL();
                Dashboard.ShowJPanel(new SLibros(dao.getLibroById(bookId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el libro a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BEditarActionPerformed

    private void BUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BEditar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JTextField BUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void initStyles() {
        jLabel1.putClientProperty("FlatLaf.styleClass", "h1");
        BUsuario.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de Libro a buscar.");
    }

    private void loadLibros() {
        try {
            DAOLibros dao = new DAOLibrosIMPL();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getCod_Libro(), u.getNombreL(), u.getEditorial(), u.getAutor(), u.getGenero(), u.getPais_Autor(), u.getN_paginas(), u.getAño_edicion(), u.getPrecio()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
