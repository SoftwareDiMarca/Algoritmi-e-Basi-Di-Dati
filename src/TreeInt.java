import java.util.ArrayList;

public class TreeInt {
	
	private Integer intero;
	private TreeInt padre;
	private ArrayList<TreeInt> figli;
	
	public TreeInt(Integer intero) {
		this.intero = intero;
		this.padre = null;
		this.figli = new ArrayList<TreeInt>();
	}
	
	
	public Integer getIntero() {
		return intero;
	}
	public void setIntero(Integer intero) {
		this.intero = intero;
	}
	public TreeInt getPadre() {
		return padre;
	}
	public void setPadre(TreeInt padre) {
		this.padre = padre;
		padre.aggiungiFiglio(this);
	}
	public ArrayList<TreeInt> getFigli() {
		return figli;
	}
	public void setFigli(ArrayList<TreeInt> figli) {
		this.figli = figli;
	}

	//Aggiungi figli
	
	public void aggiungiFiglio(TreeInt figlio) {
		this.figli.add(figlio);
		figlio.padre = this;
	}
	
	public void aggiungiFigli(Integer[] figliInteger) {
		for(Integer figlio : figliInteger) 
			aggiungiFiglio(new TreeInt(figlio));
	}
	
	public void printTabs(int tabs) {
		for(int i = 0; i < tabs; i++)
			System.out.print("\t");
	}
	
	public void visit(TreeInt interi, int level) {
		if(interi != null ) {
			printTabs(level);
			System.out.println("(" + interi.intero + ")");
			for(TreeInt figlio : interi.getFigli()) 
				visit(figlio, level + 1);
			}
	}
	
	
	

	public Integer nodeSumK2(TreeInt t, Integer sum, Integer k) {
		
		int sumEq = 0;
		sum += t.getIntero();
				
		System.out.println(sum);
		
		if(t.getFigli().size() == 0) {
			if(sum == k)
				sumEq++;
		}
		else {
			for(TreeInt figlio : t.getFigli()) {
				if(sum == k) {
					System.out.println("trovato");
					sumEq += 1 + nodeSumK2(figlio, sum, k);
					return sumEq;
				}
				else {
					System.out.println("Non trovato");
					sumEq += nodeSumK2(figlio, sum, k);
				}
			}
		}
		return sumEq;
	}
	
	
	public Integer sum(TreeInt t) {
		if (t == null) {
			return 0;
		}
		if (t.getFigli().size() == 0) {
			return t.getIntero();
		}
		else {
			int s = t.getIntero();
			for(TreeInt figlio : t.getFigli())
				s += sum(figlio);
			return s;
		}
	}
	
	public Integer nodeSumK(TreeInt t, Integer sum, Integer k) {
		sum += t.getIntero();
		Integer s = 0;
		if(t.getFigli().size() == 0) {
			if (sum == k)
				return s++;
			else return s;
		}
		else {
			for(TreeInt figlio: t.getFigli()) {
				s += nodeSumK(figlio, sum, k);
			}
			if (sum == k)
				return s++;
			else return s;
		}
	}

}

	
