package mundial;

import java.util.ArrayList;

public class Seccion {
	String nombrePais;
	ArrayList<Tupla<Jugador, Boolean>> jugadores = new ArrayList<Tupla<Jugador, Boolean>>();
	Boolean seccionCompleta; 
	
	
	public Seccion(String nombre) {
		this.nombrePais = nombre;
	}
	
//	metodos
	
	public Boolean pegarFiguritas(Figurita figurita) {
		return false;
	}
	
	public Boolean seccionCompleta () {
		seccionCompleta = true;
		return seccionCompleta;
	}
	
	public String nombre() {
		return nombrePais;
	}
	
	
	
	
}
