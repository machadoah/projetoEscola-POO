
public class Professor extends Funcionario implements Autenticavel {

	// COMPOSIÇÃO
	private AtributosUtil util;

	// CONTRUTOR
	public Professor(String nome, String DataNascimento) {
		super(nome, DataNascimento);

		this.util = new AtributosUtil();

	}

	// MÉTODOS
	public void setMatricula(int matricula) {
		this.util.matricula = matricula;
		this.util.login = matricula;
	}

	// INTERFACE
	@Override
	public void setSenha(String senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int login, String senha) {
		return this.util.autentica(login, senha);
	}

	@Override
	public void setLogin(int login) {
		this.util.login = util.matricula;

	}

}
