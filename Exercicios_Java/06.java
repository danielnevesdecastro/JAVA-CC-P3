import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double salario, prestacao;
		
		System.out.println("Informe o salário bruto: R$ ");
		salario = input.nextDouble();
		
		System.out.println("Informe o valor da prestação: R$ ");
		prestacao = input.nextDouble();
		
		if(prestacao > salario * 0.3){
			System.out.printf("30%% do salário: R$ %.2f\n", salario * 0.3);
			System.out.println("Você não tem direito ao empréstimo!");
		} else {
			System.out.printf("30%% do salário: R$ %.2f\n", salario * 0.3);
			System.out.println("Empréstimo concedido!");
		}
		
		input.close();
		
	}
	
}
