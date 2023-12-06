/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.ModelEmployeePage;


public class ControllerEmployeePage {
    private ModelEmployeePage model;
    
    public ControllerEmployeePage()
    {
        model = new ModelEmployeePage();
    }
    
    public int insertdata(String name, String dob, int age, String address, String position, String username, String password, String gender, String email, long telephone, long mobile, String nic)
    {
        int dbinsertdata = model.dbInsertData(name, dob, age, address, position, username, password, gender, email, telephone, mobile, nic);
        return dbinsertdata;
    }
    
    public int updatetdata(int id,String name, String address, String type, String username, String password, String gender, String email, long telephone, long mobile)
    {
        int dbupdatedata = model.dbUpdateData( id , name, address, type, username, password, gender, email, telephone, mobile);
        return dbupdatedata;
    }

    public int insertdata(String name, String dob, int age, String address, String position, String username, String password, String gender, String email, long telephone, long mobile, int age0, String nic) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
