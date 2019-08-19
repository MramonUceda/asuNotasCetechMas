package mx.com.Cetech.Clase13.Dao;

import java.lang.reflect.Array;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import mx.com.Cetech.Clase13.BD.ConexionDataBase;
import mx.com.Cetech.Clase13.Bean.Persona;

public class ConsultaPersonaDao {
	
	  public Map<String, String> getAllPersona(){
		Map<String, String> mapPersonas = new HashMap<String, String>();
		String  query = "SELECT * FROM personas"; 
		
		Statement st = null;
		
		ConexionDataBase conBd = new ConexionDataBase();
		
		ResultSet rs = null;
		
		Connection bdConnection = conBd.getDbConnection();
		
		try {
			
			st = bdConnection.prepareStatement(query);
			rs = st.executeQuery(query);
			while(rs.next()){
				mapPersonas.put(rs.getString("celular"), rs.getString("nombre"));
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			conBd.cerrarConexion(bdConnection, null, st);
		}
		
		return mapPersonas;
	}
	  
	  public ArrayList<Persona> getPersona(String nombre){
		  
			ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
			
			//String  query = "SELECT * FROM personas"; 
			String  query = "SELECT * FROM cetech.persona where nombre like ? "; 
			
			PreparedStatement ps = null;
			
			ConexionDataBase conBd = new ConexionDataBase();
			
			ResultSet rs = null;
			
			Connection bdConnection = conBd.getDbConnection();
			
			try {
				
				ps = bdConnection.prepareStatement(query);
				ps.setString(1, nombre + "%");
				rs = ps.executeQuery();
				while(rs.next()){
					Persona persona = new Persona(rs.getInt("idpersona"), rs.getString("nombre"), rs.getString("peterno"), rs.getString("materno"), rs.getString("genero"), rs.getString("celular"), rs.getString("fecha_de_nacimiento"));
					listaPersonas.add(persona);
				}
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally{
				conBd.cerrarConexion(bdConnection, ps, null);
			}
			
			return listaPersonas;
		}
	  
	  public String editPersona(Persona nuevaPersona, String nombreBuscado,String paternoBuscado ){
		  
			ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
			
			//String  query = "SELECT * FROM personas"; 
			String  query = "UPDATE cetech.persona SET nombre=?, peterno=?, materno=? WHERE nombre = ? and paterno = ?"; 
			
			PreparedStatement ps = null;
			
			ConexionDataBase conBd = new ConexionDataBase();
			
			ResultSet rs = null;
			
			Connection bdConnection = conBd.getDbConnection();
			
			try {
				
				ps = bdConnection.prepareStatement(query);
				ps.setString(1, nuevaPersona.getNombre());
				ps.setString(2, nuevaPersona.getPaterno());
				ps.setString(3, nuevaPersona.getMaterno());
				ps.setString(4, nombreBuscado);
				ps.setString(5, paternoBuscado);
				
				
	
				ps.executeUpdate();
							
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally{
				conBd.cerrarConexion(bdConnection, ps, null);
			}
			
			return nuevaPersona.getNombre();
		}
}
