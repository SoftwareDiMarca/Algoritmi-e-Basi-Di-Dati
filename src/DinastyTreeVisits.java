import java.util.ArrayDeque;

public class DinastyTreeVisits {
	
	public void printTabs(int tabs) {
		for(int i = 0; i < tabs; i++)
			System.out.print("\t");
	}
	
	public void visit(DinastyTree capostipite, int level) {
		if(capostipite != null ) {
			printTabs(level);
			System.out.println(capostipite.getNome() + "(" + capostipite.getAnni() + ")");
			for(DinastyTree figlio : capostipite.getFigli()) 
				visit(figlio, level + 1);
			}
	}
	
	public DinastyTree cercaDiscendentePerNome(DinastyTree dinastia, String nome) {
		DinastyTree descendantFound = null;
//		if()
		for(int i = 0; i < dinastia.getFigli().size() && (descendantFound == null); i++) {
			if(dinastia.getFigli().get(i).getNome() == nome) 
				descendantFound = dinastia.getFigli().get(i);
			else
				descendantFound = this.cercaDiscendentePerNome(dinastia.getFigli().get(i), nome);		
		}
		return descendantFound;
	}
	
	
	public DinastyTree cercaDiscendentePerNome2(DinastyTree dinastia, String nome) {
		DinastyTree descendantFound = null;
		if(dinastia.getNome() == nome)
			return dinastia;
		else {
			for (int i = 0; i < dinastia.getFigli().size() && (descendantFound == null); i++) {
				descendantFound = this.cercaDiscendentePerNome2(dinastia.getFigli().get(i), nome);		
			}
			return descendantFound;
		}
	}
	
	public DinastyTree minoreDiAnni(DinastyTree dinastia, int anni) {
		DinastyTree descendantFound = null;
		ArrayDeque<DinastyTree> coda = new ArrayDeque<>();
		coda.push(dinastia);
		while(!coda.isEmpty() && descendantFound == null) {
			DinastyTree current = coda.pop();
		if (current.getAnni() < anni) {
			descendantFound = current;
		}
		else {
			for(DinastyTree figlio : current.getFigli()) {
				coda.push(figlio);
				System.out.println("messo in coda " + figlio.getNome());
			}
		}
	}
	return descendantFound;
}

}
