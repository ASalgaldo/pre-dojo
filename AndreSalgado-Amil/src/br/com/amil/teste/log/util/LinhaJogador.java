package br.com.amil.teste.log.util;

import br.com.amil.teste.log.Jogador;
import br.com.amil.teste.log.util.Constantes.IndexField;

public class LinhaJogador implements Linha<Jogador>{
	/*
	 * Busca o o nome do Jogador e a maneira da morte
	 * 
	 */
	@Override
	public Jogador linha(String[] linha) throws Exception {
		Jogador jogador = null;
		if(linha.length > 0 ){
			jogador = new Jogador(linha[IndexField.ASSASSINO.getIndexField()], linha[IndexField.TP_MORTE.getIndexField()]);
		}
		
		return jogador;
	}

}
