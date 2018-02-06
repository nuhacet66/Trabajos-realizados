package modelo;

import java.time.LocalDate;

public abstract class Persona {

	private String nif;
	private String nombre;
	private char sexo; // 'M' 'F'
	private LocalDate fecha;
	// private Integer altura;
	private int altura;
	private Persona padre;
	private Persona madre;
	
	private static int contador = 0;
	//private  int contador = 0;
	// tipos posibles
	// primitivos: int, boolean, float, double..
	// clases: Date, Random,....

	public Persona() { // constructor sin parámetros
		
		this.nif = "44882229Y";
		this.nombre="Anonimo";
		this.sexo = 'F';
		this.fecha = LocalDate.now();
		this.altura = 180;
		this.madre = null;
		this.padre = null;
		contador++;
	}

	public  Persona(String nif,String nombre, char sexo, LocalDate fecha, int altura, Persona padre, Persona madre) {

		this.nif = nif;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fecha = fecha;
		this.altura = altura;
		this.padre = padre;
		this.madre = madre;
		contador++;
	}
@Override	

	public String toString() {
	
		return "persona numero : " + contador + ",  nif : " + this.nif  + ", nombre : " + this.nombre  + ", sexo : " + this.sexo 
				+ ",fecha : " + this.fecha  + ", altura : " + this.altura ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void soyEstatico() {

	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona padre) {
		this.padre = padre;
	}

	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	

}
