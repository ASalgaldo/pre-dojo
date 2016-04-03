package br.com.amil.teste.log.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.amil.teste.log.Jogador;
import br.com.amil.teste.log.Partida;

public class PartidaTest {

	@Test
	public void test() {
		execute();		
	}
	
	public Partida execute(){
		//## cria a partida
		Partida partida = new Partida(1);
		
		//## cria os jogadores
		Jogador j1 = new Jogador("Roman", "M16");
		Jogador j2 = new Jogador("Nick", "Faca");
		
		//## add os jogadores na partida
		partida.addJogadores(j1);
		partida.addJogadores(j2);
				
		//## add o jogador 2 novamente na partida
		partida.addJogadores(j2);
		
		/* verifica se existe apenas dois jogadores na partida no intuito de validar se o jogador 
		 * que utilizou mais de de uma vida esta sendo considerada como novo jogador ou apenas 
		 * atualizando a qtde de vidas 
		 */
		Assert.assertEquals(2, partida.getJogadores().size());
		
		//finaliza a partida
		partida.setFimPartida(true);
		
		return partida;
	}
}