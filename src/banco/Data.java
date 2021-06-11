package banco;

public class Data {
	private byte dia;
	private byte mes;
	private int ano;
	
	Data (byte dia, byte mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String formataData() {
		return dia+"/"+mes+"/"+ano;
	}
}
