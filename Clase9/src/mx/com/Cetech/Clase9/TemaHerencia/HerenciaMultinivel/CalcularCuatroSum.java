package mx.com.Cetech.Clase9.TemaHerencia.HerenciaMultinivel;

public class CalcularCuatroSum extends CalcularTresSum {
	int d = 23;
	
	public void encontrarCuatroSum(){
		
		int resultado = encontrarTresSum() + d;
		System.out.println("El resultado es " + resultado);
	}

}
