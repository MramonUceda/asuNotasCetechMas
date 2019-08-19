package mx.com.Cetech.Clase10.ProgramandoContraInterfaces;

public class Principal {

	public static void main (String[] args){
		OficinaDeEnvio oficinaDeEnvio = new OficinaDeEnvio();
		
		oficinaDeEnvio.envioUrgente("Para: Todos #msg:Todos pasan");
		oficinaDeEnvio.envioNormal("Para alguien más");
		oficinaDeEnvio.envioNormal("Otro mensaje");
		oficinaDeEnvio.enviarTodo();
	}
}
