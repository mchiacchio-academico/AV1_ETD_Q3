package questao_3;

public class post_rs {
	
	private String mensagem;
	private byte relev;
	
	public post_rs(String mensagem, byte relev) {
		super();
		this.mensagem = mensagem;
		this.relev = relev;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public byte getRelev() {
		return relev;
	}

	public void setRelev(byte relev) {
		this.relev = relev;
	}
}
