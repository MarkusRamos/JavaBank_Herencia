
public class Test_Cuenta {

	public static void main(String[] args) {
		Cuenta_corriente cc = new Cuenta_corriente(1,1);
		Cuenta_Ahorros ca = new Cuenta_Ahorros(2,3);
		cc.deposito(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}

}
