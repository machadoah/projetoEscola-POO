
public abstract class Funcionario extends Pessoa {

	public Funcionario(String nome, String DataNascimento) {
		super(nome, DataNascimento);
	}
	
	// ATRIBUTOS
	double salario;
	
	
	// MÉTODOS
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

}
