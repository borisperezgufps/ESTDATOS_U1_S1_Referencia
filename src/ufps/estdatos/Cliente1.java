package ufps.estdatos;

public class Cliente1 {

	public static void main(String[] args) {
		
		// IMPRESIONES DE REFERENCIAS
		
		Persona p1 = new Persona();
		p1.setNombre("Boris Perez");
		p1.setEdad(32);
		
		System.out.println("Persona 1");
		System.out.println(p1.getNombre() + ": " + 
							p1.getEdad() + " a�os.\n");
		
		Persona p2 = new Persona();
		p2.setNombre("Rafael Raminez");
		p2.setEdad(45);
		
		System.out.println("Persona 2");
		System.out.println(p2.getNombre() + ": " + 
							p2.getEdad() + " a�os.\n");
		
		Persona p3 = p1;
//		Persona p3 = new Persona();
		p3.setNombre("Maribel Sepulveda");
		p3.setEdad(15);
		
		System.out.println("Persona 3");
		System.out.println(p3.getNombre() + ": " + 
							p3.getEdad() + " a�os.\n");
		
		System.out.println("Persona 1");
		System.out.println(p1.getNombre() + ": " + 
							p1.getEdad() + " a�os.\n");
		
	}
	
}

