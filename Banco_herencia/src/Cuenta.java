

public abstract class Cuenta {
	
	protected double saldo;
	int agencia = 1 ;
	int numero;
	Cliente titular = new Cliente();
	private static int total = 0;
	
	
	public Cuenta(int agencia, int numero) {
		
		if(agencia<=0) {
		System.out.println("Valores negativos no son validos");
		this.agencia = 1;
		}
		else {this.agencia = agencia;
			  this.numero = numero;}
		
		total ++;
		System.out.println("Se crea nueva cuenta " + this.numero);
		}
	
	

	public abstract void deposito(double monto);
	
	public boolean retirar(double valor) {
		if(this.saldo>= valor) {
			this.saldo -= valor;
			return true;}
		
		else {return false;}
		
}
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.retirar(valor);
			cuenta.deposito(valor);
			return true;}
		else {return false;}
		}
	
	public double getSaldo() {
		
		return this.saldo;
	}
	
	public void setSaldo(double valor){
		
		this.saldo += valor;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int gettotal() {
		
		return Cuenta.total;
	}
	}
