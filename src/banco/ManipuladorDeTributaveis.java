package banco;

public class ManipuladorDeTributaveis {
	private static double impostos;
	public static double calculaImpostos(Tributavel t) {
		impostos += t.getValorImposto();
		return impostos;
	}
}
