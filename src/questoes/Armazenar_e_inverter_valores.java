package questoes;

public class Armazenar_e_inverter_valores {

	public static void main(String[] args) {
		
		int a, b , temp;
		a = 10;
		b = 20;
		
		temp = a;
		a = b;
		b = temp; 
		
		System.out.println("O valor de a é: " + a);
		System.out.println("O valor de b é: " + b);

	}

}
