/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.interfaces;

import com.demo.dominio.Cliente;
import java.util.List;

/**
 *
 * @author Jona
 */
public interface clienteInterface {
	public boolean save(Cliente cliente);
	public List<Cliente> getClienteAll();
	public boolean updateCliente(Cliente cliente);
	public boolean deleteCliente(Cliente cliente);
}
