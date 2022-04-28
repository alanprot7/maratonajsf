package br.com.devdojo.maratonajsf.bean.estudante;

import java.io.Serializable;

import javax.inject.Named;

import br.com.devdojo.maratonajsf.model.Estudante;

@Named
public class EstudanteRegistrarBean implements Serializable {

	private static final long serialVersionUID = -4309459228383308986L;

	private Estudante estudante = new Estudante();

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}
