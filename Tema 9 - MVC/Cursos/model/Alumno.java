package cursos.model;

import java.util.Objects;

public class Alumno {

	private int codigoAlumno;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String fechaNacimiento;
	
	public Alumno(int codigoAlumno, String nombre, String apellidos, String telefono, String fechaNacimiento) {
		this.codigoAlumno = codigoAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Alumno [codigoAlumno=" + codigoAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, codigoAlumno, fechaNacimiento, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && codigoAlumno == other.codigoAlumno
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}
	
	
}
