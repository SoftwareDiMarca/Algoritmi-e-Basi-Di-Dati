package Tree;

public class TreeTest {
	
	public static void main(String[] args) {
		Tree<Integer> uno = new Tree<>(1);
		Tree<Integer> due = new Tree<>(2);
		Tree<Integer> tre = new Tree<>(3);
		Tree<Integer> quattro = new Tree<>(4);
		Tree<Integer> cinque = new Tree<>(5);
		Tree<Integer> sei = new Tree<>(6);
		Tree<Integer> sette = new Tree<>(7);
		
		uno.insertChild(due);
		due.insertSibling(tre);
		tre.insertChild(quattro);
		quattro.insertSibling(cinque);
		cinque.insertSibling(sei);
		cinque.insertChild(sette);
		
		uno.DFSPreOrder(uno);
		System.out.println("");
		uno.DFSPostOrder(uno);
		System.out.println("");
		uno.DFSInOrder(uno, 2);
		

}
	
}
