/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.ModelMaintaincePage;
/**
 *
 * @author Sarith
 */
public class ControllerMaintaincePage {
    private ModelMaintaincePage model;
    
    public ControllerMaintaincePage()
    {
        model = new ModelMaintaincePage();
    }
    
    public int insertData(String type, Float price, String note)
    {
        int dbinsertdata = model.dbInsertData(type,price,note);
        return dbinsertdata;
    
    }
    
    public int updateData(int id, String type, Float price, String note)
    {
        int dbupdateData = model.dbUpdateData(id, type, price, note);
        return dbupdateData;
    
    }
    
    public int deleteData(int id)
    {
        int dbdeleteData = model.dbDeleteData(id);
        return dbdeleteData;
    
    }
}
