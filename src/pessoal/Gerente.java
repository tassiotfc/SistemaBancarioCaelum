package pessoal;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		}
		else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	
	@Override
	public String getString() {
		String str = super.getString();
		str = str + 
				"Numero de Funcionarios Gerenciados: "+numeroDeFuncionariosGerenciados+"\n";
		return str;
	}
}
