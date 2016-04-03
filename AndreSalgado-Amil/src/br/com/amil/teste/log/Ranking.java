package br.com.amil.teste.log;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Classe para controle dos rankigs das partidas
 */
public class Ranking {
	private List<Partida> partidas;
	
	public List<Partida> getPartidas() {
		return partidas;
	}
	
	public void setPartidas(Partida partida){
		partidas.add(partida);
	}
	
	public Ranking() {
		this.partidas = new ArrayList<Partida>();
	}
	
	/*
	 * metodo para validacao de regras basicas para a geracao do ranking
	 */
	public List<String> rankingFinal(){
		List<String> retorno = new ArrayList<String>();
		//verifica se existem partidas para o calculo
		if(this.partidas.isEmpty()){
			throw new RuntimeException("Para mostrar o ranking é necessario adicionar alguma partida!");
		}else {	
			for(Partida partida : this.partidas){
				//a partida deve estar finalizada 
				if(!partida.isFimPartida()){
					throw new RuntimeException("O ranking das partidas só pode ser impresso quando todas as partidas estiverem finalizadas!");
				}else if(partida.getJogadores().isEmpty()){ // deve existir jogadores nas partidas
					throw new RuntimeException("Todas as partidas devem possuir jogadores");
				} else {
					//chama o metodo que realiza a ordenacao dos jogadores das partidas
					retorno.addAll(printRanking(partida));
				}			
			}
		}
		return retorno;
	}
	
	/*
	 *metodo para a ordenacao dos jogadores para o ranking 
	 */
	private List<String> printRanking(Partida partida){
	    List<String> ranking = partida.getJogadores().stream()
	    		.sorted((a, b) -> b.getQtdeMortes() - a.getQtdeMortes())
	            .map(p -> {
	                return new String("Partida " + partida.getIdPartida() + " - " + p.getNome() + ": " + p.getQtdeMortes());
	            })
	            .collect(Collectors.toList());
	    return ranking; 
	}
}