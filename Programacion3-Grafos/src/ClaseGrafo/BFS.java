package ClaseGrafo;

import java.util.ArrayList;


public class BFS {

	public static ArrayList<Integer> bfsGrafo(GrafoImplements grafo, NodoGrafo origen) {
		ArrayList<Integer> nodos = new ArrayList<Integer>();
		visitarNodobfs(origen, nodos);
		return nodos;
	}

	public static void visitarNodobfs(NodoGrafo nodo, ArrayList<Integer> lista) {
		NodoArista aux = nodo.lista;
		if (!nodo.Visitado) {
			nodo.Visitado = true;
			lista.add(nodo.valor);
		} 
		while (aux != null) {
			if (!aux.apunta.Visitado) {
				aux.apunta.Visitado = true;
				lista.add(aux.apunta.valor);
				System.out.println("Nodo: " + aux.apunta.valor + " | "+ " Padre: " + aux.origen );
				
			} 
			aux = aux.sig;
		} 
		aux = nodo.lista;
		while (aux != null) {
			if (!aux.Visitado) {
				aux.Visitado = true;
				visitarNodobfs(aux.apunta, lista);
			}
			aux = aux.sig; 
		}

	}


}