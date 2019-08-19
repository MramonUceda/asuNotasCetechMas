package mx.com.Cetech.Clase11.Ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EscribirFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter miArchivo = null;
		PrintWriter escribirArchivo;
		String texto = "Hola Es Ultima";
		
		// Si hay un error nostros personalizamos el error pero sigue corriendo el aplicativo 
		try {
			miArchivo = new FileWriter("C:\\Users\\mario\\Desktop\\miArchivo.txt",true);
			//El parametro true es para agregar el texto al final del archivo en caso de que exista.Si se desea reemplazar el archivo
			//existente se quita el parametro true y se pone false. 
			escribirArchivo = new PrintWriter(miArchivo);
			escribirArchivo.println(texto);
			JOptionPane.showMessageDialog(null, "Texto ingresado correctamente.");
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
		

	}

}
