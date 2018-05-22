package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDao {
	
	public static Connection conexion;
	
	public ConexionDao() {
		this.conexion= conexion();
	}
	
	public static void setConexion (Connection conexion) {
		ConexionDao.conexion = conexion;
	}
	
	public static Connection getConexion() {
		return conexion;
	}

	public static Connection conexion () {
		try {
			//Cargamos el driver para conectar con mysql
			Class.forName("com.mysql.jdbc.Driver");
			//Creamos la conexi�n utilizando la base de datos
			//seguido de el usuario y la contrase�a para acceder
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost/colegio", "root", "root");
				System.out.println("Conexion con base de datos realizada.");
				return con;
				
		} catch (ClassNotFoundException e) {
			
			System.out.println("Clase mysql no encontrada.");
			
		}catch (SQLException e) {
			System.out.println("Error en la conexion.");
		}
		return null; 
			
		
		
		
	}
}