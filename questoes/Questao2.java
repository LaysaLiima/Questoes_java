package questoes;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int a, antecessor;
		
		System.out.print("Digite um nímero: ");
		a = teclado.nextInt();
		
		antecessor = a - 1;
		
		System.out.println("O antecessor de a é " + antecessor);

	}

}
