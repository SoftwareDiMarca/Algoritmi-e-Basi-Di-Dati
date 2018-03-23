/**
 * Lista semplicemente concatenata; il nodo è implementato con una classe annidata 
 * 
 * @author Marcaccini Maurizio
 *
 * @param <E>
 */

public class SinglyLinkedList<E> {
	
	//Classe annidata parametrica Nodo della lista
	
	private static class Node<E> {
		private E element;
		private Node<E> next;
		
		//Classe annidata: Nodo della lista
		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}
		//Setter e Getter
		public E getElement() {
			return this.element;
		}
	
		public Node<E> getNext() {
			return this.next;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	
	// Fine classe annidata
	
	private Node<E> head = null;			//primo nodo della lista inizializzato a null
	private Node<E> tail = null;			//ultimo nodo della lista inizializzato a null
	private int size = 0;
	
	
	//Costruttore di una lista vuota
	public SinglyLinkedList() {}

	//Accessor e Mutator
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Node<E> getFirst() {
		return head;
	}
	public Node<E> getLast() {
		return tail;
	}

	//Metodi di aggiornamento
	
	
	public void addFirst(E element) {
		this.head = new Node(element, this.head);
		if(size == 0) 
			tail = head;
		size++;		
	}
	
	






}


