/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.empleadoDaoImpl;
import com.demo.dominio.Empleado;
import com.demo.interfaces.empleadoInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class controllerEmpleado {
    
    private empleadoInterface dao;
    
    	public controllerEmpleado() {
            if(dao == null){
                dao= new  empleadoDaoImpl();
            }
	}
	
	//llama al DAO para guardar un empleado
	public void registrar(Empleado empleado ) {
		dao.save(empleado);
	}
	
	//llama al DAO para actualizar un empleado
	public void actualizar(Empleado empleado ) {
		dao.updateEmpleado(empleado);
	}
	
	//llama al DAO para eliminar un empleado
	public void eliminar(Empleado empleado ) {
		dao.deleteEmpleado(empleado);
	}
	
	//llama al DAO para obtener todos los empleados y luego los muestra en la vista
        // convertir en metod list
	public void verEmpleados(){
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados=dao.getEmpleadoAll();
		//vista.verClientes(clientes);
                for (Empleado empleado  : empleados) {
                    System.out.println("asas... "+empleado.getApellido());
            }
	}
    
}
