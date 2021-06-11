package pessoal;

public class Presidente extends Funcionario{
	
	public double getBonificacao() {
		return this.getSalario() * 0.30;
	}
}
