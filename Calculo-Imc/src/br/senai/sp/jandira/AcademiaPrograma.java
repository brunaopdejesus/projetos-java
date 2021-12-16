package br.senai.sp.jandira;

public class AcademiaPrograma {

	public static void main(String[] args) {

		Aluno ana = new Aluno();
		ana.nome = "Ana de Souza";
		ana.email = "ana@uol.com.br";
		ana.idade = 20;
		ana.matricula = "47837";
		ana.peso = 54;
		ana.altura = 1.58;
			
		System.out.printf("%s.\n%s anos.\n", ana.nome, ana.idade);
		System.out.printf("E-mail: %s.\nMatrícula: %s.\nImc: %s.\nClassificação: %s", ana.email, ana.matricula, ana.calcularImc(), ana.mostrarStatus()); 
			
		ObjetoAluno pedro = new ObjetoAluno();
		pedro.nome = "Pedro da Silva";
		pedro.email = "pedro@uol.com.br";
		pedro.idade = 18;
		pedro.matricula = "93846";
		pedro.peso = 87;
		pedro.altura = 1.85;

			
		System.out.println("");
		System.out.println("");
		System.out.printf("%s.\n%s anos.\nE-mail: %s.\nMatrícula: %s.\nIMC: %s.\nClassificação: %s", pedro.nome, pedro.idade, pedro.email, pedro.matricula, pedro.calcularImc(), pedro.mostrarStatus());


		}



}
