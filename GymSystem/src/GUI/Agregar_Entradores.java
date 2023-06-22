/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Abudi
 */
public class Agregar_Entradores extends javax.swing.JFrame {

    int xMouse, yMouse;
    /**
     * Creates new form agregar_cliente
     */
    public Agregar_Entradores() {
        initComponents();
         setLocationRelativeTo(null);
         ruta2.setVisible(false);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_borrarCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_editarCliente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        labeli = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fieldNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        fieldCedula = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Mover = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fieldCedula1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        fieldCedula2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        fieldCedula3 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        fieldCedula4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        fieldCedula5 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        ruta2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(200, 400));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo con letra.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_borrarCliente.setBackground(new java.awt.Color(191, 25, 25));
        btn_borrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_borrarClienteMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cancelar");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_borrarClienteLayout = new javax.swing.GroupLayout(btn_borrarCliente);
        btn_borrarCliente.setLayout(btn_borrarClienteLayout);
        btn_borrarClienteLayout.setHorizontalGroup(
            btn_borrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_borrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_borrarClienteLayout.setVerticalGroup(
            btn_borrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_borrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btn_borrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 170, -1));

        btn_editarCliente.setBackground(new java.awt.Color(191, 25, 25));
        btn_editarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarClienteMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar");
        jLabel7.setToolTipText("");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_editarClienteLayout = new javax.swing.GroupLayout(btn_editarCliente);
        btn_editarCliente.setLayout(btn_editarClienteLayout);
        btn_editarClienteLayout.setHorizontalGroup(
            btn_editarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_editarClienteLayout.setVerticalGroup(
            btn_editarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_editarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btn_editarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, -1));
        jPanel2.add(labeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 130));

        jButton1.setBackground(new java.awt.Color(191, 25, 25));
        jButton1.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Foto");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        fieldNombre.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        fieldNombre.setForeground(new java.awt.Color(204, 204, 204));
        fieldNombre.setText("Nombre y Apellido");
        fieldNombre.setBorder(null);
        fieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNombreFocusLost(evt);
            }
        });
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(fieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 390, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 390, 10));

        fieldCedula.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        fieldCedula.setForeground(new java.awt.Color(204, 204, 204));
        fieldCedula.setText("Cedula");
        fieldCedula.setBorder(null);
        fieldCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCedulaFocusLost(evt);
            }
        });
        fieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 180, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 180, 10));

        Mover.setBackground(new java.awt.Color(255, 255, 255));
        Mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoverMouseDragged(evt);
            }
        });
        Mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoverMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MoverLayout = new javax.swing.GroupLayout(Mover);
        Mover.setLayout(MoverLayout);
        MoverLayout.setHorizontalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoverLayout.createSequentialGroup()
                .addGap(0, 537, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MoverLayout.setVerticalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        jPanel1.add(Mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        fieldCedula1.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        fieldCedula1.setForeground(new java.awt.Color(204, 204, 204));
        fieldCedula1.setText("Telefono");
        fieldCedula1.setBorder(null);
        fieldCedula1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCedula1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCedula1FocusLost(evt);
            }
        });
        fieldCedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedula1ActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 180, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 180, 10));

        fieldCedula2.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        fieldCedula2.setForeground(new java.awt.Color(204, 204, 204));
        fieldCedula2.setText("E-mail");
        fieldCedula2.setBorder(null);
        fieldCedula2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCedula2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCedula2FocusLost(evt);
            }
        });
        fieldCedula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedula2ActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, 40));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 180, 10));

        fieldCedula3.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        fieldCedula3.setForeground(new java.awt.Color(204, 204, 204));
        fieldCedula3.setText("Especialidad");
        fieldCedula3.setBorder(null);
        fieldCedula3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCedula3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCedula3FocusLost(evt);
            }
        });
        fieldCedula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedula3ActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 190, 40));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 180, 10));

        fieldCedula4.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        fieldCedula4.setForeground(new java.awt.Color(204, 204, 204));
        fieldCedula4.setText("Horario: \"5PM-8PM\"");
        fieldCedula4.setBorder(null);
        fieldCedula4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCedula4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCedula4FocusLost(evt);
            }
        });
        fieldCedula4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedula4ActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCedula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 390, 40));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 390, 10));

        jLabel2.setFont(new java.awt.Font("Coolvetica", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Sexo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Coolvetica", 0, 13)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton1.setText("Femenino");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Coolvetica", 0, 13)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
        jRadioButton2.setText("Masculino");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jRadioButton2ComponentHidden(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        fieldCedula5.setFont(new java.awt.Font("Helvetica Neue", 0, 32)); // NOI18N
        fieldCedula5.setForeground(new java.awt.Color(204, 204, 204));
        fieldCedula5.setText("Direccion");
        fieldCedula5.setBorder(null);
        fieldCedula5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldCedula5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldCedula5FocusLost(evt);
            }
        });
        fieldCedula5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCedula5ActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCedula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 390, 40));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 390, 10));
        jPanel1.add(ruta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String sexo;
    
    
    
    private void btn_borrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_borrarClienteMouseClicked
         this.setVisible(false);
    }//GEN-LAST:event_btn_borrarClienteMouseClicked

    private void btn_editarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarClienteMouseClicked
        // TODO add your handlin
    }//GEN-LAST:event_btn_editarClienteMouseClicked

    private void MoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoverMouseDragged

    private void MoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoverMousePressed

    private void fieldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNombreFocusGained
        if (fieldNombre.getText().equals("Nombre de usuario")){

            fieldNombre.setText("");
            fieldNombre.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_fieldNombreFocusGained

    private void fieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNombreFocusLost
        if(fieldNombre.getText().isEmpty()){
            fieldNombre.setText("Nombre de usuario");
            fieldNombre.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_fieldNombreFocusLost

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedulaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedulaFocusGained

    private void fieldCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedulaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedulaFocusLost

    private void fieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedulaActionPerformed

    private void fieldCedula1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula1FocusGained

    private void fieldCedula1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula1FocusLost

    private void fieldCedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula1ActionPerformed

    private void fieldCedula2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula2FocusGained

    private void fieldCedula2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula2FocusLost

    private void fieldCedula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula2ActionPerformed

    private void fieldCedula3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula3FocusGained

    private void fieldCedula3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula3FocusLost

    private void fieldCedula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedula3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula3ActionPerformed

    private void fieldCedula4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula4FocusGained

    private void fieldCedula4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula4FocusLost

    private void fieldCedula4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedula4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void fieldCedula5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula5FocusGained

    private void fieldCedula5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldCedula5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula5FocusLost

    private void fieldCedula5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCedula5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCedula5ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      
     try{ 
        String nombre=fieldNombre.getText();
              int cedula = Integer.parseInt(fieldCedula.getText());
              long numero= Long.parseLong(fieldCedula1.getText());
              String correo=fieldCedula2.getText();
              String horario=fieldCedula4.getText();
              String direccion=fieldCedula5.getText();
             String Especialidad =fieldCedula3.getText();
              GuardarDatos();

            
        }    catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Ingresa bien los datos");
        }

    
    }//GEN-LAST:event_jLabel7MouseClicked

    private void GuardarDatos() throws ParseException, FileNotFoundException, IOException{
    
    
      
        try {
        String nombre=fieldNombre.getText();
        int cedula = Integer.parseInt(fieldCedula.getText());
        long numero= Long.parseLong(fieldCedula1.getText());
        String correo=fieldCedula2.getText();
        String direccion=fieldCedula5.getText();
       String Especialidad =fieldCedula3.getText();
           String horario=fieldCedula4.getText();
 
       FileInputStream fis = new FileInputStream(ruta2.getText());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for (int readNum; (readNum = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, readNum);
             }
            byte[] imagenEnBytes = bos.toByteArray();

          Connection con=DataBaseConnector.GetConexion();
           PreparedStatement ps=con.prepareStatement("INSERT INTO Entreadores(Cedula, Nombre, Sexo,Direccion,Telefono,Correo, Especialidad,Horario,Imagen) VALUES (?,?,?,?,?,?,?,?,?,?)");
           ps.setInt(1, cedula);
           ps.setString(2,nombre); 
           ps.setString(3, sexo);
           ps.setString(4, direccion);
           ps.setLong(5, numero);
           ps.setString(6,correo);
           ps.setString(7, Especialidad);
           ps.setString(8, horario);
            ps.setBytes(9, imagenEnBytes);

           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Registro guardado");
  
           
      } catch (SQLException e){
           JOptionPane.showMessageDialog(null,e.toString());
           
           }
        
        
    }
