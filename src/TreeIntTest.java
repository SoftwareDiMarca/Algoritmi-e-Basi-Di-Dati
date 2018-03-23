
public class TreeIntTest {
	
	public static void main(String[] args) {
		
		TreeInt int1 = new TreeInt(1);
		TreeInt int2 = new TreeInt(4);
		TreeInt int3 = new TreeInt(2);
		
		Integer[] interi1 = {2,2};
		Integer[] interi2 = {3,2};
		Integer[] interi3 = {1};
		
		int2.setPadre(int1);
		int1.aggiungiFigli(interi2);
		int2.aggiungiFigli(interi1);
		int3.aggiungiFigli(interi3);
		int3.setPadre(int1);
		
		int1.visit(int1, 0);
		
		System.out.println(int1.nodeSumK(int1, 0, 1));
		
		
		
	}

}
