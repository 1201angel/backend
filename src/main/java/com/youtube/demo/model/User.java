package com.youtube.demo.model;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Access;
import javax.persistence.Column;

@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User extends ParentEntity {

	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name="primer_nombre", nullable = false, length = 255)
	private String primerNombre ;
	
	@Column(name="segundo_nombre", nullable = true, length = 255)
	private String segundoNombre ;
	
	@Column(name="primer_apellido", nullable = false, length = 255)
	private String primerApellido;
	
	@Column(name="segundo_apellido", nullable = true, length = 255)
	private String segundoApellido;
	
	@Column(name="telefono", nullable = false, length = 255)
	private String telefono;
	
	@Column(name="direccion", nullable = false, length = 255)
	private String direccion ;
	
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
