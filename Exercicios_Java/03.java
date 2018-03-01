import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, n;
		
		System.out.println("Qual tabuada você quer ver?");
		n = input.nextInt();
		
		for(i = 0; i <= 10; i++){
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
		
		input.close();
		
	}
	
}
