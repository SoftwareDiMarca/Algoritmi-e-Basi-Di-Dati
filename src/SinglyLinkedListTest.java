
public class SinglyLinkedListTest {
	
	public static void main(String[] args) {
		
		SinglyLinkedList<Persona> catalogo = new SinglyLinkedList<>();
		
		Persona prs1 = new Persona("Giovanni", 33);
		Persona prs2 = new Persona("Francesca", 32);
		Persona prs3 = new Persona("Paolo", 56);
		Persona prs4 = new Persona("Mirco", 21);
		
		catalogo.addFirst(prs1);
		catalogo.addFirst(prs2);
		catalogo.addLast(prs3);
		catalogo.addFirst(prs4);

		System.out.println(catalogo.toString());

		System.out.println(catalogo.elementN(2));
		
		catalogo.removeFirst();
		System.out.println(catalogo.toString());
		
	}

}
