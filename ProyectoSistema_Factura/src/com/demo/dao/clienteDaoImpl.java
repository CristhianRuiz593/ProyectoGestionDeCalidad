package com.demo.dao;

import com.demo.dominio.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.util.conexion_mysql;
import com.demo.interfaces.clienteInterface;

/**
 * @author Jona
 */
public class clienteDaoImpl implements clienteInterface {

    @Override
    public boolean save(Cliente cliente) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO cliente values (NULL,'"
                + cliente.getIdentificacion() + "','"
                + cliente.getNombre() + "','"
                + cliente.getApellido() + "')";

        try {
            con = conexion_mysql.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Cliente> getClienteAll() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM cliente";

        List<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId_cliente(rs.getInt(1));
                c.setIdentificacion(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método getClienteAll");
            e.printStackTrace();
        }

        return listaCliente;
    }

    @Override
    public boolean updateCliente(Cliente cliente) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE CLIENTE SET cedula='" + cliente.getIdentificacion() + "', "
                + "nombres='" + cliente.getNombre() + "', "
                + "apellidos='" + cliente.getApellido() + "'"
                + " WHERE ID=" + cliente.getId_cliente();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean deleteCliente(Cliente cliente) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM CLIENTE WHERE ID=" + cliente.getId_cliente();
        try {
            connect = conexion_mysql.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

}
