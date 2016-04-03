package br.com.amil.teste.log.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.amil.teste.log.Jogador;
import br.com.amil.teste.log.util.Constantes;
import br.com.amil.teste.log.util.Linha;
import br.com.amil.teste.log.util.LinhaJogador;

public class LinhaJogadorTest {

	@Test
	public void test() throws Exception {
		Linha<Jogador> lJogador = new LinhaJogador();
		String linha = " "; 
		Jogador j = lJogador.linha(linha.split(Constantes.SPACE));
		// verifica se retornou nulo pois a string passada esta vazia
		Assert.assertNull(j);
		
		linha = "23/04/2013 15:36:04 - Nick killed Roman using KNIFE"; 
		j = lJogador.linha(linha.split(Constantes.SPACE));
		// verifica se o objeto jogador foi preenchido corretamente agora que foi passada a string correta
		Assert.assertNotNull(j);		
	}
}