
public class Persona {
	private String nombre;
	private float nivel;
	private byte dia;
	private byte mes;
	private short año;
	public Persona () {
		
	}
	/**
	 * @param nombre
	 * @param nivel
	 * @param dia
	 * @param mes
	 * @param año
	 */
	public Persona(String nombre, float nivel, byte dia, byte mes, short año) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getNivel() {
		return nivel;
	}
	public void setNivel(float nivel) {
		this.nivel = nivel;
	}
	public byte getDia() {
		return dia;
	}
	public void setDia(byte dia) {
		this.dia = dia;
	}
	public byte getMes() {
		return mes;
	}
	public void setMes(byte mes) {
		this.mes = mes;
	}
	public short getAño() {
		return año;
	}
	public void setAño(short año) {
		this.año = año;
	}
	
	
	
	
}
