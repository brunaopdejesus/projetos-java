package br.com.estacionabem;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.estacionabem.model.Cliente;
import br.com.estacionabem.model.Empresa;
import br.com.estacionabem.model.Funcionario;
import br.com.estacionabem.model.Movimento;
import br.com.estacionabem.model.TipoCliente;
import br.com.estacionabem.model.TipoVeiculo;
import br.com.estacionabem.model.Vaga;
import br.com.estacionabem.model.Veiculo;

public class Teste {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		empresa.setCnpj("46.298.573/0001-44");
		empresa.setNomeFantasia("Estacionamento do seu Jorge");
		empresa.setRazaoSocial("Estaciona Bem");
		
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro dos Santos Monteiro");
		pedro.setEmail("pedro.santos@uol.com.br");
		pedro.setRg("92.734.958-98");
		pedro.setTelefone("(11)98344-9238");
		pedro.setMensalidade(200);
		pedro.setTipo(TipoCliente.MENSALISTA);
		
		Cliente maria = new Cliente();
		maria.setNome("Maria Oliveira");
		maria.setEmail("maria.oliveira@uol.com.br");
		maria.setRg("55.744.938-08");
		maria.setTelefone("(11)92764-3842");
		maria.setMensalidade(0);
		maria.setTipo(TipoCliente.AVULSO);
		
		Funcionario carlos = new Funcionario();
		carlos.setNome("Carlos da Silva");
		carlos.setEmail("carlos.silva@uol.com.br");
		carlos.setRg("83.298.893-34");
		carlos.setTelefone("(11)97342-8347");
		carlos.setDataAdmissao(LocalDate.of(2020, 3, 17));
		carlos.setFuncao("Manobrista");
		carlos.setSalario(1200);
		
		Vaga vaga1 = new Vaga();
		vaga1.setNumeroVaga("A-001");
		vaga1.setOcupado(true);
		vaga1.setTempoTolerancia(LocalTime.of(0, 10));
		vaga1.setTipoVaga(TipoVeiculo.PASSEIO);
		vaga1.setValorHora(20);
		vaga1.setValorHoraAdicional(15);
		
		Vaga vaga2 = new Vaga();
		vaga2.setNumeroVaga("A-002");
		vaga2.setOcupado(false);
		vaga2.setTempoTolerancia(LocalTime.of(0, 10));
		vaga2.setTipoVaga(TipoVeiculo.MOTO);
		vaga2.setValorHora(10);
		vaga2.setValorHoraAdicional(7);
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setCliente(pedro);
		veiculo1.setCor("Vermelho");
		veiculo1.setModelo("Gol");
		veiculo1.setPlaca("PNC-5496");
		veiculo1.setTipo(TipoVeiculo.PASSEIO);
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setCliente(maria);
		veiculo2.setCor("Amarelo");
		veiculo2.setModelo("Twister");
		veiculo2.setPlaca("JFC-8273");
		veiculo2.setTipo(TipoVeiculo.MOTO);
		
		Movimento mov1 = new Movimento();
		mov1.setVeiculo(veiculo1);
		mov1.setFuncionario(carlos);
		mov1.setVaga(vaga1);
		mov1.setDataEntrada(LocalDate.of(2021, 5, 25));
		mov1.setHoraEntrada(LocalTime.of(9, 18));
		
		gerarCupom(mov1);
		
		Movimento mov2 = new Movimento();
		mov2.setVeiculo(veiculo2);
		mov2.setFuncionario(carlos);
		mov2.setVaga(vaga2);
		mov2.setDataEntrada(LocalDate.of(2021, 5, 24));
		mov2.setHoraEntrada(LocalTime.of(16, 51));
		
		gerarCupom(mov2);
	}
	
	private static void gerarCupom(Movimento m) {
		System.out.println("-----------------------------------");
		System.out.println(m.getVeiculo().getCliente().getNome());
		System.out.println(m.getVeiculo().getPlaca());
		System.out.println(m.getVeiculo().getModelo());
		System.out.println(m.getVeiculo().getTipo());
		System.out.println(m.getVaga().getNumeroVaga());
		System.out.println(m.getDataEntrada());
		System.out.println(m.getHoraEntrada());
		System.out.println("-----------------------------------");
		System.out.println("");
	}

}







