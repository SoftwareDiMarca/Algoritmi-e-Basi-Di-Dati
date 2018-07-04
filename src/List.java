/**
 * 
 * Algoritmi e strutture di dati : LISTE
 * 
 * @author Marcaccini Maurizio
 *
 * @param <T>
 */


public class List<T> {
	
	
	private List<T> pred;
	private List<T> succ;
	private T value;
	
	
	//Costruttore
	
	public List() {
		this.pred = this;
		this.succ = this;
	}
	
	//Accessors e Mutators
	
	public List<T> head() {
		return this.succ;
	}
	
	public List<T> tail() {
		return this.pred;
	}
	
	public List<T> next(List<T> pos) {
		return pos.succ;
	}
	
	public List<T> prev(List<T> pos) {
		return pos.pred;
	}
	
	public T read(List<T> pos) {
		return pos.value;
	}
	
	public void write(List<T> pos, T value) {
		pos.value = value;
	}
	
	//Others methods
	
	public boolean isEmpty() {
		return this.pred == this.succ;
	}
	
	public boolean finished(List<T> pos) {
		return pos == this;
	}
	
	public List<T> insert(List<T> p, T v) {
		List<T> t = new List<>();
		t.value = v;
		t.succ = p;
		t.pred = p.pred;
		p.pred.succ = t;
		p.pred = t;
		return t;
	}
	
	public List<T> remove(List<T> pos) {
		pos.pred.succ = pos.succ;
		pos.succ.pred = pos.pred;
		return pos.succ;
	}
	
	public List<Integer> auxPrimiNL(int n, List<Integer> L) {
		if(n >= 1) {
			L.insert(L.head(), n);
			auxPrimiNL(n - 1, L);
		}
		return L;
	}
	
	public List<Integer> auxPrimiNM(int n, List<Integer> M) {
		if(n >= 1) {
			M.insert(M.next(M.tail()), n);
			auxPrimiNM(n - 1, M);
		}
		return M;
	}
	
	public List<Integer> PrimiNM(int n) {
		List<Integer> M = new List<>();
		M = auxPrimiNM(n, M);
		return M;
	}
	
	public List<Integer> primiNL(int n) {
		List<Integer> L = new List<>();
		L = auxPrimiNL(n, L);
		return L;
	}
	
	@Override
	public String toString() {
		if(isEmpty())
			return "La Lista è vuota";
		List<T> tmp = this;
		String s = "";
		while(!finished(tmp.next(tmp))) {
			s += tmp.head().value + " : ";
			tmp = tmp.next(tmp);
		}
		s += "[]";
		return s;
	}
	
	

}
