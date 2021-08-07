/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Controller.GoiTapCTR;
import Controller.HoaDonCTR;
import Controller.HoiVienCTR;
import Controller.NhanVienCTR;
import Controller.VeTapCTR;
import Object.HoaDon;
import Object.VeTap;
import Processor.NumberProcesser;
import View.Dialog.ErrorDialog;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class jPanelSales extends javax.swing.JPanel {

    HoaDonCTR hdc = new HoaDonCTR();
    VeTapCTR vtc = new VeTapCTR();
    DefaultTableModel dTable = new DefaultTableModel();
    DefaultTableModel dTable1 = new DefaultTableModel();
    NumberProcesser np = new NumberProcesser();
    HoiVienCTR hvctr = new HoiVienCTR();

    /**
     * Creates new form jPanelDoanhThu
     */
    public jPanelSales() {
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        dTable = (DefaultTableModel) tableHoaDon.getModel();
        dTable1 = (DefaultTableModel) tableVeTap.getModel();
        showAllDataHD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jPanel1 = new javax.swing.JPanel();
        monthComboBox = new javax.swing.JComboBox<>();
        DateComboBox = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JTextField();
        btnDateStat = new javax.swing.JButton();
        btnMonthStat = new javax.swing.JButton();
        btnYearStat = new javax.swing.JButton();
        btnAllStat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVeTap = new javax.swing.JTable();
        labelDoanhThu = new javax.swing.JLabel();
        txtTC = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        monthComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "Febrary", "March", "April", "May", "June", "July", "August", "Sepemper", "October", "November", "December" }));
        jPanel1.add(monthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 34, -1, -1));
        monthComboBox.setBackground(new Color(0,0,0,0));

        DateComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        DateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(DateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 34, -1, -1));

        txtYear.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtYear.setText("2021");
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 34, 70, -1));

        btnDateStat.setBackground(new java.awt.Color(255, 255, 255));
        btnDateStat.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnDateStat.setText("By date");
        btnDateStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateStatActionPerformed(evt);
            }
        });
        jPanel1.add(btnDateStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 33, -1, -1));

        btnMonthStat.setBackground(new java.awt.Color(255, 255, 255));
        btnMonthStat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMonthStat.setText("By month");
        btnMonthStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonthStatActionPerformed(evt);
            }
        });
        jPanel1.add(btnMonthStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 33, -1, -1));

        btnYearStat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnYearStat.setText("By year");
        btnYearStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearStatActionPerformed(evt);
            }
        });
        jPanel1.add(btnYearStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 33, -1, -1));

        btnAllStat.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnAllStat.setText("All");
        btnAllStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllStatActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 33, -1, -1));

        tableHoaDon.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bill ID", "Date", "Customer", "Staff ID", "Total Price"
            }
        ));
        tableHoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        tableHoaDon.setPreferredSize(new java.awt.Dimension(375, 500));
        tableHoaDon.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableHoaDon.setShowGrid(false);
        tableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHoaDon);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 94, 632, 360));

        tableVeTap.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        tableVeTap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ticket ID", "Buy date", "Package", "Price"
            }
        ));
        tableVeTap.setGridColor(new java.awt.Color(0, 0, 0));
        tableVeTap.setPreferredSize(new java.awt.Dimension(300, 500));
        tableVeTap.setShowGrid(false);
        jScrollPane2.setViewportView(tableVeTap);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 94, 632, 360));

        labelDoanhThu.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        labelDoanhThu.setText(" Total revenue");
        jPanel1.add(labelDoanhThu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, 30));

        txtTC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTC.setForeground(new java.awt.Color(255, 51, 51));
        txtTC.setText("0");
        jPanel1.add(txtTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 485, 208, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateComboBoxActionPerformed

    }//GEN-LAST:event_DateComboBoxActionPerformed

    private void tableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHoaDonMouseClicked


    }//GEN-LAST:event_tableHoaDonMouseClicked

    private void btnDateStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateStatActionPerformed

        labelDoanhThu.setText("Revenue in " + DateComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + " " + txtYear.getText() + ": ");
        showDataHDByDate();
    }//GEN-LAST:event_btnDateStatActionPerformed

    private void btnMonthStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonthStatActionPerformed

        labelDoanhThu.setText("Revenue in " + monthComboBox.getSelectedItem() + "-" + txtYear.getText() + ": ");
        showDataByMonth();
    }//GEN-LAST:event_btnMonthStatActionPerformed

    private void btnYearStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearStatActionPerformed

        labelDoanhThu.setText("Revenue in " + txtYear.getText() + ": ");
        showDataByYear();
    }//GEN-LAST:event_btnYearStatActionPerformed

    private void btnAllStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllStatActionPerformed

        showAllDataHD();
        labelDoanhThu.setText("Total revenue: ");
    }//GEN-LAST:event_btnAllStatActionPerformed
    private void showAllDataHD() {

        float TC = 0f;
        if (tableHoaDon.getRowCount() > 0) {
            dTable.setRowCount(0); // reset nd trong bang ve 0
        }
        ArrayList<HoaDon> listHD = new ArrayList<>();
        listHD = hdc.getData();
        NhanVienCTR nvc = new NhanVienCTR();
        for (HoaDon hoaDon : listHD) {
            dTable.addRow(new Object[]{hoaDon.getMaHD(), hoaDon.getNgayLap(), hvctr.getData(hoaDon.getMaHV()).getTenHV(), nvc.getData(hoaDon.getMaNV()).getTenNV(), np.FloatToVND(hdc.getPriceByMaHD(hoaDon.getMaHD()))});
            TC += hdc.getPriceByMaHD(hoaDon.getMaHD());

        }
        if (tableVeTap.getRowCount() > 0) {
            dTable1.setRowCount(0); // reset nd trong bang ve 0
        }
        ArrayList<VeTap> listVT = new ArrayList<>();
        listVT = vtc.getData();
        GoiTapCTR gtc = new GoiTapCTR();
        for (VeTap veTap : listVT) {
            dTable1.addRow(new Object[]{veTap.getMaVe(), veTap.getNgayTap(), gtc.getData(veTap.getMaGoiTap()).getTenGoiTap(), np.FloatToVND(veTap.getGia())});
            TC += veTap.getGia();

        }
        txtTC.setText(np.FloatToVND(TC));

    }

    private void showDataHDByDate() {
        try {
            Integer.parseInt(txtYear.getText());

            float TC = 0f;
            if (tableHoaDon.getRowCount() > 0) {
                dTable.setRowCount(0); // reset nd trong bang ve 0
            }
            ArrayList<HoaDon> listHD = new ArrayList<>();
            listHD = hdc.getDataByDate(DateComboBox.getSelectedIndex() + 1, monthComboBox.getSelectedIndex() + 1, Integer.parseInt(txtYear.getText()));
            for (HoaDon hoaDon : listHD) {
                dTable.addRow(new Object[]{hoaDon.getMaHD(), hoaDon.getNgayLap(), hvctr.getData(hoaDon.getMaHV()).getTenHV(), hoaDon.getMaNV(), hdc.getPriceByMaHD(hoaDon.getMaHD())});
                TC += hdc.getPriceByMaHD(hoaDon.getMaHD());
            }
            if (tableVeTap.getRowCount() > 0) {
                dTable1.setRowCount(0); // reset nd trong bang ve 0
            }
            ArrayList<VeTap> listVT = new ArrayList<>();
            listVT = vtc.getDataByDate(DateComboBox.getSelectedIndex() + 1, monthComboBox.getSelectedIndex() + 1, Integer.parseInt(txtYear.getText()));
            for (VeTap veTap : listVT) {
                dTable1.addRow(veTap.toArray());
                TC += veTap.getGia();
            }
            txtTC.setText(np.FloatToVND(TC));
        } catch (Exception e) {
            new ErrorDialog("Invalid year input!").setVisible(true);
        }
    }

    private void showDataByMonth() {
        try {
            Integer.parseInt(txtYear.getText());
            float TC = 0f;
            if (tableHoaDon.getRowCount() > 0) {
                dTable.setRowCount(0); // reset nd trong bang ve 0
            }
            ArrayList<HoaDon> listHD = new ArrayList<>();
            listHD = hdc.getDataByMonth(monthComboBox.getSelectedIndex() + 1, Integer.parseInt(txtYear.getText()));
            for (HoaDon hoaDon : listHD) {
                dTable.addRow(new Object[]{hoaDon.getMaHD(), hoaDon.getNgayLap(), hvctr.getData(hoaDon.getMaHV()).getTenHV(), hoaDon.getMaNV(), hdc.getPriceByMaHD(hoaDon.getMaHD())});
                TC += hdc.getPriceByMaHD(hoaDon.getMaHD());
                System.out.println(hdc.getPriceByMaHD(hoaDon.getMaHD()));
            }
            if (tableVeTap.getRowCount() > 0) {
                dTable1.setRowCount(0); // reset nd trong bang ve 0
            }
            ArrayList<VeTap> listVT = new ArrayList<>();
            listVT = vtc.getDataByMonth(monthComboBox.getSelectedIndex() + 1, Integer.parseInt(txtYear.getText()));
            for (VeTap veTap : listVT) {
                dTable1.addRow(veTap.toArray());
                TC += veTap.getGia();
            }
            txtTC.setText(np.FloatToVND(TC));
        } catch (Exception e) {
            new ErrorDialog("Invalid year input!").setVisible(true);
        }
    }

    private void showDataByYear() {
        try {
            Integer.parseInt(txtYear.getText());
            float TC = 0f;
            if (tableHoaDon.getRowCount() > 0) {
                dTable.setRowCount(0); // reset nd trong bang ve 0
            }
            ArrayList<HoaDon> listHD = new ArrayList<>();
            listHD = hdc.getDataByYear(Integer.parseInt(txtYear.getText()));
            for (HoaDon hoaDon : listHD) {
                dTable.addRow(new Object[]{hoaDon.getMaHD(), hoaDon.getNgayLap(), hvctr.getData(hoaDon.getMaHV()).getTenHV(), hoaDon.getMaNV(), hdc.getPriceByMaHD(hoaDon.getMaHD())});
                TC += hdc.getPriceByMaHD(hoaDon.getMaHD());

            }

            if (tableVeTap.getRowCount() > 0) {
                dTable1.setRowCount(0); // reset nd trong bang ve 0
            }
            ArrayList<VeTap> listVT = new ArrayList<>();
            listVT = vtc.getDataByYear(Integer.parseInt(txtYear.getText()));
            for (VeTap veTap : listVT) {
                dTable1.addRow(veTap.toArray());
                TC += veTap.getGia();
            }
            txtTC.setText(np.FloatToVND(TC));
        } catch (Exception e) {
            new ErrorDialog("Invalid year input!").setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DateComboBox;
    private javax.swing.JButton btnAllStat;
    private javax.swing.JButton btnDateStat;
    private javax.swing.JButton btnMonthStat;
    private javax.swing.JButton btnYearStat;
    private java.awt.Choice choice1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDoanhThu;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTable tableHoaDon;
    private javax.swing.JTable tableVeTap;
    private javax.swing.JLabel txtTC;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
