package br.com.framework.implementacao.crud;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.framework.hibernate.session.HibernateUtil;
import br.com.framework.interfac.crud.InterfaceCrud;

@Component
@Transactional
public class ImplementacaoCrud<T> implements InterfaceCrud<T> {

	private static final long serialVersionUID = 1L;
	
	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@Autowired
	private JdbcTemplateImpl jdbcTemplate;

	@Override
	public void save(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persist(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdate(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T merge(T obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findList(Class<T> obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(Class<T> entidade, Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findPorId(Class<T> entidade, Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findListByQueryDinamica(String s) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void executeUpdateQueryDinamica(String s) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdateSQLDinamica(String s) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearSession() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void evict(Object obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session getSession() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getListSQLDinamica(String sql) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleJdbcTemplate getSimpleJdbcTemplate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SimpleJdbcInsert getSimpleJdbcInsert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long totalRegistro(String table) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query obterQuery(String query) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findListQueryDinamica(String query, int iniciaNoRegistro, int maximoResultado) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
