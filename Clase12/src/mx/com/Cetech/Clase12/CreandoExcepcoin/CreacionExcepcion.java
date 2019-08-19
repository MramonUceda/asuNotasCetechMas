package mx.com.Cetech.Clase12.CreandoExcepcoin;

public class CreacionExcepcion {
	
	static void usuarioPalabra(String mPalabra) throws MalJefeExpcecion{
		if(mPalabra.equals("David")){
			throw new  MalJefeExpcecion(mPalabra);
		}else{
			System.out.println("Buen Jefe");
		}
	}
	
	public static void main(String[] args) {
		try {
			usuarioPalabra("Cris");
			usuarioPalabra("David");
		} catch (MalJefeExpcecion e) {
			// TODO: handle exception
			System.out.println("El mal jefe es" + e.impresion());
		}
	}
	
}
