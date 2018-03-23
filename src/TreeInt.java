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
		if(t.getFigli().size() > 0) {
			for(TreeInt figlio: t.getFigli()) {
				s += nodeSumK(figlio, sum, k);
			}
		}
		if (sum == k)
			s++;
		return s;
	}
	
	public Integer ricorrenzaNumero(TreeInt t, Integer n) {
		if (t == null)
			return 0;
		Integer ric = 0;
		if(t.getFigli().size() > 0) {
			for(TreeInt figlio : t.getFigli())
				ric += ricorrenzaNumero(figlio, n);
		}
		if(t.getIntero() == n)
			ric++;
		return ric;
	}
	
	public Integer sum4Level(TreeInt t, int level) {
		if(t == null)
			return 0;
		if(level == 0)
			return t.getIntero();
		Integer sum = 0;
		if (level == 1) {
			if(t.getFigli().size() > 0) {
				for(TreeInt figlio : t.getFigli())
					sum += figlio.getIntero();
			}
		}
		else {
			for(TreeInt figlio : t.getFigli())
				sum += sum4Level(figlio, level - 1);	
		}
		return sum;
	}

}

	
