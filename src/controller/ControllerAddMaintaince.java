/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import model.ModelAddMaintaince;

/**
 *
 * @author Sarith
 */
public class ControllerAddMaintaince {
    private ModelAddMaintaince model;
    
    public ControllerAddMaintaince(){
     model = new ModelAddMaintaince();
    }
    
    public List<String> getYacht() {
        List<String> dbgetyacht= model.dbGetYacht();
        return dbgetyacht;
    }
    
    public List<String> getMaintenance() {
        List<String> maintenanceItems = model.dbGetMaintaince();
        return maintenanceItems;
    }
    
    public List<String> getMechanic() {
        List<String> mechanic = model.dbGetMechanic();
        return mechanic;
    }
    
    public int insertdata(String yacht, String maintaince_type, String mechanic, String date, String status)
    {
        int dbinsertdata = model.dbInsertData(yacht, maintaince_type, mechanic, date, date);
        return dbinsertdata;
    }
    
    public int updatetdata(int id , String yacht, String maintaince_type, String mechanic, String date, String status)
    {
        int dbupdatedata = model.dbUpdateData(id, yacht, maintaince_type, mechanic, date, status);
        return dbupdatedata;
    }
    
    public int deleteData(int no)
    {
        int dbupdatedata = model.dbdeleteData(no);
        return dbupdatedata;
    }
}
