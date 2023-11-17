/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.ModelDockPage;

/**
 *
 * @author Sarith
 */
public class ControllerDockPage {
    private ModelDockPage model;
    
    public ControllerDockPage()
    {
        model = new ModelDockPage();
    }
    
    public int insertData(String dockid,float docklength,float dockwidth,float dockprice,String dockstatus)
    {
        int dbInsertData = model.dbInsertData(dockid,docklength,dockwidth,dockprice,dockstatus);
        return dbInsertData;
    }
    
    public int updateData(String dockid,float docklength,float dockwidth,float dockprice,String dockstatus)
    {
        int dbUpdateData = model.dbUpdateData(dockid,docklength,dockwidth,dockprice,dockstatus);
        return dbUpdateData;
    }
    
    public int deleteData(String dockid)
    {
        int dbdeleteData = model.dbDeleteData(dockid);
        return dbdeleteData;
    }
   
    public int searchDataStatus(String dockstatus)
    {
        int dbSearchDataStatus = model.dbSearchDataStatus(dockstatus);
        return dbSearchDataStatus;
    }
    
}
