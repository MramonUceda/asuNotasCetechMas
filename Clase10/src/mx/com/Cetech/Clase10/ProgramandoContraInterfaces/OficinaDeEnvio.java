package mx.com.Cetech.Clase10.ProgramandoContraInterfaces;

import java.util.ArrayList;

public class OficinaDeEnvio {
	
	//programando contra la implementacion
	//ServiciosDeEnvioElectronico serviciosDeEnvioElectronico = new ServiciosDeEnvioElectronico();
	//ServiciosDeEnvioPostal serviciosDeEnvioPostal = new ServiciosDeEnvioPostal();
	
	//Programando contra interface
	
	ServiciosDeEnvio serviciosDeEnvio = new ServiciosDeEnvioPostal(); 
	
	ArrayList<String> mensajes = new ArrayList<String>();
	
	public void envioUrgente(String mensaje){
		serviciosDeEnvio.enviar(mensaje);
	}
	public void envioNormal(String mensaje){
		mensajes.add(mensaje);
		
		if(mensajes.size() > 10){
			enviarTodo();
			
		}
	}
	public void enviarTodo(){
		for (String aux:mensajes){
			serviciosDeEnvio.enviar(aux);
		}
		mensajes = new ArrayList<String>();
	}

}
