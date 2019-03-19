package task2;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorUnittest {

	@Test
	public void  test() {
			calculator c = new calculator();
			assertEquals(5, c.add(3,2));
			assertEquals(1, c.sub(3,2));
			assertEquals(6, c.multiply(3,2));
			assertEquals(2,c.divide(4,2));
			
	
	}

}
