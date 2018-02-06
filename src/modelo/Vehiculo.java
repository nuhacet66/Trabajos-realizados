package modelo;

import java.time.LocalDate;

public class Vehiculo {
	private int ID;
	private String matricula;
	private String marcaModelo;
	private LocalDate fechaMatricula;
	private float precio;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarcaModelo() {
		return marcaModelo;
	}
	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}
	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setID(String string) {
		// TODO Auto-generated method stub
		
	}
	public void add(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}


}
