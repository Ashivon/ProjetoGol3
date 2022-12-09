package Codigos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
	public JPanel painel;
	
	public Menu(Display disp) {
		setSize(400, 250);
		this.painel=disp;
		add(disp);
		setVisible(true);
	}
}
