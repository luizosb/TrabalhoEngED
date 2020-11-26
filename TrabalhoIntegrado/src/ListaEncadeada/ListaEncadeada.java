package ListaEncadeada;

import Classes.Inscricao;
import Classes.NO;

public class ListaEncadeada {
	private NO inicio;
	private Inscricao vet[];
	private static int tamanho;

	public ListaEncadeada() {
		this.inicio = null;
		tamanho = 0;

	}

	public void AdicionaInicio(Inscricao inscricao) {
		NO n = new NO(inscricao);
		n.setInscricao(inscricao);
		n.setProx(inicio);
		inicio = n;
		tamanho++;
	}

	public void AdicionaFinal(Inscricao inscricao) {
		NO n = new NO(inscricao);
		n.setInscricao(inscricao);
		n.setProx(null);
		if (inicio == null) {
			AdicionaInicio(inscricao);
		} else {
			NO aux = inicio;
			aux = RECADFIM(aux);
			aux.setProx(n);
		}
		tamanho++;
	}

	static private NO RECADFIM(NO aux) {
		if (aux.getProx() != null) {
			return RECADFIM(aux.getProx());
		} else {
			return aux;
		}
	}

	public void clonalista() {
		int a = 0;
		for (NO n = inicio; n != null; n = n.getProx()) {
			vet[a] = n.getInscricao();
			a++;
		}
	}

	public void ordenarALista() {
		vet = new Inscricao[tamanho];
		clonalista();
		mergeSortRecursivo(vet, 0, (tamanho - 1));
		reescrevelista();
	}
	
	// ORDENAÇÃO DA LISTA
	public static void mergeSortRecursivo(Inscricao[] vet, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSortRecursivo(vet, ini, meio);
			mergeSortRecursivo(vet, meio + 1, fim);
			mesclar(vet, ini, meio, meio + 1, fim);
		}
	}

	public static void mesclar(Inscricao vet[], int iniA, int fimA, int iniB, int fimB) {
		int i1 = iniA;
		int i2 = iniB;
		int iaux = iniA;
		Inscricao aux[] = new Inscricao[vet.length];
		while (i1 <= fimA && i2 <= fimB) {
			if (vet[i1].getNome().compareToIgnoreCase(vet[i2].getNome()) < 0) {
				aux[iaux++] = vet[i1++];
			} else {
				aux[iaux++] = vet[i2++];
			}
		}
		while (i1 <= fimA) {
			aux[iaux++] = vet[i1++];
		}
		while (i2 <= fimB) {
			aux[iaux++] = vet[i2++];
		}
		for (int i = iniA; i <= fimB; i++) {
			vet[i] = aux[i];
		}
	}
	// FIM DA ORDENAÇÃO

	public void reescrevelista() {
		int a = 0;
		for (NO n = inicio; n != null; n = n.getProx()) {
			n.setInscricao(vet[a]);
			a++;
		}
	}

	public Inscricao RemoveInicio() {
		if (inicio == null) {
			return null;
		} else {
			NO aux = inicio;
			Inscricao aluno = aux.getInscricao();
			inicio = aux.getProx();
			tamanho--;
			return aluno;
		}
	}

	public Inscricao RemoveFinal() {
		NO aux = inicio;
		Inscricao aluno;
		if (inicio == null) {
			return null;
		} else if (inicio.getProx() == null) {
			aluno = aux.getInscricao();
			inicio = null;
			tamanho--;
			return aluno;
		} else {
			aux = RECREM(inicio, inicio);
			aluno = aux.getProx().getInscricao();
			aux.setProx(null);
			tamanho--;
			return aluno;
		}
	}

	private NO RECREM(NO aux1, NO aux2) {
		if (aux1.getProx() != null) {
			return RECREM(aux1.getProx(), aux1);
		} else {
			return aux2;
		}

	}

	public String PercorreLista() {
		NO aux = inicio;
		String str = "\n";
		return RECPER(str, aux);
	}

	private String RECPER(String str, NO aux) {
		if (aux != null) {
			str += " " + aux.getInscricao() + "\n";
			return RECPER(str, aux.getProx());
		} else {
			return str + "\n";
		}
	}

}