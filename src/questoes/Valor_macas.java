package questoes;

import java.util.Scanner;

public class Valor_macas{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int maca;
		double mult1;
		double mult2;
		
		System.out.print("Digite a quantidade de maçãs: ");
		maca = scan.nextInt();
		
		mult1 = maca * 1.30;
		mult2 = maca * 1.00;
		
		
		if(maca >= 12) {
			System.out.println("O total de maçãs compradas foram " + mult2);
		}else {
			System.out.println("O total de maçãs compradas foram " + mult1);
		}

	}

}
