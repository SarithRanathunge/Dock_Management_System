/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.ModelYachtPage;

/**
 *
 * @author Sarith
 */
public class ControllerYachtPage {

    private ModelYachtPage model;

    public ControllerYachtPage() {
        model = new ModelYachtPage();
    }

     public List<String> getItems() {
        List<String> itemList = model.dbGetItem();
        return itemList;
    }
}
