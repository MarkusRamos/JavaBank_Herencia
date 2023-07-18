
public class Gerente extends Funcionario implements Autenticable{
	
	private String clave;
	
	@Override
	public double getBono() {
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public boolean login(String clave) {
		if(this.clave == clave) {
			return true;
		} else {
		return false;
	}
}
}
