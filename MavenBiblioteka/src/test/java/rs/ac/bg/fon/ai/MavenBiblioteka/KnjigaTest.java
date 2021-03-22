package rs.ac.bg.fon.ai.MavenBiblioteka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnjigaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSetNaslov() {
		Knjiga k=new Knjiga();
		k.setNaslov("Naslov 1");
		assertEquals("Naslov 1", k.getNaslov());
	}

}
