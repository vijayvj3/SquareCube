package squarecube;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		int output = SquareCube.square(3);
		assertEquals(9, output);
	}

}
