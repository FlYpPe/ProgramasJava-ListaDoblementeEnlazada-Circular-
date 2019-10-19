
public class pruebaListas {

	public static void main(String[] args) {
		
		ListaDobleEnlazada le = new ListaDobleEnlazada();
		
		
		
		le.insertarCabezaLista(5);
		le.insertarCabezaLista(10);
		le.insertarCabezaLista(6);
		le.mostrarElementos();
		le.eliminarElemento(6);
		le.mostrarElementos();
		le.eliminarElemento(5);
		le.mostrarElementos();
		le.eliminarElemento(10);
		System.out.println();
		le.mostrarElementos();
		
		//////////////
		System.out.println();
		ListaCircular lc = new ListaCircular();
		lc.insertarElemento(5);
		lc.insertarElemento(9);
		lc.insertarElemento(10);
		lc.mostrarElementos();
		lc.eliminarElemento(9);
		System.out.println();
		lc.mostrarElementos();
		System.out.println();
		lc.eliminarElemento(10);
		lc.mostrarElementos();
	}

}
