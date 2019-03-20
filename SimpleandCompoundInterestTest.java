package task2;
/*
 * Author:Nishitha
 * program for unittesting simple interest and compound interest 
 * 
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleandCompoundInterestTest {

	@Test
	public void test() {
		SimpleandCompoundInterest s=new SimpleandCompoundInterest();
		assertEquals(20,s.SimpleInterest(500, 2, 2),0.0);

		assertEquals(288.00,s.CompoundInterest(200, 20, 2),0.0);
		}

}
