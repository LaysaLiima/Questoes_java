package questoes;

import java.util.Scanner;

public class Implementar_valores_entre_um_e_n {

	public static void main(String[] args) {
	 Scanner scan = new Scanner (System.in);
	 
	 int n;
	 System.out.print("Digite um número: ");
	 n = scan.nextInt();
	 
	 for(int i = 1; i <= n; i++) {
		 System.out.println(i);
	 }
	}

}
