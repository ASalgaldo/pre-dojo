package br.com.amil.teste.log.util;

/*
 * Classe generica para variaveis contantes p/ a identificacao de campos no 
 * arquivo e conteudos p/ localizacao nas linhas
 */
public class Constantes {
	public static final String SPACE = " ";
	
	// enum p/ controle de posicoes de atributos nas linhas
	public enum IndexField {
		ASSASSINO(3),
		PARTIDA(5),
		MORTO(6),
		TP_MORTE(7);

		private Integer indexField;

		IndexField(Integer indexField) {
			this.indexField = indexField;
		}

		public Integer getIndexField() {
			return indexField;
		}
		
	}
	
	//enum p/ comparacao de conteudos nas linhas
	public enum TpLinha {
		NEWMATCH("New"),
		STARTED("started"),
		MATCH("Match"),
		ENDED("ended"),		
		KILLED("killed"),
		USING("using"),		
		WORLD("<WORLD>");

		private String linha;

		TpLinha(String linha) {
			this.linha = linha;
		}

		public String getLinha() {
			return linha;
		}
	}
}