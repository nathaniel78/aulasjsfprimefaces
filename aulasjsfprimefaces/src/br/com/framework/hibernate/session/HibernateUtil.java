package br.com.framework.hibernate.session;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

import javax.faces.bean.ApplicationScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.SessionFactoryImplementor;

import br.com.framework.implementacao.crud.VariavelConexaoUtil;



@ApplicationScoped
public class HibernateUtil implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String JAVA_COM_ENV_JDBC_DATA_SOURCE = "java:/comp/env/jdbc/datasource";

	private static SessionFactory sessionFactory = buildSessionFactory();

	/**
	 * Responsável por ler o arquivo de configuração hibernate.cfg.xml
	 * 
	 * @author nathaniel
	 */
	private static SessionFactory buildSessionFactory() {

		try {
			if (sessionFactory == null) {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}

			return sessionFactory;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("Erro ao realizar a conexão sessionFactory");
		}
	}

	/**
	 * Retorna a sessão do SessionFactory
	 * 
	 * return sessionFactory
	 */
	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}

	/**
	 * Abre a sessão do SessionFactory
	 * 
	 * return sessionFactory.openSession
	 */
	public static Session openSession() {

		if (sessionFactory == null) {
			buildSessionFactory();
		}

		return sessionFactory.openSession();
	}

	/**
	 * Obtem a conection do provedor de conexões configurado
	 * 
	 * @return Connection SQL
	 * @throws SQLException
	 */
	public static Connection getConnectionProvider() throws SQLException {

		return ((SessionFactoryImplementor) sessionFactory).getConnectionProvider().getConnection();
	}

	/**
	 * Connection no InitialContext java:/com/env/jdbc/datasource
	 * 
	 * @return Exception
	 */
	public static Connection getConnection() throws Exception {

		InitialContext context = new InitialContext();
		DataSource ds = (DataSource) context.lookup(JAVA_COM_ENV_JDBC_DATA_SOURCE);

		return ds.getConnection();
	}

	/**
	 * @return DataSource JNDI tomcat
	 * @throws NamingException
	 */
	public DataSource getDataSourceJndi() throws NamingException {
		InitialContext context = new InitialContext();
		return (DataSource) context.lookup(VariavelConexaoUtil.JAVA_COM_ENV_JDBC_DATA_SOURCE);
	}

}
