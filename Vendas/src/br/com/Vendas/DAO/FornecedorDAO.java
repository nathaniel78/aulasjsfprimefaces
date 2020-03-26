package br.com.Vendas.DAO;

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

}
