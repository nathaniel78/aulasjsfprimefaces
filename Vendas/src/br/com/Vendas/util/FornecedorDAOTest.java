package br.com.Vendas.util;

import org.junit.Test;

import br.com.Vendas.DAO.FornecedorDAO;
import br.com.Vendas.domain.Fornecedor;

public class FornecedorDAOTest {
	
	@Test
	public void salvar() {
		Fornecedor f1 = new Fornecedor();
		
		f1.setDescricao("Descrição A");
		
		FornecedorDAO dao = new FornecedorDAO();
		dao.salvar(f1);
	}

}
