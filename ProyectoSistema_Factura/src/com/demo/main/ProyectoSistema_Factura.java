/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.main;

import com.demo.controller.controllerCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Denisse Bailon
 */
public class ProyectoSistema_Factura {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        controllerCliente c = new controllerCliente();
        
        c.verClientes();
    }
 
    
}
