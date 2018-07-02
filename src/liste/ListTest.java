package liste;

public class ListTest {
	
	public static List<Integer> ordinaMaggioreDi(List<Integer> p, Integer v) {
		List<Integer> t = p.head().succ;
		while (t != p) {
			if(t.value > v) {
				p.insert(p.head(), t.value);
				p.remove(t);
			}
			t = t.succ;
		}
		return p;
	}
	
	public static List<Integer> epurazione(List<Integer> p) {
		List<Integer> L = new List<>();
		List<Integer> tmp1 = p.head();
		List<Integer> tmp2;
		while(!p.finished(tmp1)) {
			Integer conta = 0;
			tmp2 = p.head();
			while(!p.finished(tmp2)) {
				if (p.read(tmp2) == p.read(tmp1)) {
					conta++;
				}
				tmp2 = p.next(tmp2);
			}
			if (conta != 2) {
				L.insert(L.next(L.tail()), p.read(tmp1));
			}
			tmp1 = p.next(tmp1);
		}
		return L;
	}
	
	public static void primiN(List<Integer> L, List<Integer> M, Integer n) {
		for (int i = 1; i <= n; i++) {
			L.insert(L.next(L.tail()), i);
			M.insert(M.head(), i);
		}
	}
	
	public static void primiNRec(List<Integer> L, List<Integer> M, Integer n) {
		if(n >= 1) {
			L.insert(L.head(), n);
			M.insert(M.next(M.tail()), n);
			primiNRec(L, M, n-1);
		}
	}
	
	public static void tangentopoli(List<String> corrotti, Integer k) {
		List<String> tmp = corrotti;
		while(!corrotti.isEmpty()) {
			for(int i = 1; i <= k; i++) {
				tmp = corrotti.next(tmp);
				if(corrotti.finished(tmp))
					tmp = corrotti.head();
			}
			System.out.println(corrotti.read(tmp));
			corrotti.remove(tmp);
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer> lista = new List<>();
		System.out.println(lista);
		
		lista.insert(lista.head(), 4);
		lista.insert(lista.head(), 2);
		lista.insert(lista.head(), 34);
		lista.insert(lista.head(), 54);
		lista.insert(lista.head(), 11);
		lista.insert(lista.head(), 7);
		lista.insert(lista.head(), 85);
		lista.insert(lista.head(), 32);
		lista.insert(lista.head(), 3);
		lista.insert(lista.head(), 1);
		lista.insert(lista.head(), 31);
		lista.insert(lista.head(), 32);
		lista.insert(lista.head(), 3);
		lista.insert(lista.head(), 1);
		
		System.out.println(lista);
		
		lista = ordinaMaggioreDi(lista, 11);
		System.out.println(lista);
		
		System.out.println(epurazione(lista));
		
		List<Integer> L = new List<>();
		List<Integer> M = new List<>();
		
		primiNRec(L, M, 30);
		System.out.println(L);
		System.out.println(M);
		
		List<String> corrotti = new List<>();
		corrotti.insert(corrotti.head(), "Pinco");
		corrotti.insert(corrotti.head(), "Pallino");
		corrotti.insert(corrotti.head(), "Tizio");
		corrotti.insert(corrotti.head(), "Caio");
		corrotti.insert(corrotti.head(), "Sempronio");
		corrotti.insert(corrotti.head(), "Lui");
		corrotti.insert(corrotti.head(), "L'altro");
		corrotti.insert(corrotti.head(), "Il matto");
		corrotti.insert(corrotti.head(), "Il serio");
		
		System.out.println(corrotti);
		
		tangentopoli(corrotti, 3);
	}

}


