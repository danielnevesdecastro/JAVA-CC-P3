import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double sal, novoSal;
		String nome;
		
		System.out.print("Digite o nome do funcion�rio: ");
		nome = input.nextLine();
		
		do{
			
			System.out.print("Digite o sal�rio do funcion�rio: R$ ");
			sal = input.nextDouble();
			
			if(sal < 500.00){
				novoSal = sal + sal * 0.2;
				System.out.printf("O novo sal�rio � de %.2f\n", novoSal);
			} else {
				System.out.println("Voc� n�o tem direito ao aumento!");
			}
			
			System.out.print("Digite o nome do funcion�rio: ");
			input.nextLine();
			nome = input.nextLine();
			
		}while(! nome.equalsIgnoreCase("fim"));
		
		input.close();
		
	}
	
}
