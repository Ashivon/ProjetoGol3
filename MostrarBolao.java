package Codigos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JOptionPane;

public class MostrarBolao {
	public String texto;
	
	public MostrarBolao(Path Banco) throws IOException {
		byte[] bytes = Files.readAllBytes(Banco);
		texto= new String(bytes);
		
		System.out.println(texto);
		JOptionPane.showConfirmDialog(null, texto, "BOLÕES", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
	}
}
