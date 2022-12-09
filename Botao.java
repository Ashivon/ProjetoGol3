package Codigos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Path;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Botao {
	public Teclado teclado;
	
	public Botao(Teclado teclado, JLabel label) {
		this.teclado=teclado;
	}
	
	public JButton criarbotoes(int i, Teclado teclado) {
		JButton botao;
		Path Banco = Path.of("C:\\Users\\ashiv\\eclipse-workspace\\Prova3\\src\\BoloesdaCopa");
		
		if(i==0) {
			botao = new JButton();
			botao.setText("Cadastrar Novo Bolão");
			botao.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Caixas caixa = new Caixas(Banco);
				}
			});
		}else {
			botao = new JButton();
			botao.setText("Mostrar Bolões Cadastrados");
			botao.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						MostrarBolao mostrar = new MostrarBolao(Banco);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		}		
		return botao;
	}
}
