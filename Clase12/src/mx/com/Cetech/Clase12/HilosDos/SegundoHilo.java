package mx.com.Cetech.Clase12.HilosDos;

public class SegundoHilo implements Runnable {
	
	Thread hiloDos;
	public SegundoHilo(){
		hiloDos = new Thread(this,"hiloDos");
		hiloDos.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<=10; i++){
			System.out.println("Segundo hilo/subproceso" + hiloDos.getName() + " Valor" + i);
		}
	}

}
