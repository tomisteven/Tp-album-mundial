package mundial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SistemAlbumMundial {

	Figurita figurita;
	FiguritaTop10 figuritaTop10;
//	ArrayList<Pais> paises = new ArrayList<>();
	Map<Integer, Pais> paises = new HashMap<Integer, Pais>();
	ArrayList<Participante> participantes = new ArrayList<>();
	ArrayList<Participante> participanteConAlbumCompleto = new ArrayList<>();
	
//	datos
	
	String [] paisesArr = {"Brasil", "Belgica","Argentina", "Francia", "Inglaterra", "Italia", "España", 
			"Paises bajos", "Portugal", "Dinamarca", "Alemania", "Croacia", "Mexico", "Uruaguay", "Suiza"
			, "USA", "Colombia", "Senegal","Galses", "Irlanda", "Serbia", "Marruecos", "Peru", "Japon", 
			"Suecia", "Polonia", "Ucrania","Corea del Norte", "Chile", "Tunez", "Costa Rica"};
	
	
	int [] ranking_paises = {40,38,37,34,32,31,30,28,26,25,24,
								24,23,22,21,20,19,19,18,16,15,
								14,12,11,10,10,10,5,4,3,2,1
							};
	
	public void cargarPasisesYRanking() {
		for (int i = 0; i < paisesArr.length; i++) {
				paises.put(i, new Pais(ranking_paises[i], paisesArr[i]));
		}
	}
	
//	metodos
	
	public void registrarParticipante(int dni, char tipoAlbum, String nombre) {
		Participante newParticipante = new Participante(dni, nombre, tipoAlbum);
		participantes.add(newParticipante);
	}
	
	public void agregarParticipanteGanador() {}
	public void comprarFigurita(int dni) {
		//si dni esta dentro de los participantes podemos comprar
	}
	public void canjearCodigoPromocionalFigurita(int codigoPromocional) {}
	public Boolean albumCompleto(int dni){return true;}
	public void solicitarSorteo(int dni) {}
	public Boolean completoSeleccionArgentina() {return true;}
	public ArrayList<Figurita> generarFiguritas(int cantidad) {return null;}
	
	
	public static void main(String[] args) {
		SistemAlbumMundial sistema = new SistemAlbumMundial();
		sistema.registrarParticipante(40847133, 'c', "Tomas");
		sistema.registrarParticipante(44444444, 'T', "Leonardo");
		sistema.cargarPasisesYRanking();
		for(int i = 0; i < sistema.participantes.size(); i++) {
			System.out.println(sistema.participantes.get(i).verParticipante());
		}
		
		for(int i = 0; i < sistema.paises.size(); i++) {
			System.out.println(sistema.paises.get(i).toStringg());
		}
		
		
		
		
		
	}
	
	
}
