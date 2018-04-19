
public class ProgramaPrincipal {

	public static void main(String[] args) {
		int i;
		Disciplina d1;
		d1 = new Disciplina();
		Disciplina d2 = new Disciplina();
		
		d1.setCodigo("DET1020");
		d1.setNome("Estrutura de Dados");
		d1.setCH(80);
		
		System.out.println(d1.getCodigo().toString());

		/*
		System.out.println(d1.getCodigo());
		System.out.println(d1.getNome());
		System.out.println(d1.getCH());
		*/
	}

}
