import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
	public static void main(String[] args) {
		try {
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parametro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parametro");
			int parametroDois = terminal.nextInt();

			try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
			} catch (ParametrosInvalidosException exception) {
				// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println("O segundo parametro deve ser maior que o primeiro");
			}
		} catch (InputMismatchException e) {
			System.out.println("Os parametros precisam ser numeros inteiros");
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero: " + i);
		}
	}
}