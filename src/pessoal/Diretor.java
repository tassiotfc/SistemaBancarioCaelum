package pessoal;

public class Diretor extends Funcionario implements Autenticavel{
	private int senha;
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.25; 
	}
	
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
}
