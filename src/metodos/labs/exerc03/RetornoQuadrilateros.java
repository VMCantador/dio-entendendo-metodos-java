package metodos.labs.exerc03;

public class RetornoQuadrilateros {
	
	// quadrado
	public static double area(double lado) {
		return (lado * lado);
	}
	
	// retangulo
	public static double area(double lado1, double lado2) {
		return (lado1 * lado2);
	}
	
	// trapézio
	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	
	// losango
	public static float area(float diagonal1, float diagonal2) {
		return ((diagonal1 * diagonal2)/2);
	}
}
