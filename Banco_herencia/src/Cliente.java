

public class Cliente implements Autenticable{
	private String Nombre;
	private String documento;
	private String telefono;
	private Utility tool;
	
	public Cliente() {
		this.tool = new Utility();
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
