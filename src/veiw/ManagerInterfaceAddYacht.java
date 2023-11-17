/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.ControllerAddYacht;

/**
 *
 * @author Sarith
 */
public class ManagerInterfaceAddYacht extends javax.swing.JFrame {

    private ControllerAddYacht controller;
    /**
     * Creates new form ManagerInterfaceAddYacht
     */
    String path2;

    public ManagerInterfaceAddYacht() {
        initComponents();
        controller = new ControllerAddYacht();
        date();
        getItems();
        getEngineNO();
        cleanDetails();
        cbx_ya_dockplace.removeAllItems();
        btnYacht.setBackground(Color.white);
        Font boldFont = new Font(btnYacht.getFont().getFontName(), Font.BOLD, btnYacht.getFont().getSize());
        btnYacht.setFont(boldFont);
        //btnYacht.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    public void date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String dd = sdf.format(d);
        lblDate.setText(dd);
    }

    public void getItems() {
        //cbx_ya_customer.removeAllItems();
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT cu_id FROM customer ");
            while (rs.next()) {
                String itemlist = rs.getString("cu_id");
                cbx_ya_customer.addItem(itemlist);

            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    public void getEngineNO() {
        cbx_search_ya_engine_no.removeAllItems();
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ya_engine_no FROM yacht ");
            while (rs.next()) {
                String itemlist = rs.getString("ya_engine_no");
                cbx_search_ya_engine_no.addItem(itemlist);
            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

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
        btnlogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUserPosition = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_emp_position_error = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_ya_model = new javax.swing.JTextField();
        txt_ya_width = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_ya_length = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_ya_speed = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_ya_fuel_type = new javax.swing.JTextField();
        txt_ya_fuel_capacity = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnAddYachtImage = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_ya_duration = new javax.swing.JTextField();
        btnClearYachtDetails = new javax.swing.JButton();
        btnUpdateYachtDetails = new javax.swing.JButton();
        btnSearchYachtDetails = new javax.swing.JButton();
        btnAddYachtDetails = new javax.swing.JButton();
        lbl_ya_registration_copy = new javax.swing.JLabel();
        yc_ya_year = new com.toedter.calendar.JYearChooser();
        yc_ya_start_date = new com.toedter.calendar.JYearChooser();
        yc_ya_due_date = new com.toedter.calendar.JYearChooser();
        cbx_ya_dockplace = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cbx_ya_customer = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txt_ya_engine_no = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbx_search_ya_engine_no = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_ya_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yacht Page > Add, Update Yacht Details Page");
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

        btnlogout.setBackground(new java.awt.Color(255, 0, 0));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("Log Out");
        btnlogout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
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
            .addComponent(btnlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel4.setPreferredSize(new java.awt.Dimension(1120, 745));

        txt_emp_position_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error.setText("The Error");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Add , Update Yacht Details");

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Go Back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Model              :");

        txt_ya_model.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_ya_width.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Width (m)        :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Length  (m)      :");

        txt_ya_length.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Speed(km/h)  :");

        txt_ya_speed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Year                :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Fuel Type         :");

        txt_ya_fuel_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_ya_fuel_capacity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Fual Capacity  :");

        btnAddYachtImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddYachtImage.setForeground(new java.awt.Color(0, 204, 0));
        btnAddYachtImage.setText("Add Image");
        btnAddYachtImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddYachtImageActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Registration Copy    :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Start Year       :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Due Year        :");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Duration         :");

        txt_ya_duration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ya_duration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ya_durationMouseClicked(evt);
            }
        });
        txt_ya_duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ya_durationActionPerformed(evt);
            }
        });

        btnClearYachtDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearYachtDetails.setText("Clear");
        btnClearYachtDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearYachtDetailsActionPerformed(evt);
            }
        });

        btnUpdateYachtDetails.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateYachtDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateYachtDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateYachtDetails.setText("Update");
        btnUpdateYachtDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateYachtDetailsActionPerformed(evt);
            }
        });

        btnSearchYachtDetails.setBackground(new java.awt.Color(0, 102, 255));
        btnSearchYachtDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearchYachtDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchYachtDetails.setText("Search");
        btnSearchYachtDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchYachtDetailsActionPerformed(evt);
            }
        });

        btnAddYachtDetails.setBackground(new java.awt.Color(0, 204, 0));
        btnAddYachtDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddYachtDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddYachtDetails.setText("Add");
        btnAddYachtDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddYachtDetailsActionPerformed(evt);
            }
        });

        lbl_ya_registration_copy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbx_ya_dockplace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_ya_dockplaceMouseClicked(evt);
            }
        });
        cbx_ya_dockplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ya_dockplaceActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Dock Place      :");

        cbx_ya_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_ya_customerMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Customer ID  :");

        txt_ya_engine_no.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Engine No.      :");

        cbx_search_ya_engine_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Engine No.          :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Yacht ID             :");

        txt_ya_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_emp_position_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_ya_fuel_type, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(yc_ya_due_date, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(yc_ya_start_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_ya_fuel_capacity))))
                                    .addGap(5, 5, 5))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(yc_ya_year, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_ya_length))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_ya_width))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_ya_model, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_ya_speed, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_ya_duration)
                                        .addComponent(cbx_ya_dockplace, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbx_ya_customer, 0, 308, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ya_engine_no, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnClearYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnAddYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUpdateYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_ya_registration_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbx_search_ya_engine_no, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_ya_id, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddYachtImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearchYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jSeparator1)))))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_ya_model, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_ya_width, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_ya_length, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_ya_speed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_ya_fuel_capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(yc_ya_year, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_ya_fuel_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yc_ya_start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jLabel15)
                    .addComponent(lbl_ya_registration_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddYachtImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yc_ya_due_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txt_ya_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_ya_dockplace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_ya_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_ya_engine_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(cbx_search_ya_engine_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(btnSearchYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_ya_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
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
        ManagerInterfaceCustomer mic = new ManagerInterfaceCustomer();
        mic.setVisible(true);
        mic.pack();
        mic.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnYachtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYachtActionPerformed

    }//GEN-LAST:event_btnYachtActionPerformed

    private void btnDockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDockActionPerformed
        ManagerInterfaceDock mdock = new ManagerInterfaceDock();
        mdock.setVisible(true);
        mdock.pack();
        mdock.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDockActionPerformed

    private void btnMaintainceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainceActionPerformed
        ManagerInterfaceAddMaintaince miam = new ManagerInterfaceAddMaintaince();
        miam.setVisible(true);
        miam.pack();
        miam.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMaintainceActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        ManagerInterfacePayment mip = new ManagerInterfacePayment();
        mip.setVisible(true);
        mip.pack();
        mip.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to log out?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            Login loginpage = new Login();
            loginpage.setVisible(true);
            loginpage.pack();
            loginpage.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ManagerInterfaceYacht miy = new ManagerInterfaceYacht();
        miy.setVisible(true);
        miy.pack();
        miy.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jButton11ActionPerformed

    private void btnAddYachtImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddYachtImageActionPerformed
        ImageIcon imageIcon;

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();
            imageIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
            lbl_ya_registration_copy.setIcon(imageIcon);
            path2 = imagePath;
        }


    }//GEN-LAST:event_btnAddYachtImageActionPerformed

    public void cleanDetails() {
        cbx_ya_dockplace.removeAllItems();
        lbl_ya_registration_copy.setIcon(null);
        txt_ya_model.setText(null);
        txt_ya_fuel_capacity.setText(null);
        txt_ya_length.setText(null);
        txt_ya_width.setText(null);
        txt_ya_fuel_type.setText(null);
        txt_ya_speed.setText(null);
        cbx_ya_dockplace.removeAllItems();
        txt_ya_duration.setText(null);
        txt_ya_engine_no.setText(null);
        lbl_ya_registration_copy.setIcon(null);
        yc_ya_start_date.setYear(0);
        yc_ya_due_date.setYear(0);
        yc_ya_year.setYear(0);
    }
    private void btnClearYachtDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearYachtDetailsActionPerformed
        cleanDetails();
    }//GEN-LAST:event_btnClearYachtDetailsActionPerformed

    private void btnUpdateYachtDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateYachtDetailsActionPerformed

        String model = txt_ya_model.getText();
        Float width = Float.valueOf(txt_ya_width.getText());
        Float length = Float.valueOf(txt_ya_length.getText());
        String speed = txt_ya_speed.getText();
        int year = yc_ya_year.getYear();
        String fuel_type = txt_ya_fuel_type.getText();
        String fuel_capacity = txt_ya_fuel_capacity.getText();
        int start_year = yc_ya_start_date.getYear();
        int due_date = yc_ya_due_date.getYear();
        String duration = txt_ya_duration.getText();
        String dock = cbx_ya_dockplace.getSelectedItem() != null ? cbx_ya_dockplace.getSelectedItem().toString() : "";
        String customer = cbx_ya_customer.getSelectedItem().toString();
        String engine = txt_ya_engine_no.getText();
        int id = Integer.parseInt(txt_ya_id.getText());
        int updateData = controller.updateData(id, model, width, length, speed, year, path2, fuel_type, fuel_capacity, engine, fuel_type, fuel_type, duration, customer, dock);
        if (model.equals("")) {

        } else if (txt_ya_width.getText().equals("")) {

        } else if (txt_ya_length.getText().equals("")) {

        } else if (speed.equals("")) {

        } else if (fuel_type.equals("")) {

        } else if (fuel_capacity.equals("")) {

        } else if (duration.equals("")) {

        } else if (dock.equals("")) {

        } else if (customer.equals("")) {

        } else if (engine.equals("")) {

        } else {
            if (updateData == 1) {
                JOptionPane.showMessageDialog(this, " Yacht data has been updated.");
                cbx_ya_dockplace.removeAllItems();
                lbl_ya_registration_copy.setIcon(null);
                txt_ya_model.setText(null);
                txt_ya_fuel_capacity.setText(null);
                txt_ya_length.setText(null);
                txt_ya_width.setText(null);
                txt_ya_fuel_type.setText(null);
                txt_ya_speed.setText(null);
                cbx_ya_dockplace.removeAllItems();
                txt_ya_duration.setText(null);
                txt_ya_engine_no.setText(null);
                lbl_ya_registration_copy.setIcon(null);
                yc_ya_start_date.setYear(0);
                yc_ya_due_date.setYear(0);
                yc_ya_year.setYear(0);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, The data not updated into the database. Try again.");
            }

        }
    }//GEN-LAST:event_btnUpdateYachtDetailsActionPerformed

    private void btnSearchYachtDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchYachtDetailsActionPerformed
        String search = cbx_search_ya_engine_no.getSelectedItem().toString();
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT ya_id, ya_model, ya_width, ya_length, ya_speed, ya_year, ya_image, ya_fuel_type, ya_fuel_capacity, ya_engine_no, ya_due_date, ya_start_date, ya_duration, ya_cu_id, ya_do_id FROM yacht WHERE ya_engine_no='" + search + "'");
            while (rst.next()) {
                txt_ya_id.setText(rst.getString("ya_id"));
                txt_ya_model.setText(rst.getString("ya_model"));
                txt_ya_width.setText(rst.getString("ya_width"));
                txt_ya_length.setText(rst.getString("ya_length"));
                txt_ya_speed.setText(rst.getString("ya_speed"));
                yc_ya_year.setYear(rst.getInt("ya_year"));
                txt_ya_fuel_type.setText(rst.getString("ya_fuel_type"));
                txt_ya_fuel_capacity.setText(rst.getString("ya_fuel_capacity"));
                txt_ya_engine_no.setText(rst.getString("ya_engine_no"));
                yc_ya_start_date.setYear(rst.getInt("ya_start_date"));
                yc_ya_due_date.setYear(rst.getInt("ya_due_date"));
                txt_ya_duration.setText(rst.getString("ya_duration"));
                cbx_ya_customer.addItem(rst.getString("ya_cu_id"));
                cbx_ya_dockplace.addItem(rst.getString("ya_do_id"));

                Blob blob = rst.getBlob("ya_image");
                byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                ImageIcon originalIcon = new ImageIcon(imageBytes);// Convert byte array to ImageIcon
                // Scale the image to fit the JLabel (replace 300 and 200 with your desired width and height)
                Image scaledImage = originalIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);
                lbl_ya_registration_copy.setIcon(scaledIcon); // Set the scaled ImageIcon to the JLabel
                yc_ya_start_date.setYear(rst.getInt("ya_start_date"));
