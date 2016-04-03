package br.com.amil.teste.log.util;

import br.com.amil.teste.log.Partida;
import br.com.amil.teste.log.util.Constantes.IndexField;

public class LinhaPartida implements Linha<Partida> {

	/*
	 * Busca o ID da partida dentro da Linha
	 * 
	 */
	@Override
	public Partida linha(String[] linha) throws Exception {
		Partida partida = null;
		if(linha.length > 0 ){
			partida = new Partida(Integer.parseInt(linha[IndexField.PARTIDA.getIndexField()]));
		}
		
		return partida;
	}
}
