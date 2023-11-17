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
public class ModelMechanicPage {
    
    public int dbUpdateData(int id , String status) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("UPDATE maintaince_yacht SET ma_status=? WHERE  my_id=?");
            pst.setString(1, status);
            pst.setInt(2, id);
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
