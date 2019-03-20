package task2;
/*
 * Author:Nishitha
 * program for estimating cost for construction of a house 
 * 
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class CostEstimatorTest {

	@Test
	public void test() {
		CostEstimator c=new CostEstimator();
		assertEquals(36000,c.calculateCost("standard", 30, false),0.0);
		assertEquals(57500,c.calculateCost("highstandard", 23,true),0.0);
		assertEquals(22500,c.calculateCost("abovestandard",15 ,false),0.0);
	}

}
