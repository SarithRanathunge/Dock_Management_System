/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import controller.ControllerMaintaincePage;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sarith
 */
public class ViewManagerInterfaceMaintaince extends javax.swing.JFrame {

    private ControllerMaintaincePage controller;

    /**
     * Creates new form ManagerInterfaceHome
     */
    public ViewManagerInterfaceMaintaince() {
        controller = new ControllerMaintaincePage();
        initComponents();
        date();
        showDataTable();
        btnMaintaince.setBackground(Color.white);
        Font boldFont = new Font(btnMaintaince.getFont().getFontName(), Font.BOLD, btnMaintaince.getFont().getSize());
        btnMaintaince.setFont(boldFont);
        //btnMaintaince.setBorder(new EmptyBorder(0, 0, 0, 0));
        txt_add_error.setText(null);
        txt_ma_up_id.setEnabled(false);
        txt_ma_up_id.setDisabledTextColor(Color.black);
    }

    public void Color() {
        txt_main_note.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_main_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_main_type.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_ma_up_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_ma_up_note.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_ma_up_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_ma_up_type.setBorder(BorderFactory.createLineBorder(Color.BLACK));
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
        btnEmployee = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnYacht = new javax.swing.JButton();
        btnDock = new javax.swing.JButton();
        btnMaintaince = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnLougout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_main_type = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_main_price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAddDetails = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintaince_table = new javax.swing.JTable();
        btnRefreshTableData = new javax.swing.JButton();
        txt_add_error = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_main_note = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_ma_up_id = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_ma_up_note = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        txt_update_error = new javax.swing.JLabel();
        btnClearDetails = new javax.swing.JButton();
        txt_ma_up_price = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnUpdateDetails = new javax.swing.JButton();
        btnSearchTablesDetails = new javax.swing.JButton();
        btnUpdateClear = new javax.swing.JButton();
        btndeleteDetails = new javax.swing.JButton();
        txt_ma_up_type = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        cbx_search_details = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maintaince Page > Add, Upadte, Delete, Manage Maintaince Details page");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 800));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel2.setMaximumSize(new java.awt.Dimension(240, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(240, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 800));

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

        btnLougout.setBackground(new java.awt.Color(255, 0, 0));
        btnLougout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLougout.setForeground(new java.awt.Color(255, 255, 255));
        btnLougout.setText("Log Out");
        btnLougout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLougout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLougoutActionPerformed(evt);
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
            .addComponent(btnLougout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnLougout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Available Maintenance ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Maintenance  Type :");

        txt_main_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_main_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_main_typeKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Maintenance  Price(Rs.) :");

        txt_main_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_main_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_main_priceKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Maintenance  Note :");

        btnAddDetails.setBackground(new java.awt.Color(0, 204, 0));
        btnAddDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDetails.setText("Add");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Add New Maintenance  Type");

        maintaince_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type", "Price (Rs.)", "Note"
            }
        ));
        maintaince_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintaince_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(maintaince_table);

        btnRefreshTableData.setBackground(new java.awt.Color(153, 153, 153));
        btnRefreshTableData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefreshTableData.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshTableData.setText("Refresh");
        btnRefreshTableData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableDataActionPerformed(evt);
            }
        });

        txt_add_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_add_error.setText("The Error");

        txt_main_note.setColumns(20);
        txt_main_note.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_main_note.setRows(5);
        jScrollPane3.setViewportView(txt_main_note);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Maintenance ID      :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Maintenance Type :");

        txt_ma_up_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ma_up_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ma_up_idMouseClicked(evt);
            }
        });

        txt_ma_up_note.setColumns(20);
        txt_ma_up_note.setRows(5);
        jScrollPane4.setViewportView(txt_ma_up_note);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Maintenance Note :");

        txt_update_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_update_error.setText("The Error");

        btnClearDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearDetails.setText("Clear");
        btnClearDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDetailsActionPerformed(evt);
            }
        });

        txt_ma_up_price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ma_up_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ma_up_priceKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Maintenance Price(Rs.) :");

        btnUpdateDetails.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDetails.setText("Update");
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        btnSearchTablesDetails.setBackground(new java.awt.Color(0, 102, 255));
        btnSearchTablesDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearchTablesDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchTablesDetails.setText("Search");
        btnSearchTablesDetails.setVerifyInputWhenFocusTarget(false);
        btnSearchTablesDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTablesDetailsActionPerformed(evt);
            }
        });

        btnUpdateClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateClear.setText("Clear");
        btnUpdateClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateClearActionPerformed(evt);
            }
        });

        btndeleteDetails.setBackground(new java.awt.Color(255, 102, 0));
        btndeleteDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btndeleteDetails.setForeground(new java.awt.Color(255, 255, 255));
        btndeleteDetails.setText("Delete");
        btndeleteDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteDetailsActionPerformed(evt);
            }
        });

        txt_ma_up_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ma_up_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ma_up_typeKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Update, Delete Maintenance  Type");

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Go Back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Maintenance ID      :");

        cbx_search_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_search_detailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_search_details, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRefreshTableData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearchTablesDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_ma_up_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(btnUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnUpdateClear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btndeleteDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txt_update_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txt_ma_up_type, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txt_ma_up_price, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_main_type))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane3)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_main_price, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnClearDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_add_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_main_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_main_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDetails)
                    .addComponent(btnClearDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_add_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ma_up_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txt_ma_up_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txt_ma_up_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_update_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUpdateDetails)
                                    .addComponent(btnUpdateClear)
                                    .addComponent(btndeleteDetails))))
                        .addGap(9, 9, 9)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchTablesDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(cbx_search_details, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRefreshTableData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
        ViewManagerInterfaceDock mdock = new ViewManagerInterfaceDock();
        mdock.setVisible(true);
        mdock.pack();
        mdock.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDockActionPerformed

    private void btnMaintainceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainceActionPerformed

    }//GEN-LAST:event_btnMaintainceActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        ViewManagerInterfacePayment mip = new ViewManagerInterfacePayment();
        mip.setVisible(true);
        mip.pack();
        mip.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnLougoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLougoutActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to log out?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            ViewLogin loginpage = new ViewLogin();
            loginpage.setVisible(true);
            loginpage.pack();
            loginpage.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnLougoutActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ViewManagerInterfaceAddMaintaince miam = new ViewManagerInterfaceAddMaintaince();
        miam.setVisible(true);
        miam.pack();
        miam.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    public void getItems() {
        cbx_search_details.removeAllItems();
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ma_id FROM maintaince ");
            while (rs.next()) {
                String itemlist = rs.getString("ma_id");
                cbx_search_details.addItem(itemlist);
            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    public void showDataTable() {
        try {
            cbx_search_details.removeAllItems();
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM maintaince");
            DefaultTableModel tblModel = (DefaultTableModel) maintaince_table.getModel();
            tblModel.setRowCount(0);
            while (rst.next()) {
                String[] tbData = {rst.getString("ma_id"), String.valueOf(rst.getString("ma_type")), String.valueOf(rst.getString("ma_price")), rst.getString("ma_note")};
                tblModel.addRow(tbData);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private void btnRefreshTableDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableDataActionPerformed
        showDataTable();
        cbx_search_details.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_btnRefreshTableDataActionPerformed

    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed

        if (txt_main_type.getText() == null || txt_main_price.getText() == null || txt_main_note.getText() == null) {
            JOptionPane.showMessageDialog(this, "Please add all data.");
            txt_add_error.setText(null);
        } else {
            txt_add_error.setText(null);
            String type = txt_main_type.getText();
            Float price = Float.valueOf(txt_main_price.getText());
            String note = txt_main_note.getText();
            int insertdata = controller.insertData(type, price, note);
            if (insertdata == 1) {
                JOptionPane.showMessageDialog(this, type + " maintaince data added into the database.");
                txt_main_type.setText(null);
                txt_main_price.setText(null);
                txt_main_note.setText(null);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, The data not insert into database. Try again.");
            }
        }

        getItems();
    }//GEN-LAST:event_btnAddDetailsActionPerformed

    private void btnClearDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDetailsActionPerformed
        txt_add_error.setText(null);
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to clear the data?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            txt_main_type.setText(null);
            txt_main_price.setText(null);
            txt_main_note.setText(null);
        }

    }//GEN-LAST:event_btnClearDetailsActionPerformed

    private void btnSearchTablesDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTablesDetailsActionPerformed

        if (cbx_search_details.getSelectedItem() == null || cbx_search_details.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, select maintenance ID before click the search button.");
            cbx_search_details.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else {
            String search = cbx_search_details.getSelectedItem().toString();
            cbx_search_details.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            try {
                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";
                Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                Statement st = conn.createStatement();
                ResultSet rst = st.executeQuery("SELECT * FROM maintaince WHERE ma_id='" + search + "'");
                DefaultTableModel tblModel = (DefaultTableModel) maintaince_table.getModel();
                tblModel.setRowCount(0);
                while (rst.next()) {
                    String[] tbData = {rst.getString("ma_id"), String.valueOf(rst.getString("ma_type")), String.valueOf(rst.getString("ma_price")), rst.getString("ma_note")};
                    tblModel.addRow(tbData);
                }
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSearchTablesDetailsActionPerformed

    private void maintaince_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintaince_tableMouseClicked
        TableModel model = maintaince_table.getModel();
        int selectedRow = maintaince_table.getSelectedRow();

        if (selectedRow != -1) {
            Object value = model.getValueAt(selectedRow, 0);
            if (value != null) {
                txt_ma_up_id.setText(value.toString());
            }

            value = model.getValueAt(selectedRow, 1);
            if (value != null) {
                txt_ma_up_type.setText(value.toString());
            }

            value = model.getValueAt(selectedRow, 2);
            if (value != null) {
                txt_ma_up_price.setText(value.toString());
            }

            value = model.getValueAt(selectedRow, 3);
            if (value != null) {
                txt_ma_up_note.setText(value.toString());
            }
        }
    }//GEN-LAST:event_maintaince_tableMouseClicked

    private void btnUpdateClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateClearActionPerformed
        txt_update_error.setText(null);
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to clear the data?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            txt_ma_up_id.setText(null);
            txt_ma_up_type.setText(null);
            txt_ma_up_price.setText(null);
            txt_ma_up_note.setText(null);

        }

    }//GEN-LAST:event_btnUpdateClearActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        txt_add_error.setText(null);
        if (txt_ma_up_id.getText().isEmpty() || txt_ma_up_type.getText().isEmpty() || txt_ma_up_price.getText().isEmpty() || txt_ma_up_note.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please add all data.");
        } else {
            int id;
            try {
                id = Integer.parseInt(txt_ma_up_id.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid ID.");
                return; // Exit the method to prevent further execution
            }
            String type = txt_ma_up_type.getText();
            Float price;
            try {
                price = Float.valueOf(txt_ma_up_price.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid price. Please enter a valid point number.");
                return; // Exit the method to prevent further execution
            }
            String note = txt_ma_up_note.getText();
            int updatedata = controller.updateData(id, type, price, note);
            if (updatedata == 1) {
                JOptionPane.showMessageDialog(this, type + " maintenance data has been updated.");
                txt_ma_up_id.setText(null);
                txt_ma_up_type.setText(null);
                txt_ma_up_price.setText(null);
                txt_ma_up_note.setText(null);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, the data was not updated into the database. Please try again.");
            }
        }
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void btndeleteDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteDetailsActionPerformed
        txt_add_error.setText(null);
        if (txt_ma_up_id.getText().isEmpty() || txt_ma_up_type.getText().isEmpty() || txt_ma_up_price.getText().isEmpty() || txt_ma_up_note.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please add all data.");
        } else {
            int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to delete?", "conform", JOptionPane.YES_NO_OPTION);
            if (logout == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(txt_ma_up_id.getText());
                String type = txt_ma_up_type.getText();
                int deletedata = controller.deleteData(id);

                if (txt_ma_up_type.getText().equals("")) {

                } else {
                    if (deletedata == 1) {
                        JOptionPane.showMessageDialog(this, type + " maintaince data has been deleted.");
                        txt_ma_up_id.setText(null);
                        txt_ma_up_type.setText(null);
                        txt_ma_up_price.setText(null);
                        txt_ma_up_note.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(this, "Sorry, The data not deleted in the database. Try again.");
                    }
                }
            }
        }


    }//GEN-LAST:event_btndeleteDetailsActionPerformed

    private void cbx_search_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_search_detailsMouseClicked
        cbx_search_details.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        getItems();
    }//GEN-LAST:event_cbx_search_detailsMouseClicked

    private void txt_main_typeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_main_typeKeyTyped
        char c = evt.getKeyChar();
        txt_add_error.setText(null);
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
            txt_add_error.setText("Maintenance type Can't have any numbers.");
            txt_main_type.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_main_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_main_note.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_main_type.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_add_error.setText(null);
        }
    }//GEN-LAST:event_txt_main_typeKeyTyped

    private void txt_main_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_main_priceKeyTyped
        char c = evt.getKeyChar();
        txt_add_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_add_error.setText("Maintenance price Can't have any charachter.");
            txt_main_type.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_main_price.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_main_note.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_main_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_add_error.setText(null);
        }
    }//GEN-LAST:event_txt_main_priceKeyTyped

    private void txt_ma_up_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ma_up_idMouseClicked
        JOptionPane.showMessageDialog(this, "Sorry, Maintenance ID can't update.");
    }//GEN-LAST:event_txt_ma_up_idMouseClicked

    private void txt_ma_up_typeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ma_up_typeKeyTyped
        char c = evt.getKeyChar();
        txt_update_error.setText(null);
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
            txt_update_error.setText("Maintenance type Can't have any numbers.");
            txt_ma_up_type.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_ma_up_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_ma_up_note.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_ma_up_type.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_update_error.setText(null);
        }
    }//GEN-LAST:event_txt_ma_up_typeKeyTyped

    private void txt_ma_up_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ma_up_priceKeyTyped
        char c = evt.getKeyChar();
        txt_update_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_update_error.setText("Maintenance price Can't have any charachter.");
            txt_ma_up_type.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_ma_up_price.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_ma_up_note.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_ma_up_price.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_update_error.setText(null);
        }
    }//GEN-LAST:event_txt_ma_up_priceKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ViewManagerInterfaceMaintaince mim = new ViewManagerInterfaceMaintaince();
        mim.setVisible(true);
        mim.pack();
        mim.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JButton btnClearDetails;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLougout;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnRefreshTableData;
    private javax.swing.JButton btnSearchTablesDetails;
    private javax.swing.JButton btnUpdateClear;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btnYacht;
    private javax.swing.JButton btndeleteDetails;
    private javax.swing.JComboBox<String> cbx_search_details;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JTable maintaince_table;
    private javax.swing.JLabel txt_add_error;
    private javax.swing.JTextField txt_ma_up_id;
    private javax.swing.JTextArea txt_ma_up_note;
    private javax.swing.JTextField txt_ma_up_price;
    private javax.swing.JTextField txt_ma_up_type;
    private javax.swing.JTextArea txt_main_note;
    private javax.swing.JTextField txt_main_price;
    private javax.swing.JTextField txt_main_type;
    private javax.swing.JLabel txt_update_error;
    // End of variables declaration//GEN-END:variables
}
