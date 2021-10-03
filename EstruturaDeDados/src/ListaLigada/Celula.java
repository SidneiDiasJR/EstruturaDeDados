package ListaLigada;

public class Celula {
	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		setProximo(proximo);
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public Object getElemento() {
		return this.elemento;
	}

	

}
