/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableviewdemo;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author petri.ryynanen
 */
public class Accounts {
    public SimpleStringProperty UserName = new SimpleStringProperty("");
    public SimpleStringProperty Password = new SimpleStringProperty("");
    public SimpleStringProperty Type = new SimpleStringProperty("");
    
    public Accounts(String Username, String Password, String Type){
        this.UserName.set(Username);
        this.Password.set(Password);
        this.Type.set(Type);
    }
    
    public String getUserName(){
        return UserName.get();
    }
    public String getPassword(){
        return Password.get();
    }
    
    public String getType(){
        return Type.get();
    }
    
}
