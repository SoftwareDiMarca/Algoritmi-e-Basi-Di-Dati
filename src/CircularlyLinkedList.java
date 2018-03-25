
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
	
	
	
	
	
}
