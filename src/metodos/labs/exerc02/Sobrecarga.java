package metodos.labs.exerc02;

// Calcule a área dos tres quadriláteros notáveis (Quadrado. Retangulo, Trapézio)

public class Sobrecarga {
	
	public static void main(String[] args) {
		
		//Quadrilátero
		
		System.out.println("Exercício quadrilátero");
		Quadrilatero.area(3); // quadrado
		Quadrilatero.area(5d, 5d); // retangulo
		Quadrilatero.area(7, 8, 9); // trapézio
		Quadrilatero.area(5f, 5f); // losango
	}
	
}
