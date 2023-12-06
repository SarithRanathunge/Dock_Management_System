/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import controller.ControllerAddCustomer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.ImageIcon;

/**
 *
 * @author Sarith
 */
public class ViewManagerInterfaceAddCustomer extends javax.swing.JFrame {

    private ControllerAddCustomer controller;
    String path2;

    public ViewManagerInterfaceAddCustomer() {
        initComponents();
        controller = new ControllerAddCustomer();
        date();
        //time();
        btnCustomer.setBackground(Color.white);
        Font boldFont = new Font(btnCustomer.getFont().getFontName(), Font.BOLD, btnCustomer.getFont().getSize());
        btnCustomer.setFont(boldFont);
        //btnCustomer.setBorder(new EmptyBorder(0, 0, 0, 0));
        txt_emp_position_error.setText(null);
        color();
    }

    public void color() {
        txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cbx_cu_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_find_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_find_cu_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public void date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String dd = sdf.format(d);
        lblDate.setText(dd);
    }

    public void getItems() {
        cbx_cu_id.removeAllItems();
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT cu_id FROM customer ");
            while (rs.next()) {
                String itemlist = rs.getString("cu_id");
                cbx_cu_id.addItem(itemlist);
            }
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

//    Timer t;
//    SimpleDateFormat st;
//
//    public void time() {
//
//        try {
//            t = new Timer(0, new ActionListener() {
//                public void actionPerformed(ActionListener e) {
//                    Date dt = new Date();
//                    st = new SimpleDateFormat("hh:mm:ss a");
//
//                    String tt = st.format(dt);
//                    lblTime.setText(tt);
//                }
//
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//                }
//
//            });
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
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
        jButton5 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_emp_position_error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cu_name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_cu_age = new javax.swing.JTextField();
        rbtn_cu_male = new javax.swing.JRadioButton();
        rbtn_cu_female = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_cu_address = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_cu_nic = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnAddDetails = new javax.swing.JButton();
        btnSearchDetails = new javax.swing.JButton();
        btnUpdateDetails = new javax.swing.JButton();
        btnAddCustomerImage = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_go_back = new javax.swing.JButton();
        btnClearDetails = new javax.swing.JButton();
        lbl_cu_image = new javax.swing.JLabel();
        dc_cu_dob = new com.toedter.calendar.JDateChooser();
        txt_cu_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_cu_telephone = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cbx_cu_id = new javax.swing.JComboBox<>();
        txt_cu_mobile = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_find_cu_nic = new javax.swing.JTextField();
        txt_find_cu_id = new javax.swing.JTextField();
        btnFindCustomerID = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Page > Add, Upadate, Delete Customer Details Page");
        setPreferredSize(new java.awt.Dimension(1360, 825));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1360, 830));
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel8.setText("Add , Update, Delete Customer Details");

        txt_emp_position_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error.setText("The Error");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Full Name             :");

        txt_cu_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cu_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cu_nameKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Date of Birth         :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Age                      :");

        txt_cu_age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cu_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cu_ageKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbtn_cu_male);
        rbtn_cu_male.setText("Male");
        rbtn_cu_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_cu_maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_cu_female);
        rbtn_cu_female.setText("Female");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Gender                 :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Address               :");

        txt_cu_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("NIC No.                :");

        txt_cu_nic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cu_nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cu_nicKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("NIC Copy            :");

        btnAddDetails.setBackground(new java.awt.Color(0, 204, 0));
        btnAddDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDetails.setText("Add");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        btnSearchDetails.setBackground(new java.awt.Color(0, 102, 255));
        btnSearchDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearchDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchDetails.setText("Search");
        btnSearchDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDetailsActionPerformed(evt);
            }
        });

        btnUpdateDetails.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDetails.setText("Update");
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        btnAddCustomerImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddCustomerImage.setForeground(new java.awt.Color(0, 204, 0));
        btnAddCustomerImage.setText("Add Image");
        btnAddCustomerImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerImageActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Customer ID       :");

        jLabel7.setText("Please, Select Customer ID if you want and Click the button saerch");

        btn_go_back.setBackground(new java.awt.Color(0, 153, 153));
        btn_go_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_go_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_go_back.setText("Go Back");
        btn_go_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_go_backActionPerformed(evt);
            }
        });

        btnClearDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearDetails.setText("Clear");
        btnClearDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDetailsActionPerformed(evt);
            }
        });

        lbl_cu_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dc_cu_dob.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dc_cu_dobPropertyChange(evt);
            }
        });

        txt_cu_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cu_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cu_emailKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Email Address      :");

        txt_cu_telephone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cu_telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cu_telephoneKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Telephone            :");

        cbx_cu_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbx_cu_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_cu_idMouseClicked(evt);
            }
        });

        txt_cu_mobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_cu_mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cu_mobileKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("mobile                 :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Customer NIC     :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Customer ID       :");

        txt_find_cu_nic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_find_cu_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFindCustomerID.setBackground(new java.awt.Color(153, 153, 153));
        btnFindCustomerID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFindCustomerID.setForeground(new java.awt.Color(255, 255, 255));
        btnFindCustomerID.setText("Find");
        btnFindCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCustomerIDActionPerformed(evt);
            }
        });

        jLabel11.setText("Please, Add CustomerNIC to find Specific  Customer ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                        .addGap(429, 429, 429))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbl_cu_image, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnAddCustomerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(156, 156, 156)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_cu_mobile))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel25))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_cu_telephone, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                        .addComponent(txt_cu_email))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cu_age, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dc_cu_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txt_find_cu_nic))
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(12, 12, 12)
                                                        .addComponent(cbx_cu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel7)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txt_find_cu_id)))
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btn_go_back, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(btnSearchDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(btnFindCustomerID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClearDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(203, 203, 203))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(33, 33, 33)
                                .addComponent(rbtn_cu_male, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(rbtn_cu_female, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_cu_address)
                                    .addComponent(txt_cu_nic, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                            .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_go_back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_cu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dc_cu_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(cbx_cu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txt_cu_age, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(rbtn_cu_male)
                            .addComponent(rbtn_cu_female))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_cu_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_cu_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cu_image, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCustomerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_cu_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txt_cu_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_find_cu_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_find_cu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnFindCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnAddDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnClearDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txt_cu_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        ViewManagerInterfaceEmployee mie = new ViewManagerInterfaceEmployee();
        mie.setVisible(true);
        mie.pack();
        mie.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void dc_cu_dobPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dc_cu_dobPropertyChange
        try {
            LocalDate currentDate = LocalDate.now();
            Date selectedDate = dc_cu_dob.getDate();

            if (selectedDate != null) {
                LocalDate dateOfBirth = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Period pe = Period.between(dateOfBirth, currentDate);
                int years = pe.getYears();
                txt_cu_age.setText(String.valueOf(years));
            } else {
                // Handle the case when no date is selected
                // Display an error message or take appropriate action
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_dc_cu_dobPropertyChange

    private void btnClearDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDetailsActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to clear the data?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            txt_cu_name.setText(null);
            dc_cu_dob.setDate(null);
            txt_cu_age.setText(null);
            rbtn_cu_male.setSelected(false);
            rbtn_cu_female.setSelected(false);
            txt_cu_address.setText(null);
            txt_cu_nic.setText(null);
            txt_cu_email.setText(null);
            txt_cu_telephone.setText(null);
            txt_cu_mobile.setText(null);
            lbl_cu_image.setIcon(null);
        }

    }//GEN-LAST:event_btnClearDetailsActionPerformed

    private void btn_go_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_go_backActionPerformed
        ViewManagerInterfaceCustomer mic = new ViewManagerInterfaceCustomer();
        mic.setVisible(true);
        mic.pack();
        mic.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btn_go_backActionPerformed

    private void btnAddCustomerImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerImageActionPerformed
        // TODO add your handling code here:

        //this codes is to used image retrival
        ImageIcon imageIcon;

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();
            imageIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
            lbl_cu_image.setIcon(imageIcon);
            path2 = imagePath;// this is the image path

        }
    }//GEN-LAST:event_btnAddCustomerImageActionPerformed

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        if (txt_cu_name.getText() == null || txt_cu_address.getText() == null || lbl_cu_image.getIcon() == null || txt_cu_email.getText() == null || txt_cu_telephone.getText() == null || txt_cu_mobile.getText() == null) {
            JOptionPane.showMessageDialog(this, "Please, add data al the required feilds");
        } else {
            int id = Integer.parseInt(cbx_cu_id.getSelectedItem().toString());
            String name = txt_cu_name.getText();
            String gender = null;
            if (rbtn_cu_male.isSelected() == true) {
                gender = "Male";
            } else if (rbtn_cu_female.isSelected() == true) {
                gender = "Female";
            }
            String address = txt_cu_address.getText();
            String email = txt_cu_email.getText();
            int telephone = Integer.parseInt(txt_cu_telephone.getText());
            int mobile = Integer.parseInt(txt_cu_mobile.getText());
            int updateData = 0;
            try {
                updateData = controller.UpdateData(id, name, address, gender, email, telephone, mobile, path2);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ViewManagerInterfaceAddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
            int logout = JOptionPane.showConfirmDialog(null, "Date of birth, age and NIC no. can not update, Because of the privacy issue.", "Conform", JOptionPane.YES_NO_OPTION);
            if (logout == JOptionPane.YES_OPTION) {
                if (updateData == 1) {
                    JOptionPane.showMessageDialog(this, name + " ,customer data has been updated.");
                    txt_cu_name.setText(null);
                    dc_cu_dob.setDate(null);
                    txt_cu_age.setText(null);
                    rbtn_cu_male.setSelected(false);
                    rbtn_cu_female.setSelected(false);
                    txt_cu_address.setText(null);
                    txt_cu_email.setText(null);
                    txt_cu_telephone.setText(null);
                    txt_cu_mobile.setText(null);
                    txt_cu_nic.setText(null);
                    lbl_cu_image.setIcon(null);
                } else {
                    JOptionPane.showMessageDialog(this, "Sorry, The data not updated. Try again.");
                }
            } else {
                txt_cu_name.setText(null);
                dc_cu_dob.setDate(null);
                txt_cu_age.setText(null);
                rbtn_cu_male.setSelected(false);
                rbtn_cu_female.setSelected(false);
                txt_cu_address.setText(null);
                txt_cu_email.setText(null);
                txt_cu_telephone.setText(null);
                txt_cu_mobile.setText(null);
                txt_cu_nic.setText(null);
                lbl_cu_image.setIcon(null);
            }

        }
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void btnSearchDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDetailsActionPerformed
        cbx_cu_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        if (cbx_cu_id.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please, select the customer ID before click search button.");
            cbx_cu_id.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        } else if (cbx_cu_id.getSelectedItem() != null) {
            String search = cbx_cu_id.getSelectedItem().toString();
            try {
                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";
                Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                Statement st = conn.createStatement();
                ResultSet rst = st.executeQuery("SELECT cu_name, cu_gender, cu_NIC_copy, cu_address, cu_telephone, cu_mobile, cu_email FROM customer WHERE cu_id='" + search + "'");
                while (rst.next()) {
                    txt_cu_name.setText(rst.getString("cu_name"));
                    if (rst.getString("cu_gender").equals("Male")) {
                        rbtn_cu_male.setSelected(true);
                    } else if (rst.getString("cu_gender").equals("Female")) {
                        rbtn_cu_female.setSelected(true);
                    }
                    txt_cu_address.setText(rst.getString("cu_address"));
                    txt_cu_telephone.setText(rst.getString("cu_telephone"));
                    txt_cu_mobile.setText(rst.getString("cu_mobile"));
                    txt_cu_email.setText(rst.getString("cu_email"));

                    Blob blob = rst.getBlob("cu_NIC_copy");
                    byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                    ImageIcon originalIcon = new ImageIcon(imageBytes);// Convert byte array to ImageIcon
                    // Scale the image to fit the JLabel (replace 300 and 200 with your desired width and height)
                    Image scaledImage = originalIcon.getImage().getScaledInstance(301, 200, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);
                    lbl_cu_image.setIcon(scaledIcon); // Set the scaled ImageIcon to the JLabel

//                SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd, yyyy");
//                Date date = dateFormat.parse(rst.getString("cu_dob"));
//
//                // Set the parsed Date object to the JDateChooser
//                dc_cu_dob.setDate(date);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btnSearchDetailsActionPerformed

    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed

        if (txt_cu_name.getText() == null || dc_cu_dob.getDate() == null || txt_cu_age.getText() == null || txt_cu_address.getText() == null || txt_cu_nic.getText() == null || lbl_cu_image.getIcon() == null || txt_cu_email.getText() == null || txt_cu_telephone.getText() == null || txt_cu_mobile.getText() == null) {
            JOptionPane.showMessageDialog(this, "Please, add data al the required feilds");
        } else {
            String name = txt_cu_name.getText();
            String dob = dc_cu_dob.getDate().toString();
            int age = Integer.parseInt(txt_cu_age.getText());
            String gender = null;
            if (rbtn_cu_male.isSelected() == true) {
                gender = "Male";
            } else if (rbtn_cu_female.isSelected() == true) {
                gender = "Female";
            }
            String address = txt_cu_address.getText();
            String email = txt_cu_email.getText();
            int telephone = Integer.parseInt(txt_cu_telephone.getText());
            int mobile = Integer.parseInt(txt_cu_mobile.getText());
            String nic = txt_cu_nic.getText();
            int insertData = controller.insertData(name, dob, age, address, gender, email, telephone, mobile, nic, path2);
            if (insertData == 1) {
                JOptionPane.showMessageDialog(this, name + " ,customer data added into database.");
                txt_cu_name.setText(null);
                dc_cu_dob.setDate(null);
                txt_cu_age.setText(null);
                rbtn_cu_male.setSelected(false);
                rbtn_cu_female.setSelected(false);
                txt_cu_address.setText(null);
                txt_cu_email.setText(null);
                txt_cu_telephone.setText(null);
                txt_cu_mobile.setText(null);
                txt_cu_nic.setText(null);
                lbl_cu_image.setIcon(null);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, The data not insert into database. Try again.");
            }

        }
    }//GEN-LAST:event_btnAddDetailsActionPerformed

    private void rbtn_cu_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_cu_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_cu_maleActionPerformed

    private void btnFindCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCustomerIDActionPerformed
        String nic = txt_find_cu_nic.getText();
        String findcustomerid = controller.findCustomerID(nic);
        if (findcustomerid != null) {
            txt_find_cu_id.setText(findcustomerid);
        } else {
            JOptionPane.showMessageDialog(this, "Please, try again.");
        }
    }//GEN-LAST:event_btnFindCustomerIDActionPerformed

    private void cbx_cu_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_cu_idMouseClicked
        getItems();
    }//GEN-LAST:event_cbx_cu_idMouseClicked

    private void txt_cu_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cu_nameKeyTyped

        char c = evt.getKeyChar();
        txt_emp_position_error.setText(null);
        if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
            evt.consume();
            txt_emp_position_error.setText("Customer name Can't have any numbers.");
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_emp_position_error.setText(null);
        }
    }//GEN-LAST:event_txt_cu_nameKeyTyped

    private void txt_cu_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cu_ageKeyTyped
        char c = evt.getKeyChar();
        txt_emp_position_error.setText(null);
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_emp_position_error.setText("Customer age Can't have any charachter.");
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_emp_position_error.setText(null);
        }
    }//GEN-LAST:event_txt_cu_ageKeyTyped

    private void txt_cu_nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cu_nicKeyTyped
        txt_emp_position_error.setText(null);
        if (txt_cu_nic.getText().length() <= 9) {
            txt_emp_position_error.setText("Customer NIC no. should have more than 9 characters.");
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_emp_position_error.setText(null);
        }
    }//GEN-LAST:event_txt_cu_nicKeyTyped

    private void txt_cu_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cu_emailKeyTyped
        String email = txt_cu_email.getText();

        // Regular expression pattern for basic email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (txt_cu_email.getText().isEmpty()) {
            txt_emp_position_error.setText("Please Enter an Email Address.");
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            return;
        } else {
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_emp_position_error.setText(null);
        }
    }//GEN-LAST:event_txt_cu_emailKeyTyped

    private void txt_cu_telephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cu_telephoneKeyTyped
        txt_emp_position_error.setText(null);
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_emp_position_error.setText("Customer telephone no. can't have any characters.");
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else if (txt_cu_telephone.getText().length() < 9 || txt_cu_telephone.getText().length() >= 10) {
            txt_emp_position_error.setText("Customer telephone no. should have more than 10 characters.");
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_emp_position_error.setText(null);
        }
    }//GEN-LAST:event_txt_cu_telephoneKeyTyped

    private void txt_cu_mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cu_mobileKeyTyped
        txt_emp_position_error.setText(null);
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
            txt_emp_position_error.setText("Customer mobile no. can't have any characters.");
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else if (txt_cu_mobile.getText().length() < 9 || txt_cu_mobile.getText().length() >= 10) {
            txt_emp_position_error.setText("Customer mobile no. should have more than 10 characters.");
            txt_cu_name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            dc_cu_dob.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_address.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_nic.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            lbl_cu_image.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_email.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            txt_cu_telephone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_cu_mobile.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_emp_position_error.setText(null);
        }
    }//GEN-LAST:event_txt_cu_mobileKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ViewManagerInterfaceAddCustomer miac = new ViewManagerInterfaceAddCustomer();
        miac.setVisible(true);
        miac.pack();
        miac.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomerImage;
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JButton btnClearDetails;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnFindCustomerID;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSearchDetails;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btnYacht;
    private javax.swing.JButton btn_go_back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_cu_id;
    private com.toedter.calendar.JDateChooser dc_cu_dob;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lbl_cu_image;
    private javax.swing.JRadioButton rbtn_cu_female;
    private javax.swing.JRadioButton rbtn_cu_male;
    private javax.swing.JTextField txt_cu_address;
    private javax.swing.JTextField txt_cu_age;
    private javax.swing.JTextField txt_cu_email;
    private javax.swing.JTextField txt_cu_mobile;
    private javax.swing.JTextField txt_cu_name;
    private javax.swing.JTextField txt_cu_nic;
    private javax.swing.JTextField txt_cu_telephone;
    private javax.swing.JLabel txt_emp_position_error;
    private javax.swing.JTextField txt_find_cu_id;
    private javax.swing.JTextField txt_find_cu_nic;
    // End of variables declaration//GEN-END:variables

}
