import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 0, dias;
		String nome;
		double conta, s = 0.00;
		
		while(i < 4){
			System.out.println("Digite o nome do cliente " + (i + 1));
			nome = input.nextLine();
			
			System.out.print("Digite a quantidade de dias: ");
			dias = input.nextInt();
			input.nextLine();
			
			if(dias < 10){
				conta = 55.00 * dias;
			} else {
				conta = 48.00 * dias;
			}
			
			s += conta;
			
			System.out.println("Nome: " + nome);
			System.out.printf("Valor da conta: %.2f\n\n", conta);
			i++;
		}
		
		System.out.printf("Total arrecadado pela pousada: %.2f\n", s);
		
		input.close();
		
	}
	
}
