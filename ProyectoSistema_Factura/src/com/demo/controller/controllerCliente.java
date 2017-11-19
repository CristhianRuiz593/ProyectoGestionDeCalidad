/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dominio.Cliente;
import com.demo.dao.clienteDaoImpl;
import java.util.ArrayList;
import java.util.List;
import com.demo.interfaces.clienteInterface;

/**
 *
 * @author Jona
 */
public class controllerCliente {
    
    private clienteInterface dao;
    
    	public controllerCliente() {
            if(dao == null){
                dao= new  clienteDaoImpl();
            }
	}
	
	//llama al DAO para guardar un cliente
	public void registrar(Cliente cliente ) {
		dao.save(cliente);
	}
	
	//llama al DAO para actualizar un cliente
	public void actualizar(Cliente cliente) {
		dao.updateCliente(cliente);
	}
	
	//llama al DAO para eliminar un cliente
	public void eliminar(Cliente cliente) {
		dao.deleteCliente(cliente);
	}
	
	//llama al DAO para obtener todos los clientes y luego los muestra en la vista
	public void verClientes(){
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes=dao.getClienteAll();
		//vista.verClientes(clientes);
                for (Cliente cli : clientes) {
                    System.out.println("asas... "+cli.getApellido());
            }
	}
    
}
