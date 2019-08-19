package mx.com.uacm.ProyectoFinalUACM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ficheros {
	
	public boolean EscribirFichero(String usuario) {
		// TODO Auto-generated method stub
		boolean isAgregado = false;
		FileWriter miArchivo = null;
		PrintWriter escribirArchivo;
		
		
		// Si hay un error nostros personalizamos el error pero sigue corriendo el aplicativo 
		try {
			miArchivo = new FileWriter("C:\\clasetarea\\miArchivo.txt",false);  
			//El parametro true es para agregar el texto al final del archivo en caso de que exista.
			//Si se desea reemplazar el archivo
			//existente se quita el parametro true y se pone false. 
			escribirArchivo = new PrintWriter(miArchivo);
			escribirArchivo.println(usuario);
			JOptionPane.showMessageDialog(null, "Texto ingresado correctamente.");
			isAgregado = true;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error al ingresar datos.");
		}
		finally{
			try {
				if(miArchivo != null){
					miArchivo.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e2.getMessage());
			}
		}
		return isAgregado;

	}
	
	
	public boolean LeerFichero(String nombre) {
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
				System.out.println(linea+"CETECH");
				System.out.println(linea.length());
				String aux= linea.toString();
				String[] div=aux.split("\\$");
				System.out.println(div.length);
				System.out.println(div[0]);
				String uno= div[0];
				String[] div1=uno.split("$");
				System.out.println(div1.length);
				int posicion = linea.indexOf("Borbolla");
				System.out.println("Posicion " + posicion);
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
	return false;
	}
	
	public String ObtenerFecha(){
		Date fecha;
		//Queremos sacar la fecha del sistema
		fecha = new Date();
		//System.out.println(fecha);
		//formato
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String fechaFormato =  sdf.format(fecha);
		
		System.out.println(fechaFormato);
		return fechaFormato;
	}

}
