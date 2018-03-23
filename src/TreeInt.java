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
	
	public Integer nodeSumK(TreeInt t, Integer sum, Integer k) {
		sum += t.getIntero();
		if(t.getFigli().size() == 0) {
			if(sum == k)
				return 1;
			else
				return 0;
		}
		else {
			for(TreeInt figlio : t.getFigli()) {
				if(sum == k) 
					return 1 + nodeSumK(figlio, sum, k);	
				else
					return nodeSumK(figlio, sum, k);
			}
			return 7;
		}
	}
		

	

}
