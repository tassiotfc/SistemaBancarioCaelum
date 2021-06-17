package pessoal;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	Funcionario(){
		
	}

	public String getString() {
		String str = "Nome: "+this.nome+"\n"+
				"CPF: "+this.cpf+"\n"+
				"Salario: "+this.salario+"\n";
		return str;
	}

	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}