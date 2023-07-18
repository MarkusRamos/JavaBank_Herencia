
public class TestGerente {
	
public static void  main(String [] args) {
	Gerente gerente = new Gerente();
	
	gerente.setSalario(6000);
	gerente.setClave("Minato205");
	gerente.setTipo(1);
	
	System.out.println(gerente.getBono());
	System.out.println(gerente.login("Minato205"));
}
}
