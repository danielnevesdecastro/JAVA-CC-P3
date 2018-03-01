import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome, outronome1 = "", outronome2 = "", sexo;
		double peso, altura, somaMedia = 0.00, menor = 3.00;
		int idade, qtdPacientes = 0, qtdMulheres = 0, qtdHomens = 0, qtdPacIdade = 0, maior = 0;
		
		System.out.print("Digite o nome do paciente: ");
		nome = input.nextLine();
		
		do{
			
			System.out.print("Informe o sexo [m/f]: ");
			sexo = input.nextLine();
			System.out.print("Digite o peso em kg: ");
			peso = input.nextDouble();
			System.out.print("Digite a idade: ");
			idade = input.nextInt();
			System.out.print("Digite a altura em metros: ");
			altura = input.nextDouble();
			input.nextLine();
			
			qtdPacientes++;
			
			if(sexo.equalsIgnoreCase("m")){
				somaMedia += idade;
				qtdHomens++;
			}
			
			if(sexo.equalsIgnoreCase("f")){
				if(altura >= 1.60 && altura <= 1.70 && peso > 70.00){
					qtdMulheres++;
				}
				if(altura < menor){
					menor = altura;
					outronome2 = nome;
				}
			}
			
			if(idade >= 18 && idade <= 25){
				qtdPacIdade++;
			}
			
			if(idade > maior){
				maior = idade;
				outronome1 = nome;
			}
			
			System.out.print("Digite o nome do paciente: ");
			nome = input.nextLine();
			
		}while(! nome.equalsIgnoreCase("fim"));
		
		System.out.println("Quantidade de pacientes: " + qtdPacientes);
		System.out.printf("Média de idade dos homens: %.2f\n", somaMedia / qtdHomens);
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + qtdMulheres);
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + qtdPacIdade);
		System.out.printf("Nome do paciente mais velho: %s; Idade: %d\n", outronome1, maior);
		System.out.printf("Nome da mulher mais baixa: %s; Altura: %.2f\n", outronome2, menor);
		
		input.close();
		
	}
	
}
