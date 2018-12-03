package Tree;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class TreeTest {
	
	public static void main(String[] args) {
		Tree<Character> uno = new Tree<>('A');
		Tree<Character> due = new Tree<>('B');
		Tree<Character> tre = new Tree<>('C');
		Tree<Character> quattro = new Tree<>('D');
		Tree<Character> cinque = new Tree<>('E');
		Tree<Character> sei = new Tree<>('F');
		Tree<Character> sette = new Tree<>('G');
		Tree<Character> otto = new Tree<>('H');
		Tree<Character> nove = new Tree<>('I');
		Tree<Character> dieci = new Tree<>('L');
		
		uno.insertChild(due);
		due.insertSibling(sei);
		sei.insertSibling(sette);
		due.insertChild(tre);
		tre.insertSibling(cinque);
		tre.insertChild(quattro);
		sette.insertChild(otto);
		otto.insertChild(nove);
		nove.insertSibling(dieci);
		
		uno.DFSPreOrder(uno);
		System.out.println("");
		uno.DFSPostOrder(uno);
		System.out.println("");
		uno.DFSInOrder(uno, 1);
		System.out.println("");
		uno.BFS(uno);
		System.out.println("");
		System.out.println(uno.height(uno));
		System.out.println("");
//		uno.deleteLeaf(uno, 24, 0);
		uno.BFS(uno);
		
		

}
	
}
