
public class CircularlyLinkedListTest {

	public static void main(String[] args) {
		CircularlyLinkedList<Integer> interi = new CircularlyLinkedList<>();
		interi.addFirst(3);
		System.out.println(interi.Last());
		System.out.println(interi.First());
		interi.addFirst(4);
		interi.addLast(5);
		
		System.out.println(interi.Last());
		
		
		interi.rotate();
		System.out.println(interi.Last());
		System.out.println(interi.First());
	}

}
