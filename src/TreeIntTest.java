
public class TreeIntTest {
	
	public static void main(String[] args) {
		
		TreeInt int1 = new TreeInt(1);
		TreeInt int2 = new TreeInt(4);
		TreeInt int3 = new TreeInt(2);
		TreeInt int4 = new TreeInt(2);
		TreeInt int5 = new TreeInt(2);
		
		
		Integer[] interi1 = {2};
		Integer[] interi2 = {3};
		Integer[] interi3 = {0,1};
		Integer[] interi4 = {1};
		Integer[] interi5 = {6,1,-1,-4};
		
		int2.setPadre(int1);
		int3.setPadre(int1);
		int4.setPadre(int1);
		int5.setPadre(int2);
		int1.aggiungiFigli(interi2);
		int2.aggiungiFigli(interi1);
		int3.aggiungiFigli(interi3);
		int4.aggiungiFigli(interi4);
		int5.aggiungiFigli(interi5);
		
		int1.visit(int1, 0);
		
		System.out.println(int1.nodeSumK(int1, 0, 3));
		System.out.println(int1.sum(int1));
		
		System.out.println(int1.ricorrenzaNumero(int1, -5));
		
		System.out.println(int1.sum4Level(int1, 0));
		System.out.println(int1.sum4Level(int1, 1));
		System.out.println(int1.sum4Level(int1, 2));
		System.out.println(int1.sum4Level(int1, 3));	}

}
