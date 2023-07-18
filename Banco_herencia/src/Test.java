
public class Test {
	
	public static void main(String[] args) {
		Funcionario markos = new Contador();
		
		markos.setNombre("Markos");
		markos.setDocumento("20505");
		markos.setSalario(15000);
		
		System.out.println(markos.getSalario());
	}

}
