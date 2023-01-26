package metodos.labs.exerc02;

//Calcule a área dos tres quadriláteros notáveis (Quadrado. Retangulo, Trapézio)

public class Quadrilatero {

	public static void area(double lado) {
		System.out.println("A área do quadrado é: " + (lado * lado));
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("A área do retangulo é: " + (lado1 * lado2));
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("A área do trapézio é: " + (((baseMaior + baseMenor) * altura)/2));
	}
	
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("A área do losango é: " + ((diagonal1 * diagonal2)/2));
	}
}
