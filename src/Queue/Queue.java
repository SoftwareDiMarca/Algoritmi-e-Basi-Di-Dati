package Queue;

public class Queue<E> {

	class Node<T> {
		Node<T> next;
		Node<T> prev;
		T value;

		public Node(T t) {
			value = t;
			next = null;
			prev = null;
		}

		public T read() {
			return value;
		}

		public void write(T t) {
			value = t;
		}

	}

	private Node<E> head;
	private Node<E> tail;
	int size;
	
	public Queue() {
		head = new Node<>(null);
		tail = head;
		size = 0;
	}
	
	public boolean empty() {
		if(size == 0) return true;
		return false;
	}

	public void enqueue(E e) {
		Node<E> newNode = new Node<>(e);
		if (empty()) {
			head = newNode;
			tail = newNode;
		}
		else {
		newNode.next = tail;
		tail.prev = newNode;
		tail = newNode;
		}
		size++;
	}

	public E dequeue() {
		if (empty()) return null;
		E w = head.value;
		head = head.prev;
		size--;
		return w;
	}
	
	public void print() {
		Node<E> t = tail;
		int count = 0;
		while(t != null) {
			t = t.next;
			count++;
		}
		System.out.println(count);
	}

}
