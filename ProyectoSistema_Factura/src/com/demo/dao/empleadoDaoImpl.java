/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.Empleado;
import com.demo.interfaces.empleadoInterface;
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
public class empleadoDaoImpl implements empleadoInterface{

    @Override
    public boolean save(Empleado empleado) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO empleado values (NULL,'"
                + empleado.getCedulaIdentidad() + "','"
                + empleado.getNombre() + "','"
                + empleado.getApellido() + "')";

        try {
            con = conexion_mysql.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método save");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Empleado> getEmpleadoAll() {
         Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM empleado";

        List<Empleado> listaCliente = new ArrayList<Empleado>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Empleado e = new Empleado();
                e.setId_empleado(rs.getInt(1));
                e.setCedulaIdentidad(rs.getString(2));
                e.setNombre(rs.getString(3));
                e.setApellido(rs.getString(4));
                listaCliente.add(e);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método getEmpleadoAll");
            e.printStackTrace();
        }

        return listaCliente;
        
    }

    @Override
    public boolean updateEmpleado(Empleado empleado) {
         Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE empleado SET cedula='" + empleado.getCedulaIdentidad() + "', "
                + "nombres='" + empleado.getNombre() + "', "
                + "apellidos='" + empleado.getApellido() + "'"
                + " WHERE ID=" + empleado.getId_empleado();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
        
    }

    @Override
    public boolean deleteEmpleado(Empleado empleado) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM empleado WHERE ID=" + empleado.getId_empleado();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
    
    
}
