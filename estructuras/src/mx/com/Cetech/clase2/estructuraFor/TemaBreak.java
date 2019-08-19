package mx.com.Cetech.clase2.estructuraFor;

public class TemaBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Puedes utlizar la declacion breakpara dar fin a un ciclo en cualquier momento 
		 * por ejemplo, vamos a incrementar el valor de "i" por "3" y queremos evitar un 
		 * mayor incremento en su resultado
		 * si alcanza el "7"
		 */
		int i, resultado;
		for(i=1; i<10; i++){
			resultado = i+3;
			if(resultado > 7){
				break;
			}
			System.out.println(resultado);
		}

	}

}
