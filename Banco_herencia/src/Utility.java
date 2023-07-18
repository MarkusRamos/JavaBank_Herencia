
public class Utility {

	private String clave;
	
	public boolean login(String clave) {
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
}
