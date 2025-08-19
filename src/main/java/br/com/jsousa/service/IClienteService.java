package br.com.jsousa.service;

import java.util.List;

import br.com.jsousa.domain.Cliente;
import br.com.jsousa.exceptions.DAOException;
import br.com.jsousa.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);
}
