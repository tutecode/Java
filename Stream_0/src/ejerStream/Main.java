package ejerStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream st = new Stream();
		System.out.println(">>> Filtrar <<<");
		st.filtrar();
		System.out.println(">>> Transformar <<<");
		st.transformar();
		System.out.println(">>> Ordenar <<<");
		st.ordenar();
		System.out.println(">>> Limitar <<<");
		st.limitar();
		System.out.println(">>> Contar <<<");
		st.contar();
		
	}

}
