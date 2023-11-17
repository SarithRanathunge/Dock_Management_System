/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import model.ModelCustomerPage;

/**
 *
 * @author Sarith
 */
public class ControllerCustomerPage {
    private ModelCustomerPage model;
    
    public ControllerCustomerPage(){
     model = new ModelCustomerPage();
    }
    
    public List<String> getItems() {
        List<String> dbgetitem= model.dbGetItem();
        return dbgetitem;
    }
}
