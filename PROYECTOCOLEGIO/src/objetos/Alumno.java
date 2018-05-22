package objetos;

import java.util.Date;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int codigo;
	private int codigoCurso;
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellidos, int codigo, int codigoCurso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.codigo = codigo;
		this.codigoCurso = codigoCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	
	
	
	
}
