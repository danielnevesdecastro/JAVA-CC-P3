import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double salario, prestacao;
		
		System.out.println("Informe o sal�rio bruto: R$ ");
		salario = input.nextDouble();
		
		System.out.println("Informe o valor da presta��o: R$ ");
		prestacao = input.nextDouble();
		
		if(prestacao > salario * 0.3){
			System.out.printf("30%% do sal�rio: R$ %.2f\n", salario * 0.3);
			System.out.println("Voc� n�o tem direito ao empr�stimo!");
		} else {
			System.out.printf("30%% do sal�rio: R$ %.2f\n", salario * 0.3);
			System.out.println("Empr�stimo concedido!");
		}
		
		input.close();
		
	}
	
}
