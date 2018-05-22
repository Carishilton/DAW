package principal;

import daos.ConexionDao;
import daos.AlumnoDao;
import objetos.Alumno;

public class Principal {


		public static void main(String[] args) {
			ConexionDao con = new ConexionDao();
			AlumnoDao.setConexion(con.getConexion());
		
			
			Alumno a1 = AlumnoDao.buscarAlumnoPorCodigo(10);
			System.out.println(a1.getNombre() + " " + a1.getApellidos() + " con codigo " +
			a1.getCodigo() + " y codigo de curso: " + a1.getCodigoCurso()
			);
			
		}

	

}
