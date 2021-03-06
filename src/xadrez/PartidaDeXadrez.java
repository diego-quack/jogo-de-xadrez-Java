package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] match = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0; i < tabuleiro.getLinhas(); i++) {
			for(int j = 0; j < tabuleiro.getColunas(); j++) {
				match[i][j] = (PecaDeXadrez) tabuleiro.pecas(i, j);
			}
		}
		return match;
	}
	
	private void setupInicial() {
		
	}

}
