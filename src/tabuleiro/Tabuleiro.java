package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private PecaDoJogo[][] pecas;
	
	public Tabuleiro() {
		
	}

	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new PecaDoJogo[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public PecaDoJogo pecas(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public PecaDoJogo pecas(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void posicionarPeca(PecaDoJogo peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
