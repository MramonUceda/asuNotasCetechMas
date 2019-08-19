package mx.com.Cetech.Clase10.ProgramandoContraInterfaces;

public class ServiciosDeEnvioPostal implements ServiciosDeEnvio {

	@Override
	public void enviar(String mensaje) {
		// TODO Auto-generated method stub
		System.out.println("Desde envio postal" + mensaje);
	}

}
