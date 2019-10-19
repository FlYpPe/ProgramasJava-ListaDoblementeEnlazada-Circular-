public class NodoC {
	private int dato;
	private NodoC enlace;

	public NodoC(int entrada) {
		dato = entrada;
		enlace = this;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoC getEnlace() {
		return enlace;
	}

	public void setEnlace(NodoC enlace) {
		this.enlace = enlace;
	}

	@Override
	public String toString() {
		return "NodoC [dato=" + dato + ", enlace=" + enlace + "]";
	}

	
	
	
}