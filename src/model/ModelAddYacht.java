/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarith
 */
public class ModelAddYacht {

    public int dbInsertData(String mod, float width, float length, String speed, int year, String path2, String fuel_type, String fuel_capacity, String engine, int due_date, int start_date, float duration, int customer, String dock) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("INSERT INTO yacht(ya_model, ya_width, ya_length, ya_speed, ya_year, ya_image, ya_fuel_type, ya_fuel_capacity, ya_engine_no, ya_due_date, ya_start_date, ya_duration, ya_cu_id, ya_do_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement pst2 = conn.prepareStatement("UPDATE dock SET do_status ='Taken' WHERE do_id = ?");

            InputStream is = new FileInputStream(path2);

            pst.setString(1, mod);
            pst.setFloat(2, width);
            pst.setFloat(3, length);
            pst.setString(4, speed);
            pst.setInt(5, year);
            pst.setBlob(6, is);
            pst.setString(7, fuel_type);
            pst.setString(8, fuel_capacity);
            pst.setString(9, engine);
            pst.setInt(10, due_date);
            pst.setInt(11, start_date);
            pst.setFloat(12, duration);
            pst.setInt(13, customer);
            pst.setString(14, dock);
            pst2.setString(1, dock);

            int value = pst.executeUpdate();
            int value2 = pst2.executeUpdate();

            if (value == 1 && value2 == 1) {
                return 1;
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Image file not found: " + path2);
            System.out.println("Image file not found: " + path2);
        } catch (SQLException ey) {
            JOptionPane.showMessageDialog(null, ey.getMessage());
            System.out.println(ey.getMessage());
        }
//        catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//            System.out.println(ex.getMessage());
//        }

        return 0;

    }

    public int dbUpdateData(int id, String mod, float width, float length, String speed, int year, String fuel_type, String fuel_capacity, String engine, int due_date, int start_date, float duration, int customer, String dock) {
        try {
            String dblocation = "jdbc:mysql://localhost/eadproject";
            String dbuser = "root";
            String dbpassword = "";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("UPDATE yacht SET ya_model=?,ya_width=?,ya_length=?,ya_speed=?,ya_year=?,ya_fuel_type=?,ya_fuel_capacity=?,ya_engine_no=?,ya_due_date=?,ya_start_date=?,ya_duration=?,ya_cu_id=?,ya_do_id=? WHERE ya_id=?");

            

            pst.setString(1, mod);
            pst.setFloat(2, width);
            pst.setFloat(3, length);
            pst.setString(4, speed);
            pst.setInt(5, year);
            pst.setString(6, fuel_type);
            pst.setString(7, fuel_capacity);
            pst.setString(8, engine);
            pst.setInt(9, due_date);
            pst.setInt(10, start_date);
            pst.setFloat(11, duration);
            pst.setInt(12, customer);
            pst.setString(13, dock);
            pst.setInt(14, id);
            int value = pst.executeUpdate();

            if (value == 1) {
                return 1;
            }
        }  catch (SQLException ey) {
            JOptionPane.showMessageDialog(null, ey.getMessage());
            System.out.println(ey.getMessage());
        }
//        catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//            System.out.println(ex.getMessage());
//        }

        return 0;

    }

}
