package banco;

public class Conta {
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;
	
	Conta(String titular, int numero, String agencia, double saldo, Data dataAbertura){
		this.titular = titular;
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
	
	public double rendimento() {
		return saldo*0.1;
	}
	
	public String recuperaDadosParaImpressao() {
		String resultado = "Titular: "+this.titular + "\n" +
				"Numero: "+this.numero + "\n" +
				"Agencia: "+this.agencia + "\n" +
				"Saldo: "+this.saldo + "\n" +
				"Data de Abetura: "+this.dataAbertura.formataData() + "\n";
		return resultado;
	}
}