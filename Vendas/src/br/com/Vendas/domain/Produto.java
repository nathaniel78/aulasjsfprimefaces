package br.com.Vendas.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_produtos")
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pro_codigo")
	private Long codigo;
	
	@Column(name="pro_descricao", length=100, nullable=false)
	private String descricao;
	
	@Column(name="pro_preco", length=50, nullable=false, scale=7, precision=2)
	private BigDecimal preco;
	
	@Column(name="pro_quantidade", length=20, nullable=false)
	private int quantidade;

	

}
