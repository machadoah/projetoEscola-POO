// CONTRATO AUTENTICAVEL
	// QUEM ASSINA ESSE CONTRATO, PRECISA IMPLEMENTAR:
		// METODO SETLOGIN
		// METODO SETSENHA

public abstract interface Autenticavel {
	
	// METODOS ABSTRATOS
	public abstract void setSenha(String senha);
	public abstract void setLogin(int login);
	
	public abstract boolean autentica(int login, String senha);
}
