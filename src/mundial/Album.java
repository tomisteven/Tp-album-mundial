package mundial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Album {
	
	char tipo;
	int codigoAlbum;
	int valorCodigo;
	String Premio;
	int dniParticipante;
	Boolean albumCompleto;
		
	Map <String, Seccion> secciones = new HashMap <String, Seccion>(); 
	
	
	
//	metodos
	public Boolean albumCompleto() {return true;}
	public String premio() {return "el premio es..";}
	public int codigoAlbum() {return this.codigoAlbum;}
	public ArrayList<Figurita> pegarFiguritas (ArrayList<Figurita> figuritasParaPegar){return null;}
	
	
}
