/**
 * 
 The ArithmeticTest class is a unit test for the Arithmetic class. It tests the add,subtract,divide and multiply methods of the Arithmetic class by
 creating instances of different subclasses of Arithmetic (NaturalN, RealN, RationalN, and ComplexN) and passing them as arguments to
 the add and subtract methods. The results of the operations are then checked to ensure they are correct.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticTest {
  
  @Test
  public void testAdd() {
    // Test0 adding two natural numbers
    Arithmetic num1 = new NaturalN(10);
    Arithmetic num2 = new NaturalN(7);
    Arithmetic result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof NaturalN);
    assertEquals(17, ((NaturalN) result).getNat());
    
    // Test1 adding two real numbers
    num1 = new RealN(2.6);
    num2 = new RealN(7.7);
    result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof RealN);
    assertEquals(10.3, ((RealN) result).getRealPart(), 0.001);
    
    // Test2 adding two rational numbers
    num1 = new RationalN(2, 6);
    num2 = new RationalN(1, 2);
    result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof RationalN);
    assertEquals((5+"/"+6),result.toString() ); 
    
    // Test3 adding real number to rational number
    num1 = new RealN(7.0);
    num2 = new RationalN(1, 2);
    result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof RealN);
    assertEquals(7.5,((RealN) result).getRealPart(),0.001); 
    
    // Test4 adding a natural number and an integer
    num1 = new NaturalN(10);
    num2 = new IntegerN(-7);
    result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof IntegerN);
    assertEquals(3, ((IntegerN) result).getInt());
    
    // Test5 adding a rational number and a complex number
    num1 = new RationalN(1, 2);
    num2 = new ComplexN(3.0, 4.0);
    result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(3.5, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(4.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test6 adding a complex number and an integer
    num1 = new ComplexN(6.0, 4.0);
    num2 = new IntegerN(-2);
    result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(4.0, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(4.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test7 adding a real number and a complex number
    num1 = new RealN(2.6);
    num2 = new ComplexN(3.0, 4.0);
    result = Arithmetic.add(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(5.6, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(4.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
  }
  
  @Test
  public void testSubtract() {
    
    
    // Test1 subtracting two natural numbers
    Arithmetic num1 = new NaturalN(10);
    Arithmetic num2 = new NaturalN(7);
    Arithmetic result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof NaturalN);
    assertEquals(3, ((NaturalN) result).getNat());
    
    //Test2 substracting rational number from an complex number
    num1 = new RationalN(6,3);
    num2 = new ComplexN(10.0,5.0);
    result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(-8.0, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(-5.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    
    // Test3 subtracting a complex number from an integer
    num1 = new IntegerN(3);
    num2 = new ComplexN(2.0, 4.0);
    result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(1.0, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(-4.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test4 subtracting two real numbers
    num1 = new RealN(5.5);
    num2 = new RealN(7.7);
    result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof RealN);
    assertEquals(-2.2, ((RealN) result).getRealPart(), 0.001);
    
    //Test5 substracting two rational numbers
    num1 = new RationalN(1, 3);
    num2 = new RationalN(3, 4);
    result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof RationalN);
    assertEquals((-5+"/"+12),result.toString() );
    
    // Test6 subtracting a complex number from a real number
    num1 = new RealN(2.6);
    num2 = new ComplexN(3.0, 4.0);
    result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(-0.4, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(-4.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test7 subtracting an integer from a natural number
    num1 = new NaturalN(10);
    num2 = new IntegerN(-7);
    result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof IntegerN);
    assertEquals(17, ((IntegerN) result).getInt());
    
    // Test8 subtracting a complex number from a rational number
    num1 = new RationalN(3, 2);
    num2 = new ComplexN(2.0, 4.0);
    result = Arithmetic.substract(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(-0.5, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(-4.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test9 subtracting a larger natural number from a smaller one
    num1 = new NaturalN(5);
    num2 = new NaturalN(7);
    try {
      result = Arithmetic.substract(num1, num2);
      fail("Expected ArithmeticException not thrown");
    } catch (ArithmeticException ex) {
      assertEquals("A natural number cannot be negative ", ex.getMessage());
    }
  }
  @Test
  public void testDivide() {
    // Test0 dividing two natural numbers
    Arithmetic num1 = new NaturalN(10);
    Arithmetic num2 = new NaturalN(5);
    Arithmetic result = Arithmetic.divide(num1, num2);
    assertTrue(result instanceof NaturalN);
    assertEquals(2, ((NaturalN) result).getNat());
    
    // Test1 dividing a complex number by an integer
    num1 = new ComplexN(3.0, 4.0);
    num2 = new NaturalN(2);
    result = Arithmetic.divide(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(1.5, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(2.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test2 dividing two real numbers
    num1 = new RealN(10.5);
    num2 = new RealN(2.5);
    result = Arithmetic.divide(num1, num2);
    assertTrue(result instanceof RealN);
    assertEquals(4.2, ((RealN) result).getRealPart(), 0.001);
    
    // Test3 dividing a complex number by a real number
    num1 = new ComplexN(3.0, 4.0);
    num2 = new RealN(2.5);
    result = Arithmetic.divide(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(1.2, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(1.6, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test4 dividing two integer numbers
    num1 = new IntegerN(10);
    num2 = new IntegerN(3);
    result = Arithmetic.divide(num1, num2);
    assertTrue(result instanceof RationalN);
    assertEquals((10+"/"+3),result.toString());
    
    // Test5 dividing a natural number by a real number
    num1 = new NaturalN(5);
    num2 = new RealN(2.5);
    result = Arithmetic.divide(num1, num2);
    assertTrue(result instanceof RealN);
    assertEquals(2.0, ((RealN) result).getRealPart(), 0.001);
    
    // Test6 dividing by zero
    num1 = new RealN(10.5);
    num2 = new RealN(0);
    try {
      result = Arithmetic.divide(num1, num2);
      fail("Expected ArithmeticException not thrown");
    } catch (ArithmeticException ex) {
      // Exception was expected, test passes
    }
    
  }
  
  @Test
  public void testMultiply() {
    // Test0 multiplying two natural numbers
    Arithmetic num1 = new NaturalN(10);
    Arithmetic num2 = new NaturalN(6);
    Arithmetic result = Arithmetic.multiply(num1, num2);
    assertTrue(result instanceof NaturalN);
    assertEquals(60, ((NaturalN) result).getNat());
    
    // Test1 multiplying a natural number by a rational number
    num1 = new NaturalN(5);
    num2 = new RationalN(1, 2);
    result = Arithmetic.multiply(num1, num2);
    assertTrue(result instanceof RationalN);
    assertEquals(5, ((RationalN) result).getNumerator());
    assertEquals(2, ((RationalN) result).getDenominator());
    
    // Test2 multiplying a natural number by a real number
    num1 = new NaturalN(5);
    num2 = new RealN(2.5);
    result = Arithmetic.multiply(num1, num2);
    assertTrue(result instanceof RealN);
    assertEquals(12.5, ((RealN) result).getRealPart(), 0.001);
    
    // Test3 multiplying a complex number by a real number
    num1 = new ComplexN(5.0, 6.0);
    num2 = new RealN(2.5);
    result = Arithmetic.multiply(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals(12.5, ((ComplexN) result).getRealPart(), 0.001);
    assertEquals(15.0, ((ComplexN) result).getImaginaryPart(), 0.001);
    
    // Test4 Multiplying two Rational numbers.
    num1 = new RationalN(12,24);
    num2 = new RationalN(15,45);
    result = Arithmetic.multiply(num1, num2);
    assertTrue(result instanceof ComplexN);
    assertEquals((1+"/"+6),result.toString());
    
    // Test5 Multiplying integer to natural
    num1 = new IntegerN(-20);
    num2 = new NaturalN(2);
    result = Arithmetic.multiply(num1,num2);
    assertTrue(result instanceof IntegerN);
    assertEquals(-40, ((IntegerN) result).getInt());
    
    //Test6
    
    
  }
  
  @Test
  public void testEquals() {
    // Test0 equals method for natural numbers
    NaturalN num1 = new NaturalN(5);
    NaturalN num2 = new NaturalN(6);
    assertFalse(num1.equals(num2));
    num2 = new NaturalN(5);
    assertTrue(num1.equals(num2));
    
    // Test1 equals method for integer numbers
    IntegerN num3 = new IntegerN(5);
    IntegerN num4 = new IntegerN(6);
    assertFalse(num3.equals(num4));
    num4 = new IntegerN(5);
    assertTrue(num3.equals(num4));
    
    // Test2 equals method for rational numbers
    RationalN num5 = new RationalN(5, 2);
    RationalN num6 = new RationalN(6, 2);
    assertFalse(num5.equals(num6));
    num6 = new RationalN(5, 2);
    assertTrue(num5.equals(num6));
    
    // Test3 equals method for real numbers
    RealN num7 = new RealN(5.5);
    RealN num8 = new RealN(5.5);
    assertTrue(num7.equals(num8));
    
    // Test4 equals method for complex numbers
    ComplexN num9 = new ComplexN(5.5, 6.5);
    ComplexN num10 = new ComplexN(6.5, 7.5);
    assertFalse(num9.equals(num10));
    num10 = new ComplexN(5.5, 6.5);
    assertTrue(num9.equals(num10));
    
   
  }
  
}

