package Codigos;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teclado extends JPanel {
	public JPanel painel;
	public JLabel label;
	public String texto = "Funcionalidades do Bolão";
	
	public Teclado () {
		add(criarescolhas());
	}
	
	public JPanel criarescolhas() {
		painel = new JPanel();
		Botao escolha = new Botao(this, label);
		
		for(int i=0; i<2; i++) {
			painel.add(escolha.criarbotoes(i, this));
		}
		
		return painel;
	}
}
