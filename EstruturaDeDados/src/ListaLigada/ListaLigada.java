package ListaLigada;

public class ListaLigada {
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;

		if (tamanho() == 0)
			this.ultima = this.primeira;

		this.totalElementos++;
	}

	public void adiciona(Object elemento) {
		if (tamanho() == 0)
			adicionaNoComeco(elemento);
		else {
			Celula nova = new Celula(elemento, null);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.totalElementos++;
		}
	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0)
			adicionaNoComeco(elemento);
		else if (posicao == tamanho())
			adiciona(elemento);
		else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula novo = new Celula(elemento, pegaCelula(posicao));
			anterior.setProximo(novo);
			this.totalElementos++;
		}
	}

	public Celula pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao))
			throw new IllegalArgumentException("Posição Inexistente!");
		Celula atual = primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {
		if (tamanho() == 0)
			throw new IllegalArgumentException("Lista Vazia!");

		this.primeira = this.primeira.getProximo();
		this.totalElementos--;

		if (tamanho() == 0)
			this.ultima = null;

	}

	public void remove(int posicao) {
		Celula anterior = pegaCelula(posicao - 1);
		Celula seguinte = pegaCelula(posicao).getProximo();
		anterior.setProximo(seguinte);
		this.totalElementos--;
	}

	public int tamanho() {
		return this.totalElementos;
	}
	
	public boolean contem(Object o) {
		Celula atual = primeira;
		for (int i = 0; i < tamanho(); i++) {
			if (atual.getElemento() == o)
				return true;
			atual = atual.getProximo();
		}
		return false;
	}
		
	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}
	
	@Override
	public String toString() {
		if (tamanho() == 0)
			return "[]";

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < tamanho(); i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}
}
