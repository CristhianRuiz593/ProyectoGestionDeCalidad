/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.controller;

import com.demo.dao.facturaDaoImpl;
import com.demo.dominio.FacturaCabecera;
import com.demo.interfaces.facturaInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class controllerFactura {
    private facturaInterface dao;
    
    	public controllerFactura() {
            if(dao == null){
                dao= new  facturaDaoImpl();
            }
	}
	
	//llama al DAO para guardar un factura
	public void registrar(FacturaCabecera factura ) {
		dao.save(factura);
	}
	
	//llama al DAO para actualizar un cliente
	public void actualizar(FacturaCabecera factura ) {
		dao.updateFactura(factura);
	}
	
	//llama al DAO para eliminar un cliente
	public void eliminar(FacturaCabecera factura ) {
		dao.deleteFactura(factura);
	}
	
	//llama al DAO para obtener todos los clientes y luego los muestra en la vista
        // convertir en metodo list
	public void verFacturas(){
		List<FacturaCabecera> facturas = new ArrayList<FacturaCabecera>();
		facturas=dao.getFacturaAll();
		//vista.verClientes(clientes);
                for (FacturaCabecera factura  : facturas) {
                    System.out.println("asas... "+factura.getDireccion());
            }
	}
}
