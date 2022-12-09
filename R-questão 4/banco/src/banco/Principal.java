package banco;

public class Principal {
	public static void main(String[] args) {

		PessoaFisica cliente1 = new PessoaFisica("Jeova", "nobre", "024.471.653-66");
		Conta c1 = new Conta(cliente1);
		c1.creditar(2000.0);
		c1.debitar(100);

		PessoaJuridica cliente2 = new PessoaJuridica("Samuel", "70.560.022/0001-91", "dar aula");
		ContaEspecial c2 = new ContaEspecial(cliente2, 200);
		c2.debitar(500);

		ContaPoupanca c3 = new ContaPoupanca(new PessoaFisica("Agamenon", "alves", "024.234.234-76"), 10000);
		c3.rendeJuros();

		System.out.println(c1);

		System.out.println(c2);

		System.out.println(c3);
	}
}
