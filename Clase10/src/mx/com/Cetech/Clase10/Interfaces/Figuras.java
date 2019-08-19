package mx.com.Cetech.Clase10.Interfaces;

public class Figuras {

	int perimetro = 10;
	int alto = 3;
	int ancho = 7;
	
	public void calcularPerimetro(){
		System.out.println("Perimetro es " + (alto + ancho));
	}
	public void area(){
		System.out.println("Area es :" + (alto * ancho));
	}
}
