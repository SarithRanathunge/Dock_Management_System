/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarith
 */
public class ModelAddMaintaince {

    public List<String> dbGetYacht() {
        List<String> yachtIds = new ArrayList<>();

        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ya_id FROM yacht ");

            while (rs.next()) {
                String yaId = rs.getString("ya_id");
                yachtIds.add(yaId);
            }

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return yachtIds;
    }

    public List<String> dbGetMaintaince() {
        List<String> maintenanceItems = new ArrayList<>();

        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ma_type FROM maintaince ");

            while (rs.next()) {
                String item = rs.getString("ma_type");
                maintenanceItems.add(item);
            }

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return maintenanceItems;
    }

    public List<String> dbGetMechanic() {
        List<String> mechanic = new ArrayList<>();

        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT emp_name FROM employee WHERE emp_type='Mechanic' ");

            while (rs.next()) {
                String item = rs.getString("emp_name");
                mechanic.add(item);
            }

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return mechanic;
    }

    public int dbInsertData(String yacht, String maintaince_type, String mechanic, String date, String status) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO maintaince_yacht(my_yacht, my_maintaince_type, my_mechanic, my_date ,ma_status) VALUES (?,?,?,?,?)");
            pst.setString(1, yacht);
            pst.setString(2, maintaince_type);
            pst.setString(3, mechanic);
            pst.setString(4, date);
            pst.setString(5, status);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public int dbUpdateData(int id , String yacht, String maintaince_type, String mechanic, String status) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("UPDATE maintaince_yacht SET my_yacht=?,my_maintaince_type=?,my_mechanic=? ,ma_status=? WHERE  my_id=?");
            pst.setString(1, yacht);
            pst.setString(2, maintaince_type);
            pst.setString(3, mechanic);
            pst.setString(4, status);
            pst.setInt(5, id);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public int dbdeleteData(int no) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("DELETE FROM maintaince_yacht WHERE my_id=?");
            pst.setInt(1, no);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
