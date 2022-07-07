package ClaseGrafo;

import java.util.ArrayList;

public class DFS {

	public static ArrayList<Integer> dfsGrafo(GrafoImplements grafo, NodoGrafo origen) {
		ArrayList<Integer> nodos = new ArrayList<Integer>();

		visitarNodo(origen, nodos);
		return nodos;
	}

	public static void visitarNodo(NodoGrafo nodo, ArrayList<Integer> lista) {
		nodo.Visitado = true;
		NodoArista aux = nodo.lista;

		while (aux != null) {
			if (!aux.apunta.Visitado) {
				visitarNodo(aux.apunta, lista);
			} else {
				aux = aux.sig;
			}
		}

		lista.add(nodo.valor);
	}




}