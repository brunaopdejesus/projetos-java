package br.sp.jandira.senai.model.certo;

public class Aluno {                                     // CLASSE
	
//------------------------------------------------------- 
	
	public String nome;
	public String email;
	public String matricula;                            // ATRIBUTOS
	public byte idade;
	public double peso;
	public double altura;

//-------------------------------------------------------	
	
	public double calcularImc() {  //método tem que ser um verbo; função void não retorna nada, outras funções DEVEM retornar
		return peso / (altura * altura);
	}
	
	public String cumprimentar() {
		return "Oi! Tudo bem?";
	}
	                                                     // MÉTODOS
	public String mostrarStatus() {
		if (calcularImc() <= 18.5) {
			return "Abaixo do peso.";
		} else if (calcularImc() >= 18.6 && calcularImc() <= 24.9) {
			return "Peso ideal.";
		} else if (calcularImc() >= 25.0 && calcularImc() <= 29.9) {
	        return "Levemente acima do peso.";
		} else if (calcularImc() >= 30.0 && calcularImc() <= 34.9) {
	        return "Obesidade grau I.";
		} else if (calcularImc() >= 35.0 && calcularImc() <= 39.9) {
	        return "Obesidade grau II.";
		} else {
			return "Obesidade grau III.";
		}

	        
	}
//-------------------------------------------------------
}
