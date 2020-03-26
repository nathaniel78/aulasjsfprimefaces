package br.com.Vendas.util;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class JSFUtil {

	public static void adicionarMensagem(String mensagem, int tipo){
		if(tipo == 1) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, mensagem);
			FacesContext contexto = FacesContext.getCurrentInstance();
			contexto.addMessage(null, msg);
		} else if(tipo == 2) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, mensagem);
			FacesContext contexto = FacesContext.getCurrentInstance();
			contexto.addMessage(null, msg);
		} else if(tipo == 3) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, mensagem, mensagem);
			FacesContext contexto = FacesContext.getCurrentInstance();
			contexto.addMessage(null, msg);
		} else if(tipo == 4) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, mensagem, mensagem);
			FacesContext contexto = FacesContext.getCurrentInstance();
			contexto.addMessage(null, msg);
		}
	}
	
	public static String getParam(String nome){
		FacesContext contexto = FacesContext.getCurrentInstance();
		ExternalContext externalContext = contexto.getExternalContext();
		Map<String, String>parametros = externalContext.getRequestParameterMap();
		String valor = parametros.get(nome);
		return valor;
	}
	
}
