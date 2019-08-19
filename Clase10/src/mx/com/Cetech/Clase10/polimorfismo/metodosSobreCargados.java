package mx.com.Cetech.Clase10.polimorfismo;

public class metodosSobreCargados {
	public static void main(String[] args) {
		/*
		 * En java es posible obtener dos o mas metodos de la misma clase que compartan el mismo nombre, siempre y cuando
		 * su declaracón de parametros sea diferente.
		 * 
		 * MetodosSObreCargados:
		 * Es una manera que java implementa el polimorfismo, cuando se invoca un metodo sobr cargado java utiliza el tipo o el numero de argumentos
		 * en el metodo como guía para determinar que version del metodo sobre cargado es el que está llamadno. 
		 * 
		 */
		CalcularSuma clacularSuma = new CalcularSuma();
		
		clacularSuma.encontrarSuma(true);
		
	}

}
