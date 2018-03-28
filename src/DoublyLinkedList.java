
public class DoublyLinkedList<E> {
	//Classe annidata Node
	private static class Node<E> {
		private E element;
		private Node<E> next;
		private Node<E> prev;
		
		//Costruttore
		public Node(E element, Node<E> next, Node<E> prev) {
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
		
		//Setter e Getter
		public E getElement() {
			return this.element;
		}
		
		public Node<E> getNext() {
			return this.next;
		}
		
		public Node<E> getPrev() {
			return this.prev;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}		
	}
	
	//Fine classe annidata Node

	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	
	//Costruttore lista vuota
	public DoublyLinkedList() {
		header = new Node(null, null, null);
		trailer = new Node(null, null, header);
		header.setNext(trailer);
	}
	
	// Accessor e Mutator
	
	
	
	
	
	
	
	
}

