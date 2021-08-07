/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Controller.NhanVienCTR;
import Controller.TaiKhoanCTR;
import Object.NhanVien;
import Object.TaiKhoan;
import Processor.Encrypt;
import Processor.Regex;
import View.Dialog.ErrorDialog;
import View.Dialog.SuccessDialog;
import java.util.regex.Pattern;
//import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class jPanelChangeDetail extends javax.swing.JPanel {

    /**
     * Creates new form ChangeDetails
     */
    String user;
    TaiKhoanCTR tkc = new TaiKhoanCTR();
    NhanVienCTR nvc = new NhanVienCTR();

    public jPanelChangeDetail(String userSelect) {
        initComponents();
        user = userSelect;
        txtTen.setEnabled(false);
        txtDiaChi.setEnabled(false);
        txtSDT.setEnabled(false);
        txtTenDN.setEnabled(false);
        txtPassword.setEnabled(false);
        txtNewPassword.setEnabled(false);
        txtEmail.setEnabled(false);
        InitDefaultData();

    }

    private void InitDefaultData() {
        //MaNV[0],TenNV[1], DiaChi[2], SDT[3], GioiTinh[4], Email[5], TenDangNhap[6], LoaiTK[7], [8]PassWord
        Object[] x = new Object[9];
        x = tkc.getDataJoinNVAndTaiKhoan(user);
        txtTen.setText(x[1] + "");
        txtDiaChi.setText(x[2] + "");
        txtSDT.setText(x[3] + "");
        txtTenDN.setText(x[6] + "");
        //txtPassword.setText(x.getPassWord());
        txtEmail.setText(x[5] + "");
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
        editProfileBttn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        inputPanel = new javax.swing.JPanel();
        txtTenDN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordLab = new javax.swing.JLabel();
        locationLab = new javax.swing.JLabel();
        fullNameLab = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        phoneLab = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordLab3 = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JLabel();
        btnSuaNV = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editProfileBttn.setBackground(new java.awt.Color(255, 255, 255));
        editProfileBttn.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        editProfileBttn.setText("Change Detail");
        editProfileBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBttnActionPerformed(evt);
            }
        });
        mainPanel.add(editProfileBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        inputPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtTenDN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtTenDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("User name");

        passwordLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        passwordLab.setText("Password");

        locationLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        locationLab.setText("Address");

        fullNameLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        fullNameLab.setText("Name");

        txtSDT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtDiaChi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        txtTen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        phoneLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        phoneLab.setText("Phone");

        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Update");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Clear");

        passwordLab3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        passwordLab3.setText("New password");

        txtNewPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_broom_48px.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        btnSuaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_edit_file_48px.png"))); // NOI18N
        btnSuaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaNVMouseClicked(evt);
            }
        });

        Email.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Email.setText("Email");

        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordLab3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(locationLab)
                                    .addComponent(fullNameLab)
                                    .addComponent(phoneLab)
                                    .addComponent(passwordLab, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 45, Short.MAX_VALUE))
                            .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenDN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail)))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)))
                        .addGap(34, 34, 34)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLab)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLab)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(btnSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Detail Info", inputPanel);

        mainPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDNActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed


    private void editProfileBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBttnActionPerformed
        txtPassword.setEnabled(true);
        txtNewPassword.setEnabled(true);
        txtDiaChi.setEnabled(true);
        txtSDT.setEnabled(true);
        txtEmail.setEnabled(true);

    }//GEN-LAST:event_editProfileBttnActionPerformed

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        txtPassword.setText("");
        txtNewPassword.setText("");
        //txtNewPassword.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnSuaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaNVMouseClicked

        if (txtTen.getText().equals("") || txtDiaChi.getText().equals("") || txtSDT.getText().equals("") || txtTenDN.getText().equals("") || txtPassword.getText().equals("") || txtNewPassword.getText().equals("")) {
            new ErrorDialog("Please fill all the field!").setVisible(true);
        } else {
            Encrypt e = new Encrypt();
            Pattern patternPW = Pattern.compile(Regex.TenDangNhap_PasswordPattern);
            Pattern patternDiaChi = Pattern.compile(Regex.DiaChiPattern);
            Pattern patternSDT = Pattern.compile(Regex.SdtPattern);
            Pattern patternEmail = Pattern.compile(Regex.EmailPattern);
            String oldPass, newPass;
            if (!patternPW.matcher(txtPassword.getText()).find() || !patternPW.matcher(txtNewPassword.getText()).find()
                    || !patternDiaChi.matcher(txtDiaChi.getText()).find() || !patternEmail.matcher(txtEmail.getText()).find()
                    || !patternSDT.matcher(txtSDT.getText()).find()) {
                new ErrorDialog("String does not match regex!").setVisible(true);
            } else {
                oldPass = e.encryptPassword(txtPassword.getText());
                newPass = e.encryptPassword(txtNewPassword.getText());
                if (tkc.checkPass(user, oldPass)) {
                    TaiKhoan tk = new TaiKhoan(user, newPass, tkc.getData(user).getLoaiTK(), 0);
                    tkc.UpdateData(tk);
                    NhanVien nv = new NhanVien(0, txtTen.getText(), txtDiaChi.getText(), txtSDT.getText(), null, txtEmail.getText());
                    nvc.UpdateData(nv);
                    new SuccessDialog("Change detail successfully!").setVisible(true);
                    InitDefaultData();
                } else {
                    new ErrorDialog("Wrong password!").setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_btnSuaNVMouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnSuaNV;
    private javax.swing.JButton editProfileBttn;
    private javax.swing.JLabel fullNameLab;
    public javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel locationLab;
    public javax.swing.JPanel mainPanel;
    private javax.swing.JLabel passwordLab;
    private javax.swing.JLabel passwordLab3;
    private javax.swing.JLabel phoneLab;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables
}