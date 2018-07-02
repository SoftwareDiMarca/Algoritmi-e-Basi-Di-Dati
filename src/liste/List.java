package liste;

import java.time.temporal.IsoFields;

/**
 * 
 * @author Marcaccini Maurizio
 *
 * @param <T>
 */

public class List<T> {
	
	/**
	 * Member 
	 */
	List<T> prec;
	List<T> succ;
	T value;
	
	/**
	 * Constructor
	 */
	
	public List() {
		prec = this;
		succ = this;
	}
	
	boolean isEmpty() {
		return (prec == this && succ == this);
	}
	
	public List<T> head() {
		return this.succ;
	}
	
	public List<T> tail() {
		return prec;
	}
	
	boolean finished(List<T> p) {
		return(p == this);
	}
	
	public List<T> next(List<T> p) {
		return p.succ;
	}
	
	public List<T> prev(List<T> p) {
		return p.prec;
	}
	
	public T read(List<T> p) {
		return (T)p.value;
	}
	
	public void write(List<T> p, T v) {
		p.value = v;
	}
	
	public List<T> insert(List<T> p, T v) {
		List<T> t = new List<>();
		t.value = v;
		t.prec = p.prec;
		p.prec.succ = t;
		t.succ = p;
		p.prec = t;
		return t;
	}
	
	public List<T> remove(List<T> p) {
		p.prec.succ = p.succ;
		p.succ.prec = p.prec;
		return p.succ;		
	}
	
	
	@Override
	public String toString() {
		if(isEmpty())
			return "La Lista è vuota";
		String s = "";
		List<T> tmp = this.head();	
		while(!finished(tmp)) {
			s += tmp.value + "::";
			tmp = tmp.next(tmp);
		}
		s += "[]";
		return s;
	}

}
