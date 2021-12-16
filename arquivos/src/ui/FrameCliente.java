package ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import dao.ClienteDao;
import model.Cliente;
import util.Util;

public class FrameCliente {

	private JLabel labelNome;
	private JTextField textNome;
	private JLabel labelCidade;
	private JTextField textCidade;
	private JLabel labelEstado;
	private JComboBox<String> comboEstados;
	private JLabel labelCep;
	private JTextField textCep;
	private JLabel labelTelefone;
	private JTextField textTelefone;
	private JLabel labelSalario;
	private JTextField textSalario;
	private JLabel labelSexo;
	private ButtonGroup radio;
	private JRadioButton radioFem;
	private JRadioButton radioMas;
	private JButton buttonGravar;
	private JScrollPane scrollTable;
	private JTable tabelaClientes;
	private DefaultTableModel tabelaClientesModelo;
	
	public void criarTela() {

		Color azul = new Color(218, 254, 239);
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setBackground(azul);
		tela.setTitle("Cadastro de Clientes");
		tela.setSize(505, 515);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);

		labelNome = new JLabel("Nome do cliente:");
		labelNome.setBounds(20, 20, 130, 30);
		textNome = new JTextField();
		textNome.setBounds(20, 50, 450, 30);

		labelCidade = new JLabel("Cidade:");
		labelCidade.setBounds(20, 80, 90, 30);
		textCidade = new JTextField();
		textCidade.setBounds(20, 110, 90, 30);

		labelEstado = new JLabel("Estado:");
		labelEstado.setBounds(120, 80, 90, 30);
		String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", 
				"GO", "MA", "MT", "MS", "MG", "PA", "PB", "PE", "PR", "PI", 
				"RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
		comboEstados = new JComboBox<String>(estados);
		comboEstados.setBounds(120, 110, 90, 30);

		labelCep = new JLabel("CEP:");
		labelCep.setBounds(220, 80, 90, 30);
		textCep = new JTextField();
		textCep.setBounds(220, 110, 100, 30);

		labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(20, 140, 90, 30);
		textTelefone = new JTextField();
		textTelefone.setBounds(20, 170, 90, 30);

		labelSalario = new JLabel("Salário:");
		labelSalario.setBounds(120, 140, 90, 30);
		textSalario = new JTextField();
		textSalario.setBounds(120, 170, 90, 30);

		labelSexo = new JLabel("Sexo:");
		labelSexo.setBounds(220, 140, 90, 30);

		radio = new ButtonGroup();

		radioFem = new JRadioButton("F");
		radioFem.setBounds(220, 170, 45, 30);
		radioFem.setSelected(true);
		radioMas = new JRadioButton("M");
		radioMas.setBounds(270, 170, 45, 30);

		radio.add(radioMas);
		radio.add(radioFem);

		buttonGravar = new JButton("Gravar Cliente");
		buttonGravar.setBounds(120, 220, 200, 30);
		
		criarTabela();

		tela.getContentPane().add(labelNome);
		tela.getContentPane().add(textNome);
		tela.getContentPane().add(labelCidade);
		tela.getContentPane().add(textCidade);
		tela.getContentPane().add(labelEstado);
		tela.getContentPane().add(comboEstados);
		tela.getContentPane().add(labelCep);
		tela.getContentPane().add(textCep);
		tela.getContentPane().add(labelTelefone);
		tela.getContentPane().add(textTelefone);
		tela.getContentPane().add(labelSalario);
		tela.getContentPane().add(textSalario);
		tela.getContentPane().add(labelSexo);
		tela.getContentPane().add(radioFem);
		tela.getContentPane().add(radioMas);
		tela.getContentPane().add(buttonGravar);
		tela.getContentPane().add(scrollTable);


		tela.setVisible(true);
		
		buttonGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
							
