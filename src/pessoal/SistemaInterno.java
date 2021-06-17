package pessoal;

public class SistemaInterno {
	public void login(Autenticavel a, int senha) {
		if(a.autentica(senha))
			System.out.println("Usuario autenticado!");
		else 
			System.out.println("Senha inexiste!");
	}
}