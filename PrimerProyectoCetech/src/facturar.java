import java.util.*;
public class facturar {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner nm = new Scanner(System.in);
		System.out.println("Cual fue el valor de la compra?:");
		 float compra = nm.nextFloat();
		if ((compra > 100) && (compra < 150)){
			double  factura = compra * 1.10;
			System.out.println("La factura es de : " + factura);
		}
		if ( (compra < 150) && ( compra > 200)){
			double  factura = compra * 1.10;
			System.out.println("La factura es "+ factura);
		}

	}

}
