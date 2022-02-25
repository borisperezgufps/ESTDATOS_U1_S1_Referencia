package ufps.estdatos;

public class Gestion {

	public void calcularEdad(Persona p) {
		
		int edad = 2022 - p.getAnioNacimiento();
		p.setEdad(edad);
		
	}
	
}
