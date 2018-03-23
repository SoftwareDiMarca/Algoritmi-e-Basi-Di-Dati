
public class ArrayStack<E> implements Stack<E>{
	
	public static final int CAPACITY = 1000;    //capacità iniziale dell'array
	private E[] data;							//array generico usato per gli elementi
	int t = -1;									//indice elemento in cima alla pila

	public ArrayStack() {						//Costruttore di una pila di capacità standard
		this(CAPACITY);
	}
	
	public ArrayStack(int capacity) {			//Costruttore di una pila di capacità definita 
		data = (E[]) new Object[capacity];		//dall'utente
	}
	
	public int size() {
		return t + 1;
	}
	
	public boolean isEmpty() {
		return(t == -1);
	}
	
	public void push(E e) throws IllegalStateException {
		if(size() == data.length) throw new IllegalStateException("Stack is full");
		data[++t] = e;
	}
	
	public E top() {
		if(isEmpty()) return null;
		return data[t];
	}
	
	public E pop() {
		if(isEmpty()) return null;
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
	}
	
	@Override
	public String toString() {
		String s = "";
		if(isEmpty())
			s += "ArrayStack is empty";
			else {
				s += "Elementi dell'ArrayStack:\n";
				for(int i = 0; i < size(); i++)
				s += data[i].toString() + "\n";
			}
		return s;
	}
	
	
	public static void main(String[] args) {
		ArrayStack<Integer> ints = new ArrayStack<Integer>();
		System.out.println(ints.toString());
		System.out.println(ints.size());
		ints.push(5);
		System.out.println(ints.size());
		ints.push(4);
		System.out.println(ints.size());
		ints.push(7);
		System.out.println(ints.size());
		System.out.println(ints.pop());
		System.out.println(ints.size());
		System.out.println(ints.toString());
		
	}
	
}
