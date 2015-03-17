/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddSubTest {
   @Test
   public void testAddPass() {
      // assertEquals(String message, long expected, long actual)
      assertEquals("error in add()",  3, Calculator.add(1, 2));
      assertEquals("error in add()", -3, Calculator.add(-1, -2));
      assertEquals("error in add()",  9, Calculator.add(9, 0));
   }
 
   @Test
   public void testAddFail() {
      // assertNotEquals(String message, long expected, long actual)
      assertNotEquals("error in add()", 0, Calculator.add(1, 2));
   }
 
   @Test
   public void testSubPass() {
      assertEquals("error in sub()",  1, Calculator.sub(2, 1));
      assertEquals("error in sub()", -1, Calculator.sub(-2, -1));
      assertEquals("error in sub()",  0, Calculator.sub(2, 2));
   }
 
   @Test
   public void testSubFail() {
      assertNotEquals("error in sub()", 0, Calculator.sub(2, 1));
   }

    private void assertNotEquals(String error_in_add, int i, int add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}