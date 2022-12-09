package Codigos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel{
	public Teclado teclado;
	public JLabel label;

	public Display(Teclado teclas) {
		this.setBackground(Color.CYAN);

		label =  new JLabel();
		label.setText(teclas.texto);

		this.teclado=teclas;
		this.teclado.label=label;

		setLayout(new GridLayout(2, 1));
		add(label, BorderLayout.NORTH);
		add(teclado, BorderLayout.SOUTH);
	}
}