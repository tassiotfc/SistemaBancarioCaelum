package pessoal;

public class SecretariaAdministrativa extends Secretaria{

	public double getBonificacao() {
		return this.getSalario() * 0.1 + super.getComissao();
	}
}