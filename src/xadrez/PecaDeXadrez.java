package xadrez;

import tabuleiro.PecaDoJogo;
import tabuleiro.Tabuleiro;

public class PecaDeXadrez extends PecaDoJogo{
	
	private Cor cor;
	
	public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
}
