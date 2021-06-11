package pessoal;

public abstract class Secretaria extends Funcionario{
	private float comissao;

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public String getString() {
		String str = super.getString();
		str = str + 
				"Comissao: "+comissao+"\n";
		return str;
	}
}
