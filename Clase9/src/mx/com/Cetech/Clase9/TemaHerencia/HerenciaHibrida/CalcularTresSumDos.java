package mx.com.Cetech.Clase9.TemaHerencia.HerenciaHibrida;

public class CalcularTresSumDos extends CalcularDosSum {
	int c = 90;
	
	public void encontrarTresSum(){
		int resultado  = encontrarDosSum() + c;
		System.out.println("EL resultado de la suma es: " + resultado);
	}

}
