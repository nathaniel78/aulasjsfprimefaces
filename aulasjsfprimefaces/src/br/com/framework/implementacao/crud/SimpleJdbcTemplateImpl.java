package br.com.framework.implementacao.crud;

import java.io.Serializable;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
public class SimpleJdbcTemplateImpl extends JdbcTemplate implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public SimpleJdbcTemplateImpl(DataSource dataSource) {
		super(dataSource);
	}

}
