import ListaLigada.ListaLigada;

public class Main {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Barbatos");
		lista.adiciona("Morax");
		lista.adiciona("Baal");
		lista.adiciona("Belzebul");
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
	}
}
