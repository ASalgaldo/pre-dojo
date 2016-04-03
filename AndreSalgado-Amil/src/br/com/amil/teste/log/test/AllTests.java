package br.com.amil.teste.log.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LinhaJogadorTest.class, LinhaPartidaTest.class, PartidaTest.class, RankingTest.class })
public class AllTests {

}
