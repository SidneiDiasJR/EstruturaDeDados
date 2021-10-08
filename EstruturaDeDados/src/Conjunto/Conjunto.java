package Conjunto;

import java.util.ArrayList;
import ListaLigada.ListaLigada;

public class Conjunto {
	private ArrayList<ListaLigada> tabela = new ArrayList<ListaLigada>();

	public Conjunto() {
		for (int i = 0; i < 26; i++)
			this.tabela.add(new ListaLigada());
	}

	public int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
	}

	public void adiciona(String palavra) {
		if (!contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);
			ListaLigada lista = tabela.get(indice);
			lista.adiciona(palavra);
		}
	}
	
	public void remove(String palavra) {
		if(contem(palavra)) {
			int indice = calculaIndiceDaTabela(palavra);
			ListaLigada lista = tabela.get(indice);
			lista.remove(palavra);
		}
	}

	public boolean contem(String palavra) {
		int indice = calculaIndiceDaTabela(palavra);
		return tabela.get(indice).contem(palavra);
	}
	
	@Override
	public String toString() {
		return this.tabela.toString();
	}
}
