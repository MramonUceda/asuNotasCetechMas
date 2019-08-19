package mx.com.Cetech.Clase7.Temanuevo.ventanas;

import java.lang.invoke.SwitchPoint;

import javax.swing.JOptionPane;

public class ventanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String campo;
		campo = JOptionPane.showInputDialog("Escribe tu nombre:");
		System.out.println(campo);
		JOptionPane.showMessageDialog(null, "lo que escibiste fue:" + campo);
		
		System.out.println("**********************************");
		
		JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titulo", JOptionPane.ERROR_MESSAGE,JOptionPane.ERROR_MESSAGE, null, new  Object[]{"Cancelar"},"No jalo");
		JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titulo", JOptionPane.INFORMATION_MESSAGE,JOptionPane.INFORMATION_MESSAGE, null, new  Object[]{"ok"},"ok2");
		
		
		
		
		
		
		int opcion = JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titulo", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, new  Object[]{"Si","No"},"No");
		System.out.println(opcion);
		
		if(JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titulo", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, new  Object[]{"Si","No"},"No") == 1){
			 
			
		}else{
			JOptionPane.showMessageDialog(null, "Estas dentro del else");
		}
		
		int ventana = JOptionPane.showOptionDialog(null, "Este es el cuerpo del mensaje", "Este es el titulo", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, new  Object[]{"Si","No","Cancelar"},"0");
		switch (ventana) {
		case 0:
			JOptionPane.showMessageDialog(null, "Estas dentro del if");
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "Estas dentro del else");
			break;
		case 2:
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Cancelar opcion");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Return");
			break;
		}
	}

}
