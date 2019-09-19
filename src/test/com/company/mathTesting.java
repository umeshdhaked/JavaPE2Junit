package com.company;
import math.classes.*;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class mathTesting {

@Test
    public void palindromeTest(){

    assertEquals(true,palindrome.palindrome("umesemu"));
    assertEquals(false,palindrome.palindrome("umes7882883 387 36emu"));
    assertEquals(false,palindrome.palindrome(null));
}

    @Test
    public void powOf4(){

        assertEquals(true,powOfFour.checkPowOf4(1024));
        assertEquals(false,powOfFour.checkPowOf4(1026));
        assertEquals(false,powOfFour.checkPowOf4(0));
    }

    @Test
    public void factorial(){

        assertEquals(479001600,factorial.fact(12));

    }

    @Test
    public void users(){

    user obj = new user("kumar","saurav",25,5);

    assertEquals("kumar saurav",obj.getFullName());

    assertEquals(true,obj.isValidAge());

    }


}
