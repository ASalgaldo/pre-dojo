package br.com.amil.teste.log.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.amil.teste.log.Ranking;

public class RankingTest {

	@Test
	public void test() {
		PartidaTest  partida = new PartidaTest();
		PartidaTest  partida2 = new PartidaTest();
		Ranking ranking = new Ranking();
		
		ranking.setPartidas(partida.execute());
		ranking.setPartidas(partida2.execute());
		// verifica se as partidas foram add
		Assert.assertNotNull(ranking.getPartidas());
		
		/* verifica se existe apenas dois jogadores na partida no intuito de validar se o jogador 
		 * que utilizou mais de de uma vida esta sendo considerada como novo jogador ou apenas 
		 * atualizando a qtde de vidas 
		 */
		Assert.assertEquals(2, ranking.getPartidas().size());		
		
		// verifica se o ranking foi montado
		Assert.assertNotNull(ranking.rankingFinal());
	}

}
