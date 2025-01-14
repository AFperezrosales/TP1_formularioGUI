/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp1_formulariogui;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Arian
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        botonR = new javax.swing.JButton();
        jtCorreoElectronico = new javax.swing.JTextField();
        jtContrasena = new javax.swing.JPasswordField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        lbULP = new java.awt.Label();
        jbVerContrasena = new javax.swing.JButton();
        jbDejarDeVer = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asistencias de alumnos ULP");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(500, 500, 500, 500));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        setForeground(java.awt.Color.pink);

        botonR.setBackground(new java.awt.Color(102, 153, 255));
        botonR.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        botonR.setForeground(new java.awt.Color(0, 0, 0));
        botonR.setText("Ingresar");
        botonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRActionPerformed(evt);
            }
        });

        jtCorreoElectronico.setBackground(new java.awt.Color(102, 153, 255));
        jtCorreoElectronico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtCorreoElectronico.setToolTipText("");
        jtCorreoElectronico.setActionCommand("<Not Set>");
        jtCorreoElectronico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCorreoElectronicoFocusGained(evt);
            }
        });
        jtCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCorreoElectronicoActionPerformed(evt);
            }
        });

        jtContrasena.setBackground(new java.awt.Color(102, 153, 255));
        jtContrasena.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtContrasenaActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setName(""); // NOI18N
        label1.setText("Correo electronico");

        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setName("textoContra"); // NOI18N
        label2.setText("Contraseña");

        lbULP.setBackground(new java.awt.Color(51, 153, 255));
        lbULP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbULP.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        lbULP.setForeground(new java.awt.Color(255, 255, 255));
        lbULP.setText("                                   Alumnos ULP Virtual");

        jbVerContrasena.setText("ver contraseña");
        jbVerContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerContrasenaActionPerformed(evt);
            }
        });

        jbDejarDeVer.setText("dejar de ver contraseña");
        jbDejarDeVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDejarDeVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbULP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbVerContrasena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbDejarDeVer))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVerContrasena)
                    .addComponent(jbDejarDeVer))
                .addGap(18, 18, 18)
                .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(lbULP, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRActionPerformed
        if (jtCorreoElectronico.getText().equals("alumno@ulp.edu.ar") && jtContrasena.getText().equals("12345678")) {
            JOptionPane.showMessageDialog(this, "Bienvenido");
        }else{
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña\n" +
            "incorrectos");
        }
    }//GEN-LAST:event_botonRActionPerformed

    private void jtCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCorreoElectronicoActionPerformed
        
    }//GEN-LAST:event_jtCorreoElectronicoActionPerformed

    private void jbVerContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerContrasenaActionPerformed
        jtContrasena.setEchoChar((char)0);
    }//GEN-LAST:event_jbVerContrasenaActionPerformed

    private void jbDejarDeVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDejarDeVerActionPerformed
        jtContrasena.setEchoChar('*');
    }//GEN-LAST:event_jbDejarDeVerActionPerformed

    private void jtCorreoElectronicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCorreoElectronicoFocusGained
       
    }//GEN-LAST:event_jtCorreoElectronicoFocusGained

    private void jtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtContrasenaActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonR;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JButton jbDejarDeVer;
    private javax.swing.JButton jbVerContrasena;
    private javax.swing.JPasswordField jtContrasena;
    private javax.swing.JTextField jtCorreoElectronico;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label lbULP;
    // End of variables declaration//GEN-END:variables
}
