package ufps.estdatos;

public class Cliente5 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setAnioNacimiento(1981);
		p1.setNombre("Boris Perez");
		
		System.out.println("Momento 1: "+p1.getEdad());
		
		Gestion g = new Gestion();
		g.calcularEdad(p1);
		
		System.out.println("Momento 2: "+p1.getEdad());
		
		
	}
	
}
