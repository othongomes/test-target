package test_target;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		/* Exercício 1 */
		ex1 objetoEx1 = new ex1();
		int resultado = objetoEx1.exercUm();
		System.out.println("A soma é: " + resultado);
		/*fim*/

		/* Exercício 2 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
		int num = scanner.nextInt();

		ex2 objetoEx2 = new ex2();

		if (objetoEx2.verificFibonacci(num)) {
			System.out.println(num + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(num + " não pertence à sequência de Fibonacci.");
		}

		scanner.close();
		/*fim*/
		

	}

}
