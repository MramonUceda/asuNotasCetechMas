package mx.com.Cetech12.Hilos;

public class PrimerHilo extends Thread {
	
	/*
	 * Hilos/Subprocesos
	 * Crear una clase que herede de Thread
	 * Crear instancia de esa clase, La clase que hereda debe de reemplazar el metodo run
	 *	que es el metodo de partida para el nuevo hilo
	 * Esta nueva clase creada debe llamar el metodo Start para la ejecución del hilo
	 */
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("Primer hilo" + i);
		}
	}
}
