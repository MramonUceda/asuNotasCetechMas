package mx.com.Cetech.Clase11.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

import javax.swing.JOptionPane;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo;
		FileReader leerArchivo = null;
		
		try {
			archivo = new File("C:\\Users\\mario\\Desktop\\miArchivo.txt");
			leerArchivo = new FileReader(archivo);
			BufferedReader memoriaParaLectura = new BufferedReader(leerArchivo);
			String linea = null; 
			int i = 0;
			while((linea = memoriaParaLectura.readLine()) != null){
				System.out.println(linea);
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

