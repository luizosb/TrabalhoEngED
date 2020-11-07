package Classes;

public class NO {
	
	private Inscricao inscricao;
	private NO prox;
	
	public NO(Inscricao inscricao) {
		this.prox = null;
		this.inscricao = inscricao;
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public NO getProx() {
		return prox;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public void setProx(NO prox) {
		this.prox = prox;
	}

}
