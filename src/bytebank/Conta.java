package bytebank;

public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;

	public Conta(int agencia, int numero) {
		Conta.total++;

		if (agencia <= 0 || numero <= 0) {
			System.out.println("Não pode valores negativos ou iguais a 0");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente! Saldo Atual: " + this.saldo + " Valor Solicitado:" + valor );
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {

			this.saca(valor);
			destino.deposita(valor);
			System.out.println("Transferencia Completada com Sucesso!");

	}

	public Double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é possivel numero negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não é possivel numero negativo");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;

	}

	public static int getTotal() {
		return total;
	}
}
