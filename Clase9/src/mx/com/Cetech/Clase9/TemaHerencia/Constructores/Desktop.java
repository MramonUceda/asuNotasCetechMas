package mx.com.Cetech.Clase9.TemaHerencia.Constructores;
//el constructor se encarga de inicializar los objectos

public class Desktop {
	
	String agp;
	String tarjetaMadre;
	String procesador;
	String memoriaRam;
	String hdd;
	String unidadLectora;
	String procesaor;
	String sistemaDeEnfriamiento;
	String fuente;
	String gabinete;
	
	public Desktop(String agp, String tarjetaMadre, String procesador,
			String memoriaRam, String hdd, String unidadLectora,
			String procesaor, String sistemaDeEnfriamiento, String fuente,
			String gabinete) {
		super();
		this.agp = agp;
		this.tarjetaMadre = tarjetaMadre;
		this.procesador = procesador;
		this.memoriaRam = memoriaRam;
		this.hdd = hdd;
		this.unidadLectora = unidadLectora;
		this.procesaor = procesaor;
		this.sistemaDeEnfriamiento = sistemaDeEnfriamiento;
		this.fuente = fuente;
		this.gabinete = gabinete;
	}
	
	public Desktop() {
	}

	public Desktop(String tarjetaMadre, String procesador, String gabinete) {
		this.tarjetaMadre = tarjetaMadre;
		this.procesador = procesador;
		this.gabinete = gabinete;
	}
	
	
//	public Desktop(){
//		System.out.println("Dentro de la clase Constructor Desktop");
//		int a=5, b=5;
//		System.out.println((a+b));
//	}
	
	
	
	

}
