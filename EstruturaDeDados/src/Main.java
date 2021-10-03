import ListaLigada.ListaLigada;

public class Main {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Ganyu");
		System.out.println(lista);
		lista.adicionaNoComeco("Xiao");
		System.out.println(lista);
		lista.adiciona("Yanfei");
		System.out.println(lista);
		lista.adiciona(1,"Pervases");
		System.out.println(lista);
		lista.adiciona(4,"Azhdaha");
		System.out.println(lista);
		lista.adiciona(0,"Guoba");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		//lista.adiciona(7,"Mountain Shaper");
		Object msg = lista.pega(2);
		System.out.println(msg);
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.contem("Guoba"));
		System.out.println(lista.contem("Ganyu"));
		lista.remove(2);
		System.out.println(lista);
	}
}
