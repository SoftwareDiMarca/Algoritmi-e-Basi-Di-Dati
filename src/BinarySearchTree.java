
public class BinarySearchTree {
	
	private Integer value;
	private BinarySearchTree leftChild;
	private BinarySearchTree rightChild;
	private BinarySearchTree parent;
	private Integer nodesInSubtree;
	
	public Integer getNodesInSubtree() {
		return nodesInSubtree;
	}

	public void setNodesInSubtree(Integer nodesInSubtree) {
		this.nodesInSubtree = nodesInSubtree;
	}

	public BinarySearchTree(Integer value) {
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

	public BinarySearchTree getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinarySearchTree leftChild) {
		this.leftChild = leftChild;
		if (leftChild != null)
			leftChild.setParent(this);
	}

	public BinarySearchTree getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinarySearchTree rightChild) {
		this.rightChild = rightChild;
		if (rightChild != null)
			rightChild.setParent(this);
	}

	public BinarySearchTree getParent() {
		return parent;
	}

	public void setParent(BinarySearchTree parent) {
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
	
	public void insert(Integer i) {
		if(i < this.getValue()) {
			if(this.getLeftChild() == null)
				this.setLeftChild(new BinarySearchTree(i));
			else
				this.getLeftChild().insert(i);
		}
		if(i > this.getValue()) {
			if(this.getRightChild() == null)
				this.setRightChild(new BinarySearchTree(i));
			else
				this.getRightChild().insert(i);
		}
	}
	


}
