package mx.com.Cetech.clase5.Metodos;

public class MetodoDos {

	/*
	 * Modificador de acceso´+ tipo de retorno +         nombre del metodo + ( argumentos ){
	 * 	public					STRING						
	 * Private					INT
	 * protecter				FLOAT
	 *  espacio (default) 		PERSONA U OTRO OBJECTO
	 * 
	 * } 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		MetodoDos instancia= new MetodoDos();
		instancia.suma(1, 2);
		System.out.println("Siguiente algo");
		instancia.suma(98, 23);
		

	}
	
	public void suma(int a, int b){
		int resutaldo = a+b;
		System.out.println(resutaldo);
	
	}

}
