import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, n;
		
		for(i = 1; i <= 10; i++){
			System.out.print("Digite o n�mero: ");
			n = input.nextInt();
			if(n % 2 == 0){
				System.out.println("� um n�mero PAR!");
			} else {
				System.out.println("� um n�mero �MPAR!");
			}
		}
		
		input.close();
		
	}
	
}
