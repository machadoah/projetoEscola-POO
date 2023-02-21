
public class AtributosUtil {

	// ATRIBUTO
	int matricula;
	String senha;
	int login;

	// INTERFACE
	// @Override
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public void setLogin(String login) {
		this.login = matricula;
		
	}

	// @Override
	public boolean autentica(int matricula, String senha) {
		if ((this.senha == senha) && (this.matricula == matricula)) {
			return true;
		} else {
			return false;
		}

	}

}
