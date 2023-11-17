/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
/**
 *
 * @author Sarith
 */
public class ModelMaintaincePage {
    public int dbInsertData(String type, Float price, String note)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO maintaince(ma_type, ma_price, ma_note) VALUES (?,?,?)");
            pst.setString(1, type);
            pst.setFloat(2, price);
            pst.setString(3, note);
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
    
    public int dbUpdateData(int id,String type, Float price, String note)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("UPDATE maintaince SET ma_type=?,`ma_price`=?,`ma_note`=? WHERE ma_id=?");
            pst.setString(1, type);
            pst.setFloat(2, price);
            pst.setString(3, note);
            pst.setInt(4, id);
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
    
    public int dbDeleteData(int id)
    {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("DELETE FROM maintaince WHERE ma_id=?");
            pst.setInt(1, id);
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
