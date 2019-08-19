package mx.com.Cetech.Clase7.Temanuevo.temaArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class TemaArrayList {

	public static void main(String[] args) {
		/*
		 * La clase arraylist de java nos permite almacenar datos en memoria de forma similar a los arreglos/matrices/vectores;
		 * con la ventaja de que el n�mero de elementos que almacena lo hace de forma dinamica, es decir nos permite a�adir, eliminar 
		 * o modificar elementos que pueden ser de cualquier tipo de elemento u objecto.
		 *  
		 */
		ArrayList datos = new ArrayList();
		datos.add(8);
		datos.add('@');
		datos.add(false);
		datos.add("Mario");
		
		//foreach
		for(Object aux:datos){
			System.out.println(aux);
		}
		System.out.println("***************************************");
		System.out.println(datos.get(0)); // obtiene solo el datos del indice cero.
		
		System.out.println("*******************************************");
		
		for(int i=0; i < datos.size() ;i++){
			System.out.println(datos.get(i));
		}
		
		//Arraylist de una tipo de datos
		
		System.out.println("**********************Arraylist de un tipo de datos************************");
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("4");
		nombres.add("Mario");
		nombres.add("Pato");
		nombres.add("Pablo");
		nombres.add("Alexis");
		nombres.add("Miguel");
		
		for(String aux:nombres){
			System.out.println(aux);
		}
		
		/*
		 *Una vez que tenemos nuestras listas nos bastar� con utilizar la clase "CLASE".  
		 *Para obtener un puntero que nos referencie a los elementos de la lista.En este punto tendremos que tener en cuenta
		 *que el metodo HashNext nos dice si hay m�s elementos,y el elemento Nextnos permite moverlos al siguiente elemento 
		 */
		Iterator iter = nombres.iterator();
		
		
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		//A�ade un elemento al ArrayList en cualquier posici�n
		System.out.println("********************************************");
		nombres.add(3, "Nuevo elemento");
		
		for(String aux:nombres){
			System.out.println(aux);
		}
		System.out.println("********************************");
		//Devuelve el tama�o del arraylist (arraylist.size();)
		
		System.out.println(nombres.size());
		
		System.out.println("****************************************");
		//Devuelve el elemento que esta en la posici�n "n" del arraylist
		
		System.out.println(nombres.get(5));
		
		System.out.println("****************************");
		
		//Comprueba si existe el elemento en el parametro
		
		System.out.println(nombres.contains("Miguel"));
		
		System.out.println("****************************");

		//Devuelve la posici�n de la primer ocurrenc�a 
		
		System.out.println(nombres.indexOf("Alexis"));
		
		System.out.println("****************************");

		//Devuelve la posici�n de la ultima ocurrencia
		nombres.add(7,"Alexis");
		System.out.println(nombres.lastIndexOf("Alexis"));
		
		//Borra el elemento
		System.out.println("Mario");
		System.out.println(3);
		
		System.out.println(nombres.remove("Mario"));
		for(String aux:nombres){
			System.out.println(aux);
		}
		
		
		//Borra todos los elementos del arraylist
		nombres.clear();
		for(String aux:nombres){
			System.out.println(aux);
		}
		
		//Devuelve si est� vacio
		System.out.println(nombres.isEmpty());
		//Recorre el arreglo
		iter=nombres.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
