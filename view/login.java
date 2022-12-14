/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import controller.*;
import adminView.*;

/**
 *
 * @author Deran
 */
public class login extends javax.swing.JFrame {

    private static cuenta register = new cuenta();
    private static validateLogin vLogin = new validateLogin();
    private static lobby Lobby = new lobby();
    private static lobbyAdmin lobbyAdmin = new lobbyAdmin();
    private static String usr = "";

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        loginTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        enterButton = new javax.swing.JPanel();
        enterText = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createAccount1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 153, 51));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/User.png"))); // NOI18N

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");

        loginTitle.setBackground(new java.awt.Color(0, 0, 0));
        loginTitle.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(0, 0, 0));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("INICIAR SESI??N");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contrase??a");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Password2.png"))); // NOI18N

        enterButton.setBackground(new java.awt.Color(255, 102, 51));
        enterButton.setToolTipText("");
        enterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        enterText.setBackground(new java.awt.Color(255, 102, 51));
        enterText.setFont(new java.awt.Font("Roboto Bk", 0, 12)); // NOI18N
        enterText.setForeground(new java.awt.Color(255, 255, 255));
        enterText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterText.setText("ENTRAR");
        enterText.setToolTipText("");
        enterText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout enterButtonLayout = new javax.swing.GroupLayout(enterButton);
        enterButton.setLayout(enterButtonLayout);
        enterButtonLayout.setHorizontalGroup(
            enterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterButtonLayout.createSequentialGroup()
                .addComponent(enterText, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        enterButtonLayout.setVerticalGroup(
            enterButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enterText, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/large_topicbank (1).png"))); // NOI18N

        createAccount1.setBackground(new java.awt.Color(51, 153, 255));
        createAccount1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        createAccount1.setForeground(new java.awt.Color(51, 153, 255));
        createAccount1.setText("Crear cuenta");
        createAccount1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccount1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createAccount1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createAccount1MouseReleased(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(createAccount1)
                .addGap(115, 115, 115))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createAccount1)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getUserName() {
        return usr;
    }

    private void enterTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterTextMouseClicked
        String usuario = jTextField2.getText().toString();
        String password = jPasswordField1.getText().toString();
        
        vLogin.validarUsuario(usuario, password);
        
        if(vLogin.getComprobacion()) {
            usr = usuario;
            vLogin.setComprobacion(false);
            this.setVisible(false);
            Lobby.setVisible(true);
        } else if(usuario.equals("Ander") && password.equals("admin123")) {
            this.setVisible(false);
            lobbyAdmin.setVisible(true);
        }
         else {
            javax.swing.JOptionPane.showMessageDialog(null, "Usuario o contrase??a incorrectos");
            jTextField2.setText("");
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_enterTextMouseClicked

    private void enterTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterTextMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_enterTextMouseEntered

    private void enterTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterTextMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_enterTextMouseExited

    private void createAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccount1MouseClicked
        this.setVisible(false);
        register.setVisible(true);
    }//GEN-LAST:event_createAccount1MouseClicked

    private void createAccount1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccount1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAccount1MousePressed

    private void createAccount1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccount1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_createAccount1MouseReleased

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAccount1;
    private javax.swing.JPanel enterButton;
    private javax.swing.JLabel enterText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
