package br.senai.sp.jandira;

import java.time.LocalDate;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;
import br.senai.sp.jandira.model.Empresa;

public class App {

	public static void main(String[] args) {
		
		Empresa senai = new Empresa();
		senai.setNome("SENAI \"Prof. Vicente Amato\""); //para não fechar as aspas - SCAPE
		senai.setTelefone("(11)4707-4367");
		senai.setCidade("Jandira");

		Cliente fernando = new Cliente();
		fernando.setCodigo(162);
		fernando.setNome("Fernando Leonid");
		fernando.setDataNascimento(LocalDate.of(1970, 3, 15));
		fernando.setEmail("fernando@terra.com.br");
		fernando.setTelefone("(11)92637-0347");
		fernando.setSalario(500);
		fernando.setEmpresa(senai);

		Conta conta1 = new Conta(fernando); // () é o método construtor
		conta1.setCliente(fernando);
		conta1.setDataAbertura(LocalDate.of(2020, 6, 1));
		conta1.setNumeroConta("83477-2");
		conta1.depositar(500);
		conta1.setAgencia("0004");
		conta1.setBanco("Bradesco");
		
		Cliente luiz = new Cliente();
		luiz.setCodigo(936);
		luiz.setNome("Luiz Antonio");
		luiz.setDataNascimento(LocalDate.of(1979, 8, 21));
		luiz.setEmail("luiz@terra.com.br");
		luiz.setEmpresa(senai);
		luiz.setSalario(9000);
		luiz.setTelefone("(11)92834-8473");
		
		Conta conta2 = new Conta(luiz, 100);
		conta2.setAgencia("0002");
		conta2.setBanco("Bradesco");
		conta2.setDataAbertura(LocalDate.now());
		conta2.setNumeroConta("47823-0");
		
		exibirExtrato(conta1);
		exibirExtrato(conta2);
		
		conta1.transferir(conta2, -100);

		exibirExtrato(conta1);
		exibirExtrato(conta2);
		
	}

	public static void exibirExtrato(Conta conta) {
		
		System.out.println("---------------------------------");
		System.out.println("|	EXTRATO DE CONTA	|");
		System.out.println("---------------------------------");
		System.out.println("Titular: " + conta.getCliente().getNome() + ".");
		System.out.println("E-mail: " + conta.getCliente().getEmail() + ".");
		System.out.println("Empresa: " + conta.getCliente().getEmpresa().getNome() + ".");
		System.out.println("Telefone Empresa: " + conta.getCliente().getEmpresa().getTelefone() + ".");
		System.out.println("Telefone Cliente: " + conta.getCliente().getTelefone() + ".");
		System.out.println("Conta: " + conta.getNumeroConta() + ".");
		System.out.println("Saldo: R$" + conta.getSaldo() + ".");
		System.out.println("Agência: " + conta.getAgencia()+ ".");
		System.out.println("Banco: " + conta.getBanco() + ".");
		System.out.println("Data: " + conta.getDataAbertura() + ".");

			
	}
}
