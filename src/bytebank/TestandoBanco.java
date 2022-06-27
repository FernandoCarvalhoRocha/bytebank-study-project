package bytebank;

public class TestandoBanco {

	public static void main(String[] args) {

		// Populando o Banco

		Conta contaDoPaulo = new ContaPoupanca(1722, 2000);
		Cliente paulo = new Cliente();

		contaDoPaulo.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
		paulo.setProficao("Programador");
		contaDoPaulo.deposita(200);

		Conta contaDaAmanda = new ContaCorrente(1722, 1000);
		Cliente amanda = new Cliente();
		contaDaAmanda.setTitular(amanda);
		amanda.setNome("Amanda Palhano");
		amanda.setCpf("111.111.111-22");
		amanda.setProficao("Professora");
		contaDaAmanda.deposita(500);

		Conta contaDaRita = new ContaCorrente(1229, 123456789);
		Cliente rita = new Cliente();
		rita.setNome("Rita Serpa");
		rita.setCpf("666.666.666-22");
		rita.setProficao("Dona de Casa");
		contaDaRita.deposita(50);

		Funcionario funcionario = new Gerente();
		funcionario.setNome("Fernando Rocha");
		funcionario.setCpf("000.000.999-87");
		funcionario.setSalario(10000);
		
		System.out.println("Salario de " + funcionario.getNome() + " é de: R$ " + funcionario.getSalario());
		System.out.println("sua bonificação foi de: " + funcionario.getBonificacao());
		System.out.println(" Saldo da Rita: " + contaDaRita.getSaldo());
		contaDaRita.saca(100);

	}

}
