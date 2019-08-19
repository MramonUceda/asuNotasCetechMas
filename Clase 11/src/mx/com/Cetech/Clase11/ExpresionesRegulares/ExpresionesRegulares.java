package mx.com.Cetech.Clase11.ExpresionesRegulares;

import javax.swing.JOptionPane;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Srirve para las validaciones de ciertos datos en nuestros campos de text,para esto usaremos expresiones regulares, lo cual nos facilita
		 * realizar un reconocimiento de ciertos patrones en el texto y así verificar si un texto de entrada es el correcto o no lo es.
		 * 
		 */
		//Para edad
		
//		String edad;
//		edad = JOptionPane.showInputDialog("Ingresa edad");
//		//if(edad.matches("[0-9]{1,2}")){
//		if(edad.matches("[1-9]{1}([0-9]{1,2})?")){
//			JOptionPane.showMessageDialog(null, "Correcto");
//			//matches -> expresion regular 
//			//[0-9] -> sólo acpeta número del 0 al 9
//			// {1,2} -> cantidad minima 1 o maxima 2
			//el ? da la opcion como opcional
//		}else{
//			JOptionPane.showMessageDialog(null, "Incorrecto");
//		}
		
		//para e-mail
//		String correo;
//		correo = JOptionPane.showInputDialog("Ingresa tu e-mail");
//		//if(edad.matches("[0-9]{1,2}")){
//		if(correo.matches("[a-zA-Z0-9]+\\@[a-zA-Z]+\\.[a-zA-Z]+")){
//			JOptionPane.showMessageDialog(null, "Correcto");
//			//matches -> expresion regular 
//			//[0-9] -> sólo acpeta número del 0 al 9
//			// {1,2} -> cantidad minima 1 o maxima 2
//			//el ? da la opcion como opcional
//		}else{
//			JOptionPane.showMessageDialog(null, "Incorrecto");
//		}
		//mas opciones en correo
//		String correo;
//		correo = JOptionPane.showInputDialog("Ingresa tu e-mail");
//		//if(edad.matches("[0-9]{1,2}")){
//		if(correo.matches("[a-zA-Z0-9]+[-_.]*[a-zA-Z0-9]+\\@[a-zA-Z]+\\.[a-zA-Z]+")){
//			JOptionPane.showMessageDialog(null, "Correcto");
//			//matches -> expresion regular 
//			//[0-9] -> sólo acpeta número del 0 al 9
//			// {1,2} -> cantidad minima 1 o maxima 2
//			//el ? da la opcion como opcional
//		}else{
//			JOptionPane.showMessageDialog(null, "Incorrecto");
//		}
		//[a-zA-Z0-9] ->  Se puede usar de la a -z minuscula o mayuscula o del 0-9.
		//con el signo de + debe de haber uno o más elementos antes que él 
		// [-_.]-> se puede poner "- _ y .".
		// *-> existe o no existe; puede o no haber (de 0 a muchos).
		//Caracter especial Obligatorio -> \\
		String fecha;
		fecha = JOptionPane.showInputDialog("Ingresa la fecha");
		//if(edad.matches("[0-9]{1,2}")){
		if(fecha.matches("[1-3]{1}[0-9]{1}+\\-[0-1]{1}[0-9]{1}+\\[0-9]{4]+")){
			JOptionPane.showMessageDialog(null, "Correcto");
			//matches -> expresion regular 
			//[0-9] -> sólo acpeta número del 0 al 9
			// {1,2} -> cantidad minima 1 o maxima 2
			//el ? da la opcion como opcional
		}else{
			JOptionPane.showMessageDialog(null, "Incorrecto");
		}
	}
		

}
	
