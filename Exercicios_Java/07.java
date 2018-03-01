import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n1, n2, medA, medC, medS = 0.00;
		int i;
		int sA = 0;
		int sE = 0;
		int sR = 0;
		
		for(i = 1; i <= 6; i++){
			System.out.println("Informe as duas notas do aluno " + i);
			n1 = input.nextDouble();
			n2 = input.nextDouble();
			medA = (n1 + n2) / 2;
			medS += medA;
			System.out.printf("Média: %.2f\n", medA);
			if(medA > 7.0){
				System.out.println("Média acima de 7: APROVADO!");
				sA++;
			} else if(medA >= 3.0 && medA <= 7.0){
				System.out.println("Média entre 3 e 7: EXAME FINAL!");
				sE++;
			} else {
				System.out.println("Média abaixo de 3: REPROVADO!");
				sR++;
			}
		}
		
		medC = medS / 6;
		
		System.out.println("Total de alunos aprovados: " + sA);
		System.out.println("Total de alunos na final: " + sE);
		System.out.println("Total de alunos reprovados: " + sR);
		System.out.printf("Média da classe: %.2f\n", medC);
		
		input.close();
		
	}
	
}
