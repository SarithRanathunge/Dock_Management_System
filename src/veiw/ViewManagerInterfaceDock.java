/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import controller.ControllerDockPage;
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sarith
 */
public class ViewManagerInterfaceDock extends javax.swing.JFrame {

    private ControllerDockPage controller;

    /**
     * Creates new form ManagerInterfaceDock
     */
    public ViewManagerInterfaceDock() {
        controller = new ControllerDockPage();
        initComponents();
        date();
        tableDatashowing();
        Color();
        btnDock.setBackground(Color.white);
        Font boldFont = new Font(btnDock.getFont().getFontName(), Font.BOLD, btnDock.getFont().getSize());
        btnDock.setFont(boldFont);
        //btnDock.setBorder(new EmptyBorder(0, 0, 0, 0));
        txt_dock_edit_error.setText(null);
        txt_emp_position_error.setText(null);
    }

    public void date() {
        java.util.Date d = new java.util.Date();
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
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_dock_id = new javax.swing.JTextField();
        cbx_dock_status = new javax.swing.JComboBox<>();
        txt_emp_position_error = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dockTableData = new javax.swing.JTable();
        txt_dock_length = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_dock_width = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_dock_price = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnAddDockDetails = new javax.swing.JButton();
        btnClearDetails = new javax.swing.JButton();
        btnUpdateDockDetails = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnDeleteDockDetails = new javax.swing.JButton();
        btnRefreshTable = new javax.swing.JButton();
        txt_dock_edit_error = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbx_dock_status_search = new javax.swing.JComboBox<>();
        btnSearchDockDetails = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txt_dock_length_search = new javax.swing.JTextField();
        txt_dock_width_search = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dock Page");
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
        btnMaintaince.setText("Maintenance");
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
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(898, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel8.setText("Add , Update, Delete Dock Details");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Dock ID                 :");

        txt_dock_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dock_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dock_idKeyTyped(evt);
            }
        });

        cbx_dock_status.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_dock_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a status", "Available", "Taken" }));
        cbx_dock_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_dock_statusActionPerformed(evt);
            }
        });
        cbx_dock_status.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbx_dock_statusKeyTyped(evt);
            }
        });

        txt_emp_position_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error.setText("The Error");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Available Dock");

        dockTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Length (m)", "Width (m)", "Price (Rs.)", "Status"
            }
        ));
        dockTableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dockTableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dockTableData);

        txt_dock_length.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dock_length.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dock_lengthKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Dock Length(m)    :");

        txt_dock_width.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dock_width.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dock_widthKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Dock Width(m)     :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Dock Price(Rs.)      :");

        txt_dock_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dock_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dock_priceKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Dock Status          :");

        btnAddDockDetails.setBackground(new java.awt.Color(0, 204, 0));
        btnAddDockDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddDockDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDockDetails.setText("Add");
        btnAddDockDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDockDetailsActionPerformed(evt);
            }
        });

        btnClearDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearDetails.setText("Clear");
        btnClearDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDetailsActionPerformed(evt);
            }
        });

        btnUpdateDockDetails.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateDockDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateDockDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDockDetails.setText("Update");
        btnUpdateDockDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDockDetailsActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnDeleteDockDetails.setBackground(new java.awt.Color(255, 102, 0));
        btnDeleteDockDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteDockDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDockDetails.setText("Delete");
        btnDeleteDockDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDockDetailsActionPerformed(evt);
            }
        });

        btnRefreshTable.setBackground(new java.awt.Color(153, 153, 153));
        btnRefreshTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefreshTable.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshTable.setText("Refresh");
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        txt_dock_edit_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_dock_edit_error.setText("The Error");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Dock Status         :");

        cbx_dock_status_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_dock_status_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a status", "Available", "Taken", " " }));
        cbx_dock_status_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_dock_status_searchMouseClicked(evt);
            }
        });

        btnSearchDockDetails.setBackground(new java.awt.Color(0, 204, 0));
        btnSearchDockDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearchDockDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchDockDetails.setText("Search");
        btnSearchDockDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchDockDetailsMouseClicked(evt);
            }
        });
        btnSearchDockDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDockDetailsActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Dock Length(m)    :");

        txt_dock_length_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dock_length_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dock_length_searchMouseClicked(evt);
            }
        });
        txt_dock_length_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dock_length_searchKeyTyped(evt);
            }
        });

        txt_dock_width_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dock_width_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dock_width_searchMouseClicked(evt);
            }
        });
        txt_dock_width_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dock_width_searchKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Dock Width(m)     :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(btnDeleteDockDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddDockDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateDockDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_dock_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dock_price))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dock_width))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dock_length, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_dock_edit_error, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(btnClearDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                        .addComponent(txt_emp_position_error, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_dock_length_search, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_dock_width_search, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSearchDockDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRefreshTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_dock_status_search, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dock_edit_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_dock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_dock_length, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_dock_width, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_dock_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbx_dock_status, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnAddDockDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateDockDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClearDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteDockDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txt_dock_length_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchDockDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txt_dock_width_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cbx_dock_status_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
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
        ViewManagerInterfaceEmployee mie = new ViewManagerInterfaceEmployee();
        mie.setVisible(true);
        mie.pack();
        mie.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        ViewManagerInterfaceCustomer mic = new ViewManagerInterfaceCustomer();
        mic.setVisible(true);
        mic.pack();
        mic.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnYachtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYachtActionPerformed
        ViewManagerInterfaceYacht miy = new ViewManagerInterfaceYacht();
        miy.setVisible(true);
        miy.pack();
        miy.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnYachtActionPerformed

    private void btnDockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDockActionPerformed

    }//GEN-LAST:event_btnDockActionPerformed

    private void btnMaintainceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainceActionPerformed
        ViewManagerInterfaceAddMaintaince mim = new ViewManagerInterfaceAddMaintaince();
        mim.setVisible(true);
        mim.pack();
        mim.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMaintainceActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        ViewManagerInterfacePayment mip = new ViewManagerInterfacePayment();
        mip.setVisible(true);
        mip.pack();
        mip.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to log out?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            ViewLogin loginpage = new ViewLogin();
            loginpage.setVisible(true);
            loginpage.pack();
            loginpage.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnClearDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDetailsActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to clear the data?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            txt_dock_id.setText(null);
            txt_dock_length.setText(null);
            txt_dock_width.setText(null);
            txt_dock_price.setText(null);
            cbx_dock_status.setSelectedItem("Select a status");
        }
    }//GEN-LAST:event_btnClearDetailsActionPerformed

    private void btnUpdateDockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDockDetailsActionPerformed
        txt_dock_edit_error.setText(null);
        if (txt_dock_id.getText() == null || txt_dock_length.getText() == null || txt_dock_width.getText() == null || txt_dock_price.getText() == null || cbx_dock_status.getSelectedItem().equals("Select a status")) {
            JOptionPane.showMessageDialog(this, "Please add all data.");
        } else {
            int logout = JOptionPane.showConfirmDialog(this, "Are you sure, do you want to update?", "conform", JOptionPane.YES_NO_OPTION);
            if (logout == JOptionPane.YES_OPTION) {
                Color();
                String dockid = txt_dock_id.getText();
                float docklength = Float.parseFloat(txt_dock_length.getText());
                float dockwidth = Float.parseFloat(txt_dock_width.getText());
                float dockprice = Float.parseFloat(txt_dock_price.getText());
                String dockstatus = cbx_dock_status.getSelectedItem().toString();
                int updateData = controller.updateData(dockid, docklength, dockwidth, dockprice, dockstatus);
                if (updateData == 1) {
                    JOptionPane.showMessageDialog(this, dockid + " dock data has been updated.");
                    txt_dock_id.setText(null);
                    txt_dock_length.setText(null);
                    txt_dock_width.setText(null);
                    txt_dock_price.setText(null);
                    cbx_dock_status.setSelectedItem("Select a status");
                } else {
                    JOptionPane.showMessageDialog(this, "Sorry, The dock data has not been updated. Try again.");
                }
            }

        }
    }//GEN-LAST:event_btnUpdateDockDetailsActionPerformed

    private void btnDeleteDockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDockDetailsActionPerformed
        txt_dock_edit_error.setText(null);
        if (txt_dock_id.getText() == null || txt_dock_length.getText() == null || txt_dock_width.getText() == null || txt_dock_price.getText() == null || cbx_dock_status.getSelectedItem().equals("Select a status")) {
            JOptionPane.showMessageDialog(this, "Please add all data.");
        } else {
            Color();
            int logout = JOptionPane.showConfirmDialog(this, "Are you sure, do you want to delete?", "conform", JOptionPane.YES_NO_OPTION);
            if (logout == JOptionPane.YES_OPTION) {
                String dockid = txt_dock_id.getText();
                int deleteData = controller.deleteData(dockid);
                if (dockid.equals("")) {

                } else {
                    if (deleteData == 1) {
                        JOptionPane.showMessageDialog(this, dockid + " dock data has been deleted.");
                        txt_dock_id.setText(null);
                        txt_dock_length.setText(null);
                        txt_dock_width.setText(null);
                        txt_dock_price.setText(null);
                        cbx_dock_status.setSelectedItem("Select a status");
                    } else {
                        JOptionPane.showMessageDialog(this, "Sorry, The dock data has not been deleted. Try again.");
                    }

                }
            }
        }


    }//GEN-LAST:event_btnDeleteDockDetailsActionPerformed

    public void tableDatashowing() {

        cbx_dock_status_search.setSelectedItem("Select a status");
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM dock");
            DefaultTableModel tblModel = (DefaultTableModel) dockTableData.getModel();
            tblModel.setRowCount(0);
            while (rst.next()) {
                String[] tbData = {rst.getString("do_id"), String.valueOf(rst.getString("do_length")), String.valueOf(rst.getString("do_width")), String.valueOf(rst.getString("do_price")), rst.getString("do_status")};
                tblModel.addRow(tbData);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        txt_dock_edit_error.setText(null);
        tableDatashowing();
    }//GEN-LAST:event_btnRefreshTableActionPerformed

    private void btnSearchDockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDockDetailsActionPerformed
        txt_dock_edit_error.setText(null);
        txt_dock_length_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_dock_width_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cbx_dock_status_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        String search_status = cbx_dock_status_search.getSelectedItem().toString();
        String search_width_text = txt_dock_width_search.getText();
        String search_length_text = txt_dock_length_search.getText();

        if (!search_status.equals("Select a status") && !search_width_text.isEmpty() && !search_length_text.isEmpty()) {
            try {
                Float search_width = Float.parseFloat(search_width_text);
                Float search_length = Float.parseFloat(search_length_text);

                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";
                Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                Statement st = conn.createStatement();
                ResultSet rst = st.executeQuery("SELECT do_id, do_length, do_width, do_price, do_status FROM dock WHERE do_status ='" + search_status + "' AND do_length>'" + search_length + "' AND do_width>'" + search_width + "'");
                DefaultTableModel tblModel = (DefaultTableModel) dockTableData.getModel();
                tblModel.setRowCount(0);
                while (rst.next()) {
                    String[] tbData = {rst.getString("do_id"), String.valueOf(rst.getString("do_length")), String.valueOf(rst.getString("do_width")), String.valueOf(rst.getString("do_price")), rst.getString("do_status")};
                    tblModel.addRow(tbData);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid width or length format");
            } catch (SQLException ex) {
                Logger.getLogger(ViewManagerInterfaceDock.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please, Fill add the data to yacht length and width and select yacht status the feilds.");
        }

    }//GEN-LAST:event_btnSearchDockDetailsActionPerformed

    private void btnAddDockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDockDetailsActionPerformed
        txt_dock_edit_error.setText(null);
        if (txt_dock_id.getText() == null || txt_dock_length.getText() == null || txt_dock_width.getText() == null || txt_dock_price.getText() == null || cbx_dock_status.getSelectedItem().equals("Select a status")) {
            JOptionPane.showMessageDialog(this, "Please add all data.");
        } else {
            Color();
            String dockid = txt_dock_id.getText();
            float docklength = Float.parseFloat(txt_dock_length.getText());
            float dockwidth = Float.parseFloat(txt_dock_width.getText());
            float dockprice = Float.parseFloat(txt_dock_price.getText());
            String dockstatus = cbx_dock_status.getSelectedItem().toString();
            int insertData = controller.insertData(dockid, docklength, dockwidth, dockprice, dockstatus);
            if (insertData == 1) {
                JOptionPane.showMessageDialog(this, dockid + " dock data added into database.");
                txt_dock_id.setText(null);
                txt_dock_length.setText(null);
                txt_dock_width.setText(null);
                txt_dock_price.setText(null);
                cbx_dock_status.setSelectedItem("Select a status");
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, The data not insert into database. Try again.");
            }

        }
    }//GEN-LAST:event_btnAddDockDetailsActionPerformed

    private void cbx_dock_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_dock_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_dock_statusActionPerformed

    private void dockTableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dockTableDataMouseClicked

        TableModel model = dockTableData.getModel();
        int selectedRow = dockTableData.getSelectedRow();

        if (selectedRow != -1) {
            Object value = model.getValueAt(selectedRow, 0);
            if (value != null) {
                txt_dock_id.setText(value.toString());
            }

            value = model.getValueAt(selectedRow, 1);
            if (value != null) {
                txt_dock_length.setText(value.toString());
            }

            value = model.getValueAt(selectedRow, 2);
            if (value != null) {
                txt_dock_width.setText(value.toString());
            }

            value = model.getValueAt(selectedRow, 3);
            if (value != null) {
                txt_dock_price.setText(value.toString());
            }

            value = model.getValueAt(selectedRow, 4);
            if (value != null) {
                cbx_dock_status.setSelectedItem(value.toString());
            }
        }

    }//GEN-LAST:event_dockTableDataMouseClicked

    private void btnSearchDockDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchDockDetailsMouseClicked
//        String search_status = cbx_dock_status_search.getSelectedItem().toString();
//
//        if (search_status.equals("Select a status") || txt_dock_width_search.getText().length() == 0 || txt_dock_width_search.getText().length() == 0) {
//            txt_emp_position_error.setText("hello");
//        }
    }//GEN-LAST:event_btnSearchDockDetailsMouseClicked

    public void Color() {
        txt_dock_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_dock_length.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_dock_width.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_dock_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cbx_dock_status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_dock_length_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_dock_width_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cbx_dock_status_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    private void txt_dock_length_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dock_length_searchMouseClicked
        txt_emp_position_error.setText(null);
    }//GEN-LAST:event_txt_dock_length_searchMouseClicked

    private void txt_dock_width_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dock_width_searchMouseClicked
        txt_emp_position_error.setText(null);
    }//GEN-LAST:event_txt_dock_width_searchMouseClicked

    private void cbx_dock_status_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_dock_status_searchMouseClicked
        txt_emp_position_error.setText(null);
    }//GEN-LAST:event_cbx_dock_status_searchMouseClicked

    private void txt_dock_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dock_idKeyTyped
        txt_dock_edit_error.setText(null);
        if (!txt_dock_id.getText().matches("[A-Z][0-9]+")) {
            txt_dock_edit_error.setText("Dock ID is invalid format. Ex:A1234");
            txt_dock_id.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_dock_length.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_width.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_dock_status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_dock_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_txt_dock_idKeyTyped

    private void txt_dock_lengthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dock_lengthKeyTyped
        char c = evt.getKeyChar();
        txt_dock_edit_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_dock_edit_error.setText("Dock length Can't be a charachter.");
            txt_dock_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_length.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_dock_width.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_dock_status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_dock_length.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_txt_dock_lengthKeyTyped

    private void txt_dock_widthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dock_widthKeyTyped
        char c = evt.getKeyChar();
        txt_dock_edit_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_dock_edit_error.setText("Dock width Can't be a charachter.");
            txt_dock_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_length.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_width.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_dock_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_dock_status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_dock_width.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_txt_dock_widthKeyTyped

    private void txt_dock_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dock_priceKeyTyped
        char c = evt.getKeyChar();
        txt_dock_edit_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_dock_edit_error.setText("Dock price Can't be a charachter.");
            txt_dock_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_length.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_width.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_price.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            cbx_dock_status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_dock_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_txt_dock_priceKeyTyped

    private void cbx_dock_statusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbx_dock_statusKeyTyped
        txt_dock_edit_error.setText(null);
        if (cbx_dock_status.getSelectedIndex() == 0) {
            txt_dock_edit_error.setText("Please, select the dock status.");
            txt_dock_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_length.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_width.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_dock_status.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_cbx_dock_statusKeyTyped

    private void txt_dock_length_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dock_length_searchKeyTyped
        char c = evt.getKeyChar();
        txt_emp_position_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_emp_position_error.setText("Dock length Can't be a charachter.");
            txt_dock_length_search.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_dock_width_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_dock_status_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_dock_length_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_txt_dock_length_searchKeyTyped

    private void txt_dock_width_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dock_width_searchKeyTyped
        char c = evt.getKeyChar();
        txt_emp_position_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_emp_position_error.setText("Dock width Can't be a charachter.");
            txt_dock_length_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_dock_width_search.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            cbx_dock_status_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_dock_width_search.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_txt_dock_width_searchKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ViewManagerInterfaceDock mdock = new ViewManagerInterfaceDock();
        mdock.setVisible(true);
        mdock.pack();
        mdock.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDockDetails;
    private javax.swing.JButton btnClearDetails;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDeleteDockDetails;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JButton btnSearchDockDetails;
    private javax.swing.JButton btnUpdateDockDetails;
    private javax.swing.JButton btnYacht;
    private javax.swing.JComboBox<String> cbx_dock_status;
    private javax.swing.JComboBox<String> cbx_dock_status_search;
    private javax.swing.JTable dockTableData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel txt_dock_edit_error;
    private javax.swing.JTextField txt_dock_id;
    private javax.swing.JTextField txt_dock_length;
    private javax.swing.JTextField txt_dock_length_search;
    private javax.swing.JTextField txt_dock_price;
    private javax.swing.JTextField txt_dock_width;
    private javax.swing.JTextField txt_dock_width_search;
    private javax.swing.JLabel txt_emp_position_error;
    // End of variables declaration//GEN-END:variables
}
