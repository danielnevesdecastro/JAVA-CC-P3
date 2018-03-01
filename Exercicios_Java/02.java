import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, n;
		
		for(i = 1; i <= 10; i++){
			System.out.print("Digite o número: ");
			n = input.nextInt();
			if(n % 2 == 0){
				System.out.println("É um número PAR!");
			} else {
				System.out.println("É um número ÍMPAR!");
			}
		}
		
		input.close();
		
	}
	
}
