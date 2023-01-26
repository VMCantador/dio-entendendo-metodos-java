package metodos.labs.exerc03;

public class Retorno {

	public static void main(String[] args) {
		
		// Retornos:
		System.out.println("Exercio de retornos: ");
		
		double areaQuadrado = RetornoQuadrilateros.area(3);
		System.out.println("A área do quadrado é: " + areaQuadrado);
		
		double areaRetangulo = RetornoQuadrilateros.area(5d, 4d);
		System.out.println("A área do retangulo é: " + areaRetangulo);
		
		double areaTrapezio = RetornoQuadrilateros.area(7, 8, 9);
		System.out.println("A área do trapézio é: " + areaTrapezio);
		
		double areaLosango = RetornoQuadrilateros.area(5, 5);
		System.out.println("A área do losango é: " + areaLosango);
		
	}

}
