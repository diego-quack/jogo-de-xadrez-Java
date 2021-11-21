package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private PecaDoJogo[][] pecas;
	
	public Tabuleiro() {
		
	}

	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro na criação de tabuleiro: É necessário que exista pelo menos uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new PecaDoJogo[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public PecaDoJogo pecas(int linha, int coluna) {
		if(!verificarSePosicaoExiste(linha, coluna)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	public PecaDoJogo pecas(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void posicionarPeca(PecaDoJogo peca, Posicao posicao) {
		if(existeUmaPeca(posicao)) {
			throw new TabuleiroException("Já existe uma peça na posição: " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean verificarSePosicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return verificarSePosicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean existeUmaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posição não existe no tabuleiro");
		}
		return pecas(posicao) != null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
