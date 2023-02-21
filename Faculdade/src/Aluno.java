
public class Aluno extends Pessoa implements Autenticavel {
	
	// COMPOSIÇÃO
	private AtributosUtil util;
	
	// CONTRUTOR
	public Aluno(String nome, String DataNascimento) {
		super(nome, DataNascimento);
		
		this.util = new AtributosUtil();
		
	}

	// MÉTODOS
	public void setRegistroAluno(int registroAluno) {
		this.util.matricula = registroAluno;
		this.util.login = registroAluno;
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
