package ListaEncadeada;

import Classes.Inscricao;
import Classes.NO;

public class ListaEncadeada {
	private NO inicio;
	private Inscricao vet[];
	private static int fim = 0;

	public ListaEncadeada() {
		this.inicio = null;
	}
	
	//ORDENAÇÃO DA LISTA
	public static void mergeSortRecursivo(Inscricao[] vet2, int ini, int fim) {
		ini = 0;
        if (ini < fim) {
            int meio = (ini + fim) / 2;
            mergeSortRecursivo(vet2, ini, meio);
            mergeSortRecursivo(vet2, meio + 1, fim);
            mesclar(vet2, ini, meio, meio + 1, fim);
            
        }
    }
	

    public static void mesclar(Inscricao vet[], int iniA, int fimA, int iniB, int fimB) {
        int i1 = iniA;
        int i2 = iniB;
        int iaux = iniA;
        Inscricao aux[] = new Inscricao[vet.length];
        while (i1 <= fimA && i2 <= fimB) {
            if (vet[i1] <= vet[i2]) {
                aux[iaux++] = vet[i1++];
            } else {
                aux[iaux++] = vet[i2++];
            }
        }
        while (i1<=fimA) {
            aux[iaux++]=vet[i1++];
        }
        while (i2<=fimB) {
            aux[iaux++]=vet[i2++];
        }
        for(int i=iniA;i<=fimB;i++) {
             vet[i]=aux[i];
        }
    }
    //FIM DA ORDENAÇÃO
    
	public boolean vazia() {
		if (this.inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void AdicionaInicio(Inscricao inscricao) {
		NO n = new NO(inscricao);
		n.setInscricao(inscricao);
		n.setProx(inicio);
		inicio = n;
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
	}

	static private NO RECADFIM(NO aux) {
		if (aux.getProx() != null) {
			return RECADFIM(aux.getProx());
		} else {
			return aux;
		}
	}

	public Inscricao RemoveInicio() {
		if (inicio == null) {
			System.out.println("lista vazia");
			return null;
		} else {
			NO aux = inicio;
			Inscricao aluno = aux.getInscricao();
			inicio = aux.getProx();
			return aluno;
		}
	}

	public Inscricao RemoveFinal() {
		NO aux = inicio;
		Inscricao aluno;
		if (inicio.getProx() == null) {
			aluno = aux.getInscricao();
			inicio = null;
			return aluno;
		} else {
			aux = RECREM(inicio, inicio);
			aluno = aux.getProx().getInscricao();
			aux.setProx(null);
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

	public void clonalista() {
        for (NO n = inicio; n != null; n = n.getProx()) {
            fim++;
            vet[fim]=n.getInscricao();
        }
    }
	
	public void ordenarALista() {
		clonalista();
		mergeSortRecursivo(vet, 0, fim);
	}

}