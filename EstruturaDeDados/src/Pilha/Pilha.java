package Pilha;

import ListaLigada.*;

public class Pilha {

	private ListaLigada pilha = new ListaLigada();

	public void push(String nome) {
		this.pilha.adiciona(nome);
	}

	public String pop() {
		if (this.isEmpty())
			throw new IllegalArgumentException("N�o existem itens para remo��o!");
		String removido = pick();
		this.pilha.removeDoFim();
		return removido;
	}

	public String pick() {
		if(this.isEmpty())
			return "A Pilha est� Vazia!";
		return (String)this.pilha.getUltima().getElemento();
	}

	public boolean isEmpty() {
		return this.pilha.tamanho() == 0;
	}
	
	@Override
	public String toString() {
		return this.pilha.toString();
	}
}
