package com.epam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemovalOfAInFirstTwoCharTest {
    /*
     * TO-DO List of my feature
     * 1. 2 chars : AB => BA
     * 2. 1 char  : A => ""
     * 3. n chars : AAABBCDAA => ABBCDAA
     * 4. String with no A : BB => BB
     * 5. String with all A's : AAA => A
     * 6. String starting with A : ABBA => BBA
     * 7. Empty String : "" => ""
     */
	@Test
	void test2Chars() {
		RemovalOfAInFirstTwoChar obj=new RemovalOfAInFirstTwoChar();
		String actual=obj.removeAInFirst2Char("AB");
		assertEquals("B",actual);
	}
	
	@Test
	void test1Char() {
		RemovalOfAInFirstTwoChar obj=new RemovalOfAInFirstTwoChar();
		String actual=obj.removeAInFirst2Char("A");
		assertEquals("",actual);
	}
	
	@Test
	void testnChars() {
		RemovalOfAInFirstTwoChar obj=new RemovalOfAInFirstTwoChar();
		String actual=obj.removeAInFirst2Char("ABBBAA");
		assertEquals("BBBAA",actual);
	}
	
	@Test
	void testStringWithNoA() {
		RemovalOfAInFirstTwoChar obj=new RemovalOfAInFirstTwoChar();
		String actual=obj.removeAInFirst2Char("BBB");
		assertEquals("BBB",actual);
	}
	
	@Test
	void testStringWithAllA() {
		RemovalOfAInFirstTwoChar obj=new RemovalOfAInFirstTwoChar();
		String actual=obj.removeAInFirst2Char("AAA");
		assertEquals("A",actual);
	}
	
	@Test
	void testStringStartWithA() {
		RemovalOfAInFirstTwoChar obj=new RemovalOfAInFirstTwoChar();
		String actual=obj.removeAInFirst2Char("ABBBDS");
		assertEquals("BBBDS",actual);
	}
	
	@Test
	void testEmptyString() {
		RemovalOfAInFirstTwoChar obj=new RemovalOfAInFirstTwoChar();
		String actual=obj.removeAInFirst2Char("");
		assertEquals("",actual);
	}

}
