package br.com.devdojo.maratonajsf.bean.login;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.model.Estudante;

@Named
@SessionScoped
public class LoginBean implements Serializable{

	private static final long serialVersionUID = -1105370999034431463L;

	private String nome;
	private String senha;
	private Estudante estudante;
	
	public String logar() {
		if(nome.equals("w") && senha.equals("1")) {
			estudante = new Estudante();
			return "/restricted/iniciosistema.xhtml?faces-redirect=true";
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "usuario e/ou senha inválidos", ""));
		return null;
	}
	
	public String Logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		estudante = null;
		return "/login?faces-redirect-true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	
	
}
