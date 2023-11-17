/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import com.toedter.calendar.JDateChooser;
import controller.ControllerEmployeePage;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sarith
 */
public class ManagerInterfaceEmployee extends javax.swing.JFrame {

    private ControllerEmployeePage controller;

    public ManagerInterfaceEmployee() {
        initComponents();
        controller = new ControllerEmployeePage();
        getItems();
        date();
        showDataTable();
        btnEmployee.setBackground(Color.white);
        Font boldFont = new Font(btnEmployee.getFont().getFontName(), Font.BOLD, btnEmployee.getFont().getSize());
        btnEmployee.setFont(boldFont);
        //btnEmployee.setBorder(new EmptyBorder(0, 0, 0, 0));
        txt_emp_ID.setEnabled(false);
        txt_emp_ID.setDisabledTextColor(Color.black);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButton5 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_emp_position_error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_emp_fullname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_emp_age = new javax.swing.JTextField();
        rbtn_emp_male = new javax.swing.JRadioButton();
        rbtn_emp_female = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_emp_address = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_emp_nic = new javax.swing.JTextField();
        btnAddEmployeeDetails = new javax.swing.JButton();
        btnSearchEmployeeData = new javax.swing.JButton();
        btnUpdateEmployeeDetails = new javax.swing.JButton();
        btnClearEmployeeDetails = new javax.swing.JButton();
        dc_emp_dob = new com.toedter.calendar.JDateChooser();
        txt_emp_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_emp_telephone = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_emp_mobile = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbx_emp_id = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pwtxt_emp_password = new javax.swing.JPasswordField();
        txt_emp_username = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        employe_table = new javax.swing.JTable();
        btnResreshTableData = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_emp_position_error1 = new javax.swing.JLabel();
        cbx_emp_type1 = new javax.swing.JComboBox<>();
        txt_emp_ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Page");
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

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(240, 0, 1120, 55);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1120, 745));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Add , Update Employee Details");

        txt_emp_position_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error.setText("The Error");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Full Name      :");

        txt_emp_fullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Date of Birth  :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Age               :");

        txt_emp_age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_emp_age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_emp_ageMouseClicked(evt);
            }
        });
        txt_emp_age.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_emp_agePropertyChange(evt);
            }
        });

        buttonGroup1.add(rbtn_emp_male);
        rbtn_emp_male.setText("Male");
        rbtn_emp_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_emp_maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_emp_female);
        rbtn_emp_female.setText("Female");
        rbtn_emp_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_emp_femaleActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Gender          :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Address         :");

        txt_emp_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_emp_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_addressActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("NIC No.        :");

        txt_emp_nic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_emp_nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_nicActionPerformed(evt);
            }
        });

        btnAddEmployeeDetails.setBackground(new java.awt.Color(0, 204, 0));
        btnAddEmployeeDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddEmployeeDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployeeDetails.setText("Add");
        btnAddEmployeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeDetailsActionPerformed(evt);
            }
        });

        btnSearchEmployeeData.setBackground(new java.awt.Color(0, 102, 255));
        btnSearchEmployeeData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearchEmployeeData.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchEmployeeData.setText("Search");
        btnSearchEmployeeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeDataActionPerformed(evt);
            }
        });

        btnUpdateEmployeeDetails.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateEmployeeDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateEmployeeDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateEmployeeDetails.setText("Update");
        btnUpdateEmployeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeDetailsActionPerformed(evt);
            }
        });

        btnClearEmployeeDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearEmployeeDetails.setText("Clear");
        btnClearEmployeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEmployeeDetailsActionPerformed(evt);
            }
        });

        dc_emp_dob.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dc_emp_dobPropertyChange(evt);
            }
        });
        dc_emp_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dc_emp_dobKeyReleased(evt);
            }
        });

        txt_emp_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Email             :");

        txt_emp_telephone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Telephone     :");

        txt_emp_mobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Mobile          :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Type              :");

        cbx_emp_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Employee ID" }));
        cbx_emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_emp_idActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Username      :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Password      :");

        pwtxt_emp_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwtxt_emp_passwordActionPerformed(evt);
            }
        });

        txt_emp_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_emp_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emp_usernameActionPerformed(evt);
            }
        });

        employe_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "DOB", "Age", "Gender", "Type", "Address", "Username", "Password", "NIC", "Email", "Telephone", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        employe_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employe_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employe_table);

        btnResreshTableData.setBackground(new java.awt.Color(153, 153, 153));
        btnResreshTableData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnResreshTableData.setForeground(new java.awt.Color(255, 255, 255));
        btnResreshTableData.setText("Refresh");
        btnResreshTableData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResreshTableDataActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Employee ID  :");

        txt_emp_position_error1.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error1.setText("The Error");

        cbx_emp_type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Employee Type", "Manager", "Mechanic", "Security" }));
        cbx_emp_type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_emp_type1ActionPerformed(evt);
            }
        });

        txt_emp_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_emp_ID.setText("\n");
        txt_emp_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_emp_IDMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Employee ID  :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(btnAddEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnUpdateEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnClearEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txt_emp_nic))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_emp_email, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(33, 33, 33)
                                            .addComponent(rbtn_emp_male, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(rbtn_emp_female, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_emp_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pwtxt_emp_password))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_emp_username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dc_emp_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_emp_age, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbx_emp_type1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_emp_address, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_emp_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addGap(8, 8, 8)
                                            .addComponent(txt_emp_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_emp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_emp_position_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbx_emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(btnSearchEmployeeData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnResreshTableData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_emp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_emp_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dc_emp_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txt_emp_age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(rbtn_emp_male)
                            .addComponent(rbtn_emp_female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(cbx_emp_type1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_emp_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txt_emp_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(pwtxt_emp_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_emp_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_emp_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_emp_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txt_emp_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearEmployeeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnResreshTableData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearchEmployeeData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txt_emp_position_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cbx_emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
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

    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        ManagerInterfaceCustomer mic = new ManagerInterfaceCustomer();
        mic.setVisible(true);
        mic.pack();
        mic.setLocationRelativeTo(null);
        this.dispose();
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void rbtn_emp_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_emp_maleActionPerformed

    }//GEN-LAST:event_rbtn_emp_maleActionPerformed

    public void getItems() {
        cbx_emp_id.removeAllItems();
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT emp_id FROM employee ");
            while (rs.next()) {
                String itemlist = rs.getString("emp_id");
                cbx_emp_id.addItem(itemlist);

            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }
    private void btnSearchEmployeeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeDataActionPerformed
        String search = cbx_emp_id.getSelectedItem().toString();

        if (search.equals("") || search.equals("Select Employee ID")) {

        } else {
            try {
                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";
                Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                Statement st = conn.createStatement();
                ResultSet rst = st.executeQuery("SELECT * FROM employee WHERE emp_id='" + search + "'");
                DefaultTableModel tblModel = (DefaultTableModel) employe_table.getModel();
                tblModel.setRowCount(0);
                while (rst.next()) {
                    String[] tbData = {rst.getString("emp_id"), rst.getString("emp_name"), rst.getString("emp_dob"), rst.getString("emp_age"), rst.getString("emp_gender"), rst.getString("emp_type"), rst.getString("emp_address"), rst.getString("emp_username"), rst.getString("emp_password"), rst.getString("emp_NIC_no"), rst.getString("emp_email"), rst.getString("emp_telephone"), rst.getString("emp_mobile")};
                    tblModel.addRow(tbData);
                }
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnSearchEmployeeDataActionPerformed

    private void btnUpdateEmployeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeDetailsActionPerformed
        int id = Integer.parseInt(txt_emp_ID.getText());
        String name = txt_emp_fullname.getText();
        String dob;
        int age;
        String gender = null;
        if (rbtn_emp_male.isSelected() == true) {
            gender = "Male";
        } else if (rbtn_emp_female.isSelected() == true) {
            gender = "Female";
        }
        String position = cbx_emp_id.getSelectedItem().toString();
        
        String address = txt_emp_address.getText();
        String username = txt_emp_username.getText();
        String password = String.valueOf(pwtxt_emp_password.getPassword());
        String email = txt_emp_email.getText();
        int telephone = Integer.parseInt(txt_emp_telephone.getText());
        int mobile = Integer.parseInt(txt_emp_mobile.getText());
        int updateData = controller.updatetdata(id, name, address, position, username, password, gender, email, telephone, mobile);
        if (name.equals("")) {

        } else if (rbtn_emp_male.isSelected() == false && rbtn_emp_female.isSelected() == false) {

        } else {
            int logout = JOptionPane.showConfirmDialog(null, "Date of birth, age and NIC no. can not update, Because of the privacy issue.", "Conform", JOptionPane.YES_NO_OPTION);
            if (logout == JOptionPane.YES_OPTION) {
                if (updateData == 1) {
                    JOptionPane.showMessageDialog(this, name + " data has been updated..");
                    txt_emp_fullname.setText(null);
                    dc_emp_dob.setDate(null);
                    txt_emp_age.setText(null);
                    rbtn_emp_male.setSelected(false);
                    rbtn_emp_female.setSelected(false);
                    cbx_emp_id.setSelectedItem("Select Employee Type");
                    txt_emp_address.setText(null);
                    txt_emp_username.setText(null);
                    pwtxt_emp_password.setText(null);
                    txt_emp_email.setText(null);
                    txt_emp_telephone.setText(null);
                    txt_emp_mobile.setText(null);
                    txt_emp_nic.setText(null);
                    txt_emp_ID.setText(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Sorry, The data not updated. Try again.");
                }
            } else {
                txt_emp_fullname.setText(null);
                dc_emp_dob.setDate(null);
                txt_emp_age.setText(null);
                rbtn_emp_male.setSelected(false);
                rbtn_emp_female.setSelected(false);
                cbx_emp_id.setSelectedItem("Select Employee Type");
                txt_emp_address.setText(null);
                txt_emp_username.setText(null);
                pwtxt_emp_password.setText(null);
                txt_emp_email.setText(null);
                txt_emp_telephone.setText(null);
                txt_emp_mobile.setText(null);
                txt_emp_nic.setText(null);
                txt_emp_ID.setText(null);
            }
        }
    }//GEN-LAST:event_btnUpdateEmployeeDetailsActionPerformed

    private void btnClearEmployeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEmployeeDetailsActionPerformed
        txt_emp_fullname.setText(null);
        dc_emp_dob.setDate(null);
        txt_emp_age.setText(null);
        rbtn_emp_male.setSelected(false);
        rbtn_emp_female.setSelected(false);
        cbx_emp_id.setSelectedItem("Select Employee Type");
        txt_emp_address.setText(null);
        txt_emp_username.setText(null);
        pwtxt_emp_password.setText(null);
        txt_emp_nic.setText(null);
        txt_emp_email.setText(null);
        txt_emp_telephone.setText(null);
        txt_emp_mobile.setText(null);
        txt_emp_ID.setText(null);
    }//GEN-LAST:event_btnClearEmployeeDetailsActionPerformed

    private void txt_emp_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_addressActionPerformed

    private void txt_emp_nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_nicActionPerformed

    private void cbx_emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_emp_idActionPerformed

    private void txt_emp_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emp_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_usernameActionPerformed

    public void showDataTable() {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT * FROM employee");
            DefaultTableModel tblModel = (DefaultTableModel) employe_table.getModel();
            tblModel.setRowCount(0);
            while (rst.next()) {
                String[] tbData = {rst.getString("emp_id"), rst.getString("emp_name"), rst.getString("emp_dob"), rst.getString("emp_age"), rst.getString("emp_gender"), rst.getString("emp_type"), rst.getString("emp_address"), rst.getString("emp_username"), rst.getString("emp_password"), rst.getString("emp_NIC_no"), rst.getString("emp_email"), rst.getString("emp_telephone"), rst.getString("emp_mobile")};
                tblModel.addRow(tbData);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private void btnResreshTableDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResreshTableDataActionPerformed
        showDataTable();

    }//GEN-LAST:event_btnResreshTableDataActionPerformed

    private void pwtxt_emp_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwtxt_emp_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwtxt_emp_passwordActionPerformed

    private void rbtn_emp_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_emp_femaleActionPerformed

    }//GEN-LAST:event_rbtn_emp_femaleActionPerformed

    private void btnAddEmployeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeDetailsActionPerformed
        String name = txt_emp_fullname.getText();
        String dob = dc_emp_dob.getDate().toString();
        int age = Integer.parseInt(txt_emp_age.getText());
        String gender = null;
        if (rbtn_emp_male.isSelected() == true) {
            gender = "Male";
        } else if (rbtn_emp_female.isSelected() == true) {
            gender = "Female";
        }
        String type = (String)cbx_emp_id.getSelectedItem();
        String address = txt_emp_address.getText();
        String username = txt_emp_username.getText();
        String password = String.valueOf(pwtxt_emp_password.getPassword());
        String email = txt_emp_email.getText();
        int telephone = Integer.parseInt(txt_emp_telephone.getText());
        int mobile = Integer.parseInt(txt_emp_mobile.getText());
        String nic = txt_emp_nic.getText();
        int insertData = controller.insertdata(name, dob, age, address, type, username, password, gender, email, telephone, mobile, nic);

        if (name.equals("")) {

        } else if (rbtn_emp_male.isSelected() == false && rbtn_emp_female.isSelected() == false) {

        } else {
            if (insertData == 1) {
                JOptionPane.showMessageDialog(this, name + " data added into database.");
                txt_emp_fullname.setText(null);
                dc_emp_dob.setDate(null);
                txt_emp_age.setText(null);
                rbtn_emp_male.setSelected(false);
                rbtn_emp_female.setSelected(false);
                cbx_emp_id.setSelectedItem("Select Employee Type");
                txt_emp_address.setText(null);
                txt_emp_username.setText(null);
                pwtxt_emp_password.setText(null);
                txt_emp_email.setText(null);
                txt_emp_telephone.setText(null);
                txt_emp_mobile.setText(null);
                txt_emp_nic.setText(null);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, The data not insert into database. Try again.");
            }

        }
    }//GEN-LAST:event_btnAddEmployeeDetailsActionPerformed

    private void dc_emp_dobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dc_emp_dobKeyReleased

    }//GEN-LAST:event_dc_emp_dobKeyReleased

    private void txt_emp_ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emp_ageMouseClicked

    }//GEN-LAST:event_txt_emp_ageMouseClicked

    private void dc_emp_dobPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dc_emp_dobPropertyChange
        try {
            LocalDate currentDate = LocalDate.now();
            Date selectedDate = dc_emp_dob.getDate();

            if (selectedDate != null) {
                LocalDate dateOfBirth = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Period pe = Period.between(dateOfBirth, currentDate);
                int years = pe.getYears();
                txt_emp_age.setText(String.valueOf(years));
            } else {
                // Handle the case when no date is selected
                // Display an error message or take appropriate action
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_dc_emp_dobPropertyChange

    private void txt_emp_agePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_emp_agePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emp_agePropertyChange

    private void cbx_emp_type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_emp_type1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_emp_type1ActionPerformed

    private void employe_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employe_tableMouseClicked

        try {
            TableModel model = employe_table.getModel();
            int selectedRow = employe_table.getSelectedRow();

            if (selectedRow != -1) {
                Object value = model.getValueAt(selectedRow, 0);
                if (value != null) {
                    txt_emp_ID.setText(value.toString());
                }

                value = model.getValueAt(selectedRow, 1);
                if (value != null) {
                    txt_emp_fullname.setText(value.toString());
                }

//                value = model.getValueAt(selectedRow, 2);
//                if (value != null) {
//                    dc_emp_dob.setDate((Date) value);
//                }
//                value = model.getValueAt(selectedRow, 3);
//                if (value != null) {
//                    txt_emp_age.setText(value.toString());
//                }

                value = model.getValueAt(selectedRow, 4);
                if (value != null) {
                    if (value.equals("Male")) {
                        rbtn_emp_male.setSelected(true);
                    } else if (value.equals("Female")) {
                        rbtn_emp_female.setSelected(true);
                    }
                }

                value = model.getValueAt(selectedRow, 5);
                if (value != null) {
                    cbx_emp_type1.setSelectedItem(value.toString());
                }

                value = model.getValueAt(selectedRow, 6);
                if (value != null) {
                    txt_emp_address.setText(value.toString());
                }

                value = model.getValueAt(selectedRow, 7);
                if (value != null) {
                    txt_emp_username.setText(value.toString());
                }

                value = model.getValueAt(selectedRow, 8);
                if (value != null) {
                    pwtxt_emp_password.setText(value.toString());
                }

//                value = model.getValueAt(selectedRow, 9);
//                if (value != null) {
//                    txt_emp_nic.setText(value.toString());
//                }

                value = model.getValueAt(selectedRow, 10);
                if (value != null) {
                    txt_emp_email.setText(value.toString());
                }

                value = model.getValueAt(selectedRow, 11);
                if (value != null) {
                    txt_emp_telephone.setText(value.toString());
                }

                value = model.getValueAt(selectedRow, 12);
                if (value != null) {
                    txt_emp_mobile.setText(value.toString());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_employe_tableMouseClicked

    private void txt_emp_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_emp_IDMouseClicked
        JOptionPane.showMessageDialog(this, "Employee ID can not add or update to user.");
    }//GEN-LAST:event_txt_emp_IDMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ManagerInterfaceEmployee mie = new ManagerInterfaceEmployee();
        mie.setVisible(true);
        mie.pack();
        mie.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployeeDetails;
    private javax.swing.JButton btnClearEmployeeDetails;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnResreshTableData;
    private javax.swing.JButton btnSearchEmployeeData;
    private javax.swing.JButton btnUpdateEmployeeDetails;
    private javax.swing.JButton btnYacht;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_emp_id;
    private javax.swing.JComboBox<String> cbx_emp_type1;
    private com.toedter.calendar.JDateChooser dc_emp_dob;
    private javax.swing.JTable employe_table;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserPosition;
    private javax.swing.JPasswordField pwtxt_emp_password;
    private javax.swing.JRadioButton rbtn_emp_female;
    private javax.swing.JRadioButton rbtn_emp_male;
    private javax.swing.JTextField txt_emp_ID;
    private javax.swing.JTextField txt_emp_address;
    private javax.swing.JTextField txt_emp_age;
    private javax.swing.JTextField txt_emp_email;
    private javax.swing.JTextField txt_emp_fullname;
    private javax.swing.JTextField txt_emp_mobile;
    private javax.swing.JTextField txt_emp_nic;
    private javax.swing.JLabel txt_emp_position_error;
    private javax.swing.JLabel txt_emp_position_error1;
    private javax.swing.JTextField txt_emp_telephone;
    private javax.swing.JTextField txt_emp_username;
    // End of variables declaration//GEN-END:variables
}
