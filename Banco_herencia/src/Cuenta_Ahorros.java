
public class Cuenta_Ahorros extends Cuenta {

	public Cuenta_Ahorros(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public void deposito(double valor) {
		this.saldo += valor;
	}
}
