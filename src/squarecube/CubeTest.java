package squarecube;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test() {
		int output = SquareCube.cube(3);
		assertEquals(27, output);
	}

}
