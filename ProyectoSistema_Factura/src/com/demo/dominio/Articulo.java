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
public class Articulo {
    private int id_articulo;
    private List<Proveedor> proveedor;
    private String nombre;
    private String codigo_fisico;
    private String descripcion;
    private int stock;
    private double precio_venta;
    private double precio_compra;
    private boolean estado;

    public Articulo() {
    }

    
    public Articulo(int id_articulo, List<Proveedor> proveedor, String nombre, String codigo_fisico, String descripcion, int stock, double precio_venta, double precio_compra, boolean estado) {
        this.id_articulo = id_articulo;
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.codigo_fisico = codigo_fisico;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio_venta = precio_venta;
        this.precio_compra = precio_compra;
        this.estado = estado;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public List<Proveedor> getProveedor() {
        return proveedor;
    }

    public void setProveedor(List<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo_fisico() {
        return codigo_fisico;
    }

    public void setCodigo_fisico(String codigo_fisico) {
        this.codigo_fisico = codigo_fisico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
 
    
}
