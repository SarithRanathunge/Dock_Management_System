/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import veiw.ManagerInterfaceEmployee;
import javax.swing.JTable;

/**
 *
 * @author Sarith
 */
public class ModelEmployeePage {

    public int dbInsertData(String name, String dob, int age, String address, String position, String username, String password, String gender, String email, int telephone, int mobile, String nic) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO employee( emp_name, emp_dob, emp_age, emp_address, emp_type, emp_username, emp_password, emp_gender, emp_email, emp_telephone, emp_mobile, emp_NIC_no) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, dob);
            pst.setInt(3, age);
            pst.setString(4, address);
            pst.setString(5, position);
            pst.setString(6, username);
            pst.setString(7, password);
            pst.setString(8, gender);
            pst.setString(9, email);
            pst.setInt(10, telephone);
            pst.setInt(11, mobile);
            pst.setString(12, nic);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public int dbUpdateData(int id , String name, String address, String type, String username, String password, String gender, String email, int telephone, int mobile) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("UPDATE employee SET emp_name = ? , emp_address=? , emp_type=? , emp_username=? , emp_password=? , emp_gender=? , emp_email=? , emp_telephone=? ,emp_mobile=?  WHERE emp_id = ?");
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, type);
            pst.setString(4, username);
            pst.setString(5, password);
            pst.setString(6, gender);
            pst.setString(7, email);
            pst.setInt(8, telephone);
            pst.setInt(9, mobile);
            pst.setInt(10, id);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

}
