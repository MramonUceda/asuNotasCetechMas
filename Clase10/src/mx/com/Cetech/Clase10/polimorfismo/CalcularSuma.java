package mx.com.Cetech.Clase10.polimorfismo;

public class CalcularSuma {
	/*
	 * En está clase creamos el metodo encontrarSuma();
	 * todos estos metodos tienen el mismo nombre pero tienen diferentes declaraciones de parametros
	 */
	
	public void encontrarSuma() {
		System.out.println("Sin argumentos.");

	}

	public void encontrarSuma(String primera) {
		System.out.println(" Un argumento String " + primera);
		
	}

	public void encontrarSuma(int segundo) {
		System.out.println("El resultado de la suma es : " + (segundo + 5));

	}

	public void encontrarSuma(int nm1, int nm2) {
		System.out.println("El resultado de la suma es: " + (nm1 + nm2));
	}

	public void encontrarSuma(String x, int numero1, int numero2) {
		System.out.println("Este es el String" + x + "mas" + numero1 + numero2 );
	}

	public void encontrarSuma( boolean isBuena) {
		if(isBuena){
			System.out.println("El valor es:" + isBuena);
		}else{
			System.out.println("Esto es falso");
		}
	}

}
