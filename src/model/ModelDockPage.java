/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sarith
 */
public class ModelDockPage {

    public int dbInsertData(String dockid, float docklength, float dockwidth, float dockprice, String dockstatus) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO dock(do_id,do_length,do_width,do_price,do_status) VALUES(?,?,?,?,?)");
            pst.setString(1, dockid);
            pst.setFloat(2, docklength);
            pst.setFloat(3, dockwidth);
            pst.setFloat(4, dockprice);
            pst.setString(5, dockstatus);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public int dbUpdateData(String dockid, float docklength, float dockwidth, float dockprice, String dockstatus)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("UPDATE dock SET do_length=?,do_width=?,do_price=?,do_status=? WHERE do_id=?");
            pst.setFloat(1, docklength);
            pst.setFloat(2, dockwidth);
            pst.setFloat(3, dockprice);
            pst.setString(4, dockstatus);
            pst.setString(5, dockid);
            int value = pst.executeUpdate();
            if (value == 1) {
                return value;
            }   
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public int dbDeleteData(String dockid)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("DELETE FROM dock WHERE do_id=?");
            pst.setString(1, dockid);
            int value = pst.executeUpdate();
            if (value == 1) {
                return value;
            }   
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    
    
    public int dbSearchDataStatus(String dockstatus)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("SELECT do_id, do_length, do_width, do_price, do_status FROM dock WHERE do_status=?");
            pst.setString(2, dockstatus);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
