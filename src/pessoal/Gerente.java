package pessoal;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	private TipoDepartamento tipoDepto;
	
	public Gerente(String nome, String cpf, double salario, int senha, TipoDepartamento tipoDepto) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.tipoDepto = tipoDepto;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha && this.tipoDepto == TipoDepartamento.GERENCIA) {
			System.out.println("Acesso permitido!");
			return true;
		}
		else {
			System.out.println("Acesso negado!");
			return false;
		}
	}

	//implementacao de metodo abstrato
	public double getBonificacao() {
		return this.getSalario() * 0.15;
	}
	
	@Override
	public String getString() {
		String str = super.getString();
		str = str + 
				"Numero de Funcionarios Gerenciados: "+numeroDeFuncionariosGerenciados+"\n" +
				"Departamento: "+tipoDepto+"\n";
		return str;
	}
}
