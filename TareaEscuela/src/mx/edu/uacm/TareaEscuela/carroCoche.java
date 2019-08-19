package mx.edu.uacm.TareaEscuela;

import java.util.Scanner;

public class carroCoche{
	
	private String color;
	private String marca;
	private int velocidad;
	private String modelo;
	private String motor;

	
	public carroCoche() {
		// TODO Auto-generated constructor stub
	}

	public carroCoche(String color, String marca, int velocidad, String modelo,
			String motor) {
		this.color = color;
		this.marca = marca;
		this.velocidad = velocidad;
		this.modelo = modelo;
		this.motor = motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public void AbrirPuerta(int sN) {
		if (sN == 1) {
			System.out.println("Puerta abierta.");
		} else {
			System.out.println("Aun la puerta sigue cerrada.");
		}

	}


	public void EncenderAuto(int a){
		if(a == 1){
			System.out.println("Auto Encendido.");
		}else{
			System.out.println("Auto Apagado.");
		}
	}
	
	public void CambiarVelocidad(int velocidad){
		if( velocidad == 0){
			System.out.println("En neustral");
		}
		else if(velocidad == 1){
			System.out.println("Va en primera");
		}
		else if(velocidad == 2){
			System.out.println("Vamos en segundo, cambio....");
		}
		else if(velocidad == 3){
			System.out.println("Vamos en tercera, recuerda que puedes meter hasta 5 velocidades.");
		}
		else if(velocidad == 4){
			System.out.println("Vamos en cuarta, peniltima");
		}
		else if (velocidad == 5){
			System.out.println("Ultima velocidad que puedes meter.");
		}
		
		if(velocidad == 6){
			System.out.println("Estas metiendo la reversa.");
		}
	}
	
	public void FrenarCarro(int f){
		System.out.println("Frenando");
		if(f == 9){
			System.out.println("Alto total");
		}else{
			System.out.println("Seguimos en la misma velocidad.");
		}
		
		
	}
	
}


