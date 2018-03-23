import java.util.ArrayList;

public class DinastyTree {
	
	private String nome;
	private Integer anni;
	private DinastyTree padre;
	private ArrayList<DinastyTree> figli;
	
	
	public DinastyTree(String nome, Integer anni) {
		this.nome = nome;
		this.anni = anni;
		this.padre = null;
		this.figli = new ArrayList<DinastyTree>();
	}
	
	//Setter e Getter
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnni() {
		return anni;
	}
	public void setAnni(Integer anni) {
		this.anni = anni;
	}
	public DinastyTree getPadre() {
		return padre;
	}
	public void setPadre(DinastyTree padre) {
		this.padre = padre;
	}
	public ArrayList<DinastyTree> getFigli() {
		return figli;
	}
	public void setFigli(ArrayList<DinastyTree> figli) {
		this.figli = figli;
	}
	//
	
	public void aggiungiFiglio(DinastyTree figlio) {
		this.figli.add(figlio);
		figlio.setPadre(this);
	}
	
	
	public void aggiungiFigli(DinastyTree[] figli) {
		for(int i = 0; i < figli.length; i++) {
			this.aggiungiFiglio(figli[i]);
		}
	}
	
	
	

}
