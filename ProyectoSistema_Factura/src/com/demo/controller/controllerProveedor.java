/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.proveedorDaoImpl;
import com.demo.dominio.Proveedor;
import com.demo.interfaces.proveedorInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class controllerProveedor {
    private proveedorInterface dao;
    
    	public controllerProveedor() {
            if(dao == null){
                dao= new  proveedorDaoImpl();
            }
	}
	
	//llama al DAO para guardar un empleado
	public void registrar(Proveedor proveedor ) {
		dao.save(proveedor);
	}
	
	//llama al DAO para actualizar un empleado
	public void actualizar(Proveedor proveedor) {
		dao.updateProveedor(proveedor);
	}
	
	//llama al DAO para eliminar un empleado
	public void eliminar(Proveedor proveedor) {
		dao.deleteProveedor(proveedor);
	}
	
	//llama al DAO para obtener todos los empleados y luego los muestra en la vista
        // convertir en metod list
	public void verProveedores(){
		List<Proveedor> proveedores = new ArrayList<Proveedor>();
		proveedores=dao.getProveedorAll();
		//vista.verClientes(clientes);
                for (Proveedor proveedor  : proveedores) {
                    System.out.println("asas... "+proveedor.getApellido());
            }
	}
}
