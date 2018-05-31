package Grafi.graphs;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

public class GraphVisits<T extends Comparable<T>> {

	HashSet<Node <T>> visited;
	
	public GraphVisits() {
		this.visited = new HashSet<>();
	}
	
	public Boolean isBipartite(Graph<T> graph, Node<T> u) {

		Boolean isBipartite = true;
		GraphColor currentColor;
		ArrayDeque<Node<T>> queue = new ArrayDeque<>();
		HashMap<Node<T>, GraphColor> colors = new HashMap<>();
		colors.put(u, GraphColor.RED); // Coloro di rosso tutti i nodi e quindi anche la radice
		queue.add(u);

		Node<T> first;
		while (!queue.isEmpty() && isBipartite) {
			first = queue.remove();
			System.out.print(first + " : ");

			currentColor = this.invert(colors.get(first));
			for (Node<T> n : graph.adj(first)) {
				if (!colors.containsKey(n)) {
					queue.add(n);
					colors.put(n, GraphColor.RED); // visitato e quindi li coloro tutti di rosso:
													// se lo ritrovo colorato vuol dire che l'ho già visitato e
													// aggiunto alla coda

				} else if (colors.get(n) != currentColor)
					isBipartite = false;
			}
		}
		return isBipartite;
	}

	private GraphColor invert(GraphColor c) {
		if (c == GraphColor.RED)
			return GraphColor.BLACK;
		else
			return GraphColor.RED;
	}

	public void printPath(Graph<T> graph, Node<T> u, Node<T> v) {

		Boolean found = false;
		GraphColor currentColor;
		ArrayDeque<Node<T>> queue = new ArrayDeque<>();
		HashMap<Node<T>, Node<T>> parents = new HashMap<>();
		parents.put(u, null); // Coloro di rosso tutti i nodi e quindi anche la radice
		queue.add(u);

		Node<T> first;
		while (!queue.isEmpty() && !found) {
			first = queue.remove();
			System.out.print(first + " : ");

			for (Node<T> n : graph.adj(first)) {
				if (!parents.containsKey(n)) {
					queue.add(n);
					parents.put(n, first); 
				} else {
					if (n.equals(v))
						found = true;
				}
			}
		}
//		if(found) {
//			for(Node<T> p : parents)					// stampare i parents
//		}
	}
	
	public void dfsRec(Graph<T> graph, Node<T> u) {
		System.out.print(u + " * ");
		this.visited.add(u);
		for(Node<T> a : graph.adj(u)) {
			if(!this.visited.contains(a))
				
				dfsRec(graph, a);
		}
	}
	
	public void dfsIter() {
		
	}
	

}
