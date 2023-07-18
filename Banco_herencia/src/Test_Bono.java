
public class Test_Bono {
public static void main(String[] args) {
	Funcionario diego = new Contador();
	diego.setSalario(2000);
	
	Gerente marcos = new Gerente();
	marcos.setSalario(10000);
	
	Contador alexis = new Contador();
	alexis.setSalario(5000);
	
	Control_Bono control = new Control_Bono();
	
	control.reg_sal(diego);
	control.reg_sal(marcos);
	control.reg_sal(alexis);
}
}
