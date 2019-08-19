package mx.com.Cetech.Clase11.ExpresionesRegulares;

import javax.swing.JOptionPane;

public class TareaDeIngresarDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String telefono;
		telefono = JOptionPane.showInputDialog("Ingresa el numero telefonico;");
		if(telefono.matches("[0-9]{2}([0-9]{1,2})?+\\-[0-9]{10}+")){
			JOptionPane.showInputDialog("Correcto");
		}else{
			JOptionPane.showInputDialog("Incorrecto");
		}*/
		String dinero;
		dinero = JOptionPane.showInputDialog("Ingresa el numero telefonico;");
		if(dinero.matches("[1-9]{1}([0-9]{1,9})?")){
			JOptionPane.showInputDialog("Correcto");
		}else{
			JOptionPane.showInputDialog("Incorrecto");
		}

		

	}
	
}
