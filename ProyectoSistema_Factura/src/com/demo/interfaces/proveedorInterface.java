/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.interfaces;

import com.demo.dominio.Proveedor;
import java.util.List;

/**
 *
 * @author Jona
 */
public interface proveedorInterface {
    public boolean save(Proveedor proveedor);
	public List<Proveedor> getProveedorAll();
	public boolean updateProveedor(Proveedor proveedor);
	public boolean deleteProveedor(Proveedor proveedor);
}
