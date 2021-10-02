package ArmazenamentoSequencial;

import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalAlunos = 0;

	public void adiciona(Aluno aluno) {
		redimensiona();
		this.alunos[totalAlunos] = aluno;
		totalAlunos++;
	}

	public boolean isValido(int posicao) {
		return posicao >= 0 && posicao <= totalAlunos;
	}

	public void adiciona(int posicao, Aluno aluno) {
		redimensiona();
		if (!isValido(posicao))
			throw new IllegalArgumentException("Posição Inválida!");
		else {
			for (int i = totalAlunos; i > posicao; i--) {
				alunos[i] = alunos[i - 1];
			}
			this.alunos[posicao] = aluno;
			totalAlunos++;
		}
	}

	public boolean isOcupado(int posicao) {
		return posicao >= 0 && posicao < totalAlunos;
	}

	public Aluno pega(int posicao) {
		if (isOcupado(posicao))
			return alunos[posicao];
		else
			throw new IllegalArgumentException("Posição Inválida!");
	}

	public void remove(int posicao) {
		for (int i = posicao; i < this.totalAlunos; i++) {
			alunos[i] = alunos[i + 1];
		}
		totalAlunos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalAlunos; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalAlunos;
	}
	
	public void redimensiona() {
		if(tamanho() == this.alunos.length) {
			Aluno[] novoVetor = new Aluno[tamanho()*2];
			for(int i = 0; i < this.alunos.length; i++)
				novoVetor[i] = this.alunos[i];
			this.alunos = novoVetor;
		}
	}

	public String toString() {
		return Arrays.toString(alunos);
	}
}
