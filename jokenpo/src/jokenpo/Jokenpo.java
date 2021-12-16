package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
   public static void main(String[] args) {
	   
	   int pedra; 
	   	   pedra = 0;
	   int papel; 
	   	   papel = 1;
	   int tesoura; 
	   	   tesoura = 2;
	   int escolhaComputador;
	   int escolhaJogador;
	       
	   Random escolha = new Random();
	   Scanner leitor = new Scanner(System.in);
	   
	   System.out.println("Escolhas possíveis: ");
	   System.out.println("Pedra = " + pedra);
	   System.out.println("Papel = " + papel);
	   System.out.println("Tesoura = " + tesoura);
	   
	   System.out.println();
	   System.out.println("Escolha sua jogada: ");
	   
	   escolhaJogador = leitor.nextInt();
	   if (escolhaJogador == 0) {
		   System.out.println("Sua escolha: Pedra.");
	   } else if (escolhaJogador == 1) {
		   System.out.println("Sua escolha: Papel.");
	   } else {
		   System.out.println("Sua escolha: Tesoura.");
		   
	}
		   
	   
	   escolhaComputador = escolha.nextInt(3);
	   if (escolhaComputador == 0) {
		   System.out.println("Escolha do computador: Pedra.");
	   } else if (escolhaComputador == 1) {
		   System.out.println("Escolha do computador: Papel.");
	   } else {
		   System.out.println("Escolha do computador: Tesoura.");
	   
	   
	   
	   System.out.println("Escolha do computador: " + escolhaComputador);
	   
	   if (escolhaJogador == pedra) {
	       	} else {
		     System.out.println("Você ganhou!!!"); }
	        } if (escolhaComputador == pedra) {
			   System.out.println("Empate.");
		     if (escolhaComputador == papel);{
		       System.out.println("Você perdeu...");
	   }
	  
	   
	   if (escolhaJogador == papel) {
		       	} else {
			     System.out.println("Você ganhou!!!"); }
		        } else if (escolhaComputador == papel) {
				   System.out.println("Empate.");
			     if (escolhaComputador == tesoura);{
			       System.out.println("Você perdeu...");
	   }
			     
	   if (escolhaJogador == tesoura) {
			       	} else {
				     System.out.println("Você ganhou!!!"); }
			        } else if (escolhaComputador == tesoura) {
					   System.out.println("Empate.");
				     if (escolhaComputador == pedra);{
				       System.out.println("Você perdeu...");
			   }
			   
	   
	   }
   }
}
