package br.com.amil.teste.log.util;

public interface Linha<T> {
	T linha(String[] linha) throws Exception;
}