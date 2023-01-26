package metodos.labs.exerc01;

public class Execucao {

	public static void main(String[] args) {
		
		// Calculadora
		System.out.println("|Exercicio do metodo calculadora");
		Calculadora.soma(4, 6);
		Calculadora.subtracao(10, 2.5);
		Calculadora.multiplicacao(2, 5);
		Calculadora.divisao(10, 5);
		
		// Mensagem
		System.out.println("|Exercicio do metodo mensagem");
		Mensagem.obterMensagem(8);
		Mensagem.obterMensagem(18);
		Mensagem.obterMensagem(2);
		
		
		// Emprestimo
		System.out.println("|Exercicio do metodo emprestimo");
		Emprestimo.calcular(1000.00, 2);
		Emprestimo.calcular(1000.00, 3);
		Emprestimo.calcular(1000.00, 5);
	}

}
