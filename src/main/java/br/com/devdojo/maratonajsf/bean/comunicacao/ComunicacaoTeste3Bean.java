package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable {

	private static final long serialVersionUID = -1176416112675157165L;

	private String nome;
	private String sobrenome;
	private Date data;

	public void init() {
		//if (!FacesContext.getCurrentInstance().isPostback()) {
			System.out.println("Criou comunicação 3");
			System.out.println(nome);
			System.out.println(sobrenome);
		//}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	

}
