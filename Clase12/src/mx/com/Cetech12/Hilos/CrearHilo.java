package mx.com.Cetech12.Hilos;

public class CrearHilo {
	public static void main(String[] args) {
		PrimerHilo primerHilo = new PrimerHilo();
		SegundoHilo segundoHilo = new SegundoHilo();
		primerHilo.start();
		segundoHilo.start();
		
	}
}
