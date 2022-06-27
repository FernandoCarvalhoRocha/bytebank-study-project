package bytebank;

public abstract interface Autenticavel {

	public abstract void  setSenha(int senha);

	public abstract Boolean auth(int senha);

}
