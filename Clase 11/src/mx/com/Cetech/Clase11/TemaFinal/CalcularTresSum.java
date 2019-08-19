package mx.com.Cetech.Clase11.TemaFinal;

public class CalcularTresSum extends CalcularDosSum {
	int c = 45;
	
	public void encontrarTresSum(){
		int sumaDos = encontrarDosSum() + c;
		
		System.out.println(sumaDos);
	}

}
