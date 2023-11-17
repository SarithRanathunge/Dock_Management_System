/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import controller.ControllerMechanicPage;
import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sarith
 */
public class MechanicInterface extends javax.swing.JFrame {

    private ControllerMechanicPage controller;

    /**
     * Creates new form MecahnicInterface
     */
    public MechanicInterface() {
        initComponents();
        controller = new ControllerMechanicPage();
        date();
        btnMaintaince.setBackground(Color.white);
        Font boldFont = new Font(btnMaintaince.getFont().getFontName(), Font.BOLD, btnMaintaince.getFont().getSize());
        btnMaintaince.setFont(boldFont);
        //btnMaintaince.setBorder(new EmptyBorder(0, 0, 0, 0));
        txt_date.setEnabled(false);
        txt_date.setDisabledTextColor(Color.black);
        txt_main_no.setEnabled(false);
        txt_main_no.setDisabledTextColor(Color.black);
        txt_maintaince_type.setEnabled(false);
        txt_maintaince_type.setDisabledTextColor(Color.black);
        txt_yacht.setEnabled(false);
        txt_yacht.setDisabledTextColor(Color.black);
        showDataTable();
    }

    public void date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String dd = sdf.format(d);
        lblDate.setText(dd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMaintaince = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUserPosition = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnRefreashTableDetails = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_details = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txt_emp_position_error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        btnClearDetails = new javax.swing.JButton();
        txt_emp_position_error1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbx_status = new javax.swing.JComboBox<>();
        txt_maintaince_type = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        txt_yacht = new javax.swing.JTextField();
        txt_main_no = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 800));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(240, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(240, 800));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SERVICE DOCK");
        jLabel1.setMaximumSize(new java.awt.Dimension(240, 70));
        jLabel1.setMinimumSize(new java.awt.Dimension(240, 70));
        jLabel1.setPreferredSize(new java.awt.Dimension(240, 70));

        btnMaintaince.setBackground(new java.awt.Color(0, 204, 204));
        btnMaintaince.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMaintaince.setText("Maintance");
        btnMaintaince.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMaintaince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainceActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log Out");
        btnLogout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMaintaince, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnMaintaince, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 240, 800);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1120, 55));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("23:04");
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("23:04");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 50));

        lblUserPosition.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUserPosition.setText("Mechanic");
        lblUserPosition.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblUserPosition.setPreferredSize(new java.awt.Dimension(200, 50));

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUser.setText("Sarith Ranathunge");
        lblUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblUser.setPreferredSize(new java.awt.Dimension(200, 50));

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("10 / 10 / 2023");
        lblDate.setPreferredSize(new java.awt.Dimension(150, 55));

        lblTime1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime1.setText("Date :");
        lblTime1.setPreferredSize(new java.awt.Dimension(150, 55));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 892, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUserPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUserPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(240, 0, 1120, 55);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1120, 745));

        btnRefreashTableDetails.setBackground(new java.awt.Color(153, 153, 153));
        btnRefreashTableDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefreashTableDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreashTableDetails.setText("Refresh");
        btnRefreashTableDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreashTableDetailsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Daily Maintaince Going On");

        tbl_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Maintaince No.", "Yacht", "Maintaince Type", "Dock Place", "Mechanic ", "Manitaince Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_detailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_details);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Add Maintaince To Yacht");

        txt_emp_position_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error.setText("The Error");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Yacht                   :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Maintaince Type  :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Maintaince Date :");

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnClearDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearDetails.setText("Clear");
        btnClearDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDetailsActionPerformed(evt);
            }
        });

        txt_emp_position_error1.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error1.setText("The Error");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Maintaince Status:");

        cbx_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a status", "Done", "On going" }));

        txt_maintaince_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_maintaince_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_maintaince_typeMouseClicked(evt);
            }
        });

        txt_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dateMouseClicked(evt);
            }
        });

        txt_yacht.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_yacht.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_yachtMouseClicked(evt);
            }
        });

        txt_main_no.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_main_no.setText("\n");
        txt_main_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_main_noMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Maintaince No   :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRefreashTableDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_emp_position_error1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_emp_position_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                                .addComponent(btnClearDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_main_no, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_yacht, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_maintaince_type, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_yacht, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_maintaince_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbx_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_main_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnClearDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_emp_position_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreashTableDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(240, 55, 1120, 745);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaintainceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaintainceActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to log out?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            Login loginpage = new Login();
            loginpage.setVisible(true);
            loginpage.pack();
            loginpage.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int no = Integer.parseInt(txt_main_no.getText());
        String status = cbx_status.getSelectedItem().toString();
        int updatedata = controller.updateDta(no, status);

        if (status.equals("Select a status")) {

        } else if (txt_main_no.getText().length() <= 0) {

        } else {
            int logout = JOptionPane.showConfirmDialog(null, "Date of the Maintaince can not updated.", "Conform", JOptionPane.YES_NO_OPTION);
            if (logout == JOptionPane.YES_OPTION) {
                if (updatedata == 1) {
                    JOptionPane.showMessageDialog(this, " The data has been updated.");
                    txt_main_no.setText(null);
                    txt_date.setText(null);
                    txt_maintaince_type.setText(null);
                    txt_date.setText(null);
                    cbx_status.setSelectedItem("Select a status");
                } else {
                    JOptionPane.showMessageDialog(this, "Sorry, The data not updated. Try again.");
                }
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnClearDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDetailsActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to clear the data?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            txt_main_no.setText(null);
            txt_date.setText(null);
            txt_maintaince_type.setText(null);
            txt_date.setText(null);
            cbx_status.setSelectedItem("Select a status");
        }
    }//GEN-LAST:event_btnClearDetailsActionPerformed

    private void txt_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dateMouseClicked
        JOptionPane.showMessageDialog(this, "Maintaince date can not update to mechanic.");
    }//GEN-LAST:event_txt_dateMouseClicked

    private void txt_main_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_main_noMouseClicked
        JOptionPane.showMessageDialog(this, "Employee ID can not update to mechanic.");
    }//GEN-LAST:event_txt_main_noMouseClicked

    public void showDataTable() {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            java.sql.Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            java.sql.Statement st = conn.createStatement();
            java.sql.Statement st1 = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT maintaince_yacht.my_id, maintaince_yacht.my_yacht, maintaince_yacht.my_maintaince_type, yacht.ya_do_id,maintaince_yacht.my_mechanic, maintaince_yacht.my_date FROM maintaince_yacht JOIN yacht  ON maintaince_yacht.my_id=yacht.ya_id  WHERE maintaince_yacht.ma_status='On going'");
            DefaultTableModel tblModel = (DefaultTableModel) tbl_details.getModel();
            tblModel.setRowCount(0);
            while (rst.next()) {
                String[] tbData = {rst.getString("maintaince_yacht.my_id"), rst.getString("maintaince_yacht.my_yacht"), rst.getString("maintaince_yacht.my_maintaince_type"), rst.getString("yacht.ya_do_id"),rst.getString("maintaince_yacht.my_mechanic"), rst.getString("maintaince_yacht.my_date")};
                tblModel.addRow(tbData);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private void btnRefreashTableDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreashTableDetailsActionPerformed
        showDataTable();
    }//GEN-LAST:event_btnRefreashTableDetailsActionPerformed

    private void tbl_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_detailsMouseClicked
       try {
            TableModel model = tbl_details.getModel();
            int selectedRow = tbl_details.getSelectedRow();

            if (selectedRow != -1) {
                Object value = model.getValueAt(selectedRow, 0);
                if (value != null) {
                    txt_yacht.setText(value.toString());
                }

                value = model.getValueAt(selectedRow, 1);
                if (value != null) {
                    txt_maintaince_type.setText(value.toString());
                }

                value = model.getValueAt(selectedRow, 2);
                if (value != null) {
                    cbx_status.setSelectedItem(value.toString());
                }

                value = model.getValueAt(selectedRow, 3);
                if (value != null) {
                    txt_date.setText(value.toString());
                }
                
                value = model.getValueAt(selectedRow, 4);
                if (value != null) {
                    txt_main_no.setText(value.toString());
                }
                
                

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_tbl_detailsMouseClicked

    private void txt_maintaince_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_maintaince_typeMouseClicked
        JOptionPane.showMessageDialog(this, "Maintaince type can not update to mechanic.");
    }//GEN-LAST:event_txt_maintaince_typeMouseClicked

    private void txt_yachtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_yachtMouseClicked
        JOptionPane.showMessageDialog(this, "Yacht id can not update to mechanic.");
    }//GEN-LAST:event_txt_yachtMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MechanicInterface mei = new MechanicInterface();
        mei.setVisible(true);
        mei.pack();
        mei.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearDetails;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnRefreashTableDetails;
    private javax.swing.JComboBox<String> cbx_status;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserPosition;
    private javax.swing.JTable tbl_details;
    private javax.swing.JTextField txt_date;
    private javax.swing.JLabel txt_emp_position_error;
    private javax.swing.JLabel txt_emp_position_error1;
    private javax.swing.JTextField txt_main_no;
    private javax.swing.JTextField txt_maintaince_type;
    private javax.swing.JTextField txt_yacht;
    // End of variables declaration//GEN-END:variables
}
