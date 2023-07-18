
public class Control_Bono {

	private double suma;
	public double reg_sal(Funcionario funcionario) {
		this.suma = funcionario.getBono() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
}
