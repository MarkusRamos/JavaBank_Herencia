
public class Cuenta_corriente extends Cuenta {

	public Cuenta_corriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
	
	@Override
	public void deposito(double valor){
	    super.saldo += valor;
	}
	
}
