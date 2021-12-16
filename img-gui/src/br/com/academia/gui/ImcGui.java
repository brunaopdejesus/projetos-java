package br.com.academia.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ImcGui {

	public void desenharTela() {
		
		Color azulLindo = new Color(146, 187, 218);
		Color azulFofo = new Color(62, 75, 244);
		Font titulo = new Font("Bell MT", Font.BOLD, 27);
		Font titulo2 = new Font("Times New Roman", Font.BOLD, 45);
		Font titulo3 = new Font("Bell MT", Font.BOLD, 25);
		
		JFrame telaImc = new JFrame();
		telaImc.setSize(500, 320); // largura e altura
		telaImc.setTitle("Calculadora IMC");
		telaImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaImc.getContentPane().setBackground(azulLindo);
		telaImc.setLayout(null);
		
		JLabel labelTituloImc = new JLabel();
		labelTituloImc.setBounds(10, 10, 100, 30);
		labelTituloImc.setForeground(Color.white);
		labelTituloImc.setFont(titulo);
		labelTituloImc.setText("IMC");
		
		JLabel labelsSubtitulo = new JLabel();
		labelsSubtitulo.setBounds(10, 40, 200, 30); // y = height + y (30 + 10)
		labelsSubtitulo.setForeground(Color.white);
		labelsSubtitulo.setText("Índice de Massa Corporal");
		
		JLabel labelPerguntaPeso = new JLabel();
		labelPerguntaPeso.setBounds(10, 70, 200, 30);
		labelPerguntaPeso.setForeground(Color.white);
		labelPerguntaPeso.setText("Qual o seu peso?");
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(10, 100, 170, 30);
		textFieldPeso.setHorizontalAlignment(JTextField.RIGHT);
		
		JLabel labelPerguntaAltura = new JLabel();
		labelPerguntaAltura.setBounds(10, 130, 200, 30);
		labelPerguntaAltura.setForeground(Color.white);
		labelPerguntaAltura.setText("Qual a sua altura?");
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(10, 160, 170, 30);
		textFieldAltura.setHorizontalAlignment(JTextField.RIGHT);

		JLabel labelResultado = new JLabel();
		labelResultado.setBounds(270, 105, 130, 50);
		labelResultado.setHorizontalAlignment(JLabel.CENTER);
		labelResultado.setForeground(Color.white);
		labelResultado.setFont(titulo2);
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setBounds(270, 155, 130, 30);
		labelStatusImc.setHorizontalAlignment(JLabel.CENTER);
		labelStatusImc.setFont(titulo3);
		labelStatusImc.setForeground(Color.white);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setBounds(10, 210, 170, 35);
		buttonCalcular.setText("Calcular IMC");
		buttonCalcular.setForeground(Color.white);
		buttonCalcular.setBackground(azulFofo);
		
		telaImc.getContentPane().add(labelTituloImc);
		telaImc.getContentPane().add(labelsSubtitulo);
		telaImc.getContentPane().add(labelPerguntaPeso);
		telaImc.getContentPane().add(textFieldPeso);
		telaImc.getContentPane().add(labelPerguntaAltura);
		telaImc.getContentPane().add(textFieldAltura);
		telaImc.getContentPane().add(labelResultado);
		telaImc.getContentPane().add(labelStatusImc);
		telaImc.getContentPane().add(buttonCalcular);

		telaImc.setVisible(true);

		// Ouvinte de eventos
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double peso = Double.parseDouble(textFieldPeso.getText());
				double altura = Double.parseDouble(textFieldAltura.getText());
				double imc = calcularImc(peso, altura);
				
				
				labelResultado.setText(String.format("%.1f", imc));	
			
			}
		});
		
		textFieldPeso.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Code: " + e.getKeyCode());
				System.out.println("Char: " + e.getKeyChar());

				if(e.getKeyCode() == 10) {
					textFieldAltura.requestFocus();
				}
				
//				System.out.println(e.getKeyCode());
//				 pega o código da tecla

			}
		});
	
	}

	private double calcularImc(double peso, double altura) {
	
		return peso / Math.pow(altura, 2);
		
  }
	
}
