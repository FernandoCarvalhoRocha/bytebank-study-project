package bytebank;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String proficao;
	private Autenticacao autenticacao;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProficao() {
		return proficao;
	}

	public void setProficao(String proficao) {
		this.proficao = proficao;
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
