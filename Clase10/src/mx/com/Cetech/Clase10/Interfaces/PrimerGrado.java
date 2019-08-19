package mx.com.Cetech.Clase10.Interfaces;

public class PrimerGrado extends Figuras implements FuncionesMatematicas,Fracciones {

	@Override
	public void suma() {
		// TODO Auto-generated method stub
		System.out.println("Resultado de la suma " + (a+b));
	}

	@Override
	public void resta() {
		// TODO Auto-generated method stub
		System.out.println("Resultado de la resta" + (a-b));
	}

	@Override
	public void producto() {
		// TODO Auto-generated method stub
		System.out.println("Resultado de la multiplicacion" + (a*b));
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("Resultado de la division" + (a/b));
	}

	@Override
	public void fraccionesBasics() {
		// TODO Auto-generated method stub
		System.out.println("El resultado es: " + (x/y));
		
	}

	@Override
	public void fraccionesComplejas() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
