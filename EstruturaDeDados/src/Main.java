import ArmazenamentoSequencial.*;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Klee");
		Aluno a2 = new Aluno("Sayu");
		Aluno a3 = new Aluno("Diona");
		Aluno a4 = new Aluno("Qiqi");
		Vetor lista = new Vetor();

		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);

		System.out.println(a1 + " está na lista? " + lista.contem(a1));
		System.out.println(lista);
		System.out.println("Quantidade de Alunos: " + lista.tamanho());

		lista.adiciona(0, a4);
		System.out.println("\n" + lista);
		System.out.println("Quantidade de Alunos: " + lista.tamanho());

		lista.remove(1);
		System.out.println("\n" + a1 + " está na lista? " + lista.contem(a1));
		System.out.println(lista);
		System.out.println("Quantidade de Alunos: " + lista.tamanho());

		for (int i = lista.tamanho(); i < 400; i++)
			lista.adiciona(new Aluno("Childe" + i));
		
		System.out.println(lista);
		System.out.println("Quantidade de Alunos: " + lista.tamanho());
		lista.adiciona(5,new Aluno("Tartaglia"));
		System.out.println(lista);
		System.out.println("Quantidade de Alunos: " + lista.tamanho());
	}
}
