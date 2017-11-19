/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.dao;

import com.demo.dominio.User;
import com.demo.interfaces.loginInterface;
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
public class loginDaoImpl implements loginInterface{

    // hacer metodo de tipo User
    // solo verifico con el query y si vota diferente hace el logeo
    @Override
    public void login(User usuario) {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM proveedor";
        List<User> listaUsuario = new ArrayList<User>();
        try {
            co = conexion_mysql.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                User u = new User();
                //u.setId_proveedor(rs.getInt(1));
                //u.setApellido(rs.getString(2));
                //u.setNombre(rs.getString(3));
                //u.setApellido(rs.getString(4));
                listaUsuario.add(u);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase LoginDaoImple, método getlogin");
            e.printStackTrace();
        }
        //return listaUsuario;
    }
    
}
