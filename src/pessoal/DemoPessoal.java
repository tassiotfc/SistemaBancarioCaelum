package pessoal;

public class DemoPessoal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente("Joao da Silva", "15632689632", 1000, 1356, TipoDepartamento.GERENCIA);
				
		Presidente presidente = new Presidente("Augusto", "32656329400", 2000);
				
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