package mx.com.Cetech.Clase10.ClasesAbstractas;

abstract class CalcularSuma {
	
	abstract int getSuma();
	public void imprimirResultado(){
		System.out.println("El resultado de la suma:" + getSuma());
	}

}
