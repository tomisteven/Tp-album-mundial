package mundial;

import java.util.ArrayList;

public class Participante {

	int dni;
	String nombre;
	String premio;
	char tipo;
	Album album;
	Boolean albumCompleto;
	ArrayList<Figurita> figusRepetidas = new ArrayList<>();
	ArrayList<Figurita> figusParaPegar = new ArrayList<>();
	ArrayList<FiguritaTop10> figusParaPegarTop10 = new ArrayList<>();
	
	
	public Participante(int dni, String nombre, char tipoAlbum) {
		this.nombre = nombre;
		this.dni = dni;
		this.tipo = tipoAlbum;
	}
	
	public String verParticipante() {
		return "nombre: " + this.nombre+ ", " + "Dni: " + this.dni;
	}
	
	
	public void comprarFigurita(char tipo) {
//		F = figurita tradicional
//		T = top10
		if(tipo == 'F') {			
				Figurita f = new Figurita();
				figusParaPegar.add(f);
				//verificar si no esta repetida sino... add al figusRepetidas			
		}
		if(tipo == 'T') {
				FiguritaTop10 f = new FiguritaTop10();
				figusParaPegarTop10.add(f);
			}
	}
	
	public ArrayList<Figurita> pegarFiguritas() {return null;}
	public Boolean intercambiarFigurita(int codigoFigurita) {return true;}
	public Boolean albumCompleto() {return true;}
	public String premio() {return "El premio es..";}
	
	
}
