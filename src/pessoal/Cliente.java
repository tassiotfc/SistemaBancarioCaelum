package pessoal;

public class Cliente implements Autenticavel{
	
	private String nome;
	private int senha;
		
	public Cliente(String nome, int senha) {
		this.nome = nome;
		this.senha = senha;
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

	@Override
	public String toString() {
		return "Nome:" + nome + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
}
