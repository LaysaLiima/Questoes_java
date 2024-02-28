package questoes;

import java.util.Scanner;

public class Maior_ou_menor_que_dez {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite um número: ");
		
		valor = teclado.nextInt();
		
		if(valor > 10) {
			System.out.println("É MAIOR QUE 10!");
		}else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		
	}

}
