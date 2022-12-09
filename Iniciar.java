package Codigos;

import javax.swing.JOptionPane;

public class Iniciar {
	Object[] opcoes = {"BRA", "HOL", "ARG", "EUA", "AUS", "FRA", "POL", "ING", "SEN", "CRO", "JPN", "KOR", "MAR", "ESP", "SUI", "POR"};
	Object[] gols = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	public String pais, pais1, pais2;
	public int gol1, gol2;
	public int placar;
	public String[] jogoOitFinal = new String[8];
	public String[] jogoQuarFinal= new String[4];
	public String[] jogoSemFinal = new String[2];
	public String Campeao;
	public String texto="";
	
	public Iniciar(String texto) {
		int cont=0;
		for(int c=0; c<16; c++) {
			pais=(String) JOptionPane.showInputDialog(null, "Escolha a seleção:", "OITAVAS DE FINAL", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			placar=(int)JOptionPane.showInputDialog(null, "Digite os gols feitos por "+pais, "PLACAR", JOptionPane.INFORMATION_MESSAGE, null, gols, gols[0]);
			
			if(c%2==0) {
				texto+=pais+" "+placar+" X";
				gol1=placar;
				pais1=pais;
			} else {
				texto+=" "+placar+" "+pais+";";
				gol2=placar;
				pais2=pais;
				
				if(gol1>gol2) {
					jogoOitFinal[cont]=pais1;
					cont++;
				} else{
					jogoOitFinal[cont]=pais2;
					cont++;
				}
			}
		}
		cont=0;
		QuartasdeFinal(jogoOitFinal, cont, texto);
	}
	
	public void QuartasdeFinal(String[] jogo, int cont, String texto) {
		for(int i=0; i<8; i++) {
			if(i%2==0){
				pais1=jogo[i];
				
				placar=(int) JOptionPane.showInputDialog(null, "Digite quantos gols do: "+pais1, "QUARTAS DE FINAL", JOptionPane.INFORMATION_MESSAGE, null, gols, gols[0]);
				gol1=placar;
				texto+=pais1+" "+placar+" X";
			} else {
				pais2=jogo[i];
				
				
				
				placar=(int) JOptionPane.showInputDialog(null, "Digite quantos gols do: "+pais2, "QUARTAS DE FINAL", JOptionPane.INFORMATION_MESSAGE, null, gols, gols[0]);
				gol2=placar;
				
				texto+=" "+placar+" "+pais2+";";
				
				if(gol1>gol2){
					jogoQuarFinal[cont]=pais1;
					cont++;
				} else {
					jogoQuarFinal[cont]=pais2;
					cont++;
				}
			}
		}
		cont=0;
		SemiFinal(cont, jogoQuarFinal, texto);
	}
	
	public void SemiFinal(int cont, String[] jogo, String texto) {
		for(int i=0; i<4; i++) {
			if(i%2==0){
				pais1=jogo[i];
				
				placar=(int) JOptionPane.showInputDialog(null, "Digite quantos gols do: "+pais1, "SEMI FINAL", JOptionPane.INFORMATION_MESSAGE, null, gols, gols[0]);
				gol1=placar;
				texto+=pais1+" "+placar+" X";
			} else {
				pais2=jogo[i];
				
				
				
				placar=(int) JOptionPane.showInputDialog(null, "Digite quantos gols do: "+pais2, "SEMI FINAL", JOptionPane.INFORMATION_MESSAGE, null, gols, gols[0]);
				gol2=placar;
				
				texto+=" "+placar+" "+pais2+";";
				
				if(gol1>gol2){
					jogoSemFinal[cont]=pais1;
					cont++;
				} else {
					jogoSemFinal[cont]=pais2;
					cont++;
				}
			}
		}
		cont=0;
		Final(cont, jogoSemFinal, texto);
	}
	
	public void Final(int cont, String[] jogo, String texto) {
		for(int i=0; i<2; i++) {
			if(i%2==0){
				pais1=jogo[i];
				
				placar=(int) JOptionPane.showInputDialog(null, "Digite quantos gols do: "+pais1, "FINAL", JOptionPane.INFORMATION_MESSAGE, null, gols, gols[0]);
				gol1=placar;
				texto+=pais1+" "+placar+" X";
			} else {
				pais2=jogo[i];
				
				
				
				placar=(int) JOptionPane.showInputDialog(null, "Digite quantos gols do: "+pais2, "FINAL", JOptionPane.INFORMATION_MESSAGE, null, gols, gols[0]);
				gol2=placar;
				
				texto+=" "+placar+" "+pais2+";";
				
				if(gol1>gol2){
					Campeao=pais1;
				} else {
					Campeao=pais2;
				}
			}
		}
		texto+=Campeao+";";
		this.texto=texto;
		System.out.println(texto);
	}
}
