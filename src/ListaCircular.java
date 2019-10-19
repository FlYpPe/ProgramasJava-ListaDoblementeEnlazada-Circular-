public class ListaCircular {

	private NodoC nodoInicio;

	public ListaCircular() {
		nodoInicio = null;
	}

	public void insertarElemento(int entrada) {
		NodoC nuevo;
		nuevo = new NodoC(entrada);
		if (nodoInicio != null) {
			nuevo.setEnlace(nodoInicio.getEnlace());
			nodoInicio.setEnlace(nuevo);
		}
		nodoInicio = nuevo;
		
	}

	public void mostrarElementos() {
		NodoC aux;
		if (nodoInicio != null) {
			aux = nodoInicio.getEnlace();
			do {
				System.out.print("[" + aux.getDato() + "]-->");
				aux = aux.getEnlace();
			} while (aux != nodoInicio.getEnlace());
		}
	}

	public void eliminarElemento(int entrada) {
		NodoC actual;
		boolean en = false;
		actual = nodoInicio;
		while ((actual.getEnlace() != nodoInicio) && (!en)) {
			en = (actual.getEnlace().getDato() == entrada);
			if (!en) {
				actual = actual.getEnlace();
			}
		}
		en = (actual.getEnlace().getDato() == entrada);
		if (en) {
			NodoC p;
			p = actual.getEnlace();
			if (nodoInicio == nodoInicio.getEnlace()) {
				nodoInicio = null;
			} else {
				if (p == nodoInicio) {
					nodoInicio = actual;
				}
				actual.setEnlace(p.getEnlace());
			}
			p = null;
		}
	}

}