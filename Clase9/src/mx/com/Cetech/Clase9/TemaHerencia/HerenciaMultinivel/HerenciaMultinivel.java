package mx.com.Cetech.Clase9.TemaHerencia.HerenciaMultinivel;

public class HerenciaMultinivel {

	public static void main(String[] args) {
		/*
		 * La clase CalcularTresSum es Subclase de la Superclase CalcularDosSum por lo tanto podemos acceder
		 * a metodos y atributos de clase padre/superclase desde la instancia de la clase hijo.
		 */
		
		CalcularCuatroSum cuatroSum = new CalcularCuatroSum();
		cuatroSum.encontrarCuatroSum();
	}

}
