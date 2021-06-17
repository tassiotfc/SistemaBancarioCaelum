package pessoal;

public abstract class Secretaria extends Funcionario{
	private float comissao;

	public Secretaria(String nome, String cpf, double salario, float comissao) {
		super(nome, cpf, salario);
		this.comissao = comissao;
	}
	
	public Secretaria() {
		
	}
	
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
