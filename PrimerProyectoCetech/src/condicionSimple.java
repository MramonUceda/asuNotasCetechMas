import java.util.*;
public class condicionSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nm = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int numero = nm.nextInt();
		System.out.println(numero);
		if (numero%2 == 0){
			System.out.println("Tu numero es para.");
		}else{
			System.out.println("Tu numero es impar");
		}
	}

}
