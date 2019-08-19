package mx.com.Cetech.Clase9.TemaHerencia.HerenciaMultinivel;

public class CalcularTresSum extends CalcularDosSum {
	int c = 3;
	
	public int encontrarTresSum(){
		int resultado  = encontrarDosSum() + c;
		return resultado;
	}

}
