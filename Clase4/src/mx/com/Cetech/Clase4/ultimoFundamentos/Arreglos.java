package mx.com.Cetech.Clase4.ultimoFundamentos;


public class Arreglos {

	public static void main(String[] args) {
		/*
		 * Arreglos o matrices
		 * Son variables que reservan espacio en memoria de antemano y podemos acceder a ellos
		 *  atraves de posiciones(indeces)
		 * funcionan con todo tipode datos / objetos
		 */
		String nombre = "Mario";
		nombre = "Cetech";
		
		//nombre = "Cetech" // no se puede hacer porque se sobreex¿scribe la variable solo guarda un dato
		//Primero se ponen los corchetes, para hacer una arreglo tenemos que inicializar y definir las posiciones en memoria			
		
		String[] nombres = new String[8];
		//asignando valor a cada posición

		nombres [0] = "Brandon";
		nombres [1]= "Daniel";
		nombres [2]= "Pati";
		nombres [3]= "Alexis";
		//nombres [4]= "Alejandro";
		nombres [5]= "Hector";
		nombres [6]= "Miguel";
		nombres [7]= "Mario";
		//nombres [8]="Marco"; Se genera un error al tratar de guardar en un indece que no existe
		
		System.out.println(nombres[6]);
		System.out.println(nombres[4]);
		
		int numeros [] = new int[10];
		
		numeros[0]= 7;
		numeros[1]= 578;
		numeros[2]= 4;
		numeros[3]= 1;
		numeros[4]= 7895;
		numeros[5]= 567;
		numeros[6]= 159;
		numeros[7]= 78;
		numeros[8]= 3;
		numeros[9]= 33;
		
		System.out.println(numeros[4]+ numeros[8]);
		
		String[] frutas = {"Manzana","Fresa","Pina","Sandia","Coco"};
		System.out.println(frutas[1]);
		System.out.println("*************************************************");
		System.out.println("Tamaño de arreglo numeros: " + frutas.length);
		
		for(int i=0; i<frutas.length;i++){
			System.out.println(frutas[i]);
		}
		System.out.println("******************************************");
		int i=0;
		System.out.println("Tamaño de arreglo numeros: " + numeros.length);
		while(i<numeros.length){
			System.out.println(numeros[i]);
			i++;
		}
		
		System.out.println("**********************FOR EACH**************************");
		
		for(String a:nombres){
			System.out.println(a);
		}
		System.out.println("Imprime numero:");
		for(int d:numeros){
			System.out.println(d);
		}
		
		System.out.println("************************************");
		
		Persona[] arregloPersona = new Persona[3];
		Persona personaUno = new Persona();
		
		personaUno.nombre = "Mario";
		personaUno.direccion = "Av.Revolucion";
		personaUno.nacionalidad = "Mexicana";
		personaUno.edad= 23;
		personaUno.estatura = 1.86f;
		personaUno.peso = 78.900f;
		personaUno.genero = 'm';
		
		Persona personaDos = new Persona();
		
		personaDos.nombre = "Patricia Navidad";
		personaDos.direccion = "Quien sabe";
		personaDos.nacionalidad = "Mexicana";
		personaDos.edad= 29;
		personaDos.estatura = 1.86f;
		personaDos.peso = 78.900f;
		personaDos.genero = 'f';
		
		arregloPersona[0] = personaUno;
		arregloPersona[1] = personaUno;
		
		System.out.println("Primera persona: " + arregloPersona[0].nombre);
		System.out.println("Primera persona: " + arregloPersona[0].edad);
		System.out.println("Primera persona: " + arregloPersona[0].estatura);
		System.out.println("Primera persona: " + arregloPersona[0].nacionalidad);
		System.out.println("Primera persona: " + arregloPersona[0].direccion);
		System.out.println("Primera persona: " + arregloPersona[0].peso);
		System.out.println("Primera persona: " + arregloPersona[0].estatura);
		System.out.println("Primera persona: " + arregloPersona[0].genero);
		

	}

}
