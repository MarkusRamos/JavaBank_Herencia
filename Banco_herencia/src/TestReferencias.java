
public class TestReferencias {

	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setNombre("marcos");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Luis");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
	
}
