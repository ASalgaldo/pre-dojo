package br.com.amil.teste.log;

import java.io.BufferedReader;
import java.io.FileReader;

import br.com.amil.teste.log.util.Constantes;
import br.com.amil.teste.log.util.Constantes.TpLinha;
import br.com.amil.teste.log.util.Linha;
import br.com.amil.teste.log.util.LinhaJogador;
import br.com.amil.teste.log.util.LinhaPartida;

public class Run {

	public static void main(String[] args) throws Exception {
		Partida p = null;
		Jogador j = null;
		Ranking r = new Ranking();
		
		Linha<Partida> lPartida = new LinhaPartida();
		Linha<Jogador> lJogador = new LinhaJogador();
		
		BufferedReader arqB = new BufferedReader(new FileReader("log/log.txt"));
		for (String linha = arqB.readLine(); linha != null; linha = arqB.readLine()){
			System.out.println(linha);
			//verifica qual o tipo da linha para catalogar conforme os objetos
			if( linha.contains(TpLinha.NEWMATCH.getLinha()) && 
				linha.contains(TpLinha.STARTED.getLinha())
			){
				// se for de inicio de partida cria a instancia e alimenta o id da partida
				p = lPartida.linha(linha.split(Constantes.SPACE));
			} else if( linha.contains(TpLinha.KILLED.getLinha()) && 
					   linha.contains(TpLinha.USING.getLinha())
			){	
				// se for ref a jogador matando outros alimenta o objeto jogador com os dados
				j = lJogador.linha(linha.split(Constantes.SPACE));
				
				// add o jogador que realizou a morte na partida
				p.addJogadores(j);
				
			} else if(linha.contains(TpLinha.WORLD.getLinha())){
				//ignora o registro caso seja WORLD
				continue;
			} else if( linha.contains(TpLinha.MATCH.getLinha()) && 
					   linha.contains(TpLinha.ENDED.getLinha())
			){
				//finaliza a partida
				p.setFimPartida(true);
				
				/*
				 * se for o final da partida
				 * add a mesma p/ calcular o ranking ao termino do arquivo
				 */
				r.setPartidas(p);
				
			}			
		}
		//fecha o arquivo de log
		arqB.close();
		
		// verifica se tem alguma partida para printar o ranking
		if(!r.getPartidas().isEmpty()){
			System.out.println("\n-----------------------------------------------------------------");
			//imprime o ranking das partidas
			for(String result : r.rankingFinal()){
				System.out.println(result);
			}
		}
	}

}
