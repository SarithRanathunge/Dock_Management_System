/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.ControllerCustomerPage;
import java.util.List;

/**
 *
 * @author Sarith
 */
public class ManagerInterfaceCustomer extends javax.swing.JFrame {

    private ControllerCustomerPage controller;
    /**
     * Creates new form ManagerInterfaceCustomer
     */
    public ManagerInterfaceCustomer() {
        initComponents();
        controller = new ControllerCustomerPage();
        date();
        getItems();
        btnCustomer.setBackground(Color.white);
        Font boldFont = new Font(btnCustomer.getFont().getFontName(), Font.BOLD, btnCustomer.getFont().getSize());
        btnCustomer.setFont(boldFont);
        //btnCustomer.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    public void date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String dd = sdf.format(d);
        lblDate.setText(dd);
    }

    public void getItems(){
        cbx_cu_id_details.removeAllItems();
        List<String> items = controller.getItems();

        for (String item : items) {
            cbx_cu_id_details.addItem(item);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnYacht = new javax.swing.JButton();
        btnDock = new javax.swing.JButton();
        btnMaintaince = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUserPosition = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_emp_position_error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbx_cu_id_details = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        yacht_details_table_customer = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        btnSearchCustomerDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Page");
        setResizable(false);

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

        btnEmployee.setBackground(new java.awt.Color(0, 204, 204));
        btnEmployee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnCustomer.setBackground(new java.awt.Color(0, 204, 204));
        btnCustomer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCustomer.setText("Customer");
        btnCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnYacht.setBackground(new java.awt.Color(0, 204, 204));
        btnYacht.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnYacht.setText("Yacht");
        btnYacht.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnYacht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYachtActionPerformed(evt);
            }
        });

        btnDock.setBackground(new java.awt.Color(0, 204, 204));
        btnDock.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDock.setText("Dock");
        btnDock.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDockActionPerformed(evt);
            }
        });

        btnMaintaince.setBackground(new java.awt.Color(0, 204, 204));
        btnMaintaince.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMaintaince.setText("Maintaince");
        btnMaintaince.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMaintaince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainceActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(0, 204, 204));
        btnPayment.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
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
            .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnYacht, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMaintaince, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnYacht, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaintaince, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
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
        lblUserPosition.setText("Manager");
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

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Customer Details");

        txt_emp_position_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error.setText("The Error");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Customer ID      :");

        yacht_details_table_customer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yacht_details_table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Yachat ID", "Yacht Model", "Dock Place", "Yacht Width (m)", "Yacht Length (m)", "Start Date", "Due Date"
            }
        ));
        jScrollPane1.setViewportView(yacht_details_table_customer);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Yacht Details");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Payment Details History");

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add or Update Customer Details ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        customer_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Date of Birth", "Age", "Gender", "Address", "Telephone", "Mobile", "Telephone", "Email"
            }
        ));
        jScrollPane2.setViewportView(customer_table);

        btnSearchCustomerDetails.setBackground(new java.awt.Color(0, 102, 255));
        btnSearchCustomerDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearchCustomerDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCustomerDetails.setText("Search");
        btnSearchCustomerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_cu_id_details, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_emp_position_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearchCustomerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1094, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_cu_id_details, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
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

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        ManagerInterfaceEmployee mie = new ManagerInterfaceEmployee();
        mie.setVisible(true);
        mie.pack();
        mie.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnYachtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYachtActionPerformed
        ManagerInterfaceYacht miy = new ManagerInterfaceYacht();
        miy.setVisible(true);
        miy.pack();
        miy.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnYachtActionPerformed

    private void btnDockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDockActionPerformed
        ManagerInterfaceDock mdock = new ManagerInterfaceDock();
        mdock.setVisible(true);
        mdock.pack();
        mdock.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDockActionPerformed

    private void btnMaintainceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainceActionPerformed
        ManagerInterfaceAddMaintaince mim = new ManagerInterfaceAddMaintaince();
        mim.setVisible(true);
        mim.pack();
        mim.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMaintainceActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        ManagerInterfacePayment mip = new ManagerInterfacePayment();
        mip.setVisible(true);
        mip.pack();
        mip.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ManagerInterfaceAddCustomer miac = new ManagerInterfaceAddCustomer();
        miac.setVisible(true);
        miac.pack();
        miac.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchCustomerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerDetailsActionPerformed
        String search = cbx_cu_id_details.getSelectedItem().toString();

        //customer details
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT cu_id,cu_name,cu_dob,cu_age,cu_gender,cu_address,cu_telephone,cu_mobile,cu_NIC_no,cu_email FROM customer WHERE cu_id='" + search + "'");
            DefaultTableModel tblModel = (DefaultTableModel) customer_table.getModel();
            tblModel.setRowCount(0);
            while (rst.next()) {
                String[] tbData = {rst.getString("cu_id"), rst.getString("cu_name"), rst.getString("cu_dob"), rst.getString("cu_age"), rst.getString("cu_gender"), rst.getString("cu_address"), rst.getString("cu_telephone"), rst.getString("cu_mobile"), rst.getString("cu_NIC_no"), rst.getString("cu_email")};
                tblModel.addRow(tbData);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT ya_id, ya_model, ya_do_id, ya_width, ya_length, ya_start_date, ya_due_date FROM yacht WHERE ya_cu_id='" + search + "'");
            DefaultTableModel tblModel = (DefaultTableModel) yacht_details_table_customer.getModel();
            tblModel.setRowCount(0);
            while (rst.next()) {
                String[] tbData = {rst.getString("ya_id"), rst.getString("ya_model"), rst.getString("ya_do_id"), rst.getString("ya_width"), rst.getString("ya_length"), rst.getString("ya_start_date"), rst.getString("ya_due_date")};
                tblModel.addRow(tbData);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_btnSearchCustomerDetailsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ManagerInterfaceCustomer mic = new ManagerInterfaceCustomer();
        mic.setVisible(true);
        mic.pack();
        mic.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSearchCustomerDetails;
    private javax.swing.JButton btnYacht;
    private javax.swing.JComboBox<String> cbx_cu_id_details;
    private javax.swing.JTable customer_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserPosition;
    private javax.swing.JLabel txt_emp_position_error;
    private javax.swing.JTable yacht_details_table_customer;
    // End of variables declaration//GEN-END:variables
}
