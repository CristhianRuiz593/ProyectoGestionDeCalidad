/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.loginDaoImpl;
import com.demo.interfaces.loginInterface;

/**
 *
 * @author Jona
 */
public class controllerLogin {
    private loginInterface dao;
    
    	public controllerLogin() {
            if(dao == null){
                dao= new  loginDaoImpl();
            }
	}
        
        // gestiona el inicio de sesion del empleado
        // hacemos devolver los parametros
        // id_empleado, nombre, apellido y su rol
        //para validar a que opciones del menu tiene acceso
        
    
}
