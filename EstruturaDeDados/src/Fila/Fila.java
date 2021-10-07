package Fila;

import ListaLigada.ListaLigada;

public class Fila {
	private ListaLigada fila = new ListaLigada();

	public void adicionar(Object elemento) {
		this.fila.adiciona(elemento);
	}

	public Object remover() {
		if(estaVazia())
			throw new IllegalArgumentException("Não há elementos para remoção!");
		Object removido = proximo();
		this.fila.removeDoComeco();
		return removido;
	}
	
	public Object proximo() {
		return this.fila.getPrimeira().getElemento();
	}
	
	public boolean estaVazia() {
		return this.fila.tamanho() == 0;
	}
	
	@Override
	public String toString() {
		return this.fila.toString();
	}
}
