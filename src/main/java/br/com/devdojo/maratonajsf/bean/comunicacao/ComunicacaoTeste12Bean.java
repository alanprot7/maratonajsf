package br.com.devdojo.maratonajsf.bean.comunicacao;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.devdojo.maratonajsf.model.Estudante;
import br.com.devdojo.maratonajsf.util.ApplicationMapUtil;

@Named
@RequestScoped
public class ComunicacaoTeste12Bean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Estudante estudante;

	public void init() {
		estudante = (Estudante) ApplicationMapUtil.getValueFromApplicationMap("estudante");
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}
