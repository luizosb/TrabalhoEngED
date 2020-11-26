package Classes;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Inscricao {

	String RG;
	String nome;
	String CPF;
	String diploma;
	String comprovanteResidencia;
	String historico;
	
	public Inscricao(String RG, String nome, String CPF, String diploma, String comprovanteCasa, String historico) {
		this.RG = RG;
		this.nome = nome;
		this.CPF = CPF;
		this.diploma = diploma;
		this.comprovanteResidencia = comprovanteCasa;
		this.historico = historico;
	}
	
	Date data = new Date();
	SimpleDateFormat formatador = new SimpleDateFormat();
	
	public String toString() {
		String retorno = "| Nome: " + this.nome + "| RG: " + this.RG + "| CPF: " + this.CPF + "\n" + 
						 "| Diploma do Ensino Médio: " + this.diploma + "\n" + 
						 "| Comprovante de Residência: " + this.comprovanteResidencia + "| Histórico Escolar: " + this.historico + "\n" +
						 "| DATA LIMITE: 15/12/2020       DATA DA INSCRIÇÃO: " + formatador.format(data) + "\n";
						
		return retorno;
	}
	
	

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getComprovanteResidencia() {
		return comprovanteResidencia;
	}

	public void setComprovanteResidencia(String comprovanteResidencia) {
		this.comprovanteResidencia = comprovanteResidencia;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
	
}
