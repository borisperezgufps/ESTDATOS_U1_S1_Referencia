package ufps.estdatos;

public class Cliente4 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setNombre("Boris Perez");
		p1.setEdad(32);
		
		System.out.println("Persona 1");
		System.out.println(p1.getNombre() + ": " + p1.getEdad() + " años.\n");
		
		Persona p2 = new Persona();
		p2.setNombre("Boris Perez");
		p2.setEdad(32);
		
		System.out.println("Persona 2");
		System.out.println(p2.getNombre() + ": " + p2.getEdad() + " años.\n");
		
		System.out.println("Comparación P1.equals(P2):");		
		System.out.println(p1.equals(p2));
		
	}
	
}

