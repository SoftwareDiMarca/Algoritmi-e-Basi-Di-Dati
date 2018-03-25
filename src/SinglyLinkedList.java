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
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Node<E> First() {
		return head;
	}
	public Node<E> Last() {
		return tail;
	}

	//Metodi di aggiornamento
	
	public void addFirst(E element) {
		this.head = new Node(element, this.head);
		if(size == 0) 
			tail = head;
		size++;		
	}
	
	public void addLast(E element) {
		Node newNode = new Node(element, null);
		if(size == 0)
			head = newNode;
		else 
			tail.setNext(newNode);
		tail = newNode;
		size++;
	}
	
	public E removeFirst() {
		if(isEmpty()) return null;
		E element = this.head.getElement();
		this.head = this.head.getNext();
		size--;
		if(size == 0)
			tail = null;
		return element;
	}
	
	public E elementN(int n) {
		if(isEmpty())
			return null;
		else {
			Node<E> tmp = this.First();
			n--;
			while(n > 0) {
				tmp = tmp.getNext();
				if(tmp == null) {
					System.out.println("La lista contiene " + size() + " elementi");
					return null;
				}
				n--;
			}
			return tmp.getElement();
		}
	}
	

	@Override
	public String toString() {
		String s = "";
		if(isEmpty())
			s += "List is empty";
		else {
			Node<E>  tmp = this.First();
			s += "Elementi della List:\n";
			while(tmp != null) {
				s += tmp.getElement().toString();
				tmp = tmp.getNext();
			}
		}
		return s;
	}
	
}


