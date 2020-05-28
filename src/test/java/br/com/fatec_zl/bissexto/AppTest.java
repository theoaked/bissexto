package br.com.fatec_zl.bissexto;

import junit.framework.TestCase;

/**
 * Trabalho de conclusão de curso
 *
 * Utilizando analise de mutantes no processo de desenvolvimento 
 * dirigido por teste para avaliar a qualidade do teste.
 * 
 * Eduardo Carvalho
 * Yago Rodrigues
 * Willian Ribeiro
 *
 */
public class AppTest extends TestCase {

	App app = new App();

	public void testApp() {

		assertTrue(app.calcula(1600));
		assertTrue(app.calcula(1404));
		assertFalse(app.calcula(2017));
	}
}
