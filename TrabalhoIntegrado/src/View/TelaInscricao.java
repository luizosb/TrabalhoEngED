package View;

import java.util.Scanner;

import Classes.Inscricao;
import ListaEncadeada.ListaEncadeada;

public class TelaInscricao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String RG;
		String nome;
		String CPF;
		String diploma;
		String comprovanteResidencia;
		String historico;
		
		Scanner sc = new Scanner(System.in);
		int op = 0;
		ListaEncadeada acao = new ListaEncadeada();
		while (op!=9) {
			System.out.print("\n=========================================="
							 + "\nDigite o que deseja"
							 + "\n1 - Adicionar candidato no in�cio"
							 + "\n2 - Adicionar candidato no final"
							 + "\n3 - Ordenar a lista"
							 + "\n4 - Remover candidato do in�cio"
							 + "\n5 - Remover candidato do final"
							 + "\n6 - Percorre a lista"
							 + "\n9 - Terminar aplica��o"
							 + "\nOp��o escolhida: ");
			op = sc.nextInt();
			System.out.println("==========================================");
			Inscricao x;
			switch (op) {
			case 1:
				System.out.println("Digite o candidato a ser adicionado: ");
				System.out.println("Digite o RG: ");
				RG = sc.nextLine();
				RG = sc.nextLine();
				System.out.println("Digite o Nome: ");
				nome = sc.nextLine();
				System.out.println("Digite o CPF: ");
				CPF = sc.nextLine();
				System.out.println("Digite o diploma: ");
				diploma = sc.nextLine();
				System.out.println("Digite o Comprovante Resid�ncia: ");
				comprovanteResidencia = sc.nextLine();
				System.out.println("Digite o hist�rico: ");
				historico = sc.nextLine();
				acao.AdicionaInicio(new Inscricao(RG, nome, CPF, diploma, comprovanteResidencia, historico));
				break;
			case 2:
				System.out.println("Digite o candidato a ser adicionado: ");
				System.out.println("Digite o RG: ");
				RG = sc.nextLine();
				RG = sc.nextLine();
				System.out.println("Digite o Nome: ");
				nome = sc.nextLine();
				System.out.println("Digite o CPF: ");
				CPF = sc.nextLine();
				System.out.println("Digite o diploma: ");
				diploma = sc.nextLine();
				System.out.println("Digite o Comprovante Resid�ncia: ");
				comprovanteResidencia = sc.nextLine();
				System.out.println("Digite o hist�rico: ");
				historico = sc.nextLine();
				acao.AdicionaFinal(new Inscricao(RG, nome, CPF, diploma, comprovanteResidencia, historico));
				break;
			case 3:
				acao.ordenarALista();
				break;
			case 4:
				x = acao.RemoveInicio();
				if(x ==null) {
					System.out.println("Lista j� est� vazia!");
				} else {
					System.out.println("Candidato(a) removido(a) foi: \n " + x);
				}
				break;
			case 5:
				x = acao.RemoveFinal();
				if(x ==null) {
					System.out.println("Lista j� est� vazia!");
				} else {
					System.out.println("Candidato(a) removido(a) foi: \n " + x);
				}
				break;
			case 6:
				System.out.println(acao.PercorreLista());
				break;
			case 9:
				System.out.println("PROGRAMA FINALIZADO!!");
				break;
			default:
				System.out.println("FUN��O INV�LIDA!");
				break;
			}
		}
	}
}
