package banco;

public class Conta {
	protected String numero;
	protected Pessoa cliente;
	protected double saldo;

	public Conta() {
		int n = (int) (Math.random() * 10000 + 1);
		String numConta = "c" + n;
		this.numero = numConta;
	}

	public Conta(PessoaFisica cliente) {
		this();
		this.cliente = cliente;
	}

	public Conta(PessoaJuridica cliente) {
		this();
		this.cliente = cliente;
	}

	public Conta(Pessoa cliente) {
		this();
		this.cliente = cliente;
	}

	public Conta(Pessoa cliente, double saldo) {
		this(cliente);
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public String toString() {
		return "\n" + cliente + "\n\nSaldo: " + this.saldo;
	}
}