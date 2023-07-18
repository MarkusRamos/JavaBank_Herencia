
public class Sys_Interno {

	private String  clave = "12345";
	public boolean verifica (Autenticable gerente) {
		boolean canlogin = gerente.login(clave);
		if(canlogin) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error en el login");
		return false;}
	}
}
