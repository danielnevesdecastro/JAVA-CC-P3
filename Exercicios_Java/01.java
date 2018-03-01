import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float sal, percentual, aumento, novoSal;
		
		System.out.print("Digite o salário do funcionário: R$ ");
		sal = input.nextFloat();
		
		System.out.print("Digite o percentual de aumento (0,00): ");
		percentual = input.nextFloat();
		
		aumento = sal * percentual;
		
		novoSal = sal + aumento;
		
		System.out.println("O aumento é de R$ " + aumento);
		
		System.out.println("O novo salário é de R$ " + novoSal);
		
		input.close();
		
	}
	
}
