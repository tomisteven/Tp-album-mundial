package mundial;

import java.util.ArrayList;


public class SistemAlbumMundial {

	Figurita figurita;
	FiguritaTop10 figuritaTop10;
	ArrayList<Pais> paises = new ArrayList<>();
	ArrayList<Participante> participantes = new ArrayList<>();
	ArrayList<Participante> participanteConAlbumCompleto = new ArrayList<>();
	
	
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
		
		for(int i = 0; i < sistema.participantes.size(); i++) {
			System.out.println(sistema.participantes.get(i).verParticipante() );
		}
		
		
		
	}
	
	
}
