/**
 * 
 */
package theorie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Virginie Van den Schrieck
 *
 */
class VoitureTest {
	Voiture maVoiture;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		maVoiture = new Voiture();
	}

	/**
	 * Test method for {@link theorie.Voiture#getKilometrage()}.
	 */
	@Test
	void testGetKilometrage() {
		assertEquals(maVoiture.getKilometrage(),0);
		maVoiture.setKilometrage(100);
		assertEquals(maVoiture.getKilometrage(),100);
	}

	/**
	 * Test method for {@link theorie.Voiture#setKilometrage(int)}.
	 */
	@Test
	void testSetKilometrage() {
		maVoiture.setKilometrage(100);
		assertEquals(maVoiture.getKilometrage(),100);
	}

	/**
	 * Test method for {@link theorie.Voiture#roule(int)}.
	 */
	@Test
	void testRoule() {
		maVoiture.roule(0);
		assertEquals(maVoiture.getKilometrage(), 0);
		maVoiture.setKilometrage(10);
		maVoiture.roule(0);
		assertEquals(maVoiture.getKilometrage(), 10);
		maVoiture.setKilometrage(0);
		maVoiture.roule(10);
		assertEquals(maVoiture.getKilometrage(), 10);
		maVoiture.setKilometrage(10);
		maVoiture.roule(10);
		assertEquals(maVoiture.getKilometrage(), 20);
		
	}

}
