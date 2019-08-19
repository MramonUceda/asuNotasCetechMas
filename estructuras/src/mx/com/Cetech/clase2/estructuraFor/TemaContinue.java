package mx.com.Cetech.clase2.estructuraFor;

public class TemaContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Saltarse una iteracion de un bucle, usamos la declaracion continue
		 *por ejemplos, vamos a imprmir la variable i por medio de un bucle 
		 *y queremos que no se imprima el valor de "i " cuando llegue a "3"
		 * 
		 */
		int i =1;
		for(; i< 5; i++){
			if (i==3){
				continue;
			}
			System.out.println("Valor de i " + i);
		}

	}

}
