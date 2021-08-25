package name.mjw.hellomavenworld;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void squareTest() {
		Assertions.assertEquals(4, App.square(2));
	}

	@Test
	public void cubeTest() {
		Assertions.assertEquals(27, App.cube(3));
	}

}
