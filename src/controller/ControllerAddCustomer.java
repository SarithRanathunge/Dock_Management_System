/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ModelAddCustomer;

/**
 *
 * @author Sarith
 */
public class ControllerAddCustomer {

    private ModelAddCustomer model;

    public ControllerAddCustomer()
    {
        model = new ModelAddCustomer();
    }
    
    public int insertData(String name,String dob,int age,String address,String gender,String email,int telephone,int mobile,String nic,String image)
    {
        int dbinsertdata = model.dbInserData(name, dob, age, address, gender, email, telephone, mobile, nic, image);
        return dbinsertdata;
    }
    
    public int UpdateData(String id,String name,String address,String gender,String email,int telephone,int mobile, String image)
    {
        int dbupdatedata = model.dbUpdateData(id, name, address, gender, email, telephone, mobile, image);
        return dbupdatedata;
    }
    
    public String findCustomerID(String nic)
    {
        String dbfindcustomerid = model.dbFindCustomerID(nic);
        return dbfindcustomerid;
    }
}
