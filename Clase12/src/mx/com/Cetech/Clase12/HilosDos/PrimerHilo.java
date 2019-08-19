package mx.com.Cetech.Clase12.HilosDos;

public class PrimerHilo implements Runnable {

	Thread hiloUno;
	public PrimerHilo(){
		hiloUno = new Thread(this,"hiloUno");
		hiloUno.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<=10; i++){
			System.out.println("Primer hilo/subproceso" + hiloUno.getName() + " Valor" + i);
		}
	}

}
