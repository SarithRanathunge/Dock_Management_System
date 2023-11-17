/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.ModelAddYacht;

/**
 *
 * @author Sarith
 */
public class ControllerAddYacht {
    private ModelAddYacht model;
    
    public ControllerAddYacht(){
        model = new ModelAddYacht();
    }
    
    
    public int ddinsertData(String mod, float width, float length, String speed, int year, String image, String fuel_type, String fuel_capacity, String engine, String due_date, String start_date, String duration, String customer, String dock){
     int dbinsertdata = model.dbInsertData(mod, width, length, speed, year, image, fuel_type, fuel_capacity, engine, due_date, start_date, duration, customer, dock);
     return dbinsertdata;
    }
    
    public int updateData(int id,String mod, float width, float length, String speed, int year, String image, String fuel_type, String fuel_capacity, String engine, String due_date, String start_date, String duration, String customer, String dock){
     int dbupdatedata = model.dbUpdateData(id,mod, width, length, speed, year, image, fuel_type, fuel_capacity, engine, due_date, start_date, duration, customer, dock);
     return dbupdatedata;
    }

    public int insertData(String model, Float width, Float length, String speed, int year, String model0, String fuel_type, String fuel_capacity, String engine, int due_Year, int start_year, String duration, String customer, String dock) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 0;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
