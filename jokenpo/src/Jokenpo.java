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
	   
	// ** Random: sorteia aleatoriamente
	   Random escolha = new Random();
	   
	// ** Espa�o para usu�rio inserir informa��es
	   Scanner leitor = new Scanner(System.in);
	   
	   System.out.println("Escolhas poss�veis: ");
	   System.out.println("Pedra = " + pedra);
	   System.out.println("Papel = " + papel);
	   System.out.println("Tesoura = " + tesoura);
	   
	   System.out.println();
	   System.out.println("Escolha sua jogada: ");
	   
	// ** Espa�o para escolha do usu�rio
	   escolhaJogador = leitor.nextInt();
	   
	// ** Espa�o para usu�rio inserir informa��es
	   System.out.print("Qual o seu nome? ");
	   String nomeDoJogador = leitor.next();
	   
	// ** Exibe a escolha do jogador
	   if (escolhaJogador == 0) {
		   System.out.println(nomeDoJogador + " escolheu: Pedra.");
	   } else if (escolhaJogador == 1) {
		   System.out.println(nomeDoJogador + " escolheu: Papel.");
	   } else {
		   System.out.println(nomeDoJogador + " escolheu: Tesoura.");   
	}

	   // ** Sortear o valor dentre 3 possibilidades
	   escolhaComputador = escolha.nextInt(3);
	   
	   
	   // ** Exibe a escolha do computador
	   if (escolhaComputador == 0) {
		   System.out.println("Escolha do computador: Pedra.");
	   } else if (escolhaComputador == 1) {
		   System.out.println("Escolha do computador: Papel.");
	   } else {
		   System.out.println("Escolha do computador: Tesoura.");
	
		// ** Determinar quem venceu
		// ** Se o jogador escolheu PEDRA
		if (escolhaJogador == 0) {
			if(escolhaComputador == 0) {
			   System.out.println("Empate!");
			} else if (escolhaComputador == 1) {
				System.out.println("Computador venceu!");
			} else {
				System.out.println(nomeDoJogador + " venceu!!!");
			}
			
		// ** Se o jogador escolheu PAPEL
		} else if (escolhaJogador == 1) {
			if(escolhaComputador == 0) {
				   System.out.println(nomeDoJogador + " venceu!!!");
				} else if (escolhaComputador == 1) {
					System.out.println("Empate!");
				} else {
					System.out.println("Computador venceu!");
				}
		
		// ** Se o jogador escolheu TESOURA	
		} else {
			if(escolhaComputador == 0) {
				   System.out.println("Computador venceu!");
				} else if (escolhaComputador == 1) {
					System.out.println(nomeDoJogador + " venceu!!!");
				} else {
					System.out.println("Empate!");
				}
		}
		System.out.println("FIM DE JOGO!");   
	   
		   
	   }
   }
}
	 