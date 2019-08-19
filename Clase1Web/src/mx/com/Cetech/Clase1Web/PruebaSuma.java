package mx.com.Cetech.Clase1Web;

public class PruebaSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args != null && args.length > 0){
			int resulado = 0;
			for(String iterar : args){
				resulado = Integer.parseInt(iterar);
			}
			System.out.println("El resutaldo es: " +  resulado);
		}else{
			System.out.println("No se recibio valores.");
		}

	}

}
