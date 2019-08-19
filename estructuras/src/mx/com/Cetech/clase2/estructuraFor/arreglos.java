package mx.com.Cetech.clase2.estructuraFor;

public class arreglos {

	public static void main(String[] args) {
		
		/*
		 * Arreglos o matrices
		 * Son variables que reservan espacio en memoria de antemano y podemos acceder a ellos
		 *  atraves de posiciones(indeces)
		 * funcionan con todo tipode datos / objetos
		 */		
		String nombre = "Mario";
		//nombre = "Cetech" // no se puede hacer porque se sobreescribe la variable solo guarda un dato
		// primero pongamos en corchetes para hacer una arreglo, tenemos que inicializar y definir la posicion en memoria
		String[] nombres = new String[8];
		//asignando valor a cada posición
		nombres [0] = "Brandon";
		nombres [1]= "Daniel";
		nombres [2]= "Pati";
		nombres [3]= "Alexis";
		nombres [4]= "Alejandro";
		nombres [5]= "Hector";
		nombres [6]= "Miguel";
		nombres [7]= "Mario";
		
		System.out.println(nombres[7]);
	}

}
