/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import java.sql.ResultSet;
/**
 *
 * @author Sarith
 */
public class ModelLoginPage {
    
    public String validateLogin(String username, String password, String position)
    {
        try{
            String dblocation ="jdbc:mysql://localhost/eadproject";
            String dbuser ="root";
            String dbpassword ="";
            Connection conn = DriverManager.getConnection(dblocation, dbuser, dbpassword);
            PreparedStatement pst = conn.prepareStatement("SELECT emp_type,emp_username,emp_password FROM employee WHERE emp_type = ? AND emp_username=? AND emp_password=?");
            pst.setString(1, position);
	    pst.setString(2, username);
            pst.setString(3, password);
	    ResultSet rst = pst.executeQuery();
        if(rst.next()){
                return rst.getString("emp_type");
            }else{
                return null;
        }
              
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
