/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarith
 */
public class ModelAddCustomer {

    public int dbInserData(String name, String dob, int age, String address, String gender, String email, int telephone, int mobile, String nic, String path2) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO customer(cu_name, cu_dob, cu_age, cu_gender, cu_NIC_copy, cu_address, cu_telephone, cu_mobile, cu_NIC_no, cu_email) VALUES (?,?,?,?,?,?,?,?,?,?)");
            InputStream is=new FileInputStream(new File(path2));
            pst.setString(1, name);
            pst.setString(2, dob);
            pst.setInt(3, age);
            pst.setString(4, gender);
            pst.setBlob(5,is );
            pst.setString(6, address);
            pst.setInt(7, telephone);
            pst.setInt(8, mobile);
            pst.setString(9, nic);
            pst.setString(10, email);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public int dbUpdateData(int id, String name, String address, String gender, String email, int telephone,int mobile, String path2) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            InputStream img = new FileInputStream(path2);
            PreparedStatement pst = conn.prepareStatement("UPDATE customer SET cu_name=?,cu_gender=?, cu_NIC_copy=?,cu_address=?,cu_telephone=?,cu_mobile=?,cu_email=? WHERE cu_id = ?");
            pst.setString(1, name);
            pst.setString(2, gender);
            pst.setBlob(3, img);
            pst.setString(4, address);
            pst.setInt(5, telephone);
            pst.setInt(6, mobile);
            pst.setString(7, email);
            pst.setInt(8, id);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public String dbFindCustomerID(String nic) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery("SELECT cu_id FROM customer WHERE cu_NIC_no='" + nic + "'");
            while (rst.next()) {
                String data = rst.getString("cu_id");
                return data;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
