package br.com.fatec_zl.bissexto;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	App app = new App();

	public void testApp() {

		assertTrue(app.calcula(1600));
		assertTrue(app.calcula(1404));
		assertFalse(app.calcula(2017));
	}
}
