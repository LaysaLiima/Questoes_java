package questoes;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int num;
		
		System.out.print("Digite um número: ");
		num = scan.nextInt();
		
		if(num >= 0 ) {
			System.out.println("É positivo");
			}else {
				System.out.println("É negativo");
			}
		
		
	}

}
