package unipe.br;

public class Principal {

	
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		ManipulaVetores manipulaVetores = new ManipulaVetores();
		int opcao = 0;
		int[] vetor = null;
	
		while (true){
			menu.menu();
			opcao = manipulaVetores.obterValor();
			
			switch (opcao){
			case 1:
					manipulaVetores.inicializarVetor();
				break;
					
			case 2:
				menu.menuimpressao();
				int tipo = manipulaVetores.obterValor();
				manipulaVetores.imprimirVetor(vetor, tipo);
				break;
			case 9:
				System.exit(0);
				default:
					break;
				
			}
		}
	}
}
