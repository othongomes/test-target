package test_target;

import java.util.Scanner;

public class ex2 {

	public boolean verificFibonacci(int numero) {

		int a = 0;
		int b = 1;
		int soma = 0;

		if (numero == a || numero == b) {
			return true;
		}

		while (soma < numero) {
			soma = a + b;
			a = b;
			b = soma;
		}
		
		if (soma == numero) {
            return true;
        }
		
		 return false;

	}

}
