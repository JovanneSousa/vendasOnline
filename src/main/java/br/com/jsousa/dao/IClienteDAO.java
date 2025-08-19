package br.com.jsousa.dao;

import java.util.List;

import br.com.jsousa.dao.generic.IGenericDAO;
import br.com.jsousa.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{
	
	List<Cliente> filtrarClientes(String query);
}
