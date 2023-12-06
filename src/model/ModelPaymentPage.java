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
public class ModelPaymentPage {
    public int dbInsertData(int customer, int yacht, float duration, float price, float total) {
        try {
            String details = "Duration: "+ duration +" "+"\n"+"Monthly Price: Rs."+price;
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO payment(pa_ya_id, pa_cu_id, pa_details, pa_amount) VALUES (?,?,?,?)");
            pst.setInt(1, yacht);
            pst.setInt(2, customer);
            pst.setString(3, details);
            pst.setFloat(4, total);
            int value = pst.executeUpdate();
            if (value == 1) {
                return 1;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    public int dbAddData(int customer, int yacht, float total) {
        try {
            String details = "All the maintenance total price";
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO payment(pa_ya_id, pa_cu_id, pa_details, pa_amount) VALUES (?,?,?,?)");
            pst.setInt(1, yacht);
            pst.setInt(2, customer);
            pst.setString(3, details);
            pst.setFloat(4, total);
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
