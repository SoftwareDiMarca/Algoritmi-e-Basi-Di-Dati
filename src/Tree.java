
public class Tree<E> {
	
	private Tree<E> parent;
	private Tree<E> child;
	private Tree<E> sibling;
	private E element;
	
	public Tree(E element) {
		this.element = element;
		this.parent = null;
		this.child = null;
		this.sibling = null;
	}
	
	public void insertChild(Tree<E> t) {
		t.parent = this;
		t.sibling = this.child;
		this.child = t;
	}
	
	public void insertSibling(Tree t) {
		t.parent = this;
		t.sibling = this.sibling;
		this.sibling = t;
	}
	
	public Tree<E> parent() {
		return this.parent;
	}
	
	public Tree<E> leftMostChild() {
		return this.child;
	}
	
	public Tree<E> rightSibling() {
		return this.sibling;
	}
	
	

}
