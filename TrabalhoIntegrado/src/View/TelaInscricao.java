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
							 + "\n1 - Adicionar aluno no início"
							 + "\n2 - Adicionar aluno no final"
							 + "\n3 - Ordenar a lista"
							 + "\n4 - Remover aluno do início"
							 + "\n5 - Remover aluno do final"
							 + "\n6 - Percorre a lista"
							 + "\n9 - Terminar aplicação"
							 + "\nOpção escolhida: ");
			op = sc.nextInt();
			System.out.println("==========================================");
			switch (op) {
			case 1:
				System.out.println("Digite a aluno a ser adicionada: ");
				System.out.println("Digite o RG: ");
				RG = sc.next();
				System.out.println("Digite o Nome: ");
				nome = sc.next();
				System.out.println("Digite o CPF: ");
				CPF = sc.next();
				System.out.println("Digite o diploma: ");
				diploma = sc.next();
				System.out.println("Digite o Comprovante Residência: ");
				comprovanteResidencia = sc.next();
				System.out.println("Digite o histórico: ");
				historico = sc.next();
				acao.AdicionaInicio(new Inscricao(RG, nome, CPF, diploma, comprovanteResidencia, historico));
				break;
			case 2:
				System.out.println("Digite a aluno a ser adicionada: ");
				System.out.println("Digite o RG");
				RG = sc.next();
				System.out.println("Digite o Nome");
				nome = sc.next();
				System.out.println("Digite o CPF");
				CPF = sc.next();
				System.out.println("Digite o diploma");
				diploma = sc.next();
				System.out.println("Digite o Comprovante Residência");
				comprovanteResidencia = sc.next();
				System.out.println("Digite o histórico");
				historico = sc.next();
				acao.AdicionaFinal(new Inscricao(RG, nome, CPF, diploma, comprovanteResidencia, historico));
				break;
			case 3:
				acao.ordenarALista();
			case 4:
				System.out.println("Aluno(a) removido(a) foi: " + acao.RemoveInicio());
				break;
			case 5:
				System.out.println("Aluno(a) removido(a) foi: " + acao.RemoveFinal());
				break;
			case 6:
				System.out.println(acao.PercorreLista());
				break;
			case 9:
				System.out.println("PROGRAMA FINALIZADO!!");
				break;
			default:
				System.out.println("FUNÇÃO INVÁLIDA!");
				break;
			}
		}
	}
}
