package br.com.Vendas.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.Vendas.domain.Fornecedor;
import br.com.Vendas.util.HibernateUtil;

public class FornecedorDAO {

	public void salvar(Fornecedor fornecedor) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(fornecedor);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	
	public void excluir(Fornecedor fornecedor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session.delete(fornecedor);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	
	public void excluirPorCodigo(Long codigo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			Fornecedor fornecedor = buscarPorCodigo(codigo);
			session.delete(fornecedor);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	
	public void editar(Fornecedor fornecedor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session.update(fornecedor);
			transaction.commit();
		} catch (RuntimeException e) {
			if(transaction != null) {
				transaction.rollback();
			} 
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Fornecedor> listar() {
		Session session = HibernateUtil.getSessionFactory().openSession();

		List<Fornecedor> fornecedores = null;

		try {
			Query consulta = session.getNamedQuery("Fornecedor.listar");
			fornecedores = consulta.list();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}

		return fornecedores;
	}
	
	public Fornecedor buscarPorCodigo(Long codigo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Fornecedor fornecedor = null;
		
		try {
			Query consulta = session.getNamedQuery("Fornecedor.buscarPorCodigo");
			consulta.setLong("codigo", codigo);
			fornecedor = (Fornecedor) consulta.uniqueResult();
		} catch (RuntimeException e) {
			throw e;
		} finally {
			session.close();
		}
		
		return fornecedor;
	}

}
