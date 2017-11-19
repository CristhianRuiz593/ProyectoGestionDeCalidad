/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.interfaces;

import com.demo.dominio.Empleado;
import java.util.List;

/**
 *
 * @author Jona
 */
public interface empleadoInterface {

    public boolean save(Empleado empleado);
    public List<Empleado> getEmpleadoAll();
    public boolean updateEmpleado(Empleado empleado);
    public boolean deleteEmpleado(Empleado empleado);

}
