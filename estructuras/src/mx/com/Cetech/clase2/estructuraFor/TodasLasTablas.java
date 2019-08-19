package mx.com.Cetech.clase2.estructuraFor;

public class TodasLasTablas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=1; i<=10; i++){
			System.out.println("tabla de multiplicar " + i);
			for(j=1; j<=10;j++){
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}

	}

}
