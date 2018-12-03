package Tree;

import Queue.Queue;

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
		int i = 0;
		while (u != null && i < k) {
			i++;
			DFSInOrder(u, k);
			u = u.rightSibling();
		}
		System.out.print("(" + t.value + ")  ");
		while (u != null) {
			DFSInOrder(u, k);
			u = u.rightSibling();
		}
	}

	public void BFS(Tree<Item> t) {
		Queue<Tree<Item>> queue = new Queue<>();
		if(t != null)
			queue.enqueue(t);
		while (!queue.empty()) {
			Tree<Item> u = queue.dequeue();
			System.out.print("(" + u.value + ")  ");
			u = u.leftMostChild();
			while (u != null) {
				queue.enqueue(u);
				u = u.rightSibling();
			}
		}
	}

	public int height(Tree<Item> t) {
		if (t.leftMostChild() == null)
			return 0;
		int h = 0;
		Tree<Item> u = t.leftMostChild();
		while (u != null) {
			int tmp = height(u);
			if (h < tmp)
				h = tmp;
			u = u.rightSibling();
		}
		return h + 1;
	}
	
	public void deleteLeaf(Tree<Integer> t, int k, int sum) {
		if(t.leftMostChild() == null) {
			if((sum + t.value) == k) {
				t = null;
			}
		}
		else {
			sum += t.value;
			Tree<Integer> u = t.leftMostChild();
			while(u != null) {
				deleteLeaf(u, k, sum);
				u = u.rightSibling();
			}
		}
	}
}
