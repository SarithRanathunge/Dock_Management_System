/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import model.ModelPaymentPage;

/**
 *
 * @author Sarith
 */
public class ControllerPaymentPage {
    private ModelPaymentPage model;
    
    public ControllerPaymentPage(){
     model = new ModelPaymentPage();
    }
   
    public int insertData(int customer, int yacht, float duration, float price, float total)
    {
        int dbinsertdata = model.dbInsertData(customer, yacht, duration, price, total);
        return dbinsertdata;
    }
    
    public int addData(int customer, int yacht, float total)
    {
        int dbinsertdata = model.dbAddData(customer, yacht, total);
        return dbinsertdata;
    }
    
}
