package banco;

public class DemoConta {

	public static void main(String[] args) {
		Data d1 = new Data((byte)15, (byte)03, 2010);
		Data d2 = new Data((byte)23, (byte)06, 2015);
		
		Conta c1 = new Conta("Tassio", 213063, "1165-7", 1700, d1);
		Conta c2 = new Conta("Mateus", 278777, "1165-7", 13550, d2);
		
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c2.recuperaDadosParaImpressao());
	}
}
