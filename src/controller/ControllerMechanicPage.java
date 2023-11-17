/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ModelMechanicPage;

/**
 *
 * @author Sarith
 */
public class ControllerMechanicPage {

    private ModelMechanicPage model;

    public ControllerMechanicPage() {
        model = new ModelMechanicPage();
    }
    
    public int updateDta(int id , String status){
    
        int dbUpdateData = model.dbUpdateData(id, status);
        return dbUpdateData;
    }
}
