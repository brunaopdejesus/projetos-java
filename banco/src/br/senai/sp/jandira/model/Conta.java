package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Conta {

	private String numeroConta;
	private String agencia;
	private Cliente cliente;
	private String banco;
	private double saldo;
	private LocalDate dataAbertura;

	// m�todo construtor, ser� chamado quando criamos um novo objeto utilizando a instru��o NEW
	// deve ser p�blico
	// o nome dele � o nome da CLASSE
	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}
//--------------------------------------------------------------------	
	public Conta(Cliente cliente, double valor) {
		this.cliente = cliente;
		saldo = valor;
	}
//--------------------------------------------------------------------	
	// M�todos de acesso
	public void setNumeroConta(String numeroConta) { // ao inv�s de x, uso o nome do String
		this.numeroConta = numeroConta;
		
		// if (numeroConta.length() > 7) {  // numero de caracteres
			//this.numeroConta = numeroConta;
		//} else {
			//System.out.println("N�mero de conta inv�lido! Insira um valor com 5 caracteres");
	}
	
	public String getNumeroConta() {
		return this.numeroConta;
	}
//--------------------------------------------------------------------	
	public void setAgencia(String agencia) { 
		this.agencia = agencia;  // this se refere ao atributo da classe
	}
	
	public String getAgencia() {  
		return this.agencia;  // vai me devolver
	}
//--------------------------------------------------------------------	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public String getBanco() {
		return this.banco;
	}
//--------------------------------------------------------------------	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
//--------------------------------------------------------------------	
	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public LocalDate getDataAbertura() {
		return dataAbertura;
	}
//--------------------------------------------------------------------	
	public void depositar(double valor) {
		if (valor >= 0) {
			saldo = saldo + valor;
		} else {
			System.out.println("Valor de dep�sito inv�lido.");
		}
	}
//--------------------------------------------------------------------	
	public boolean sacar(double valor) { //return true ou false
		
		if (saldo >= valor && valor >= 0) {
			saldo = saldo - valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}
	
	public void transferir(Conta contaDestino, double valor) {
		
		if (this.sacar(valor)) {
			contaDestino.depositar(valor);
		} else {
			System.out.println("N�o foi poss�vel efetuar a tranfer�ncia.");
		}
		
	}
//--------------------------------------------------------------------	

	public void transferir() {
	}

	// usar verbo GET quando eu quero PEGAR alguma coisa
	public double getSaldo() { // se n�o � void, deve ter return
		return saldo;
	}
}
