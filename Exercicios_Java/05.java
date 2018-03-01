import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double litros, totl, total;
		
		System.out.println("Digite a quantidade de litros: ");
		litros = input.nextFloat();
		
		totl = litros * 2.50;
		
		total = totl + 6.00;
		
		System.out.printf("\n");
		System.out.printf("Conta\n");
		System.out.printf("Gasolina: R$ %.2f\n", totl);
		System.out.println("Refrigerantes: R$ 6,00");
		System.out.printf("Total a pagar: R$ %.2f\n", total);
		
		input.close();
		
	}
	
}
