package mx.com.uacm.Ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Pruebas {

	public  void Encontrar (String nombre) {
		// TODO Auto-generated method stub
				File archivo;
				FileReader leerArchivo = null;
				
				try {
					archivo = new File("C:\\clasetarea\\miArchivo.txt");
					leerArchivo = new FileReader(archivo);
					BufferedReader memoriaParaLectura = new BufferedReader(leerArchivo);
					String linea = null; 
					int i = 0; 
					
					while((linea = memoriaParaLectura.readLine()) != null){
						System.out.println(linea+"CETECH2");
						System.out.println(linea.length());
						String aux= linea.toString();
						String[] div=aux.split("\\$");
						System.out.println(div.length);
						System.out.println(div[0]);
						String uno= div[0];
						String[] div1=uno.split("$");
						System.out.println(div1.length);
						int posicion = linea.indexOf(nombre); //se ingresa el nombre a buscar en fichero, si el nombre existe arroja
						System.out.println("Posicion " + posicion);
						//String[] patito = linea.split("@"); 
						//Split metodo para separ una cadena.en patito se está guardando los datos ingresados como un arreglo
						//posterior a eso se coloca el @ como separador entre cada atributo.
						//System.out.println(patito.length);
						//for(String aux:patito){ 
						//	System.out.println(aux); 
						//}
					}

					
					
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());		
			} 
				finally{
					try {
						if(leerArchivo != null){
							leerArchivo.close();
						}
					} catch (Exception e2) {
						// TODO: handle exception
						JOptionPane.showMessageDialog(null, e2.getMessage());

					}
			}

	}

}
