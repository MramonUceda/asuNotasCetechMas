package mx.com.Cetech.clase2.variables;

public class OperadoresCondicionales {

	public static void main(String[] args) {

		// los operadores condiciones  <,>,<=,>=,==, !=
		
		boolean isCondicional = 5 == 5;
		System.out.println(isCondicional);
		isCondicional = 5 < 5;
		System.out.println(isCondicional);
		isCondicional = 5 > 5;
		System.out.println(isCondicional);
		isCondicional = 5 >= 5;
		System.out.println(isCondicional);
		isCondicional = 5 <= 5;
		System.out.println(isCondicional);
		isCondicional = 5 != 5;
		System.out.println(isCondicional);
		isCondicional = !(5 > 10);
		System.out.println(isCondicional);
		
		//Operadores Logicos
		// AND &   |  Or |

		// AND(Y) 
		
		boolean islogicos = (6<12) & (3>5);
		System.out.println(islogicos);
		islogicos = ((6<12) && (3>5)) & (7<8); // doble && quiere decir que se hace un corto circuito si la primera condicion no se cumple ya no sigue 
		System.out.println(islogicos);
		
		// OR
		
		boolean islogico = (6<12) || (3>5);
		System.out.println(islogico);
		islogico = ((6<12) | (3>5)) | (7<8);  
		System.out.println(islogico);
		
		
	}

}
