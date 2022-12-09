package banco;

public class PessoaJuridica extends Pessoa {

	private String cnpj, razaoSocial;
	private String tipo = "Pessoa tipo juridica";

	public PessoaJuridica(String nome, String cnpj, String razaoSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String toString() {
		return "\n" + tipo + "\nNome: " + this.getNome() + "\nSobrenome: " + this.getCnpj() + "\nCpf: "
				+ this.getRazaoSocial();
	}
}