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
public class user {
    private int id_user;
    private List <empleado> empleado;
    private String nick;
    private String password;
    private String rol;
    private boolean activo;

    public user() {
    }

    
    public user(int id_user, List<empleado> empleado, String nick, String password, String rol, boolean activo) {
        this.id_user = id_user;
        this.empleado = empleado;
        this.nick = nick;
        this.password = password;
        this.rol = rol;
        this.activo = activo;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public List<empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<empleado> empleado) {
        this.empleado = empleado;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
