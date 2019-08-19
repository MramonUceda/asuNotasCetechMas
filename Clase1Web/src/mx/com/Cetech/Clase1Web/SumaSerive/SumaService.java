package mx.com.Cetech.Clase1Web.SumaSerive;

public class SumaService {
	private SumaService(){
		
	}
	public static int suma(int... numbers){
		int result = 0;
		for(int iterador : numbers){
			result += iterador;
		}
		return result;
	}

}
