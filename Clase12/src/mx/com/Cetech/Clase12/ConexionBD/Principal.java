package mx.com.Cetech.Clase12.ConexionBD;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection miConnection;
		miConnection = new ConexionDataBase().getDbConnection();
		if(miConnection != null){
			JOptionPane.showInputDialog("Conexion correcta");
		}else{
			JOptionPane.showInputDialog("Conexion fallida");
		}

	}

}
