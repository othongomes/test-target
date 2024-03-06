package test_target;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		/*Exercício 3*/
		Scanner scannerUm = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scannerUm.nextLine();
        String invertido = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertido = invertido + palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertido);

        scannerUm.close();
	}

}
