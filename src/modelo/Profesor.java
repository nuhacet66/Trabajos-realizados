package modelo;

import java.time.LocalDate;

public class Profesor extends Persona {
	private int codDepto;
	private LocalDate fechaIngreso;

	public Profesor() {
		super();
		this.setCodDepto(123);
		this.setFechaIngreso(LocalDate.now());
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nif, String nombre, char sexo, LocalDate fecha, int altura, Persona padre, Persona madre) {
		super(nif, nombre, sexo, fecha, altura, padre, madre);
		// TODO Auto-generated constructor stub
	}

	public int getCodDepto() {
		return codDepto;
	}

	public void setCodDepto(int codDepto) {
		this.codDepto = codDepto;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String toString() {

		return super.toString() + " , depto : " + this.codDepto + ",fecha ingreso: " + this.fechaIngreso;
	}
}
