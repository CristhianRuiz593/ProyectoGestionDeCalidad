/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dominio;

import java.sql.Date;
import java.util.List;

/**
 * @author Denisse Bailon
 */
public class FacturaCabecera {
    private int id_facturaCab;
    private List <Cliente> cliente;
    private List <Empleado> empleado;
    private Date fecha;
    private String Telefono;
    private String direccion;
    private double descuento;
    private double subtotal;
    private double iva;
    private double totalPagar;

    public FacturaCabecera() {
    }
    

    public FacturaCabecera(int id_facturaCab, List<Cliente> cliente, List<Empleado> empleado, Date fecha, String Telefono, String direccion, double descuento, double subtotal, double iva, double totalPagar) {
        this.id_facturaCab = id_facturaCab;
        this.cliente = cliente;
        this.empleado = empleado;
        this.fecha = fecha;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.descuento = descuento;
        this.subtotal = subtotal;
        this.iva = iva;
        this.totalPagar = totalPagar;
    }

    public int getId_facturaCab() {
        return id_facturaCab;
    }

    public void setId_facturaCab(int id_facturaCab) {
        this.id_facturaCab = id_facturaCab;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    

    
            
}
