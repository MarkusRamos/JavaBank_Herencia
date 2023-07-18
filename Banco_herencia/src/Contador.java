
public class Contador extends Funcionario{
	
	@Override
	public double getBono() {
		System.out.println("Llamando metodo del Contador");
		return 200;
		
	}
}
