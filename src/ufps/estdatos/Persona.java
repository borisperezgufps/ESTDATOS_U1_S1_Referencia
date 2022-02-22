package ufps.estdatos;

public class Persona {

	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = false;
		
		Persona pTemporal = (Persona) obj;
		
		if(pTemporal.getNombre().equals(this.getNombre()) && 
				pTemporal.getEdad()==this.getEdad()) {
			sonIguales = true;
		}
			
		return sonIguales;
	}
	
}
