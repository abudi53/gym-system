/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import java.sql.Statement;




public class Clientes extends javax.swing.JFrame {

    int xMouse, yMouse;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
         visualizartabla();
         setLocationRelativeTo(null);
        
    }

        private void visualizartabla() {
        DefaultTableModel modelotabla=(DefaultTableModel) jTable1.getModel();
        modelotabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int colummnas;
  
        
        try{
            Connection con=DataBaseConnector.GetConexion();
            ps=con.prepareStatement("SELECT id,Cedula,Nombre,Sexo,edadmDirrecion,N.Telefono,Correo,inscripción FROM Clientes");
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();
           colummnas=rsmd.getColumnCount();
           
           while(rs.next()){
               Object[] fila=new Object [colummnas];
               for(int indice=0; indice<colummnas;indice++){
                   fila[indice]=rs.getObject(indice+1);
               }
               modelotabla.addRow(fila);
           }
    
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
            
        }
        
    }
    

        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_agregarPaquete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_agregarServicio = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_borrarCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_editarCliente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_agregarCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Mover = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo con letra.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        btn_agregarPaquete.setBackground(new java.awt.Color(191, 25, 25));
        btn_agregarPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarPaqueteMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar Paquete");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout btn_agregarPaqueteLayout = new javax.swing.GroupLayout(btn_agregarPaquete);
        btn_agregarPaquete.setLayout(btn_agregarPaqueteLayout);
        btn_agregarPaqueteLayout.setHorizontalGroup(
            btn_agregarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_agregarPaqueteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        btn_agregarPaqueteLayout.setVerticalGroup(
            btn_agregarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarPaqueteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btn_agregarPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 240, -1));

        btn_agregarServicio.setBackground(new java.awt.Color(191, 25, 25));
        btn_agregarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarServicioMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agregar Servicio");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout btn_agregarServicioLayout = new javax.swing.GroupLayout(btn_agregarServicio);
        btn_agregarServicio.setLayout(btn_agregarServicioLayout);
        btn_agregarServicioLayout.setHorizontalGroup(
            btn_agregarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_agregarServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        btn_agregarServicioLayout.setVerticalGroup(
            btn_agregarServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btn_agregarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, -1));

        btn_borrarCliente.setBackground(new java.awt.Color(191, 25, 25));
        btn_borrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_borrarClienteMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Borrar Cliente");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout btn_borrarClienteLayout = new javax.swing.GroupLayout(btn_borrarCliente);
        btn_borrarCliente.setLayout(btn_borrarClienteLayout);
        btn_borrarClienteLayout.setHorizontalGroup(
            btn_borrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_borrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_borrarClienteLayout.setVerticalGroup(
            btn_borrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_borrarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btn_borrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 240, -1));

        btn_editarCliente.setBackground(new java.awt.Color(191, 25, 25));
        btn_editarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarClienteMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Editar Cliente");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout btn_editarClienteLayout = new javax.swing.GroupLayout(btn_editarCliente);
        btn_editarCliente.setLayout(btn_editarClienteLayout);
        btn_editarClienteLayout.setHorizontalGroup(
            btn_editarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_editarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_editarClienteLayout.setVerticalGroup(
            btn_editarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_editarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btn_editarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 240, -1));

        btn_agregarCliente.setBackground(new java.awt.Color(191, 25, 25));
        btn_agregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarClienteMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Coolvetica", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar Cliente");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout btn_agregarClienteLayout = new javax.swing.GroupLayout(btn_agregarCliente);
        btn_agregarCliente.setLayout(btn_agregarClienteLayout);
        btn_agregarClienteLayout.setHorizontalGroup(
            btn_agregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_agregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_agregarClienteLayout.setVerticalGroup(
            btn_agregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_agregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btn_agregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 500));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Sexo", "Edad", "Direccion", "Telefono", "E-mail", "Inscripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 520, 460));

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

        jLabel2.setFont(new java.awt.Font("Coolvetica", 0, 13)); // NOI18N
        jLabel2.setText("Clientes");

        javax.swing.GroupLayout MoverLayout = new javax.swing.GroupLayout(Mover);
        Mover.setLayout(MoverLayout);
        MoverLayout.setHorizontalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoverLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 449, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MoverLayout.setVerticalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPaqueteMouseClicked
        // TODO add your handlin
    }//GEN-LAST:event_btn_agregarPaqueteMouseClicked

    private void btn_agregarServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarServicioMouseClicked
        // TODO add your handlin
    }//GEN-LAST:event_btn_agregarServicioMouseClicked

    private void btn_borrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_borrarClienteMouseClicked
        // TODO add your handlin
    }//GEN-LAST:event_btn_borrarClienteMouseClicked

    private void btn_editarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarClienteMouseClicked
        // TODO add your handlin
    }//GEN-LAST:event_btn_editarClienteMouseClicked

    private void btn_agregarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarClienteMouseClicked
        // TODO add your handlin
    }//GEN-LAST:event_btn_agregarClienteMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void MoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoverMouseDragged

    private void MoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoverMousePressed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mover;
    private javax.swing.JPanel btn_agregarCliente;
    private javax.swing.JPanel btn_agregarPaquete;
    private javax.swing.JPanel btn_agregarServicio;
    private javax.swing.JPanel btn_borrarCliente;
    private javax.swing.JPanel btn_editarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
