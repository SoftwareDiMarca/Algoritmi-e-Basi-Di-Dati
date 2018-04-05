
public class ListTest {

	
	public static void main(String[] args) {
		List<Integer> myList = new List<>();
		
		System.out.println(myList.toString());
		
		myList.insert(myList.head(), 2);
		myList.insert(myList.head(), 3);
		myList.insert(myList.tail().next(myList.tail()), 5);
		myList.insert(myList.tail().next(myList.tail()), 7);
		myList.insert(myList.head(), 10);
//		System.out.println(myList.read(myList.prev(myList)));
		System.out.println(myList.toString());
		
	}
}
