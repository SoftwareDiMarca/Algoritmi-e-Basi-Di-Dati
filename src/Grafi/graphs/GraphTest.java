package Grafi.graphs;

public class GraphTest {

	public static void main(String[] args) {
	
	Graph<String> g = new Graph<String>();
	
//	Node<String> a = new Node<String>("a");
//	Node<String> b = new Node<String>("b");
//	Node<String> c = new Node<String>("c");
//	Node<String> d = new Node<String>("d");
//	Node<String> e = new Node<String>("e");
//	
//	g.insertNode(a);
//	g.insertNode(b);
//	g.insertNode(c);
//	g.insertNode(d);
//	g.insertNode(e);
//	
//	g.insertEdge(a, b);
//	g.insertEdge(a, c);
//	g.insertEdge(a, e);
//	g.insertEdge(c, b);
//	g.insertEdge(c, d);
//	g.insertEdge(c, e);
//	g.insertEdge(d, e);
//	g.insertEdge(e, b);
	
	Node<String> a = new Node<String>("A");
	Node<String> b = new Node<String>("B");
	Node<String> c = new Node<String>("C");
	Node<String> d = new Node<String>("D");
	Node<String> e = new Node<String>("E");
	Node<String> f = new Node<String>("F");
	Node<String> h = new Node<String>("G");
	
	g.insertNode(a);
	g.insertNode(b);
	g.insertNode(c);
	g.insertNode(d);
	g.insertNode(e);
	g.insertNode(f);
	g.insertNode(h);
	
	g.insertEdge(a, b);
	g.insertEdge(a, c);
	g.insertEdge(b, e);
	g.insertEdge(b, c);
	g.insertEdge(b, h);
	g.insertEdge(d, h);
	g.insertEdge(h, c);
	g.insertEdge(c, f);
	g.insertEdge(e, d);
	//nodi invertiti: grafo non orientato
	g.insertEdge(b, a);
	g.insertEdge(c, a);
	g.insertEdge(e, b);
//	g.insertEdge(c, b);
	g.insertEdge(h, b);
	g.insertEdge(h, d);
	g.insertEdge(c, h);
	g.insertEdge(f, c);
	g.insertEdge(d, e);

	g.print();
	
//	System.out.println("---");
//	g.deleteNode(e);
//	g.print();
	
	GraphVisits <String> gf = new GraphVisits<>();
	
	System.out.println(gf.isBipartite(g, a));
	gf.printPath(g, a, h);
	
	gf.dfsRec(g, a);
	
	
	
	
	}
}
