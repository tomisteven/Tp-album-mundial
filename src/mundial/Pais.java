package mundial;

public class Pais {
	String nombre;
	int ranking;
	
	
	public Pais(int ranking, String nombre) {
		this.nombre = nombre;
		this.ranking = ranking;
		
	}
	
	public String toStringg() {
		return "Pais:" + this.nombre + ", Ranking: " + this.ranking; 
	}
	
	
	
	
	
	
}



