import Conjunto.Conjunto;

public class Main {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Jean");
		conjunto.adiciona("Jean");
		conjunto.adiciona("Kaeya");
		conjunto.adiciona("Diluc");
		conjunto.adiciona("Lisa");
		conjunto.adiciona("Noelle");
		conjunto.adiciona("Eula");
		conjunto.adiciona("Klee");
		System.out.println(conjunto);
		conjunto.remove("Klee");
		System.out.println(conjunto);
	}
}
