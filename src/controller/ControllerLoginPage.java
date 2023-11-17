/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.ModelLoginPage;

/**
 *
 * @author Sarith
 */
public class ControllerLoginPage {
    private ModelLoginPage  model;
    
    public ControllerLoginPage()
    {
        model = new ModelLoginPage();
    }
    
    public String validateLogin(String username, String password, String position)
    {
        String db_usertype = model.validateLogin(username, password, position);
        return db_usertype;
    }
}
