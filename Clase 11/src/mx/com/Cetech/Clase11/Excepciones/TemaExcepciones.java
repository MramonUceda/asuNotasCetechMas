package mx.com.Cetech.Clase11.Excepciones;

public class TemaExcepciones {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		int numero[] = new int [3];
		
		try {
			System.out.println(b/a);
			System.out.println("Fin de try.");
			
			System.out.println(numero[5]);
			
		}catch(ArithmeticException arit){
				System.out.println("Error aritmetico,ponte a estudiar." + arit.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException arrerro){
			System.out.println("Error en arreglo, no existe esa posicion." + arrerro.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("error de ejecucion" + e.getMessage());
		}finally{
			System.out.println("Bloque finally siempre se ejecutará.");
		}
		System.out.println("Fin de programa.");
	}

}
