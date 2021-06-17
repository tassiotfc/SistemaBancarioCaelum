package banco;

import pessoal.Cliente;

public abstract class Conta {
	
	private Cliente cliente;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;
	
	Conta(Cliente cliente, int numero, String agencia, double saldo, Data dataAbertura){
		this.cliente = cliente;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	public void saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Nao posso sacar um valor maior que o saldo!");
		}
		else {
			saldo -= valor;	
		}
	}
	
	public void deposita(double valor) {
		saldo += valor;
	}
	
	@Override
	public String toString() {
		String resultado = cliente.toString();
		resultado += "Numero: "+this.numero + "\n" +
				"Agencia: "+this.agencia + "\n" +
				"Saldo: "+this.saldo + "\n" +
				"Data de Abetura: "+this.dataAbertura.formataData() + "\n";
		return resultado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
}