package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {
	
	private Coche cut;
	
	@BeforeEach
	void setUp() throws Exception {
		Motor motor = new Motor();
		this.cut= new Coche(motor);
	}

	@Test
	void testArrancar() {
		
	}

}
