package pessoal;

public class DemoPessoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		
		gerente.setNome("Joao da Silva");
		gerente.setSenha(1356);
		gerente.setCpf("15632689632");
		gerente.autentica(1356);
		gerente.setSalario(1000);
		
		Presidente presidente = new Presidente();
		presidente.setNome("Augusto");
		presidente.setSalario(1000);
		
		SecretariaAdministrativa administrativa = new SecretariaAdministrativa();
		administrativa.setNome("Valeria");
		administrativa.setComissao(1500.f);
		administrativa.setSalario(1500);
				
		ControleDeBonificacoes bonificacoes = new ControleDeBonificacoes();
		bonificacoes.registra(gerente);
		bonificacoes.registra(administrativa);
		bonificacoes.registra(presidente);
		System.out.println(bonificacoes.getTotalDeBonificacoes());
	}
}