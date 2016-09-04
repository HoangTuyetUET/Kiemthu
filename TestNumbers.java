package Test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumbers {

	@Test
	public void test() {
		MaxTwoNumbers testnumbers=new MaxTwoNumbers();
		int a[]={1,3,4,2,3,5};
		String result= testnumbers.ThreeMax(a,6);
		assertEquals("5 4", result);
		
	
	}

}
