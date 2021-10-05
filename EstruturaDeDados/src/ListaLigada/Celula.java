package ListaLigada;

public class Celula {
	private Object elemento;
	private Celula anterior;
	private Celula proximo;

	public Celula (Object elemento, Celula proximo, Celula anterior) {
		this(elemento, proximo);
		setAnterior(anterior);
	}
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		setProximo(proximo);
	}

	public Celula(Object elemento) {
		this(elemento, null);
	}

	public Celula getProximo() {
		return this.proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Celula getAnterior() {
		return this.anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Object getElemento() {
		return this.elemento;
	}

}
