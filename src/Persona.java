
public class Persona {
	
	private String nome;
	private int anni;
	
	public Persona(String nome, int anni) {
		this.nome = nome;
		this.anni = anni;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnni() {
		return anni;
	}

	public void setAnni(int anni) {
		this.anni = anni;
	}
	
	@Override
	public String toString() {
		String s = getNome();
		s += "\nAnni = " + getAnni() + "\n";
		return s;
	}

	
	
	
}
