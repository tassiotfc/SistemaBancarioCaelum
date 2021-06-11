package pessoal;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes;
	
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();	
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
