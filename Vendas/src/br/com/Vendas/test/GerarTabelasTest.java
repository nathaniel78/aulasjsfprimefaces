<<<<<<< HEAD
package br.com.Vendas.test;

import org.junit.Test;

import br.com.Vendas.util.HibernateUtil;

public class GerarTabelasTest {

	@Test
	public void gerar(){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
	
}
=======
package br.com.Vendas.test;

import org.junit.Test;

import br.com.Vendas.util.HibernateUtil;

public class GerarTabelasTest {

	@Test
	public void gerar(){
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
	
}
>>>>>>> branch 'master' of https://github.com/nathaniel78/vendas
