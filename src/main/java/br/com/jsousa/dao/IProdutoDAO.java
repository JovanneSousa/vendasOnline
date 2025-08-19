package br.com.jsousa.dao;

import java.util.List;

import br.com.jsousa.dao.generic.IGenericDAO;
import br.com.jsousa.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);
}
