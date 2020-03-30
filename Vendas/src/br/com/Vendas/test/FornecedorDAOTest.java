package br.com.Vendas.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.DAO.FornecedorDAO;
import br.com.Vendas.domain.Fornecedor;

public class FornecedorDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Fornecedor f1 = new Fornecedor();

		f1.setDescricao("Descrição B");

		FornecedorDAO dao = new FornecedorDAO();
		dao.salvar(f1);
	}

	@Test
	@Ignore
	public void listar() {
		FornecedorDAO dao = new FornecedorDAO();
		List<Fornecedor> fornecedores = dao.listar();

		for (Fornecedor fornecedor : fornecedores) {
			System.out.println(fornecedor);
		}
	}

	@Test
	@Ignore
	public void buscar() {
		FornecedorDAO dao = new FornecedorDAO();
		Fornecedor f1 = dao.buscarPorCodigo(3L);

		System.out.println(f1);
	}

	@Test
	@Ignore
	public void excluir() {
		FornecedorDAO dao = new FornecedorDAO();
		Fornecedor f1 = dao.buscarPorCodigo(3L);

		dao.excluir(f1);
	}

	@Test
	@Ignore
	public void excluirPorCodigo() {
		FornecedorDAO dao = new FornecedorDAO();

		dao.excluirPorCodigo(4L);
	}

	@Test
	@Ignore
	public void editar() {
		FornecedorDAO dao = new FornecedorDAO();

		Fornecedor fornecedor = dao.buscarPorCodigo(7L);
		fornecedor.setDescricao("Paula Campos");

		dao.editar(fornecedor);

	}

}
