
public class BinaryTreeTest {
	
	
	public static void main(String[] args) {
		BinaryTree b1 = new BinaryTree(1);
		BinaryTree b2 = new BinaryTree(2);
		BinaryTree b3 = new BinaryTree(3);
		BinaryTree b4 = new BinaryTree(4);
		BinaryTree b5 = new BinaryTree(7);
		BinaryTree b6 = new BinaryTree(6);
		BinaryTree b7 = new BinaryTree(7);
		
		b5.setLeftChild(b7);
		b4.setRightChild(b6);
		b2.setRightChild(b5);
		b2.setLeftChild(b4);
		
		b1.setRightChild(b3);
		b1.setLeftChild(b2);
		
		BinaryTreeVisit btt = new BinaryTreeVisit();
		
		
//		btt.visit(b1, 0, "root");
		btt.nodeNumbers(b1);
		btt.visit(b1, 0, "root");
		
//		btt.invert(b1);
		btt.deleteLeftChildEqual(b1);
		btt.visit(b1, 0, "root");
	
		
	}

}
