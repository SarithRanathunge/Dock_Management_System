/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veiw;

import controller.ControllerLoginPage;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class ViewLogin extends javax.swing.JFrame {

    private ControllerLoginPage controller;

    public ViewLogin() {
        initComponents();
        controller = new ControllerLoginPage();
        txt_emp_position_error.setText(null);
        txt_username_error.setText(null);
        txt_password_error.setText(null);
        cbx_emp_position.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_username.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pwtxt_password.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbx_emp_position = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pwtxt_password = new javax.swing.JPasswordField();
        txt_password_error = new javax.swing.JLabel();
        txt_username_error = new javax.swing.JLabel();
        txt_emp_position_error = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setMinimumSize(new java.awt.Dimension(850, 630));
        setName("login"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarith\\Documents\\DCSD (NIBM)\\semester 2 stage 2\\EAD\\logo.png")); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("copyright ©  servicedock, All rigth reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel10)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 600);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 600));
        jPanel3.setMinimumSize(new java.awt.Dimension(450, 600));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 600));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("LOGIN");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Employee Position");

        cbx_emp_position.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbx_emp_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your position", "Manager", "Mechanic" }));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Username");

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usernameKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Password");

        pwtxt_password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pwtxt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwtxt_passwordKeyTyped(evt);
            }
        });

        txt_password_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_password_error.setText("The Error");

        txt_username_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_username_error.setText("The Error");

        txt_emp_position_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_emp_position_error.setText("The Error");

        btnLogin.setBackground(new java.awt.Color(0, 204, 204));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbx_emp_position, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(txt_username)
                                .addComponent(jLabel5)
                                .addComponent(pwtxt_password)
                                .addComponent(txt_password_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_username_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_emp_position, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_emp_position_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwtxt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 450, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (cbx_emp_position.getSelectedIndex() == 0 && txt_username.getText() == null && pwtxt_password.getPassword() == null) {
            JOptionPane.showMessageDialog(this, "Please, fill all the required fileds.");
        } else {
            String position = cbx_emp_position.getSelectedItem().toString();
            String username = txt_username.getText();
            String password = String.valueOf(pwtxt_password.getPassword());
            String usertype = controller.validateLogin(username, password, position);

            String capitalizedusername = username.substring(0, 1).toUpperCase() + username.substring(1);

            if (usertype != null) {
                if (usertype.equals("Manager") || usertype.equals("manager") || usertype.equals("Manager")) {
                    JOptionPane.showMessageDialog(this, capitalizedusername + " , Your Login Succuessfull.");
                    ViewManagerInterfaceEmployee mie = new ViewManagerInterfaceEmployee();
                    mie.setVisible(true);
                    mie.pack();
                    mie.setLocationRelativeTo(null);
                    this.dispose();
                } else if (usertype.equals("Mechanic") || usertype.equals("Mechanic") || usertype.equals("MECHENIC")) {
                    JOptionPane.showMessageDialog(this, capitalizedusername + " , Your Login Succuessfull.");
                    ViewMechanicInterface mi = new ViewMechanicInterface();
                    mi.setVisible(true);
                    mi.pack();
                    mi.setLocationRelativeTo(null);
                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(this, " Invalid username or password.");
            }
        }
    

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txt_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyTyped
        char c = evt.getKeyChar();
        txt_username_error.setText(null);
        txt_password_error.setText(null);
        if (!txt_username.getText().matches("^[a-z]+$")) {
            txt_username_error.setText("Invalid username.(Only simple letters)");
            cbx_emp_position.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_username.setBorder(BorderFactory.createLineBorder(Color.RED,2));
            pwtxt_password.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        } else {
            txt_username_error.setText(null);
            cbx_emp_position.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_username.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            pwtxt_password.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_txt_usernameKeyTyped

    private void pwtxt_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwtxt_passwordKeyTyped
        txt_password_error.setText(null);
        txt_username_error.setText(null);
        String password = new String(pwtxt_password.getPassword());
        if (password.length() <= 8) {
            txt_password_error.setText("Password should have a minimum of 8 characters");
            cbx_emp_position.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_username.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            pwtxt_password.setBorder(BorderFactory.createLineBorder(Color.RED,2));
        } else {
            txt_password_error.setText(null);
            cbx_emp_position.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            txt_username.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            pwtxt_password.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    }//GEN-LAST:event_pwtxt_passwordKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ViewLogin login_frame = new ViewLogin();
        login_frame.setVisible(true);
        login_frame.pack();
        login_frame.setLocationRelativeTo(null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cbx_emp_position;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pwtxt_password;
    private javax.swing.JLabel txt_emp_position_error;
    private javax.swing.JLabel txt_password_error;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel txt_username_error;
    // End of variables declaration//GEN-END:variables
}
