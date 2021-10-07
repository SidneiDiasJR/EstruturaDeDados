import Fila.Fila;

public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adicionar("Jean");
		fila.adicionar("Kaeya");
		fila.adicionar("Diluc");
		fila.adicionar("Lisa");
		fila.adicionar("Klee");
		System.out.println(fila);
		System.out.println(fila.proximo());
		System.out.println(fila.estaVazia());
		System.out.println(fila);
	}
}
