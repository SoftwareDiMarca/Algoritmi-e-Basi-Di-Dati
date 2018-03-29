
public class BinaryTreeVisit {
	
	public void printTabs(int tabs) {
		for(int i = 0; i < tabs; i++)
			System.out.print("\t");
	}
	
	public void visit(BinaryTree alberoBinario, int level, String label) {
		if(alberoBinario != null ) {
			printTabs(level);
			System.out.println(label + ":" + alberoBinario.getValue() +
					" (d: " +alberoBinario.getNodesInSubtree() + ")");
			visit(alberoBinario.getLeftChild(), level + 1, "L");
			visit(alberoBinario.getRightChild(), level + 1, "R");
			}
	}
	
	public int nodeNumbers(BinaryTree alberoBinario) {
		Integer nodes = 0;
		if(alberoBinario.getLeftChild() != null)
			nodes += nodeNumbers(alberoBinario.getLeftChild());
		if(alberoBinario.getRightChild() != null)
			nodes += nodeNumbers(alberoBinario.getRightChild());
		nodes ++;
		alberoBinario.setNodesInSubtree(nodes);
		return nodes;
	}
	
	public void deleteLeftChildEqual(BinaryTree alberoBinario) {
		if(alberoBinario != null) {
			if(alberoBinario.getLeftChild() != null && alberoBinario.getLeftChild().isLeaf() 
					&& alberoBinario.getValue() == alberoBinario.getLeftChild().getValue()) {
				alberoBinario.setLeftChild(null);
				deleteLeftChildEqual(alberoBinario.getRightChild());
			}
			else {
				if(alberoBinario.getLeftChild() != null)
					deleteLeftChildEqual(alberoBinario.getLeftChild());
				if(alberoBinario.getRightChild() != null)
				deleteLeftChildEqual(alberoBinario.getRightChild());
			}
		}
	}
	
	public void deleteLeftChildEqual2(BinaryTree alberoBinario) {
		if(alberoBinario != null) {
			if(alberoBinario.isLeaf() && alberoBinario.getValue() == alberoBinario.getParent().getValue() 
					&& alberoBinario.equals(alberoBinario.getParent().getLeftChild()))	//oppure metto una get nel binaryTree che dice che sono una figlio sinistro
				alberoBinario.getParent().setLeftChild(null);
			else  {
				deleteLeftChildEqual2(alberoBinario.getLeftChild());
				deleteLeftChildEqual2(alberoBinario.getRightChild());
			}
		}	
	}
	
	public void invert(BinaryTree alberoBinario) {
		if(alberoBinario != null) {
			BinaryTree tmp = alberoBinario.getLeftChild();
			alberoBinario.setLeftChild(alberoBinario.getRightChild());
			alberoBinario.setRightChild(tmp);
			invert(alberoBinario.getLeftChild());
			invert(alberoBinario.getRightChild());
		}
	}
	

	

}
