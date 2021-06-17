package banco;

import pessoal.Cliente;

public class ContaPoupanca extends Conta{
		
	ContaPoupanca(Cliente cliente, int numero, String agencia, double saldo, Data dataAbertura){
		super(cliente, numero, agencia, saldo, dataAbertura);
	}
			
	public double rendimento() {
		return super.getSaldo()*0.1;
	}
	
	@Override
	public String toString() {
		String resultado = super.toString() + 
				"Rendimento: "+rendimento()+"\n";
		return resultado;
	}
}