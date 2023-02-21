
public class Siga {

	// ATRIBUTOS
	private int login;
	private String senha;

	// MÉTODOS
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public void autentica(Autenticavel verifica) {
		boolean autenticou = verifica.autentica(this.login, this.senha);

		if (autenticou == true) {
			System.out.println("Você possui acesso ao siga.");
		} else {
			System.out.println("Você não possui acesso ao siga");
		}

	}
}
