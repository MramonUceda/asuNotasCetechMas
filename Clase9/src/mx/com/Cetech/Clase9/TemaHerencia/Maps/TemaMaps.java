package mx.com.Cetech.Clase9.TemaHerencia.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class TemaMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Declaración de un MAP (Un "HASHMAP"), con clave integer y valor String.
		 * Las claves pueden ser de cualquien tipo de dato, aun que lo mas utilizados como claves son:
		 * integer,String ó double.
		 * Como se declara un Map:
		 */
		
		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		
		nombreMap.size(); // devuelve el número de elementos del Map
		
		nombreMap.isEmpty(); // Devuelve true si hay elementos en el map
		
		//nombreMap.put(K clave, v Valor); //Añade un elemento al Map
		
		//nombreMap.get(k clave); //Devuelve el valor de la clave que se le pase como parametro
		
		nombreMap.clear(); //Borra todos los componentes de MAP
		
		//nombreMap.remove(k clave); //borra el par clave/valor de la clave que se le pasa como parametro
		
		//nombreMap.containsKey(k clave); // devuelve true si en el Map, hay un clave que coincide
		//nombreMap.containsValue(v valor); //Devuelve true si en el map hay un valor que coincide
		
		nombreMap.values(); // Devuelve una coleccion con los valores del Map
		
		/*
		 * Existen tres tipo de Maps:
		 * 1.-HasMap: Los elementos que se insertan en el map no trendran un orden en especifico 
		 * 
		 * 2.- TreeMap: El map lo ordena de forma natural. por ejemplo, si la clave son valores enteros los 
		 * ordena de menor a mayor
		 * 
		 * 3.- LinkedHashMap: Inserta en el mapa los elementos en el orden en el que se van insertando(no los acomoda no los arregla), es decir, que no tienen
		 * una ordenacion de los elementos como tal. Por lo tanto ésta clase realiza la busqueda de los elemenros de
		 * forma mal lenta.
		 * 
		 */
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(91, "Patricia");
		hashMap.put(55, "Mario");
		hashMap.put(67, "Miguel");
		hashMap.put(35, "Alexis");
		hashMap.put(10, "Pablo");
		
		
		Iterator<Integer> it =  hashMap.keySet().iterator();
		while(it.hasNext()){
			
			Integer key = it.next();
			
			System.out.println("clave" + key + "-Valor:" + hashMap.get(key));
			
		}
		
		System.out.println("**********************************************************");
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(91, "Patricia");
		treeMap.put(55, "Mario");
		treeMap.put(67, "Miguel");
		treeMap.put(35, "Alexis");
		treeMap.put(10, "Pablo");
		
		
		it =  treeMap.keySet().iterator();
		while(it.hasNext()){
			
			Integer key = it.next();
			
			System.out.println("clave" + key + "-Valor:" + treeMap.get(key));
			
		}
		
System.out.println("**********************************************************");
		
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(91, "Patricia");
		linkedHashMap.put(55, "Mario");
		linkedHashMap.put(67, "Miguel");
		linkedHashMap.put(35, "Alexis");
		linkedHashMap.put(10, "Pablo");
		
		
		it =  linkedHashMap.keySet().iterator();
		while(it.hasNext()){
			
			Integer key = it.next();
			
			System.out.println("clave" + key + "-Valor:" + linkedHashMap.get(key));
			
		}
		
		//foreach
		System.out.println("****************foreach*******************************+");
		
		for (Entry<Integer, String> aux : linkedHashMap.entrySet()) {
			
			Integer clave = aux.getKey();
			
			String valor = aux.getValue();
			
			System.out.println(clave + "->" + valor );
			
			
		}
		
	}

}
