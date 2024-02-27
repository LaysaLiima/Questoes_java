package questoes;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int b, h, area;
		
		System.out.print("Digite o valor da base do retângulo: ");
		b = input.nextInt();
		System.out.print("Digite o valor da altura do retângulo: ");
		h = input.nextInt();
		
		area = b * h;
		
		System.out.println("O resultado da área do retângulo é: " + area);
		
	}

}
