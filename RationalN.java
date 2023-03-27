/**
 * 
 * A class representing a rational number, which is a number that can be expressed as the ratio of two integers.
 * Rational numbers are implemented as a numerator and a denominator, both of which are integers. 
 * The class alsoincludes a method to return the greatest common divisor of two integers and a method 
 * to return a string representation of the rational number in reduced form.
 */

public class RationalN extends RealN{
  private int numerator;
  private int denominator;
  public RationalN(int numerator, int denominator){
    super((double)numerator / denominator);
    if (denominator == 0) {
      throw new ArithmeticException("Denominator cannot be 0");
    }
    this.numerator = numerator;
    this.denominator = denominator;
  }
  
  public int getNumerator() {
    return numerator;
  }
  
  public int getDenominator() {
    return denominator;
  }
  
  /*
   * Calculates two numbers great common divisor.
   *
   * @param a the first number
   * @param b the second number
   * @return numbers's gcd
   */
  private int greatestCommonDivisor(int a, int b) {
    // an algorithm for gcd
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
  
  /**
   * Returns a string representation of the rational number in reduced form.
   * @return a string representation of the rational number in the form "numerator/denominator"
   */
  @Override
  public String toString() {
    int gcd = greatestCommonDivisor(numerator, denominator);
    int reducedNumerator = numerator / gcd;
    int reducedDenominator = denominator / gcd;
    if (reducedDenominator == 1) {
      return String.valueOf(reducedNumerator);
    }
    if (numerator < 0 && denominator < 0) {
      return String.valueOf(-reducedNumerator) + "/" + String.valueOf(-reducedDenominator);
    }
    if (numerator < 0 || denominator < 0) {
      return "-" + String.valueOf(Math.abs(reducedNumerator)) + "/" + String.valueOf(Math.abs(reducedDenominator));
    }
    return String.valueOf(reducedNumerator) + "/" + String.valueOf(reducedDenominator);
  }
  
  /**
   * Determines if this rational number is equal to another object.
   * @param o the other object to compare
   * @return true if the other object is a rational number with the same numerator and denominator, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof RationalN)) {
      return false;
    }
    RationalN r = (RationalN) o;
    return numerator == r.numerator && denominator == r.denominator;
  }
}
