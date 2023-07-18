
public class Admin extends Funcionario implements Autenticable {

	private Utility tool;

	public Admin() {
		this.tool = new Utility();
	}
	
	public double getBono() {
		
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.tool.setClave(clave);
		
	}

	@Override
	public boolean login(String clave) {
		return this.tool.login(clave);
	}
	
}

