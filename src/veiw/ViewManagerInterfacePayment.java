/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import controller.ControllerPaymentPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sarith
 */
public class ViewManagerInterfacePayment extends javax.swing.JFrame {

    private ControllerPaymentPage controller;

    public void getItems() {
        cbx_pa_cu_id.removeAllItems();
        cbx_pa_cu_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword)) {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT cu_id FROM customer ");
                while (rs.next()) {
                    String itemlist = rs.getString("cu_id");
                    cbx_pa_cu_id.addItem(itemlist);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    public void getCustomerID() {
        cbx_customer_id.removeAllItems();
        cbx_customer_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword)) {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT cu_id FROM customer ");
                while (rs.next()) {
                    String itemlist = rs.getString("cu_id");
                    cbx_customer_id.addItem(itemlist);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    public void getYachtID() {
        cbx_yacht_id.removeAllItems();
        try {
            Object selectedItem = cbx_customer_id.getSelectedItem();
            if (selectedItem != null) {
                cbx_customer_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                int customer = Integer.parseInt(selectedItem.toString());

                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";

                try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword)) {
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT ya_id FROM yacht WHERE ya_cu_id='" + customer + "'");

                    while (rs.next()) {
                        String itemlist = rs.getString("ya_id");
                        cbx_yacht_id.addItem(itemlist);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a customer ID before selecting a yacht ID");
                cbx_customer_id.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            }
        } catch (SQLException ex) {
            // Handle SQLException (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error executing SQL query: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            // Handle NumberFormatException (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error parsing customer ID: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void getYacht() {
        cbx_pa_ya_id.removeAllItems();
        cbx_pa_ya_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        try {
            Object selectedItem = cbx_pa_cu_id.getSelectedItem();
            if (selectedItem != null) {
                cbx_pa_cu_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                int customer = Integer.parseInt(selectedItem.toString());

                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";

                try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword)) {
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT ya_id FROM yacht WHERE ya_cu_id='" + customer + "'");

                    while (rs.next()) {
                        String itemlist = rs.getString("ya_id");
                        cbx_pa_ya_id.addItem(itemlist);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please, Select customer ID before selecting the yacht ID");
                cbx_pa_cu_id.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            }
        } catch (SQLException ex) {
            // Handle SQLException (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error executing SQL query: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            // Handle NumberFormatException (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error parsing customer ID: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public void getItems01() {
        cbx_cu_id_total.removeAllItems();
        cbx_cu_id_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword)) {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT cu_id FROM customer ");
                while (rs.next()) {
                    String itemlist = rs.getString("cu_id");
                    cbx_cu_id_total.addItem(itemlist);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }

    public void getYacht01() {
        cbx_ya_id_total.removeAllItems();
        try {
            Object selectedItem = cbx_cu_id_total.getSelectedItem();
            if (selectedItem != null) {
                int customer = Integer.parseInt(selectedItem.toString());
                cbx_cu_id_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";

                try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword)) {
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("SELECT ya_id FROM yacht WHERE ya_cu_id='" + customer + "'");

                    while (rs.next()) {
                        String itemlist = rs.getString("ya_id");
                        cbx_ya_id_total.addItem(itemlist);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please, Select customer ID before selecting the yacht ID");
                cbx_cu_id_total.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            }
        } catch (SQLException ex) {
            // Handle SQLException (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error executing SQL query: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            // Handle NumberFormatException (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error parsing customer ID: " + ex.getMessage());
        } catch (Exception ex) {
            // Handle other exceptions (log, display an error message, etc.)
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

    }

    public ViewManagerInterfacePayment() {
        initComponents();
        controller = new ControllerPaymentPage();
        date();
        btnPayment.setBackground(Color.white);
        Font boldFont = new Font(btnPayment.getFont().getFontName(), Font.BOLD, btnPayment.getFont().getSize());
        btnPayment.setFont(boldFont);
        //btnPayment.setBorder(new EmptyBorder(0, 0, 0, 0));
        color();
    }

    public void color() {
        cbx_pa_cu_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cbx_pa_ya_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_pa_duration.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_pa_mp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));

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
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAddYachtDetails = new javax.swing.JButton();
        cbx_pa_cu_id = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbx_pa_ya_id = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_pa_duration = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_pa_mp = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cbx_yacht_id = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_yacht_total_payment = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAddYachtDetails1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnClearDockPaymentDetails = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_total_payment = new javax.swing.JTextField();
        btnCalculateTotalAmount = new javax.swing.JButton();
        cbx_customer_id = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_yacht_payments = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_total_payments = new javax.swing.JTable();
        cbx_cu_id_total = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbx_ya_id_total = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbx_category_total = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnTotalPaymentReportDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment Page");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1375, 800));
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

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Log Out");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(918, Short.MAX_VALUE))
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
        jPanel3.setBounds(240, 0, 1140, 55);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1120, 745));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Add Dock Payments");

        btnAddYachtDetails.setBackground(new java.awt.Color(0, 204, 0));
        btnAddYachtDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddYachtDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddYachtDetails.setText("Add to bill");
        btnAddYachtDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddYachtDetailsActionPerformed(evt);
            }
        });

        cbx_pa_cu_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_pa_cu_idMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Customer ID      :");

        cbx_pa_ya_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_pa_ya_idMouseClicked(evt);
            }
        });
        cbx_pa_ya_id.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbx_pa_ya_idPropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Yacht ID            :");

        txt_pa_duration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_pa_duration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pa_durationMouseClicked(evt);
            }
        });
        txt_pa_duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pa_durationActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Duration         :");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Monthly Price :");

        txt_pa_mp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_pa_mp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pa_mpMouseClicked(evt);
            }
        });
        txt_pa_mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pa_mpActionPerformed(evt);
            }
        });
        txt_pa_mp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_pa_mpPropertyChange(evt);
            }
        });
        txt_pa_mp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pa_mpKeyTyped(evt);
            }
        });

        txt_total.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_totalMouseClicked(evt);
            }
        });
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Total Rental Amount (Rs.) :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Yacht ID  :");

        cbx_yacht_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_yacht_idMouseClicked(evt);
            }
        });
        cbx_yacht_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_yacht_idActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Add Yacht Payments");

        txt_yacht_total_payment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_yacht_total_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_yacht_total_paymentMouseClicked(evt);
            }
        });
        txt_yacht_total_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yacht_total_paymentActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Total Maintenancel Amount :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Total Payments");

        btnAddYachtDetails1.setBackground(new java.awt.Color(0, 204, 0));
        btnAddYachtDetails1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddYachtDetails1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddYachtDetails1.setText("Add to bill");
        btnAddYachtDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddYachtDetails1ActionPerformed(evt);
            }
        });

        btnClearDockPaymentDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClearDockPaymentDetails.setText("Clear");
        btnClearDockPaymentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDockPaymentDetailsActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Total bill Amount :");

        txt_total_payment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_total_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_total_paymentMouseClicked(evt);
            }
        });
        txt_total_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_paymentActionPerformed(evt);
            }
        });

        btnCalculateTotalAmount.setBackground(new java.awt.Color(0, 204, 0));
        btnCalculateTotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculateTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculateTotalAmount.setText("Calculate Total");
        btnCalculateTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateTotalAmountActionPerformed(evt);
            }
        });

        cbx_customer_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_customer_idMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Customer ID      :");

        tbl_yacht_payments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_yacht_payments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Maintenance ID", "Maintenance Type", "Maintenance Date", "Maintenance Price"
            }
        ));
        jScrollPane3.setViewportView(tbl_yacht_payments);

        tbl_total_payments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_total_payments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Yacht ID", "Payment Details", "Payment Price"
            }
        ));
        jScrollPane4.setViewportView(tbl_total_payments);

        cbx_cu_id_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_cu_id_totalMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Customer ID :");

        cbx_ya_id_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_ya_id_totalMouseClicked(evt);
            }
        });
        cbx_ya_id_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_ya_id_totalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Yacht ID  :");

        cbx_category_total.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category", "Dock", "Yacht Maintenance", "All" }));
        cbx_category_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbx_category_totalMouseClicked(evt);
            }
        });
        cbx_category_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_category_totalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Category :");

        btnTotalPaymentReportDetails.setBackground(new java.awt.Color(255, 0, 0));
        btnTotalPaymentReportDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTotalPaymentReportDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnTotalPaymentReportDetails.setText("Total Payment Report Details\n");
        btnTotalPaymentReportDetails.setToolTipText("");
        btnTotalPaymentReportDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPaymentReportDetailsActionPerformed(evt);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbx_pa_ya_id, 0, 255, Short.MAX_VALUE)
                            .addComponent(cbx_pa_cu_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_pa_duration))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_pa_mp)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_yacht_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_cu_id_total, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_ya_id_total, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbx_category_total, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnTotalPaymentReportDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(559, 559, 559)
                                    .addComponent(btnCalculateTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addGap(21, 21, 21)
                                    .addComponent(txt_total_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addGap(631, 631, 631)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_yacht_total_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnClearDockPaymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(btnAddYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnAddYachtDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddYachtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearDockPaymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cbx_pa_cu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(txt_pa_duration, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbx_pa_ya_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txt_pa_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cbx_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_yacht_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txt_yacht_total_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddYachtDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cbx_cu_id_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbx_ya_id_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cbx_category_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_total_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalculateTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnTotalPaymentReportDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(240, 55, 1140, 745);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        ViewManagerInterfaceAddMaintaince miam = new ViewManagerInterfaceAddMaintaince();
        miam.setVisible(true);
        miam.pack();
        miam.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMaintainceActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to log out?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            ViewLogin loginpage = new ViewLogin();
            loginpage.setVisible(true);
            loginpage.pack();
            loginpage.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnAddYachtDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddYachtDetailsActionPerformed

        if (cbx_pa_cu_id.getSelectedItem() == null || cbx_pa_ya_id.getSelectedItem() == null || txt_pa_mp.getText().isEmpty() || txt_pa_duration.getText().isEmpty() || txt_total.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please add data before adding to the bill.");
        } else {
            int customer = Integer.parseInt(cbx_pa_cu_id.getSelectedItem().toString());
            int yacht = Integer.parseInt(cbx_pa_ya_id.getSelectedItem().toString());
            float duration = Float.parseFloat(txt_pa_duration.getText());
            float price = Float.parseFloat(txt_pa_mp.getText());
            float total = Float.parseFloat(txt_total.getText());
            int insertData = controller.insertData(customer, yacht, duration, price, total);

            if (insertData == 1) {
                JOptionPane.showMessageDialog(this, "Dock payment added.");
                cbx_pa_cu_id.removeAllItems();
                cbx_pa_ya_id.removeAllItems();
                txt_pa_duration.setText(null);
                txt_pa_mp.setText(null);
                txt_total.setText(null);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, the data could not be inserted. Please try again.");
            }
        }
    }//GEN-LAST:event_btnAddYachtDetailsActionPerformed

    private void txt_pa_durationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pa_durationMouseClicked

        if (cbx_pa_cu_id.getSelectedItem() != null && cbx_pa_ya_id.getSelectedItem() != null) {
            cbx_pa_ya_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            int customer = Integer.parseInt(cbx_pa_cu_id.getSelectedItem().toString());
            String yacht = cbx_pa_ya_id.getSelectedItem().toString();
            try {
                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";

                try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword); PreparedStatement pst = conn.prepareStatement("SELECT ya_duration FROM yacht WHERE ya_cu_id=? AND ya_id=?")) {

                    pst.setInt(1, customer);
                    pst.setString(2, yacht);

                    try (ResultSet rs = pst.executeQuery()) {
                        while (rs.next()) {
                            String itemlist = rs.getString("ya_duration");
                            txt_pa_duration.setText(itemlist);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else if (cbx_pa_cu_id.getSelectedItem() == null || cbx_pa_ya_id.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please, select customer ID and Yacht ID before adding the duration.");
            cbx_pa_ya_id.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_txt_pa_durationMouseClicked

    private void txt_pa_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pa_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pa_durationActionPerformed

    private void txt_pa_mpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pa_mpMouseClicked
        if (cbx_pa_cu_id.getSelectedItem() != null && cbx_pa_ya_id.getSelectedItem() != null) {
            txt_pa_duration.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            int customer = Integer.parseInt(cbx_pa_cu_id.getSelectedItem().toString());
            String yacht = cbx_pa_ya_id.getSelectedItem().toString();
            try {
                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";

                try (Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword); PreparedStatement pst = conn.prepareStatement("SELECT dock.do_price FROM yacht JOIN dock ON dock.do_id=yacht.ya_do_id WHERE ya_cu_id=? AND ya_id=?")) {

                    pst.setInt(1, customer);
                    pst.setString(2, yacht);

                    try (ResultSet rs = pst.executeQuery()) {
                        while (rs.next()) {
                            String itemlist = rs.getString("dock.do_price");
                            txt_pa_mp.setText(itemlist);
                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else if (cbx_pa_cu_id.getSelectedItem() == null || cbx_pa_ya_id.getSelectedItem() == null || txt_pa_duration.getText() == null) {
            JOptionPane.showMessageDialog(this, "Please, select customer ID ,Yacht ID before and duration adding the monthly price.");
            txt_pa_duration.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_txt_pa_mpMouseClicked

    private void txt_pa_mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pa_mpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pa_mpActionPerformed

    private void txt_totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_totalMouseClicked
        if (cbx_pa_cu_id.getSelectedItem() != null && cbx_pa_ya_id.getSelectedItem() != null && txt_pa_mp.getText() != null && txt_pa_duration.getText() != null) {
            txt_pa_mp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            float duration = Float.parseFloat(txt_pa_duration.getText().toString());
            float price = Float.parseFloat(txt_pa_mp.getText().toString());

            float total_price = duration * price;

            txt_total.setText(String.valueOf(total_price));
        } else if (cbx_pa_cu_id.getSelectedItem() == null || cbx_pa_ya_id.getSelectedItem() == null || txt_pa_mp.getText() == null || txt_pa_duration.getText() == null) {
            JOptionPane.showMessageDialog(this, "Please, select customer ID ,Yacht ID before ,duration and monthly price Get the total amount .");
            txt_pa_mp.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }

    }//GEN-LAST:event_txt_totalMouseClicked

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_yacht_total_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_yacht_total_paymentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yacht_total_paymentMouseClicked

    private void txt_yacht_total_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yacht_total_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yacht_total_paymentActionPerformed

    private void btnAddYachtDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddYachtDetails1ActionPerformed

        if (txt_yacht_total_payment.getText() != null) {
            int customer = Integer.parseInt(cbx_customer_id.getSelectedItem().toString());
            int yacht=Integer.parseInt(cbx_yacht_id.getSelectedItem().toString());
            float total = Float.parseFloat(txt_yacht_total_payment.getText());

            int adddata = controller.addData(customer, yacht, total);
            if (adddata == 1) {
                JOptionPane.showMessageDialog(this, "Yacht maintenance payment added.");
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, The data Xnot added. Please, Try again.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please, select customer ID ,Yacht ID before ,calculate the tatal.");
            cbx_customer_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_yacht_id.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_btnAddYachtDetails1ActionPerformed

    private void btnClearDockPaymentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDockPaymentDetailsActionPerformed
        int logout = JOptionPane.showConfirmDialog(null, "Are you sure, you want to clear the data?", "conform", JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION) {
            cbx_pa_cu_id.removeAllItems();
            cbx_pa_ya_id.removeAllItems();
            txt_pa_duration.setText(null);
            txt_pa_mp.setText(null);
            txt_total.setText(null);
        }
    }//GEN-LAST:event_btnClearDockPaymentDetailsActionPerformed

    private void cbx_pa_cu_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_pa_cu_idMouseClicked
        getItems();
    }//GEN-LAST:event_cbx_pa_cu_idMouseClicked

    private void cbx_pa_ya_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_pa_ya_idMouseClicked
        getYacht();
    }//GEN-LAST:event_cbx_pa_ya_idMouseClicked

    private void cbx_yacht_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_yacht_idMouseClicked
        getYachtID();
    }//GEN-LAST:event_cbx_yacht_idMouseClicked

    private void cbx_pa_ya_idPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbx_pa_ya_idPropertyChange

    }//GEN-LAST:event_cbx_pa_ya_idPropertyChange

    private void txt_pa_mpPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_pa_mpPropertyChange

    }//GEN-LAST:event_txt_pa_mpPropertyChange

    private void txt_pa_mpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pa_mpKeyTyped

    }//GEN-LAST:event_txt_pa_mpKeyTyped

    private void txt_total_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_total_paymentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_paymentMouseClicked

    private void txt_total_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_paymentActionPerformed

    private void btnCalculateTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTotalAmountActionPerformed

        if (cbx_cu_id_total.getSelectedItem() != null && cbx_ya_id_total.getSelectedItem() != null && !cbx_category_total.getSelectedItem().equals("Select a category")) {
            cbx_cu_id_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_ya_id_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_category_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            if (cbx_category_total.getSelectedItem().equals("Dock")) {
                try {
                    int customer = Integer.parseInt(cbx_cu_id_total.getSelectedItem().toString());
                    int yacht = Integer.parseInt(cbx_ya_id_total.getSelectedItem().toString());
                    String dblocation = "jdbc:mysql://localhost/eadproject";
                    String dbuser = "root";
                    String dbpassword = "";
                    Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                    String query = "SELECT sum(pa_amount) as total_payment FROM payment JOIN customer ON payment.pa_cu_id=customer.cu_id WHERE payment.pa_cu_id=? AND payment.pa_ya_id=? AND payment.pa_details LIKE '%Duration%'";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setInt(1, customer);
                    stmt.setInt(2, yacht);
                    ResultSet rst = stmt.executeQuery();
                    while (rst.next()) {
                        txt_total_payment.setText(rst.getString("total_payment"));
                    }
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            } else if (cbx_category_total.getSelectedItem().equals("Yacht Maintenance")) {
                try {
                    int customer = Integer.parseInt(cbx_cu_id_total.getSelectedItem().toString());
                    int yacht = Integer.parseInt(cbx_ya_id_total.getSelectedItem().toString());
                    String dblocation = "jdbc:mysql://localhost/eadproject";
                    String dbuser = "root";
                    String dbpassword = "";
                    Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                    String query = "SELECT sum(pa_amount) as total_payment FROM payment JOIN customer ON payment.pa_cu_id=customer.cu_id WHERE payment.pa_cu_id=? AND payment.pa_ya_id=? AND payment.pa_details LIKE '%All%'";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setInt(1, customer);
                    stmt.setInt(2, yacht);
                    ResultSet rst = stmt.executeQuery();
                    while (rst.next()) {
                        txt_total_payment.setText(rst.getString("total_payment"));
                    }
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            } else if (cbx_category_total.getSelectedItem().equals("All")) {
                try {
                    int customer = Integer.parseInt(cbx_cu_id_total.getSelectedItem().toString());
                    int yacht = Integer.parseInt(cbx_ya_id_total.getSelectedItem().toString());
                    String dblocation = "jdbc:mysql://localhost/eadproject";
                    String dbuser = "root";
                    String dbpassword = "";
                    Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                    String query = "SELECT sum(pa_amount) as total_payment FROM payment JOIN customer ON payment.pa_cu_id=customer.cu_id WHERE payment.pa_cu_id=? AND payment.pa_ya_id=?";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setInt(1, customer);
                    stmt.setInt(2, yacht);
                    ResultSet rst = stmt.executeQuery();
                    while (rst.next()) {
                        txt_total_payment.setText(rst.getString("total_payment"));
                    }
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

        } else if (cbx_cu_id_total.getSelectedItem() != null || cbx_ya_id_total.getSelectedItem() != null || cbx_category_total.getSelectedItem().equals("Select a category")) {
            JOptionPane.showMessageDialog(this, "Please, select customer ID ,Yacht ID and category before ,calculate the total bill.");
            cbx_cu_id_total.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            cbx_ya_id_total.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            cbx_category_total.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }

    }//GEN-LAST:event_btnCalculateTotalAmountActionPerformed

    private void cbx_yacht_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_yacht_idActionPerformed

        try {
            Object selectedItem = cbx_yacht_id.getSelectedItem();
            if (selectedItem != null) {
                int yacht = Integer.parseInt(selectedItem.toString());
                String dblocation = "jdbc:mysql://localhost/eadproject";
                String dbuser = "root";
                String dbpassword = "";
                Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                String query = "SELECT maintaince_yacht.my_id, maintaince_yacht.my_maintaince_type, maintaince_yacht.my_date, maintaince.ma_price FROM maintaince_yacht JOIN maintaince ON maintaince_yacht.my_maintaince_type = maintaince.ma_type WHERE maintaince_yacht.my_yacht=?";
                String query1 = "SELECT SUM(maintaince.ma_price) AS total_price FROM maintaince_yacht JOIN maintaince ON maintaince_yacht.my_maintaince_type = maintaince.ma_type WHERE maintaince_yacht.my_yacht=?";
                PreparedStatement stmt = conn.prepareStatement(query);
                PreparedStatement stmt1 = conn.prepareStatement(query1);
                stmt.setInt(1, yacht);
                stmt1.setInt(1, yacht);
                ResultSet rst = stmt.executeQuery();
                ResultSet rst1 = stmt1.executeQuery();
                DefaultTableModel tblModel = (DefaultTableModel) tbl_yacht_payments.getModel();
                tblModel.setRowCount(0);
                while (rst.next()) {
                    String[] tbData = {rst.getString("maintaince_yacht.my_id"), rst.getString("maintaince_yacht.my_maintaince_type"), rst.getString("maintaince_yacht.my_date"), rst.getString("maintaince.ma_price")};
                    tblModel.addRow(tbData);
                }
                if (rst1.next()) {
                    txt_yacht_total_payment.setText(rst1.getString("total_price"));
                }
                conn.close();
            } else {
                // Handle the case when no item is selected
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_cbx_yacht_idActionPerformed

    private void cbx_customer_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_customer_idMouseClicked
        getCustomerID();
    }//GEN-LAST:event_cbx_customer_idMouseClicked

    private void cbx_cu_id_totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_cu_id_totalMouseClicked
        getItems01();
    }//GEN-LAST:event_cbx_cu_id_totalMouseClicked

    private void cbx_ya_id_totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_ya_id_totalMouseClicked
        getYacht01();
    }//GEN-LAST:event_cbx_ya_id_totalMouseClicked

    private void cbx_ya_id_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_ya_id_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_ya_id_totalActionPerformed

    private void cbx_category_totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbx_category_totalMouseClicked

    }//GEN-LAST:event_cbx_category_totalMouseClicked

    private void cbx_category_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_category_totalActionPerformed

        if (cbx_cu_id_total.getSelectedItem() != null && cbx_ya_id_total.getSelectedItem() != null && !cbx_category_total.getSelectedItem().equals("Select a category")) {
            cbx_cu_id_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            cbx_ya_id_total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            if (cbx_category_total.getSelectedItem().equals("Dock")) {
                try {
                    int customer = Integer.parseInt(cbx_cu_id_total.getSelectedItem().toString());
                    int yacht = Integer.parseInt(cbx_ya_id_total.getSelectedItem().toString());
                    String dblocation = "jdbc:mysql://localhost/eadproject";
                    String dbuser = "root";
                    String dbpassword = "";
                    Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                    String query = "SELECT customer.cu_name, payment.pa_ya_id, payment.pa_details, payment.pa_amount FROM payment JOIN customer ON payment.pa_cu_id=customer.cu_id WHERE payment.pa_cu_id=? AND payment.pa_ya_id=? AND payment.pa_details LIKE '%Duration%'";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setInt(1, customer);
                    stmt.setInt(2, yacht);
                    ResultSet rst = stmt.executeQuery();
                    DefaultTableModel tblModel = (DefaultTableModel) tbl_total_payments.getModel();
                    tblModel.setRowCount(0);
                    while (rst.next()) {
                        String[] tbData = {rst.getString("customer.cu_name"), rst.getString("payment.pa_ya_id"), rst.getString("payment.pa_details"), rst.getString("payment.pa_amount")};
                        tblModel.addRow(tbData);
                    }
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            } else if (cbx_category_total.getSelectedItem().equals("Yacht Maintenance")) {
                try {
                    int customer = Integer.parseInt(cbx_cu_id_total.getSelectedItem().toString());
                    int yacht = Integer.parseInt(cbx_ya_id_total.getSelectedItem().toString());
                    String dblocation = "jdbc:mysql://localhost/eadproject";
                    String dbuser = "root";
                    String dbpassword = "";
                    Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                    String query = "SELECT customer.cu_name, payment.pa_ya_id, payment.pa_details, payment.pa_amount FROM payment JOIN customer ON payment.pa_cu_id=customer.cu_id WHERE payment.pa_cu_id=? AND payment.pa_ya_id=? AND payment.pa_details LIKE '%All%'";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setInt(1, customer);
                    stmt.setInt(2, yacht);
                    ResultSet rst = stmt.executeQuery();
                    DefaultTableModel tblModel = (DefaultTableModel) tbl_total_payments.getModel();
                    tblModel.setRowCount(0);
                    while (rst.next()) {
                        String[] tbData = {rst.getString("customer.cu_name"), rst.getString("payment.pa_ya_id"), rst.getString("payment.pa_details"), rst.getString("payment.pa_amount")};
                        tblModel.addRow(tbData);
                    }
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            } else if (cbx_category_total.getSelectedItem().equals("All")) {
                try {
                    int customer = Integer.parseInt(cbx_cu_id_total.getSelectedItem().toString());
                    int yacht = Integer.parseInt(cbx_ya_id_total.getSelectedItem().toString());
                    String dblocation = "jdbc:mysql://localhost/eadproject";
                    String dbuser = "root";
                    String dbpassword = "";
                    Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
                    String query = "SELECT customer.cu_name, payment.pa_ya_id, payment.pa_details, payment.pa_amount FROM payment JOIN customer ON payment.pa_cu_id=customer.cu_id WHERE payment.pa_cu_id=? AND payment.pa_ya_id=?";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setInt(1, customer);
                    stmt.setInt(2, yacht);
                    ResultSet rst = stmt.executeQuery();
                    DefaultTableModel tblModel = (DefaultTableModel) tbl_total_payments.getModel();
                    tblModel.setRowCount(0);
                    while (rst.next()) {
                        String[] tbData = {rst.getString("customer.cu_name"), rst.getString("payment.pa_ya_id"), rst.getString("payment.pa_details"), rst.getString("payment.pa_amount")};
                        tblModel.addRow(tbData);
                    }
                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }

        } else if (cbx_cu_id_total.getSelectedItem() != null || cbx_ya_id_total.getSelectedItem() != null) {
            JOptionPane.showMessageDialog(this, "Please, select customer ID ,Yacht ID before ,get the table data.");
            cbx_cu_id_total.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            cbx_ya_id_total.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        }
    }//GEN-LAST:event_cbx_category_totalActionPerformed

    private void btnTotalPaymentReportDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPaymentReportDetailsActionPerformed
        try {
            JasperDesign jasperdesign1 = JRXmlLoader.load("C:\\Users\\Sarith\\Documents\\NetBeansProjects\\Dock(superyacht) Management System\\src\\veiw\\PaymentReport.jrxml");
            JRDesignQuery designquery = new JRDesignQuery();
            designquery.setText("SELECT customer.cu_name, customer.cu_NIC_no, customer.cu_email ,payment.pa_ya_id, payment.pa_details, payment.pa_amount , payment.pa_date , payment.pa_time FROM payment JOIN customer ON payment.pa_cu_id=customer.cu_id");
            jasperdesign1.setQuery(designquery);
            JasperReport jasperreport1 = JasperCompileManager.compileReport(jasperdesign1);
            String dbpath = "jdbc:mysql://localhost/eadproject";
            Connection conn = DriverManager.getConnection(dbpath, "root", "");
            JasperPrint print1 = JasperFillManager.fillReport(jasperreport1, null, conn);
            JasperViewer.viewReport(print1);

        } catch (SQLException | JRException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnTotalPaymentReportDetailsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ViewManagerInterfacePayment mip = new ViewManagerInterfacePayment();
        mip.setVisible(true);
        mip.pack();
        mip.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddYachtDetails;
    private javax.swing.JButton btnAddYachtDetails1;
    private javax.swing.JButton btnCalculateTotalAmount;
    private javax.swing.JButton btnClearDockPaymentDetails;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDock;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnMaintaince;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnTotalPaymentReportDetails;
    private javax.swing.JButton btnYacht;
    private javax.swing.JComboBox<String> cbx_category_total;
    private javax.swing.JComboBox<String> cbx_cu_id_total;
    private javax.swing.JComboBox<String> cbx_customer_id;
    private javax.swing.JComboBox<String> cbx_pa_cu_id;
    private javax.swing.JComboBox<String> cbx_pa_ya_id;
    private javax.swing.JComboBox<String> cbx_ya_id_total;
    private javax.swing.JComboBox<String> cbx_yacht_id;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JTable tbl_total_payments;
    private javax.swing.JTable tbl_yacht_payments;
    private javax.swing.JTextField txt_pa_duration;
    private javax.swing.JTextField txt_pa_mp;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_total_payment;
    private javax.swing.JTextField txt_yacht_total_payment;
    // End of variables declaration//GEN-END:variables
}
