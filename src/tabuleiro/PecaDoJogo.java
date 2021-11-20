package tabuleiro;

public abstract class PecaDoJogo {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public PecaDoJogo() {

	}

	public PecaDoJogo(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void movimentosPermitidos(PecaDoJogo[][] peca) {

	}

}
