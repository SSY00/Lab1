package pairprogramming;

import static org.junit.Assert.*;
import org.junit.Test;

public class pairprogrammingTest {
	public static pairprogramming test = new pairprogramming();
	public static String[] answer;
	@Test
	public void testExpression() {
		 answer=test.expression("10+2*x");
		 StringBuffer sb = new StringBuffer();
		 for(int i = 0; i < answer.length; i++)
		 { 
		 sb. append(answer[i]);
		 }
		 String s = sb.toString();

		 assertEquals("102x*+", s);
	}

}
