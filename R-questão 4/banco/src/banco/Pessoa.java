package banco;

public class Pessoa {
	protected String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return "\n" + nome;
	}
}
