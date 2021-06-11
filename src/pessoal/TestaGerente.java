package pessoal;

public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		
		gerente.setNome("Joao da Silva");
		
		gerente.setSenha(1356);
		
		gerente.setCpf("15632689632");
		
		gerente.autentica(1356);
		
		gerente.setSalario(5000);
		
		System.out.println(gerente.getBonificacao());
		System.out.println(gerente.getString());
		
		Funcionario funcionario = gerente;
		System.out.println(funcionario.getBonificacao());
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000);
		
		ControleDeBonificacoes bonificacoes = new ControleDeBonificacoes();
		bonificacoes.registra(funcionario2);
		bonificacoes.registra(gerente);
		System.out.println(bonificacoes.getTotalDeBonificacoes());
	}
}