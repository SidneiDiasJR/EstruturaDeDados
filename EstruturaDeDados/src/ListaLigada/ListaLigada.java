package ListaLigada;

public class ListaLigada {
	private Celula primeira = null;
	private Celula ultima = null;
	private int totalElementos = 0;

	public void adicionaNoComeco(Object elemento) {
		if (tamanho() == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula novaPrimeira = new Celula(elemento, this.primeira);
			this.primeira.setAnterior(novaPrimeira);
			this.primeira = novaPrimeira;
		}

		this.totalElementos++;
	}

	public void adiciona(Object elemento) {
		if (tamanho() == 0)
			adicionaNoComeco(elemento);
		else {
			Celula novaUltima = new Celula(elemento, null, this.ultima);
			this.ultima.setProximo(novaUltima);
			this.ultima = novaUltima;
			this.totalElementos++;
		}
	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0)
			adicionaNoComeco(elemento);
		else if (posicao == tamanho())
			adiciona(elemento);
		else {
			Celula anterior = this.pegaCelula(posicao).getAnterior();
			Celula proximo = anterior.getProximo();
			Celula novo = new Celula(elemento, proximo, anterior);
			anterior.setProximo(novo);
			proximo.setAnterior(novo);
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

	public void removeDoFim() {
		if (tamanho() == 1)
			removeDoComeco();
		else if (tamanho() == 0)
			throw new IllegalArgumentException("Lista Vazia!");
		else {
			this.ultima = this.ultima.getAnterior();
			this.ultima.setProximo(null);
			this.totalElementos--;
		}
	}

	public void remove(int posicao) {
		if (posicao == 0)
			removeDoComeco();
		else if (posicao == tamanho()-1)
			removeDoFim();
		else {
			Celula anterior = pegaCelula(posicao).getAnterior();
			Celula proximo = anterior.getProximo().getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			this.totalElementos--;
		}
	}
	
	public void remove(Object elemento) {
		Celula atual = primeira;
		for (int i = 0; i < tamanho(); i++) {
			if(atual.getElemento() == elemento)
				remove(i);
			atual = atual.getProximo();
		}
	}

	public int tamanho() {
		return this.totalElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = primeira;
		for (int i = 0; i < tamanho(); i++) {
			if (atual.getElemento() == elemento)
				return true;
			atual = atual.getProximo();
		}
		return false;
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}
	
	public Celula getUltima() {
		return this.ultima;
	}

	public Celula getPrimeira() {
		return this.primeira;
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
