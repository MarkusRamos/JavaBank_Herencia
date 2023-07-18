
public class TestInterno {

	public static void main(String[] args) {
		Sys_Interno sistema = new Sys_Interno();
		Gerente gerente1 = new Gerente();
		Admin admin = new Admin();
		
		gerente1.setClave("12345");
		admin.setClave("12345");
		sistema.verifica(gerente1);
		sistema.verifica(admin);
	}
}

