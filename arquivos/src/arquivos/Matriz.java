package arquivos;

import java.lang.reflect.Array;
import java.util.ArrayList;

import model.Cliente;

public class Matriz {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<>();
		notas.add(8.9);
		notas.add(7.6);
		notas.add(5.9);
		notas.add(7.0);
		
		System.out.println(notas.get(1));
		System.out.println(notas.get(2));

		notas.set(2, 10.0);

		System.out.println(notas.get(2));
		System.out.println(notas);
		
		
		Cliente c1 = new Cliente();
		c1.setCodigo("0001");
		c1.setNome("Pedro");
		c1.setEstado("SP");

		Cliente c2 = new Cliente();
		c2.setCodigo("0009");
		c2.setNome("Ana");
		c2.setEstado("RJ");
		
		Cliente teste = new Cliente();
		teste.setCodigo("0548");
		teste.setNome("Roberta");
		teste.setEstado("RS");
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(teste);
		
		System.out.println(clientes.get(2).getNome());
		
		
		
		
//		int x[] = {8, 15, 12, 58, 101, 78};
//		int[]y = {1, 2, 3, 8, 45, 25, 33, 67};
//		
////		Começa em 0
//		System.out.println(x[3]);
//		System.out.println(y[6]);
//		System.out.println(x[2]);
//
//		x[2] = 21;
//		System.out.println(x[2]);
//		
//		String[] frutas = {"Laranja", "Banana", "Maçã", "Uva", "Caqui"};
//		System.out.println(frutas[2]);
//		
//		System.out.println(frutas.length);
//		
//		System.out.println("-----------------");
//		for(int i = 0; i < frutas.length; i++) {
//			System.out.println(frutas[i]);
//		}

		
	}
}
