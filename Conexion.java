/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Harby Morales Uribe
 */
public class Conexion {
    public Connection get_connection(){
        Connection conection = null; 
        
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            if (conection != null){
                System.out.println("conexion exitosa");
            }
        }
        catch(SQLExeption e){
            System.out.println("e");
        }
    }
}
