package Codigos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JOptionPane;

public class Caixas {
	public String texto="", nomeUser="";
	public int escolhaUser;
	Object[] options = { "SIM", "NÃO" };
	
	public Caixas(Path Banco) {
//		Path Banco = Path.of("C:\\Users\\ashiv\\eclipse-workspace\\Prova3\\src\\BoloesdaCopa");
		
		nomeUser=(String) JOptionPane.showInputDialog(null, "Digite seu nome:");
//		JOptionPane.showMessageDialog(null,"Deseja cadastrar um Bolão?", "Bolão da Copa", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
		texto=nomeUser+";";
		
		escolhaUser=JOptionPane.showOptionDialog(null, "Deseja realizar o Bolão da Copa "+texto+"?", "BOLÃO DA COPA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if(escolhaUser==0) {
			Iniciar Bolão = new Iniciar(texto);
			texto=Bolão.texto;
			
//			JOptionPane.showMessageDialog(null,"Sua resposta foi:"+escolhaUser, "Bolão da Copa", JOptionPane.INFORMATION_MESSAGE);
			try (FileWriter f = new FileWriter("C:\\Users\\ashiv\\eclipse-workspace\\Prova3\\src\\BoloesdaCopa", true);
				BufferedWriter b = new BufferedWriter(f);
				PrintWriter p = new PrintWriter(b);){
					p.println(Bolão.texto);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(escolhaUser==1) {
			return;
		}
	}
}