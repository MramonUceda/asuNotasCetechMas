package mx.com.Cetech.Clase9.TemaHerencia.HerenciaHibrida;

public class CalcularTresSum extends CalcularDosSum {
	int c = 3;
	
	public void encontrarTresSum(){
		int resultado  = encontrarDosSum() + c;
		System.out.println("EL resultado de la suma es: " + resultado);
	}

}
