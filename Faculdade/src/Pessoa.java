
public abstract class Pessoa {
	
	String nome, endereco, DataNascimento;
	
	//Construtor
	
	public Pessoa(String nome, String DataNascimento) {
		this.nome = nome;
		this.DataNascimento = DataNascimento;
	}
	
	//Métodos
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

}
