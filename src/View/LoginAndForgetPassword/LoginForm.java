/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.LoginAndForgetPassword;

/**
 *
 * @author Admin
 */
import Controller.TaiKhoanCTR;
import Processor.Encrypt;
import Processor.Regex;
import View.Admin.AdminForm;
import View.Dialog.ErrorDialog;
import View.Staff.StaffForm;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import View.Dialog.SuccessDialog;

public class LoginForm extends javax.swing.JFrame {

    String MaNV;
    Pattern pattern = Pattern.compile(Regex.TenDangNhap_PasswordPattern);
    TaiKhoanCTR tkc = new TaiKhoanCTR();
    int MouseX, MouseY;

    public LoginForm() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
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

        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabelBtnLogin = new javax.swing.JLabel();
        jLabelBtnForgetPass = new javax.swing.JLabel();
        jLabelBtnExit = new javax.swing.JLabel();
        JlabelBtnShowPass = new javax.swing.JLabel();
        jLabelMainFrame = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        txtUser.setBorder(null);
        txtUser.setOpaque(false);
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 327, 180, 20));
        txtUser.setBackground(new Color(0,0,0,0));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setOpaque(false);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 150, 20));
        txtPassword.setBackground(new Color(0,0,0,0));

        jLabelBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnLoginMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 110, 40));

        jLabelBtnForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnForgetPassMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBtnForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 170, 20));

        jLabelBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnExitMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 70, 20));

        JlabelBtnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JlabelBtnShowPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JlabelBtnShowPassMouseReleased(evt);
            }
        });
        getContentPane().add(JlabelBtnShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 20, 20));

        jLabelMainFrame.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\DoAnQuanLyGYM\\src\\View\\Image\\FormLogin1.jpg")); // NOI18N
        jLabelMainFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelMainFrameMouseDragged(evt);
            }
        });
        jLabelMainFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMainFrameMousePressed(evt);
            }
        });
        getContentPane().add(jLabelMainFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnLoginMouseClicked
        // TODO add your handling code here:
        Encrypt e = new Encrypt();
        String TenDN = txtUser.getText();
        String PassWord = txtPassword.getText();
        if (TenDN.equals("") || PassWord.equals("")) {
            new ErrorDialog("Empty user or password are not allowed!").setVisible(true);
        } else if (pattern.matcher(txtUser.getText()).find() && pattern.matcher(txtPassword.getText()).find()) {
            if (tkc.Login(TenDN, e.encryptPassword(PassWord)) == 1) {
                MaNV = TenDN;
                SuccessDialog s = new SuccessDialog("Login sucess!");
                s.setVisible(true);
                this.setVisible(false);
                new AdminForm(TenDN).setVisible(true);
                s.setVisible(false);
            } else if (tkc.Login(TenDN, e.encryptPassword(PassWord)) == 2) {
                new SuccessDialog("Login sucess!").setVisible(true);
                this.setVisible(false);
                StaffForm fnv = new StaffForm(TenDN);
                fnv.setVisible(true);
            } else {
                new ErrorDialog("Invaild username or password").setVisible(true);
            }
        } else {

            new ErrorDialog("String doesn't match regex").setVisible(true);
        }
    }//GEN-LAST:event_jLabelBtnLoginMouseClicked

    private void jLabelBtnForgetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnForgetPassMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        PasswordRevocerForm f = new PasswordRevocerForm();
        f.setVisible(true);
    }//GEN-LAST:event_jLabelBtnForgetPassMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        Encrypt e = new Encrypt();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String TenDN = txtUser.getText();
            String PassWord = txtPassword.getText();
            if (TenDN.equals("") || PassWord.equals("")) {
                new ErrorDialog("Empty user or password are not allowed!").setVisible(true);
            } else if (pattern.matcher(txtUser.getText()).find() && pattern.matcher(txtPassword.getText()).find()) {
                if (tkc.Login(TenDN, e.encryptPassword(PassWord)) == 1) {
                    MaNV = TenDN;
                    SuccessDialog s = new SuccessDialog("Login sucess");
                    s.setVisible(true);
                    this.setVisible(false);
                    // FormAdminNew adf = new FormAdminNew(TenDN);
                    //adf.setVisible(true);
                    new AdminForm(TenDN).setVisible(true);
                    //s.setVisible(false);
                } else if (tkc.Login(TenDN, e.encryptPassword(PassWord)) == 2) {
                    new SuccessDialog("Login sucess!").setVisible(true);
                    this.setVisible(false);
                    StaffForm fnv = new StaffForm(TenDN);
                    fnv.setVisible(true);
                } else {
                    //System.out.println(tkc.Login(TenDN, PassWord) == 2);
                    // System.out.println("");
                    new ErrorDialog("Invaild username or password").setVisible(true);
                }
            } else {
                new ErrorDialog("String doesn't match regex"
                        + "!").setVisible(true);
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jLabelBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnExitMouseClicked
        // TODO add your handling code here:
        //this.setEnabled(false);
        System.exit(0);
    }//GEN-LAST:event_jLabelBtnExitMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1; i += 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void JlabelBtnShowPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlabelBtnShowPassMouseReleased
        // TODO add your handling code here:
        txtPassword.setEchoChar('\u25cf');
    }//GEN-LAST:event_JlabelBtnShowPassMouseReleased

    private void JlabelBtnShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlabelBtnShowPassMousePressed
        // TODO add your handling code here:
        txtPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_JlabelBtnShowPassMousePressed

    private void jLabelMainFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMainFrameMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - MouseX, y - MouseY);
    }//GEN-LAST:event_jLabelMainFrameMouseDragged

    private void jLabelMainFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMainFrameMousePressed
        MouseX = evt.getXOnScreen();
        MouseY = evt.getYOnScreen();
    }//GEN-LAST:event_jLabelMainFrameMousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelBtnShowPass;
    private javax.swing.JLabel jLabelBtnExit;
    private javax.swing.JLabel jLabelBtnForgetPass;
    private javax.swing.JLabel jLabelBtnLogin;
    private javax.swing.JLabel jLabelMainFrame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
