/**
 * Una raccolta di oggetti che vengono inseriti ed eliminati secondo il
 * principio last-in first-out
 * 
 * @author Marcaccini Maurizio
 *
 */
public interface Stack<E> {
	
/**
 * Restituisce il numero di elementi presenti nella pila
 * @Return il numero di elementi presenti nella pila
 */
	int size();
	
/**
 * Verifica se la pila � vuota
 * @return true se  e solo se la pila � vuota
 */
	boolean isEmpty();
	
/**
 * Inserisce un elemento in cima alla pila
 * @param e l'elemto da inserire
 */

	void  push(E e);
	
/**
 * Restituisce l'elemento in cima alla pila, senza eliminarlo
 * @return l'elemento in cima alla pila (o null se la pila � vuota)
 */
	
	E top();
	
/**
 * Elimina e restituisce l'elemento in cima alla pila
 * @return l'elemento eliminato (o null se la pila � vuota)
 */

	E pop();





}
