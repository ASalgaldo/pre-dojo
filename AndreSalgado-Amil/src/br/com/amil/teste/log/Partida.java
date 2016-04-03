package br.com.amil.teste.log;

import java.util.ArrayList;
import java.util.List;

import br.com.amil.teste.log.Jogador;

/*
 * Classe para controle de atributos da partida
 */
public class Partida {
	private int idPartida;
	private List<Jogador> jogadores;
	private boolean fimPartida;
	
	/*
	 * Inicializa a partida mantendo ela como em execucao
	 */
	public Partida(int id){
		//recebe o id da partida
		this.idPartida = id;
		this.fimPartida = false;
		
		jogadores = new ArrayList<Jogador>();
	}
	
	public int getIdPartida() {
		return idPartida;
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	/*
	 * Add um novo jogador / morte na lista de jogadores da partida
	 * Caso o jogador já exista apenas soma uma morte 
	 */
	public void addJogadores(Jogador j) {
		//atribui uma morte ao jogador
		j.setQtdeMortes(1);
		
		/* verifica se o jogador já participou da partida caso ja tenha remove a 
		 * instancia antiga para atualizar a qtde de vidas da partida
		 */
		for(Jogador jAux : jogadores){
			if(jAux.getNome().equals(j.getNome())){
				//recupera as mortes atuais p/ atualizar o contador
				j.setQtdeMortes((jAux.getQtdeMortes() + 1));
				jogadores.remove(jAux);
				break;
			}	
		}			
		
		// add o jogador na partida
		jogadores.add(j);
	}

	public boolean isFimPartida() {
		return fimPartida;
	}

	public void setFimPartida(boolean fimPartida) {
		this.fimPartida = fimPartida;
	}
}