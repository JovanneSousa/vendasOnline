package br.com.jsousa.service;

import java.util.List;

import br.com.jsousa.domain.Produto;
import br.com.jsousa.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String>{

	List<Produto> filtrarProdutos(String query);
}
