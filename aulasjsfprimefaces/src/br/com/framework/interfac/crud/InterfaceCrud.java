package br.com.framework.interfac.crud;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public interface InterfaceCrud<T> extends Serializable {
	
	// Salva os dados
	void save(T obj) throws Exception;
	
	void persist(T obj)throws Exception;
	
	// Salva ou atualiza
	void saveOrUpdate(T obj) throws Exception;
	
	// Realiza o update / atualização de dados
	void update(T obj) throws Exception;
	
	// Realiza a exclusão de dados
	void delete(T obj) throws Exception;
	
	// Salva ou atualiza e retorna o objeto em estado persistente
	T merge(T obj) throws Exception;
	
	// Carrega a lista de dados de determinada classe
	List<T> findList(Class<T> obj) throws Exception;
	
	// Consulta por objeto
	Object findById(Class<T> entidade, Long id) throws Exception;
	
	// Consulta por classe
	T findPorId(Class<T> entidade, Long id) throws Exception;
	
	// Listar query dinamica
	List<T> findListByQueryDinamica(String s) throws Exception;
	
	// Executar update HQL
	void executeUpdateQueryDinamica(String s) throws Exception;
	
	// Executar update com SQL
	void executeUpdateSQLDinamica(String s)throws Exception;
	
	// Limpa sessão do Hibernate
	void clearSession() throws Exception;
	
	// Retira um objeto da sessão do Hibernate
	void evict(Object obj) throws Exception;
	
	// Retorna a sessão no Hibernate
	Session getSession() throws Exception;
	
	// Retorna uma lista SQL
	List<?> getListSQLDinamica(String sql) throws Exception;
	
	// Trabalhar com JDBC do Spring
	JdbcTemplate getJdbcTemplate();
	
	SimpleJdbcTemplate getSimpleJdbcTemplate();
	
	SimpleJdbcInsert getSimpleJdbcInsert();
	
	// Retorna o total de registro da tabela
	Long totalRegistro(String table) throws Exception;
	
	// Obter query dinamica
	Query obterQuery(String query) throws Exception;
	
	// Carregamento por demanda, dinamico jsf e hibernate
	List<T> findListQueryDinamica(String query, int iniciaNoRegistro, int maximoResultado) throws Exception;
	
}
