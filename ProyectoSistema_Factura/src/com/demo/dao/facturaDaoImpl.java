/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.FacturaCabecera;
import com.demo.interfaces.facturaInterface;
import com.demo.util.conexion_mysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jona
 */
public class facturaDaoImpl implements facturaInterface{

    @Override
    public boolean save(FacturaCabecera factura) {
         boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO factura values (NULL,'"
                + factura.getDireccion() + "','"
                + factura.getTelefono() + "','"
                + factura.getIva() + "')";

        try {
            con = conexion_mysql.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase FacturaDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<FacturaCabecera> getFacturaAll() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM cliente";

        List<FacturaCabecera> listaFactura = new ArrayList<FacturaCabecera>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                FacturaCabecera f = new FacturaCabecera();
                f.setId_facturaCab(rs.getInt(1));
                f.setDireccion(rs.getString(2));
                f.setIva(rs.getDouble(3));
                listaFactura.add(f);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase FacturaDaoImple, método getFacturaAll");
            e.printStackTrace();
        }

        return listaFactura;
    }

    @Override
    public boolean updateFactura(FacturaCabecera factura) {
         Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE facturaCabecera SET cedula='" + factura.getDireccion() + "', "
                + "nombres='" + factura.getDireccion() + "', "
                + "apellidos='" + factura.getDireccion() + "'"
                + " WHERE ID=" + factura.getDireccion();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase FacturaDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean deleteFactura(FacturaCabecera factura) {
         Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM FacturaCabecera WHERE ID=" + factura.getId_facturaCab();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase FacturaDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
    
}