				if (validarFormulario()) {
					
					Cliente cliente = new Cliente();
					
					cliente.setCodigo(Util.gerarCodigo());
					cliente.setNome(textNome.getText());
					cliente.setCidade(textCidade.getText());
					cliente.setCep(textCep.getText().trim().toUpperCase());
					cliente.setTelefone(textTelefone.getText());
					cliente.setSalario(Double.parseDouble(textSalario.getText()));
					cliente.setEstado(comboEstados.getSelectedItem().toString());
					cliente.setSexo(radioFem.isSelected()?'F':'M'); // : = se não

					ClienteDao dao = new ClienteDao(cliente);
					dao.salvar();
					
					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
					
					limparFormulario();
					criarTabela();
					
				} else {
					JOptionPane.showMessageDialog(
							null, 
							"Você deve preencher todos os campos!", 
							"Atenção!", 
							JOptionPane.WARNING_MESSAGE);
					
				}
				
			}

		});
		
		tabelaClientes.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String codigo;
				int linha = tabelaClientes.getSelectedRow(); // Retorna a linha selecionada
				
				codigo = tabelaClientes.getModel().getValueAt(linha, 0).toString();
				
				ClienteDao dao = new ClienteDao();
				Cliente cliente = dao.buscarCliente(codigo);
				
				textNome.setText(cliente.getNome());
				textCep.setText(cliente.getCep());
				textCidade.setText(cliente.getCidade());
				textSalario.setText(String.valueOf(cliente.getSalario()));
				textTelefone.setText(cliente.getTelefone());
				
				if (cliente.getSexo() == 'M') {
					radioMas.setSelected(true);
				} else {
					radioFem.setSelected(true);
				}

				comboEstados.setSelectedItem(cliente.getEstado());
				
			}
		});
		
//		tabelaClientes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//			
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				
//				System.out.println("Clicou na tabela");
//				
//			}
//		});

	}

	private void criarTabela() {
		
		// PASSO 1 - CRIAR MODELO PARA A TABELA
		
		tabelaClientesModelo = new DefaultTableModel();
		tabelaClientesModelo.addColumn("Código");
		tabelaClientesModelo.addColumn("Nome");
		tabelaClientesModelo.addColumn("Telefone");
			
		ClienteDao clienteDao = new ClienteDao();
		ArrayList<Cliente> clientes = clienteDao.listarClientes();
		
		for (Cliente cliente : clientes) {
			String[] vetorCliente = {cliente.getCodigo(), cliente.getNome(), cliente.getTelefone()};
			tabelaClientesModelo.addRow(vetorCliente);
			
		}
		
		// PASSO 2 - CRIAR A TABELA
		
		tabelaClientes = new JTable(tabelaClientesModelo);
		
		// DETERMINAR A LARGURA DAS COLUNAS

		tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(90);
		tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
		tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(110);
	
		// NÃO PERMITE ALTERAR O TAMANHO DA COLUNA
		tabelaClientes.getColumnModel().getColumn(0).setResizable(false);

		// NÃO PERMITE MUDAR A POSIÇÃO DAS COLUNAS
		tabelaClientes.getTableHeader().setReorderingAllowed(false);

		// PASSO 3 - COLOCAR A TABELA NO PAINEL DE ROLAGEM
		
		scrollTable = new JScrollPane(tabelaClientes);
		scrollTable.setBounds(20, 260, 450, 200);		

	
	}
	
	private void limparFormulario() {
		textNome.setText("");
		textCidade.setText("");
		textCep.setText("");
		textSalario.setText("");
		textTelefone.setText("");
		textNome.requestFocus();
	}

	private boolean validarFormulario() {
		
		boolean valido = true;

		if (textNome.getText().trim().length() == 0) {
			labelNome.setForeground(Color.red);;
			valido = false;
		} else if (textCidade.getText().trim().length() == 0) {
			labelCidade.setForeground(Color.red);
			valido = false;
		} else if (textCep.getText().trim().length() == 0) {
			labelCep.setForeground(Color.red);
			valido = false;
		} else if (textTelefone.getText().trim().length() == 0) {
			labelTelefone.setForeground(Color.red);
			valido = false;
		} else if (textSalario.getText().trim().length() == 0) {
			labelSalario.setForeground(Color.red);
			valido = false;
		}
		
		return valido;
		
	}	
	
}
