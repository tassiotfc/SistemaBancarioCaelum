package banco;

import pessoal.Cliente;

public class ContaCorrente extends Conta implements Tributavel{
	
	ContaCorrente(Cliente cliente, int numero, String agencia, double saldo, Data dataAbertura){
		super(cliente, numero, agencia, saldo, dataAbertura);
	}
			
	public void transferir(double valor, ContaCorrente cc) {
		if (valor > super.getSaldo()) {
			System.out.println("Valor acima do saldo!");
		}
		else {
			double novoSaldo = super.getSaldo() - valor;
			super.setSaldo(novoSaldo);
			novoSaldo = cc.getSaldo() + valor;
			cc.setSaldo(novoSaldo);
		}
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo()*0.01;
	}
}