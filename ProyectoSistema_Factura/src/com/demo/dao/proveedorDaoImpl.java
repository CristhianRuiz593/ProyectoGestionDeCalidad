/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.Proveedor;
import com.demo.interfaces.proveedorInterface;
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
public class proveedorDaoImpl implements proveedorInterface{

    @Override
    public boolean save(Proveedor proveedor) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO proveedor values (NULL,'"
                + proveedor.getRuc() + "','"
                + proveedor.getNombre() + "','"
                + proveedor.getApellido() + "')";

        try {
            con = conexion_mysql.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedorDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Proveedor> getProveedorAll() {
          Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM proveedor";
        List<Proveedor> listaProveedor = new ArrayList<Proveedor>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedor p = new Proveedor();
                p.setId_proveedor(rs.getInt(1));
                p.setApellido(rs.getString(2));
                p.setNombre(rs.getString(3));
                p.setApellido(rs.getString(4));
                listaProveedor.add(p);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedorDaoImple, método getProveedorAll");
            e.printStackTrace();
        }
        return listaProveedor;
    }

    @Override
    public boolean updateProveedor(Proveedor proveedor) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE proveedor SET cedula='" + proveedor.getApellido() + "', "
                + "nombres='" + proveedor.getNombre() + "', "
                + "apellidos='" + proveedor.getApellido() + "'"
                + " WHERE ID=" + proveedor.getId_proveedor();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedorDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean deleteProveedor(Proveedor proveedor) {
             Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM proveedor WHERE ID=" + proveedor.getId_proveedor();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ProveedoroDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
    
}