//    
    
    
    
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jRadioButton2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ComponentHidden

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
    jRadioButton1.setSelected(false);
    sexo="M";
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
       jRadioButton2.setSelected(false);
        sexo="F";
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ruta;
        JFileChooser JFileChooser= new JFileChooser();
        FileNameExtensionFilter filtrado= new FileNameExtensionFilter("JPG, PNG","jpg","png");
        JFileChooser.setFileFilter(filtrado);
        String hola;
        int respuesta=JFileChooser.showOpenDialog(this);

        if(respuesta==JFileChooser.APPROVE_OPTION);
        ruta=JFileChooser.getSelectedFile().getPath();

        Image mImagen=new ImageIcon(ruta).getImage();
        ImageIcon mIcono=new ImageIcon(mImagen.getScaledInstance(labeli.getWidth(), labeli.getHeight(), Image.SCALE_SMOOTH));
        labeli.setIcon(mIcono);
        FileInputStream fi=null;
        ruta2.setText(ruta);
        try{
            File file=new File(ruta);
            fi=new FileInputStream(file);

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Agregar_Entradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Entradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Entradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Entradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Entradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mover;
    private javax.swing.JPanel btn_borrarCliente;
    private javax.swing.JPanel btn_editarCliente;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField fieldCedula;
    private javax.swing.JTextField fieldCedula1;
    private javax.swing.JTextField fieldCedula2;
    private javax.swing.JTextField fieldCedula3;
    private javax.swing.JTextField fieldCedula4;
    private javax.swing.JTextField fieldCedula5;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labeli;
    private javax.swing.JTextField ruta2;
    // End of variables declaration//GEN-END:variables
}
