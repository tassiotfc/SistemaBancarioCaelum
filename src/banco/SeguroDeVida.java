package banco;

import pessoal.Cliente;

public class SeguroDeVida implements Tributavel{
	
	private double valor;
	private Cliente cliente;
	private int numeroApolice;
	
	SeguroDeVida(double valor, Cliente cliente, int numApolice){
		this.valor = valor;
		this.cliente = cliente;
		this.numeroApolice = numApolice;
	}
	
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 42 + this.valor*0.02;
	}

	@Override
	public String toString() {
		return "SeguroDeVida [valor=" + valor + ", cliente=" + cliente + ", numeroApolice=" + numeroApolice + "]";
	}
}
