package br.com.fatec_zl.bissexto;

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
public class App {
	public boolean calcula(int ano) {
		// se o ano for divisivel 400. Ex 1600
		if (ano % 400 == 0) {
			return true;
		// se o ano divisivel por 4 e ao mesmo tempo nao divisivel por 100. Ex 1404
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			return true;
		// demais casos
		} else {
			return false;
		}
	}
}
