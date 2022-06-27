package bytebank;

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticacao autenticacao;
	
	public double getBonificacao() {
		return super.getSalario();

	}

	@Override
	public void setSenha(int senha) {
		this.autenticacao.setSenha(senha);
	}

	@Override
	public Boolean auth(int senha) {
		return autenticacao.auth(senha);
	}

}
