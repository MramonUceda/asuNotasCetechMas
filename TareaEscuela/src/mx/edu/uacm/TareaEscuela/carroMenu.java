package mx.edu.uacm.TareaEscuela;

import java.util.*;

public class carroMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carroCoche usar = new carroCoche("Rojo", "Seat", 6, "Leon Cupra Fr",
				"2.0");
		int a;
		System.out.println(usar.getColor());
		System.out.println(usar.getMarca());
		System.out.println(usar.getModelo());
		System.out.println(usar.getVelocidad());
		System.out.println("¿Quiere abrir la puerta del auto?");
		Scanner teclado = new Scanner(System.in);
		a = teclado.nextInt();
		if (a == 0) {
			System.out.println("La puerta sigue cerrada");
		} else {
			usar.AbrirPuerta(a);
			System.out.println("¿Quieres encender el auto?");
			a = teclado.nextInt();
			if (a == 1) {
				usar.EncenderAuto(a);
				System.out.println("¿Velocidad?");
				a = teclado.nextInt();
				usar.CambiarVelocidad(a);
				a = teclado.nextInt();
				usar.CambiarVelocidad(a);
				a = teclado.nextInt();
				usar.CambiarVelocidad(a);
				a = teclado.nextInt();
				usar.CambiarVelocidad(a);
				a = teclado.nextInt();
				usar.CambiarVelocidad(a);
				System.out.println("Bajando la velocidad");
				System.out.println("4 rrrr");
				System.out.println("3 rrrrrr");
				System.out.println("2 rrr");
				System.out.println("1 rrrr");
				System.out.println("Neutral.....");
				System.out.println("¿Desa apagar el motor?");
				a = teclado.nextInt();
				if (a == 1) {
					System.out.println("Motor apagado");
				} else {
					System.out.println("El motor seguira prendido");
				}
			} else {
				System.out.println("apagado.");
			}

		}

		

	}
}
