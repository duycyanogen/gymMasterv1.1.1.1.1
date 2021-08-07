/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Staff;

import Controller.GoiTapHoanChinhCTR;
import Controller.ChiTietHoaDonCTR;
import Controller.GoiTapCTR;
import Controller.HoaDonCTR;
import Controller.HoiVienCTR;
import Controller.LoaiGoiTapCTR;
import Controller.TaiKhoanCTR;
import Controller.VoucherKMCTR;
import Object.ChiTietHoaDon;
import Object.ChiTietHoaDonView;
import Object.HoaDon;
import Object.VoucherKM;
import Processor.NumberProcesser;
import java.util.ArrayList;
import Processor.DateProcessor;
import View.Dialog.ErrorDialog;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class PackageRegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form PackageRegistrationForm
     */
    DefaultTableModel DTable;
    ArrayList<ChiTietHoaDonView> listCTHDV = new ArrayList<>();
    TaiKhoanCTR tkc = new TaiKhoanCTR();
    HoiVienCTR hvc = new HoiVienCTR();
    GoiTapHoanChinhCTR ctgtc = new GoiTapHoanChinhCTR();
    GoiTapCTR gtc = new GoiTapCTR();
    LoaiGoiTapCTR lgtc = new LoaiGoiTapCTR();
    HoaDonCTR hdc = new HoaDonCTR();
    ChiTietHoaDonCTR cthdc = new ChiTietHoaDonCTR();
    VoucherKMCTR vkmc = new VoucherKMCTR();
    DateProcessor dp = new DateProcessor();
    NumberProcesser check = new NumberProcesser();
    int MaGoiTap = 10000;
    int MaLoaiGoiTap = 10000;
    Float ThanhTien = 0f;
    String startDate;
    String currentDate = dp.getCurrentDate();
    String endDate;
    Float TC = 0f;
    private int MaHV;
    private String TenNV;

    public PackageRegistrationForm() {

        initComponents();
        InitDefaultData();

        //
    }

    public PackageRegistrationForm(String TenNV, int MaHV) {
        this.MaHV = MaHV;
        this.TenNV = TenNV;
        initComponents();
        this.setLocationRelativeTo(null);
        InitDefaultData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        btnApDung = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHoaDon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        GoiTapComboBox = new javax.swing.JComboBox<>();
        LoaiGoiTapComboBox = new javax.swing.JComboBox<>();
        btnGetToDay = new javax.swing.JButton();
        txtYear = new javax.swing.JTextField();
        sMonthComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtVoucher = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        btnThemVaoHoaDon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sDateComboBox = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();
        txtSave = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        txtTongCong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApDung.setBackground(new java.awt.Color(255, 255, 255));
        btnApDung.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnApDung.setText("Apply");
        btnApDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApDungActionPerformed(evt);
            }
        });
        BackGround.add(btnApDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        btnGo.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnGo.setText("Remove");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        BackGround.add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        TableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Package name", "Package type", "Unit price", "Start date", "End date", "Voucher", "Discount (%)", "Discount (direct)", "Bonus day(s)", "Total price"
            }
        ));
        TableHoaDon.setPreferredSize(new java.awt.Dimension(825, 385));
        TableHoaDon.setShowHorizontalLines(false);
        TableHoaDon.setShowVerticalLines(false);
        jScrollPane1.setViewportView(TableHoaDon);

        BackGround.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 880, 413));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Package:");
        BackGround.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        GoiTapComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        GoiTapComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoiTapComboBoxActionPerformed(evt);
            }
        });
        BackGround.add(GoiTapComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, -1));

        LoaiGoiTapComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoaiGoiTapComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoaiGoiTapComboBoxActionPerformed(evt);
            }
        });
        BackGround.add(LoaiGoiTapComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 110, -1));

        btnGetToDay.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnGetToDay.setText("Today?");
        btnGetToDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetToDayActionPerformed(evt);
            }
        });
        BackGround.add(btnGetToDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        txtYear.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtYear.setText("2000");
        BackGround.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 110, -1));

        sMonthComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        sMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        sMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMonthComboBoxActionPerformed(evt);
            }
        });
        BackGround.add(sMonthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Start date:");
        BackGround.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("End date:");
        BackGround.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtEndDate.setEditable(false);
        txtEndDate.setBackground(new java.awt.Color(255, 255, 255));
        txtEndDate.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtEndDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BackGround.add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 230, -1));

        txtDonGia.setEditable(false);
        txtDonGia.setBackground(new java.awt.Color(255, 255, 255));
        txtDonGia.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtDonGia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BackGround.add(txtDonGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 230, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Price:");
        BackGround.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Voucher:");
        BackGround.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtVoucher.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtVoucher.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BackGround.add(txtVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 230, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Final price:");
        BackGround.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtThanhTien.setEditable(false);
        txtThanhTien.setBackground(new java.awt.Color(255, 255, 255));
        txtThanhTien.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtThanhTien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThanhTienActionPerformed(evt);
            }
        });
        BackGround.add(txtThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 230, -1));

        btnThemVaoHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemVaoHoaDon.setText("Add");
        btnThemVaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoHoaDonActionPerformed(evt);
            }
        });
        BackGround.add(btnThemVaoHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 162, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setPreferredSize(new java.awt.Dimension(15, 15));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1405, 5, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.setPreferredSize(new java.awt.Dimension(15, 15));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 5, -1, -1));

        BackGround.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 30));

        sDateComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        sDateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        sDateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDateComboBoxActionPerformed(evt);
            }
        });
        BackGround.add(sDateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        btnReset.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        BackGround.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 70, -1));

        txtSave.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtSave.setText("Bill preview");
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });
        BackGround.add(txtSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 581, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel11.setText("Total Price:");
        BackGround.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 489, -1, -1));

        btnXoa.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnXoa.setText("Remove");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        BackGround.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, -1, -1));

        txtTongCong.setEditable(false);
        txtTongCong.setBackground(new java.awt.Color(255, 255, 255));
        txtTongCong.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtTongCong.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongCong.setText("0");
        txtTongCong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        BackGround.add(txtTongCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1107, 486, 78, -1));

        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoiTapComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoiTapComboBoxActionPerformed

        MaGoiTap = gtc.getMaGoiTap(GoiTapComboBox.getSelectedItem() + "");
        txtDonGia.setText(np.FloatToVND(ctgtc.findPrice(MaGoiTap, MaLoaiGoiTap)));

    }//GEN-LAST:event_GoiTapComboBoxActionPerformed

    private void btnThemVaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoHoaDonActionPerformed
        try {
            Integer.parseInt(txtYear.getText() + "");
            if (dp.CompareDate(startDate, currentDate) < 0)
            {
                new ErrorDialog("Invalid start date!").setVisible(true);
            } else {
                if (!txtVoucher.getText().isEmpty()) {

                    VoucherKM x = new VoucherKM();
                    x = vkmc.getData(txtVoucher.getText(), gtc.getMaGoiTap(GoiTapComboBox.getSelectedItem() + ""), lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + ""));
                    if (x != null) {
                        if (dp.CompareDate(dp.ConvertDate(x.getNgayKetThuc()), currentDate) == 1) {
                            txtThanhTien.setText(np.FloatToVND(np.VNDToFloat(txtDonGia.getText()) * (1 - x.getGiamGia1() / 100f) - x.getGiamGia2()));       
                            endDate = dp.UpDate(Integer.parseInt(endDate.split("/")[0]), Integer.parseInt(endDate.split("/")[1]), Integer.parseInt(endDate.split("/")[2]), x.getThemNgay());
                            txtEndDate.setText(endDate);
                            DTable = (DefaultTableModel) TableHoaDon.getModel();      
                            if (GoiTapComboBox.getSelectedItem() == null) 
                            {
                                new ErrorDialog("There is no more package!").setVisible(true);
                            } else {
                                ChiTietHoaDonView cthdv = new ChiTietHoaDonView(MaHV + "",
                                        GoiTapComboBox.getSelectedItem() + "", LoaiGoiTapComboBox.getSelectedItem() + "",
                                        txtDonGia.getText(), startDate, endDate, txtVoucher.getText(),
                                        vkmc.getData(txtVoucher.getText(), MaGoiTap, MaLoaiGoiTap).getGiamGia1() + "",
                                        vkmc.getData(txtVoucher.getText(), MaGoiTap, MaLoaiGoiTap).getGiamGia2() + "",
                                        vkmc.getData(txtVoucher.getText(), MaGoiTap, MaLoaiGoiTap).getThemNgay() + "", txtThanhTien.getText());
                                listCTHDV.add(cthdv);
                                TC += np.VNDToFloat(txtThanhTien.getText());
                                txtTongCong.setText(check.FloatToVND(TC));
                                showResult();
                                GoiTapComboBox.removeItem(GoiTapComboBox.getSelectedItem());
                                txtVoucher.setText("");
                                txtThanhTien.setText("");
                                btnGo.setEnabled(false);
                                btnApDung.setEnabled(true);
                            }
                        } else {
                            new ErrorDialog("Voucher was expired!").setVisible(true);
                        }
                    } else {
                        new ErrorDialog("This voucher was not exist or not applied for this package!").setVisible(true);
                        txtVoucher.setText("");
                    }
                } else {
                    if (GoiTapComboBox.getSelectedItem() == null)
                    {
                        new ErrorDialog("There is no more package!").setVisible(true);
                    } else {
                        DTable = (DefaultTableModel) TableHoaDon.getModel();
                        txtThanhTien.setText(txtDonGia.getText());
                        ChiTietHoaDonView cthdv = new ChiTietHoaDonView(MaHV + "",
                                GoiTapComboBox.getSelectedItem() + "", LoaiGoiTapComboBox.getSelectedItem() + "",
                                txtDonGia.getText(), startDate, endDate, txtVoucher.getText(), "0", "0", "0", txtThanhTien.getText());
                        listCTHDV.add(cthdv);
                        TC += check.VNDToFloat(cthdv.getThanhTien());
                        txtTongCong.setText(check.FloatToVND(TC));
                        showResult();
                        GoiTapComboBox.removeItem(GoiTapComboBox.getSelectedItem());
                    }
                }

            }

        } catch (Exception e) {
            new ErrorDialog("Invalid input year!");
        }
    }//GEN-LAST:event_btnThemVaoHoaDonActionPerformed

    public void showResult() {
        ChiTietHoaDonView s = listCTHDV.get(listCTHDV.size() - 1);
        DTable.addRow(s.toArray());
    }

    private void showData() {
        TC = 0f;
        if (TableHoaDon.getRowCount() > 0) {
            DTable.setRowCount(0); // reset nd trong bang ve 0
        }
        for (ChiTietHoaDonView chiTietHoaDonView : listCTHDV) {
            DTable.addRow(chiTietHoaDonView.toArray());
            TC += check.VNDToFloat(chiTietHoaDonView.getThanhTien());
            txtTongCong.setText(check.FloatToVND(TC));
        }
    }

    private void sDateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDateComboBoxActionPerformed
        // TODO add your handling code here:
        int add = lgtc.getDataByMaLoaiGoiTap(lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "")).getThoiLuong();
        int sDate = sDateComboBox.getSelectedIndex() + 1;
        int sMonth = sMonthComboBox.getSelectedIndex() + 1;
        int sYear = Integer.parseInt(txtYear.getText());
        startDate = sDate + "/" + sMonth + "/" + sYear;
        endDate = dp.UpDate(sDate, sMonth, sYear, add);
        txtEndDate.setText(endDate);
    }//GEN-LAST:event_sDateComboBoxActionPerformed

    private void LoaiGoiTapComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoaiGoiTapComboBoxActionPerformed

        if (LoaiGoiTapComboBox.getSelectedIndex() >= 0) {
            int add = lgtc.getDataByMaLoaiGoiTap(lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "")).getThoiLuong();
            int sDate = sDateComboBox.getSelectedIndex() + 1;
            int sMonth = sMonthComboBox.getSelectedIndex() + 1;
            int sYear = Integer.parseInt(txtYear.getText());
            endDate = dp.UpDate(sDate, sMonth, sYear, add);
            txtEndDate.setText(endDate);
            MaLoaiGoiTap = lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "");
            txtDonGia.setText(np.FloatToVND(ctgtc.findPrice(MaGoiTap, MaLoaiGoiTap)));
        }

    }//GEN-LAST:event_LoaiGoiTapComboBoxActionPerformed

    private void sMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMonthComboBoxActionPerformed
   
        int add = lgtc.getDataByMaLoaiGoiTap(lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "")).getThoiLuong();
        int sDate = sDateComboBox.getSelectedIndex() + 1;
        int sMonth = sMonthComboBox.getSelectedIndex() + 1;
        int sYear = Integer.parseInt(txtYear.getText());
        startDate = sDate + "/" + sMonth + "/" + sYear;
        endDate = dp.UpDate(sDate, sMonth, sYear, add);
        txtEndDate.setText(endDate);
    }//GEN-LAST:event_sMonthComboBoxActionPerformed

    private void txtThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThanhTienActionPerformed



    }//GEN-LAST:event_txtThanhTienActionPerformed

    private void btnApDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApDungActionPerformed
        // TODO add your handling code here:

        VoucherKM x = new VoucherKM();
        x = vkmc.getData(txtVoucher.getText(), gtc.getMaGoiTap(GoiTapComboBox.getSelectedItem() + ""), lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + ""));
        if (x != null) {
            if (dp.CompareDate(dp.ConvertDate(x.getNgayKetThuc()), currentDate) == 1) {
                Float donGia = np.VNDToFloat(txtDonGia.getText());
                Float ThanhTien = donGia * (1 - x.getGiamGia1() / 100f) - x.getGiamGia2();
                txtThanhTien.setText(ThanhTien + "");
                endDate = dp.UpDate(Integer.parseInt(endDate.split("/")[0]), Integer.parseInt(endDate.split("/")[1]), Integer.parseInt(endDate.split("/")[2]), x.getThemNgay());
                txtEndDate.setText(endDate);
                btnGo.setEnabled(true);
                btnApDung.setEnabled(false);
            } else {

                new ErrorDialog("This voucher is expired!").setVisible(true);
            }

        } else {

            new ErrorDialog("This voucher was not exist or not applied for this package!").setVisible(true);
            txtVoucher.setText("");
        }
    }//GEN-LAST:event_btnApDungActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        listCTHDV.clear();
        GoiTapComboBox.removeAllItems();
        LoaiGoiTapComboBox.removeAllItems();
        InitDefaultData();
        showData();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int Index = TableHoaDon.getSelectedRow();
        if (listCTHDV.size() == 0) 
        {
            new ErrorDialog("The table is empty!").setVisible(true);
        } else if (Index == -1) 
        {
            new ErrorDialog("Please choose a row first!").setVisible(true);
        } else {
            GoiTapComboBox.addItem(listCTHDV.get(Index).getTenGoiTap());
            listCTHDV.remove(Index);
            showData();
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void InitDefaultData() {

        ThanhTien = 0f;
        TC = 0f;
        ArrayList<String> list1 = gtc.ToString();
        for (String string : list1) {
            GoiTapComboBox.addItem(string);

        }
        ArrayList<String> list2 = lgtc.ToString();
        for (String string : list2) {
            LoaiGoiTapComboBox.addItem(string);
        }
        sDateComboBox.setSelectedIndex(java.time.LocalDate.now().getDayOfMonth() - 1);
        sMonthComboBox.setSelectedIndex(java.time.LocalDate.now().getMonthValue() - 1);
        txtYear.setText(java.time.LocalDate.now().getYear() + "");
        int add = lgtc.getDataByMaLoaiGoiTap(lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "")).getThoiLuong();
        int sDate = sDateComboBox.getSelectedIndex() + 1;
        int sMonth = sMonthComboBox.getSelectedIndex() + 1;
        int sYear = Integer.parseInt(txtYear.getText());
        currentDate = sDate + "/" + sMonth + "/" + sYear;;
        startDate = sDate + "/" + sMonth + "/" + sYear;
        endDate = dp.UpDate(sDate, sMonth, sYear, add);
        txtEndDate.setText(endDate);
        startDate = sDate + "/" + sMonth + "/" + sYear;
        endDate = dp.UpDate(sDate, sMonth, sYear, add);
        txtEndDate.setText(endDate);
        txtDonGia.setText(np.FloatToVND(ctgtc.findPrice(MaGoiTap, MaLoaiGoiTap)));
        txtThanhTien.setText("");
        txtTongCong.setText("");
        ArrayList<String> registed = gtc.findTenGoiTapByMaHV(MaHV);
        for (String string : registed) {
            GoiTapComboBox.removeItem(string);
        }
    }

    NumberProcesser np = new NumberProcesser();
    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed

        VoucherKMCTR x = new VoucherKMCTR();
        if (!txtTongCong.getText().equals("")) {
            int MaHD = 0;
            int MaNV = Integer.parseInt(tkc.getDataJoinNVAndTaiKhoan(TenNV)[0] + "");
            HoaDon HD = new HoaDon(MaHD, dp.ReverseDate(currentDate), MaHV, MaNV);
            if (hdc.AddData(HD))
            {
                MaHD = hdc.getNextID();
                for (ChiTietHoaDonView chiTietHoaDonView : listCTHDV) {
                    int MaGoiTap = gtc.getMaGoiTap(chiTietHoaDonView.getTenGoiTap());
                    int MaLoaiGoiTap = lgtc.getMaLoaiGoiTap(chiTietHoaDonView.getLoaiGoiTap());
                    Float Gia = np.VNDToFloat(chiTietHoaDonView.getThanhTien());
                    String NgayBatDau = dp.ReverseDate(chiTietHoaDonView.getNgayBatDau());
                    String NgayKetThuc = dp.ReverseDate(chiTietHoaDonView.getNgayKetThuc());
                    String MaVoucher = chiTietHoaDonView.getVoucher();
                    if (!MaVoucher.equals("")) {
                        ChiTietHoaDon cthd = new ChiTietHoaDon(MaHD, MaGoiTap, MaLoaiGoiTap, MaVoucher, Gia, NgayBatDau, NgayKetThuc);
                        cthdc.AddData(cthd);
                    } else {
                        ChiTietHoaDon cthd = new ChiTietHoaDon(MaHD, MaGoiTap, MaLoaiGoiTap, null, Gia, NgayBatDau, NgayKetThuc);
                        cthdc.AddData(cthd);
                    }
                }
                new BillsForm(MaHD).setVisible(true);
                this.setVisible(false);
            }
        } else 
        {
            new ErrorDialog("The bills is empty!").setVisible(true);
        }
    }//GEN-LAST:event_txtSaveActionPerformed

    private void btnGetToDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetToDayActionPerformed
        // TODO add your handling code here:
        sDateComboBox.setSelectedIndex(java.time.LocalDate.now().getDayOfMonth() - 1);
        sMonthComboBox.setSelectedIndex(java.time.LocalDate.now().getMonthValue() - 1);
        txtYear.setText(java.time.LocalDate.now().getYear() + "");
        int add = lgtc.getDataByMaLoaiGoiTap(lgtc.getMaLoaiGoiTap(LoaiGoiTapComboBox.getSelectedItem() + "")).getThoiLuong();
        int sDate = sDateComboBox.getSelectedIndex() + 1;
        int sMonth = sMonthComboBox.getSelectedIndex() + 1;
        int sYear = Integer.parseInt(txtYear.getText());
        startDate = sDate + "/" + sMonth + "/" + sYear;
        endDate = dp.UpDate(sDate, sMonth, sYear, add);
        txtEndDate.setText(endDate);
    }//GEN-LAST:event_btnGetToDayActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed

        btnGo.setEnabled(false);
        btnApDung.setEnabled(true);
        InitDefaultData();
    }//GEN-LAST:event_btnGoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JComboBox<String> GoiTapComboBox;
    private javax.swing.JComboBox<String> LoaiGoiTapComboBox;
    private javax.swing.JTable TableHoaDon;
    private javax.swing.JButton btnApDung;
    private javax.swing.JButton btnGetToDay;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThemVaoHoaDon;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sDateComboBox;
    private javax.swing.JComboBox<String> sMonthComboBox;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JButton txtSave;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTongCong;
    private javax.swing.JTextField txtVoucher;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
