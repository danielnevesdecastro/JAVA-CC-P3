package beer;

import java.util.Scanner;

public class Bar {
	
	

	public static void main(String[] args) {
		
		int cervejas = 99;
		int opcao  = 0;
		int qntd = 0;
		Scanner leitor = new Scanner(System.in);
		
		while ( cervejas > 0 ) {
			
			System.out.println(cervejas +"Cervejas no freezer");
			System.out.println("Pego uma garrafa e passo pra frente !");
			cervejas = cervejas -1;
			System.out.println("Agora sao " + cervejas + " no Freezer");
		
			if(cervejas == 0 ) {
				System.out.println("FINISH HIM !!! Quer beber mais ?");
				System.out.println("Digite 1 para Sim ou 2 para Não !");
				opcao = leitor.nextInt();
			
				if(opcao == 1) {
					System.out.println("Nº de Cervejas ???");
					qntd = leitor.nextInt();
					
					cervejas = qntd;
					System.out.println("BOYAHHH !!!");
				}
					else {
						System.out.println("Ta acabando NOOB ..... !!!");
					}
			}
					
		}
	}
}
		
	
	

