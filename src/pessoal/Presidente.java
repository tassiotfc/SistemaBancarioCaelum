package pessoal;

public class Presidente extends Funcionario{
	
	public Presidente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	//implementacao de metodo abstrato
	public double getBonificacao() {
		return this.getSalario() * 0.30;
	}
}
