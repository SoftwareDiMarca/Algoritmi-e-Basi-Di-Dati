
public class CircularlyLinkedList<E> {
	
	private class Node<E> {
		private E e;
		private Node<E> next;
		
		public Node(E e, Node<E> next) {
			this.e = e;
			this.next = next;
		}
		
		//Setter e Getter
		public void setNext(Node next) {
			this.next = next;
		}
		public E getElement() {
			return this.e;
		}
		
		public Node<E> getNext() {
			return this.next;
		}
		
	}

	//Fine della classe annidata Node
	
	private int size = 0;
	private Node<E> tail = null;
	
	public CircularlyLinkedList() {}
	
	//Accessor and Mutator
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public E First() {
		if(isEmpty())
			return null;
		return tail.getNext().getElement();
	}
	
	public E Last() {
		if(isEmpty()) 
			return null;
		return tail.getElement();
	}
	
	//Metodi di modifica
	
	public void addFirst(E e) {
		if(isEmpty()) {
			tail = new Node<>(e, null);	
			tail.setNext(tail);
		}
		else {
			Node<E> tmp = new Node<>(e, tail.getNext());
			tail.setNext(tmp);
		}
		size++;
	}
	
	public void addLast(E e ) {
		addFirst(e);
		tail = tail.getNext();
	}
	
	public void rotate() {
		if(tail != null)
		tail = tail.getNext();
	}
	
	public E removeFirst() {
		if(isEmpty())
			return null;
		Node<E> head = tail.getNext();
		tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
}
