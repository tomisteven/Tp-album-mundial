package mundial;

public class FiguritaTop10 {
	int año;
	boolean balonDeOro;
	String sedeMundial;
	int valor;
	String nombre;
	
	public double valorFinal(int rankingPais) {
		if(balonDeOro) {
			return (valor + rankingPais) * 1.20;
		}else {
			return (valor + rankingPais) * 1.10;
		}
	}
	
	public String sedeMundial() {
		return sedeMundial;
	}
	
	public boolean balonDeOro() {
		return balonDeOro;
	}
}
