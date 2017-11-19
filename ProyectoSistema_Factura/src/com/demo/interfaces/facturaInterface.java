/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.interfaces;

import com.demo.dominio.FacturaCabecera;
import java.util.List;

/**
 *
 * @author Jona
 */
public interface facturaInterface {
    public boolean save(FacturaCabecera factura);
	public List<FacturaCabecera> getFacturaAll();
	public boolean updateFactura(FacturaCabecera factura);
	public boolean deleteFactura(FacturaCabecera factura);
}
