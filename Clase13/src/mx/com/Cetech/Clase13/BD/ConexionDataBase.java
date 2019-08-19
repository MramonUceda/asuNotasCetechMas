package mx.com.Cetech.Clase13.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDataBase {
	private final String DB_DRIVER = "com.mysql.jdbc.Driver"; //javaDataBaseConection(jdbs)
	private final String DB_CONNECTION = "jdbc:mysql://localhost:3306/cetech";
	//jdbs:tipoconexion://ip/puerto/database
	private final String DB_USER = "root";
	private final String DB_PASSWORD = "12345678";
	


	public Connection getDbConnection(){
		Connection dbConnection = null;
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error al cargar el driver");
		}
		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al conectarse a la DataBase");
			e.printStackTrace();
		}
		return dbConnection;
		
	}
	public void cerrarConexion(Connection conexion,PreparedStatement ps,Statement st){
		
		if(conexion != null){
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(ps != null){
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(st != null){
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}



