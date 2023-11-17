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
public class ModelYachtPage {

    public List<String> dbGetItem() {
        List<String> itemList = new ArrayList<>();

        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT ya_id FROM yacht ");

            while (rs.next()) {
                String item = rs.getString("ya_id");
                itemList.add(item);
            }

            // Close resources
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return itemList;
    }
}
