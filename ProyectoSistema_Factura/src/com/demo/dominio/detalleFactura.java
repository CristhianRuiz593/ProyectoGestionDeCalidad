/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dominio;

import java.util.List;

/**
 *
 * @author Denisse Bailon
 */
public class detalleFactura {
    private int id_detalleFactura;
    private List <facturaCabezera> facturaCabezera;
    private List <articulo> articulo;
    private int cantidad;
    private double precioUnitario;

    public detalleFactura() {
    }
    

    public detalleFactura(int id_detalleFactura, List<facturaCabezera> facturaCabezera, List<articulo> articulo, int cantidad, double precioUnitario) {
        this.id_detalleFactura = id_detalleFactura;
        this.facturaCabezera = facturaCabezera;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getId_detalleFactura() {
        return id_detalleFactura;
    }

    public void setId_detalleFactura(int id_detalleFactura) {
        this.id_detalleFactura = id_detalleFactura;
    }

    public List<facturaCabezera> getFacturaCabezera() {
        return facturaCabezera;
    }

    public void setFacturaCabezera(List<facturaCabezera> facturaCabezera) {
        this.facturaCabezera = facturaCabezera;
    }

    public List<articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(List<articulo> articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    
}
