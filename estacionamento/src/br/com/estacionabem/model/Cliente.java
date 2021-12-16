package br.com.estacionabem.model;

public class Cliente extends Pessoa { // para herdar outra classe

	private TipoCliente tipo;
	private double mensalidade;

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

}
