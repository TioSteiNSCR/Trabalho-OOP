package banco;

public class PessoaFisica extends Pessoa {

	protected String cpf, sobrenome;
	protected String tipo = "Pessoa tipo Fisica";

	public PessoaFisica(String nome, String sobrenome, String cpf) {
		super(nome);
		this.cpf = cpf;
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "\n" + tipo + "\nNome: " + this.getNome() + "\nSobrenome: " + this.getSobrenome() + "\nCpf: "
				+ this.getCpf();
	}

}
