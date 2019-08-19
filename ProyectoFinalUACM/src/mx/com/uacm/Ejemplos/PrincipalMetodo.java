package mx.com.uacm.Ejemplos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PrincipalMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atributos atri = new Atributos();
		Scanner tl = new Scanner(System.in);
		System.out.println("Ingresa tu nombre:");
		atri.setNombre(tl.nextLine());
		System.out.println("Ingresa tu apellido:");
		atri.setApellido(tl.nextLine());
		System.out.println("Ingresa tu correo:");
		atri.setCorreo(tl.nextLine());
		
		//System.out.println(atri.getNombre()+ "%" + atri.getApellido()+ "%" + atri.getCorreo());
		String todo = (atri.getNombre()+ "%" + atri.getApellido()+ "%" + atri.getCorreo());
		System.out.println(todo);
		String[] patito = todo.split("%");
		System.out.println(patito.length);
		
		for(String aux:patito){
			System.out.println(aux);
		}

		atri.setSinMedicina(JOptionPane.showInputDialog("¿Horas libreas de medicamento?"));
		// System.out.println(sr.sinMedicina);
		int sinMed = Integer.parseInt(atri.getSinMedicina());
		System.out.println(sinMed);

	}

}