//                SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd, yyyy");
//                Date date = dateFormat.parse(rst.getString("cu_dob"));
//
//                // Set the parsed Date object to the JDateChooser
//                dc_cu_dob.setDate(date);
                //cbx_ya_dockplace.setSelectedItem(rst.getString("ya_do_id"));

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnSearchYachtDetailsActionPerformed

    private void cbx_ya_dockplaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_ya_dockplaceMouseClicked
        cbx_ya_dockplace.removeAllItems();
        String yachtWidthText = txt_ya_width.getText();
        String yachtLengthText = txt_ya_length.getText();

        if (!yachtLengthText.isEmpty() && !yachtWidthText.isEmpty()) {
            try {
                Float yacht_width = Float.valueOf(yachtWidthText);
                Float yacht_length = Float.valueOf(yachtLengthText);

                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";
                Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                Statement st = conn.createStatement();
                ResultSet rst = st.executeQuery("SELECT do_id FROM dock WHERE do_status ='Available' AND do_length>'" + yacht_length + "' AND do_width>'" + yacht_width + "'");
                while (rst.next()) {
                    String itemlist = rst.getString("do_id");
                    cbx_ya_dockplace.addItem(itemlist);
                }
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                System.err.println(e.getMessage());
            }
        } else if (yachtLengthText.isEmpty() && yachtWidthText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please, add yacht length and width before select the dock place.");
        }

    }//GEN-LAST:event_cbx_ya_dockplaceMouseClicked

    private void cbx_ya_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_ya_customerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_ya_customerMouseClicked

    private void txt_ya_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ya_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ya_durationActionPerformed

    private void cbx_ya_dockplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ya_dockplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_ya_dockplaceActionPerformed

    private void btnAddYachtDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddYachtDetailsActionPerformed
        String model = txt_ya_model.getText();
        Float width = Float.valueOf(txt_ya_width.getText());
        Float length = Float.valueOf(txt_ya_length.getText());
        String speed = txt_ya_speed.getText();
        int year = yc_ya_year.getYear();
        String fuel_type = txt_ya_fuel_type.getText();
        String fuel_capacity = txt_ya_fuel_capacity.getText();
        int start_year = yc_ya_start_date.getYear();
        int due_Year = yc_ya_due_date.getYear();
        String duration = txt_ya_duration.getText();
        String dock = cbx_ya_dockplace.getSelectedItem().toString();
        String customer = cbx_ya_customer.getSelectedItem().toString();
        String engine = txt_ya_engine_no.getText();
        int ddinsertData = controller.insertData(model, width, length, speed, year, path2, fuel_type, fuel_capacity, engine, due_Year, start_year, duration, customer, dock);
        if (model.equals("")) {

        } else if (txt_ya_width.getText().equals("")) {

        } else if (txt_ya_length.getText().equals("")) {

        } else if (speed.equals("")) {

        } else if (fuel_type.equals("")) {

        } else if (fuel_capacity.equals("")) {

        } else if (duration.equals("")) {

        } else if (dock.equals("")) {

        } else if (customer.equals("")) {

        } else if (engine.equals("")) {

        } else {
            if (ddinsertData == 1) {
                JOptionPane.showMessageDialog(this, " Yacht data added into database.");
                cbx_ya_dockplace.removeAllItems();
                lbl_ya_registration_copy.setIcon(null);
                txt_ya_model.setText(null);
                txt_ya_fuel_capacity.setText(null);
                txt_ya_length.setText(null);
                txt_ya_width.setText(null);
                txt_ya_fuel_type.setText(null);
                txt_ya_speed.setText(null);
                cbx_ya_dockplace.removeAllItems();
                txt_ya_duration.setText(null);
                txt_ya_engine_no.setText(null);
                lbl_ya_registration_copy.setIcon(null);
                yc_ya_start_date.setYear(0);
                yc_ya_due_date.setYear(0);
                yc_ya_year.setYear(0);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, The data not insert into database. Try again.");
            }

        }
    }//GEN-LAST:event_btnAddYachtDetailsActionPerformed

    private void txt_ya_durationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ya_durationMouseClicked
        int start = yc_ya_start_date.getYear();
        int due = yc_ya_due_date.getYear();
        
        int calculation = due - start;
        
        txt_ya_duration.setText(String.valueOf(calculation));
    }//GEN-LAST:event_txt_ya_durationMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ManagerInterfaceAddYacht miay = new ManagerInterfaceAddYacht();
        miay.setVisible(true);
        miay.pack();
        miay.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddYachtDetails;
    private javax.swing.JButton btnAddYachtImage;
    private javax.swing.JButton btnClearYachtDetails;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSearchYachtDetails;
    private javax.swing.JButton btnUpdateYachtDetails;
    private javax.swing.JButton btnYacht;
    private javax.swing.JButton btnlogout;
    private javax.swing.JComboBox<String> cbx_search_ya_engine_no;
    private javax.swing.JComboBox<String> cbx_ya_customer;
    private javax.swing.JComboBox<String> cbx_ya_dockplace;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserPosition;
    private javax.swing.JLabel lbl_ya_registration_copy;
    private javax.swing.JLabel txt_emp_position_error;
    private javax.swing.JTextField txt_ya_duration;
    private javax.swing.JTextField txt_ya_engine_no;
    private javax.swing.JTextField txt_ya_fuel_capacity;
    private javax.swing.JTextField txt_ya_fuel_type;
    private javax.swing.JTextField txt_ya_id;
    private javax.swing.JTextField txt_ya_length;
    private javax.swing.JTextField txt_ya_model;
    private javax.swing.JTextField txt_ya_speed;
    private javax.swing.JTextField txt_ya_width;
    private com.toedter.calendar.JYearChooser yc_ya_due_date;
    private com.toedter.calendar.JYearChooser yc_ya_start_date;
    private com.toedter.calendar.JYearChooser yc_ya_year;
    // End of variables declaration//GEN-END:variables
}
