public class ListaDobleEnlazada {

	private Nodo nodoInicio;
	private Nodo nodoFin;

	public ListaDobleEnlazada() {

		nodoFin = nodoInicio = null;

	}

	public void insertarCabezaLista(int entrada) {
		Nodo nuevo;
		nuevo = new Nodo(entrada);
		nuevo.setAdelante(nodoInicio);
		if (nodoInicio != null)
			nodoInicio.setAtras(nuevo);
		nodoInicio = nuevo;
		
	}

}