package ClaseGrafo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GrafoImplements grafo = new GrafoImplements();
        BFS bfs= new BFS();
        DFS dfs = new DFS();

        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);


        grafo.agregarArista(1, 2, 0);
        grafo.agregarArista(2, 1, 0);

        grafo.agregarArista(1, 5, 0);
        grafo.agregarArista(5, 1, 0);

        grafo.agregarArista(2, 6, 0);
        grafo.agregarArista(6, 2, 0);

        grafo.agregarArista(6, 3, 0);
        grafo.agregarArista(3, 6, 0);

        grafo.agregarArista(6, 7, 0);
        grafo.agregarArista(7, 6, 0);

        grafo.agregarArista(7, 3, 0);
        grafo.agregarArista(3, 7, 0);

        grafo.agregarArista(7, 4, 0);
        grafo.agregarArista(4, 7, 0);

        grafo.agregarArista(7, 8, 0);
        grafo.agregarArista(8, 7, 0);

        grafo.agregarArista(3, 4, 0);
        grafo.agregarArista(4, 3, 0);

        grafo.agregarArista(4, 8, 0);
        grafo.agregarArista(8, 4, 0);





        System.out.println("Por cual algoritmos deseas realizar la busqueda?");
        System.out.println("1) BFS");
        System.out.println("2) DFS");

        Scanner entradaEscaner = new Scanner(System.in);


        NodoGrafo origen = grafo.encontrarNodo(4);

        System.out.println("Origen: " + origen.valor);

        int num=entradaEscaner.nextInt();

        ArrayList<Integer> resultado=new ArrayList<Integer>();
        if (num==1){
            System.out.println("BFS.....");
            resultado=bfs.bfsGrafo(grafo, origen);
        }else{
            System.out.println("DFS.....");
            resultado =dfs.dfsGrafo (grafo, origen);

            for (int i = resultado.size() - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(resultado.get(i) + " -> ");
                } else {
                    System.out.print(resultado.get(i));
                }
            }
        }





    }


}
