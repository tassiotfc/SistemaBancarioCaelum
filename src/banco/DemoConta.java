package banco;

import pessoal.Cliente;

public class DemoConta {

	public static void main(String[] args) {
		Data d1 = new Data((byte)15, (byte)03, 2010);
		Data d2 = new Data((byte)23, (byte)06, 2015);
		
		Cliente cliente1 = new Cliente("Tassio", 1);
		Cliente cliente2 = new Cliente("Josue", 2);
		
		Conta c1 = new ContaPoupanca(cliente1, 213063, "1165-7", 1700, d1);
		Tributavel c2 = new ContaCorrente(cliente2, 278777, "1165-7", 1700, d2);
		System.out.println(c1);
		System.out.println(c2);
		
		SeguroDeVida seguroDeVida1 = new SeguroDeVida(1000, cliente1, 0123);
		SeguroDeVida seguroDeVida2 = new SeguroDeVida(2000, cliente2, 1235);
		System.out.println(seguroDeVida1);
		System.out.println(seguroDeVida2);
		
		System.out.println(ManipuladorDeTributaveis.calculaImpostos(seguroDeVida1));
		System.out.println(ManipuladorDeTributaveis.calculaImpostos(seguroDeVida2));
		System.out.println(ManipuladorDeTributaveis.calculaImpostos(c2));
	}
}