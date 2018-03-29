

public class BinaryTree {
	
	private Integer value;
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	private BinaryTree parent;
	private Integer nodesInSubtree;
	
	public Integer getNodesInSubtree() {
		return nodesInSubtree;
	}

	public void setNodesInSubtree(Integer nodesInSubtree) {
		this.nodesInSubtree = nodesInSubtree;
	}

	public BinaryTree(Integer value) {
		this.value = value;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public BinaryTree getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTree leftChild) {
		this.leftChild = leftChild;
		if (leftChild != null)
			leftChild.setParent(this);
	}

	public BinaryTree getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTree rightChild) {
		this.rightChild = rightChild;
		if (rightChild != null)
			rightChild.setParent(this);
	}

	public BinaryTree getParent() {
		return parent;
	}

	public void setParent(BinaryTree parent) {
		this.parent = parent;
	}
	
	public void deleteLeftSubTree(){
		this.leftChild = null;
	}
	
	public void deleteRightSubTree(){
		this.rightChild = null;
	}
	
	public boolean isLeaf() {
		return (this.leftChild == null && this.rightChild == null);
	}
	

}
