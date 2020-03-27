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
			transaction.commit();
			session.save(fornecedor);
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

		} catch (RuntimeException ex) {
			throw ex;
		}

		finally {
			session.close();
		}

		return fornecedores;
	}

}
