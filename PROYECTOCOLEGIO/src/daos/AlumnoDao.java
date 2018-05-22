package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import objetos.Alumno;



public class AlumnoDao {

private static Connection conexion;
	
	public static Connection getConexion() {
		return conexion;
	}

	public static void setConexion(Connection conexion) {
		AlumnoDao.conexion = conexion;
	}



	public static int insertar(Alumno alum) {
		
		
		try {
			PreparedStatement stmt;
			stmt = conexion.prepareStatement
					("insert into alumnos (codigo, nombre, apellidos, codigo_curso) " + 
					 "values(?,?,?,?)");
			stmt.setInt(1, alum.getCodigo());
			stmt.setString(2, alum.getNombre());
			stmt.setString(3, alum.getApellidos());
			stmt.setInt(4, alum.getCodigoCurso());
			
			//devuelve el numero de filas modificadas
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo al insertar alumno.");
			return -1;
		}
	}
	
	public static Alumno buscarAlumnoPorCodigo (int codigo) {
		Alumno alum = new Alumno();
		try {
			PreparedStatement stmt = conexion.prepareStatement
					("select * from alumnos where codigo=?");
			stmt.setInt(1, codigo);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				alum = new Alumno (  rs.getString("nombre"),rs.getString("apellidos"),
						rs.getInt("codigo"),rs.getInt("codigo_curso"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No existe el alumno con codigo " + codigo);
			return null;
		}
		return alum;
	
}
}
