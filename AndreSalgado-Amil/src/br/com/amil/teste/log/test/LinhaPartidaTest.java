package br.com.amil.teste.log.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.amil.teste.log.Partida;
import br.com.amil.teste.log.util.Constantes;
import br.com.amil.teste.log.util.Linha;
import br.com.amil.teste.log.util.LinhaPartida;

public class LinhaPartidaTest {

	@Test
	public void test() throws Exception {
		Linha<Partida> lPartida = new LinhaPartida();
		String linha = " "; 
		Partida p = lPartida.linha(linha.split(Constantes.SPACE));
		// verifica se retornou nulo pois a string passada esta vazia
		Assert.assertNull(p);
		
		linha = "23/04/2013 15:34:22 - New match 11348965 has started"; 
		p = lPartida.linha(linha.split(Constantes.SPACE));
		// verifica se o objeto partida foi preenchido corretamente agora que foi passada a string correta
		Assert.assertNotNull(p);	
	}

}
