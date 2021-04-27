package br.com.Vendas.util;

import java.util.List;

import org.junit.Test;

import br.com.Vendas.DAO.FornecedorDAO;
import br.com.Vendas.domain.Fornecedor;

public class FornecedorDAOTest {
	
	@Test
	@org.junit.Ignore
	public void salvar() {
		Fornecedor f1 = new Fornecedor();
		
		f1.setDescricao("Descrição A");
		
		FornecedorDAO dao = new FornecedorDAO();
		dao.salvar(f1);
	}
	
	@Test
	public void listar() {
		FornecedorDAO dao = new FornecedorDAO();
		List<Fornecedor> fornecedores = dao.listar();
		
		for(Fornecedor fornecedor : fornecedores) {
			System.out.println(fornecedor);
		}
	}

}
