package Tree;

public class Tree<Item> {
	private Tree<Item> parent;
	private Tree<Item> child;
	private Tree<Item> sibling;
	private Item value;

	public Tree(Item v) {
		value = v;
		child = null;
		sibling = null;
		parent = null;
	}

	public Tree<Item> parent() {
		return parent;
	}

	public Tree<Item> leftMostChild() {
		return child;
	}

	public Tree<Item> rightSibling() {
		return sibling;
	}

	public Item read() {
		return value;
	}

	public void write(Item v) {
		value = v;
	}

	public void insertChild(Tree<Item> t) {
		t.parent = this;
		t.sibling = child;
		child = t;
	}

	public void insertSibling(Tree<Item> t) {
		t.parent = parent;
		t.sibling = sibling;
		sibling = t;
	}

	public void deleteChild() {
		Tree<Item> newChild = child.rightSibling();
		delete(child);
		child = newChild;
	}

	public void deleteSibling() {
		Tree<Item> newBrother = sibling.rightSibling();
		delete(sibling);
		sibling = newBrother;
	}

	public void delete(Tree<Item> t) {
		Tree<Item> u = t.leftMostChild();
		while (u != null) {
			Tree<Item> next = u.rightSibling();
			delete(u);
			u = next;
		}
		t = null;
	}

	public void DFSPreOrder(Tree<Item> t) {
		System.out.print("(" + t.value + ")  ");
		Tree<Item> u = t.leftMostChild();
		while (u != null) {
			DFSPreOrder(u);
			u = u.rightSibling();
		}
	}

	public void DFSPostOrder(Tree<Item> t) {
		Tree<Item> u = t.leftMostChild();
		while (u != null) {
			DFSPostOrder(u);
			u = u.rightSibling();
		}
		System.out.print("(" + t.value + ")  ");
	}

	public void DFSInOrder(Tree<Item> t, int k) {
		Tree<Item> u = t.leftMostChild();
		int i = k;
		while (u != null && i > 0) {
			DFSInOrder(u, k);
			u = u.rightSibling();
			i--;
		}
		System.out.print("(" + t.value + ")  ");
		while (u != null) {
			DFSInOrder(u, k);
			u = u.rightSibling();
		}
	}

	public void prinTree(Tree<Item> root) {
		System.out.print("(" + root.value + ")\n");
		Tree<Item> u = root.leftMostChild();
		while (u != null) {
			Tree<Item> next = u.rightSibling();
			System.out.println("(" + u.value + ")");
			prinTree(u);
			u = next;
		}
	}
}
