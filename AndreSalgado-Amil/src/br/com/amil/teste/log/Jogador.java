package br.com.amil.teste.log;
/*
 * Classe para controle de atributos referente ao jogador
 */
public class Jogador {
	private String nome;
	private String arma;
	private int qtdeMortes;

	public Jogador(String nome, String arma){
		this.nome = nome;
		this.arma = arma;
		// todo jogador inicia c/ 0 mortes
		this.qtdeMortes = 0;
	}
	
	public Jogador(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
	public int getQtdeMortes() {
		return qtdeMortes;
	}

	public void setQtdeMortes(int qtdeMortes) {
		this.qtdeMortes = qtdeMortes;
	}
}