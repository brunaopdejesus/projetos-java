package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class LerEscreverArquivo {

	public static void main(String[] args) {

		String[] frutas = {"maçã", "pêra", "goiaba", "melancia"};
		System.out.println(frutas[3]);
		
		String[][] mercado = {{"maçã", "pêra", "goiaba"}, {"couve", "alface", "agrião"}, {"coca-cola", "fanta uva", "corote"}};
		
		System.out.println(mercado[1][1]);
		// Vetor de vetor
		
		String[][] clientes = {{"1", "Ana", "8957"}, {"2", "Pedro", "5635"}, {"3", "José", "2357"}};

		System.out.println(clientes[1].length);
		
}
	private static void lerArquivo() {
		// String hoje = "08/06/2021";
		//
		// String[] dataSeparada = hoje.split("/");
		//
		// System.out.println(hoje);
		// System.out.println(dataSeparada[0]);
		// System.out.println(dataSeparada[2]);
		// System.out.println("--------------");
		//

		// Procedimento para abrir um arquivo para leitura ou escrita
		// 1º Obter o caminho do arquivo
		Path path = Paths.get("C:/Users/21192918/clientes.txt");

		// 2º Criar o Buffer para o arquivo
		try {

			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));

			String linha = reader.readLine();

			while (linha != null) {
				String[] cliente = linha.split(";");

//				if (cliente[3].equals("SP") || cliente[3].equals("RJ")) {
//					System.out.printf("ENCONTRADO! Código: %s - Nome: %s - Salário: %s\n", cliente[0], cliente[1],
//							cliente[6]);
//					break;
//				}
				System.out.printf("ENCONTRADO! Código: %s - Nome: %s - Salário: %s\n", cliente[0], cliente[1],
						cliente[6]);
				linha = reader.readLine();
			}

			System.out.println("FIM!");

		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo!");

		}
	}

}
