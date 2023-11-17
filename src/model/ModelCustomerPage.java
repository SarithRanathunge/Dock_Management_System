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
public class ModelCustomerPage {
    public List<String> dbGetItem() {
        List<String> item = new ArrayList<>();

        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT cu_id FROM customer ");

            while (rs.next()) {
                String yaId = rs.getString("cu_id");
                item.add(yaId);
            }

            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return item;
    }
}
